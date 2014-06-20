/**
 *
 */
package org.eventb.codegen.taskbodybuilder;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.taskbodybuilder.utils.TaskingGrammarUtils;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.RodinDBException;

import tasking.Task;

import compositeControl.Branch;
import compositeControl.CompositeControl;
import compositeControl.CompositeControlFactory;
import compositeControl.Do;
import compositeControl.EventWrapper;
import compositeControl.Output;
import compositeControl.Seq;
import compositeControl.SubBranch;

/**
 * @author renatosilva
 * 
 */
public class TextToEMFParser extends AbstractTextParser {

	private static CompositeControl parentComposite;
	private Task parentTask;
	private List<Event> eventList = new ArrayList<Event>();
	private Set<String> usedEvents = new TreeSet<String>();
	private List<Variable> variableList = new ArrayList<Variable>();

	static TaskingGrammar taskingGrammar;

	public enum TaskElement {
		EVENT("Event"), VARIABLE("Variable"); //$NON-NLS-1$ //$NON-NLS-2$

		private String description;

		private TaskElement(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description;
		}
	}

	public TextToEMFParser(String inputString, Task parent)
			throws UnsupportedEncodingException, RodinDBException {
		parentTask = parent;
		this.inputString = inputString;

		loadAllEventsVariables();

		if (taskingGrammar != null)
			taskingGrammar.ReInit(new ByteArrayInputStream(inputString
					.getBytes("UTF8"))); //$NON-NLS-1$
		else
			taskingGrammar = new TaskingGrammar(new ByteArrayInputStream(
					inputString.getBytes("UTF8"))); //$NON-NLS-1$
	}

	/**
	 * parse for grammar errors and return true if no error were found
	 * 
	 * @return whether error where found (true) or not (false)
	 * @throws UnsupportedEncodingException
	 * @throws ParseException
	 */
	@Override
	public boolean validParsingGrammar() throws UnsupportedEncodingException,
			ParseException {
		taskingGrammar.enable_tracing();
		taskingGrammar.parseAndBuild(inputString);

		if (!taskingGrammar.error_message.isEmpty()) {
			ErrorLocation errorLocation = new ErrorLocation(0, 0);
			addError(taskingGrammar.error_message, errorLocation);
		}

		return isParseValid();
	}

	@Override
	public CompositeControl validateInputAndGenerateEMF()
			throws UnsupportedEncodingException {
		parentComposite = null;
		taskingGrammar.ReInit(new ByteArrayInputStream(inputString
				.getBytes("UTF8"))); //$NON-NLS-1$
		runParser(parentTask);

		if (parentComposite != null)
			while (parentComposite.eContainer() != null) {
				parentComposite = (CompositeControl) parentComposite
						.eContainer();
			}

		if (parentTask != null && parentComposite != null
				&& getError_description().isEmpty())
			parentTask.setTaskBody(parentComposite);

		return parentComposite;
	}

	private CompositeControl runParser(EventBObject parent)
			throws UnsupportedEncodingException, Error {
		Token currentToken = taskingGrammar.getNextToken();
		while (currentToken != null && currentToken.image != null
				&& !currentToken.image.isEmpty()) {
			parseInput(currentToken);
			currentToken = taskingGrammar.getNextToken();
		}

		return parentComposite;
	}

	@Override
	protected void parseInput(Token token) {
		int kind = token.kind;

		switch (kind) {
		case TaskingGrammar.SEQ: {
			Seq seq = CompositeControlFactory.eINSTANCE.createSeq();
			if (parentComposite == null) {
				int[] expectedKeywords = { previousKind, TaskingGrammar.SEQ };
				addErrorParse(expectedKeywords, token);
				break;
			}

			CompositeControl leftBranch = parentComposite;

			while (leftBranch.eContainer() != null) {
				leftBranch = (CompositeControl) leftBranch.eContainer();
			}
			seq.setLeftBranch(leftBranch);

			try {
				parentComposite = null;
				previousKind = kind;
				CompositeControl rightComposite = runParser(seq);
				seq.setRightBranch(rightComposite);
			} catch (UnsupportedEncodingException e) {
				addError(e.getMessage(), token);
			} catch (Error e) {
				addError(e.getMessage(), token);
			}

			parentComposite = seq;
			break;
		}
		case TaskingGrammar.IF: {
			Branch branch = CompositeControlFactory.eINSTANCE.createBranch();
			parentComposite = branch;
			break;
		}
		case TaskingGrammar.ELSEIF: {
			SubBranch subBranch = CompositeControlFactory.eINSTANCE
					.createSubBranch();
			if (parentComposite instanceof Branch) {
				Branch branch = (Branch) parentComposite;
				branch.setSubBranch(subBranch);
			} else if (parentComposite instanceof SubBranch) {
				SubBranch subBranchParent = (SubBranch) parentComposite;
				subBranchParent.setSubBranch(subBranch);
			} else {
			}
			parentComposite = subBranch;
			break;
		}
		case TaskingGrammar.ELSE: {
			while (!(parentComposite instanceof Branch))
				parentComposite = (CompositeControl) parentComposite
						.eContainer();
			break;
		}
		case TaskingGrammar.DO: {
			Do createDo = CompositeControlFactory.eINSTANCE.createDo();
			parentComposite = createDo;
			break;
		}
		case TaskingGrammar.FINALLY: {
			assert parentComposite instanceof Do;
			break;
		}
		case TaskingGrammar.OUTPUT: {
			Output outputElement = CompositeControlFactory.eINSTANCE
					.createOutput();
			if (previousKind == -1 || previousKind == TaskingGrammar.SEQ)
				parentComposite = outputElement;
			else {
				addErrorParse(
						TaskingGrammarUtils.getKeyWord(TaskingGrammar.SEQ),
						TaskingGrammarUtils.getKeyWord(TaskingGrammar.OUTPUT),
						token);
			}
			break;
		}
		case TaskingGrammar.STRING: {
			assert parentComposite instanceof Output;
			if (parentComposite instanceof Output) {
				Output outputElement = (Output) parentComposite;
				StringBuffer textValue = new StringBuffer(token.image
						.toString().replaceFirst("\"", "").trim()); //$NON-NLS-1$ //$NON-NLS-2$
				if (textValue.charAt(textValue.length() - 1) == '"') {
					textValue = textValue.deleteCharAt(textValue.length() - 1);
				}
				if (parentComposite == null) {
					addErrorParse(
							TaskingGrammarUtils
									.getKeyWord(TaskingGrammar.OUTPUT),
							textValue.toString(), token);
				} else
					outputElement.setText(textValue.toString());
			} else {
				int[] expectedKeywords = { TaskingGrammar.OUTPUT };
				addErrorParse(expectedKeywords, token);
			}
			break;
		}

		case TaskingGrammar.NAME: {
			if (parentComposite instanceof Output) {
				Output outputElement = (Output) parentComposite;
				String value = token.image.toString();
				if (outputElement.getText() == null
						|| outputElement.getText().isEmpty()) {
					outputElement.setText(value);
				} else {
					String variableName = value;
					outputElement.setVariableName(variableName);
				}
				break;
			}

			String eventName = token.image.toString();

			// CJL REMOVED 07/02/2012
			// Event does not need to be placed in the EventWrapper as we just
			// use names now
			// Event evt = getEvent(eventName);
			// if(evt==null){
			// addErrorNotExist(TaskElement.EVENT,eventName,token);
			// break;
			// }else 
			if(!usedEvent(eventName)){
				addErrorEventAlreadyUsed(TaskElement.EVENT,eventName,token);
				break;
			}

			EventWrapper eventWrapper = CompositeControlFactory.eINSTANCE
					.createEventWrapper();
			// eventWrapper.setEvent(evt);
			eventWrapper.setEventName(eventName);

			if (parentComposite instanceof Branch) {
				Branch branch = (Branch) parentComposite;
				if (branch.getEventWrapper() == null
						|| branch.getEventWrapper().getEventName().isEmpty())
					branch.setEventWrapper(eventWrapper);
				else if (previousKind == TaskingGrammar.ELSEIF) {
					branch.getSubBranch().setEventWrapper(eventWrapper);
				} else if (previousKind == TaskingGrammar.ELSE)
					branch.setAlt(eventWrapper);
			}

			else if (parentComposite instanceof SubBranch) {
				SubBranch subBranch = (SubBranch) parentComposite;
				CompositeControl tempParentComposite = parentComposite;
				while (!(tempParentComposite instanceof Branch)
						&& tempParentComposite != null)
					tempParentComposite = (CompositeControl) tempParentComposite
							.eContainer();
				if (tempParentComposite != null) {
					Branch branch = (Branch) tempParentComposite;
					if (branch.getAlt() != null) {
						addErrorElseIfMisplaced(
								TaskingGrammarUtils.outputTextOtherSubBranch(
										eventName).toString(), token);
						break;
					}
				}
				if (subBranch.getEventWrapper() == null
						|| subBranch.getEventWrapper().getEventName().isEmpty())
					subBranch.setEventWrapper(eventWrapper);
			}

			else if (parentComposite instanceof Do) {
				Do doCycle = (Do) parentComposite;
				if (previousKind == TaskingGrammar.DO)
					doCycle.setTaskBody(eventWrapper);
				else if (previousKind == TaskingGrammar.FINALLY)
					doCycle.setFinally(eventWrapper);
			}

			else if (parentComposite instanceof Seq) {
				Seq seq = (Seq) parentComposite;
				assert seq.getLeftBranch() != null;
				seq.setRightBranch(eventWrapper);
			}

			else if (parentComposite == null
					|| parentComposite instanceof EventWrapper)
				parentComposite = eventWrapper;
			break;
		}
		}

		previousKind = kind;
	}

	private void loadAllEventsVariables() throws RodinDBException {
		EObject root = parentTask.eContainer();
		while (root != null && !(root instanceof MachineImpl)) {
			root = root.eContainer();
		}

		MachineImpl machine = (MachineImpl) root;
		for (Event event : machine.getEvents()) {
			eventList.add(event);
		}
		for (Variable var : machine.getVariables()) {
			variableList.add(var);
		}
	}

	private Event getEvent(String eventName) {
		for (Event event : eventList) {
			if (event.getName().equals(eventName))
				return event;
		}
		return null;
	}

	private Variable getVariable(String variableName) {
		for (Variable var : variableList) {
			if (var.getName().equals(variableName))
				return var;
		}
		return null;
	}

	private boolean usedEvent(String evtName) {
		return usedEvents.add(evtName);
	}

	@Override
	public CompositeControl getNewValue() {
		return parentComposite;
	}

}
