/**
 *
 */
package org.eventb.codegen.taskbodybuilder;

import static org.eventb.codegen.tasking.utils.CodeGenTaskingUtils.ELEMENT_OF;
import static org.eventb.codegen.tasking.utils.CodeGenTaskingUtils.UP_TO;
import static org.eventb.codegen.tasking.utils.CodeGenTaskingUtils.EQUALS_SYMBOL;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eventb.codegen.taskbodybuilder.utils.TaskingGrammarUtils;
import org.eventb.codegen.tasking.CodeGenTasking;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.core.machine.impl.MachineFactoryImpl;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.Context;
import org.rodinp.core.RodinDBException;
import org.rodinp.internal.core.RodinDB;
import org.rodinp.internal.core.RodinDBManager;

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
	private List<Axiom> axoimtList = new ArrayList<Axiom>();

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
			throws UnsupportedEncodingException, RodinDBException, Error {
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
			throws UnsupportedEncodingException, Error, RodinDBException {
		Token currentToken = taskingGrammar.getNextToken();
		while (currentToken != null && currentToken.image != null
				&& !currentToken.image.isEmpty()) {
			parseInput(currentToken);
			currentToken = taskingGrammar.getNextToken();
		}
		return parentComposite;
	}

	@Override
	protected void parseInput(Token token) throws UnsupportedEncodingException, RodinDBException {
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
			
			String eventName = token.image.toString();

			// manage implicit branching
			Guard branchingGrd = checkImplicitBranching(eventName);
			if (branchingGrd != null) {
				processBranching(eventName, branchingGrd);

				inputString = inputString.replaceAll(
						eventName,
						generateBranchingTaskBody(eventName, branchingGrd,
								isLastToken(eventName)));
				taskingGrammar.ReInit(new ByteArrayInputStream(inputString
						.getBytes("UTF8"))); //$NON-NLS-1$
			}

			else {

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

				// CJL REMOVED 07/02/2012
				// Event does not need to be placed in the EventWrapper as we
				// just
				// use names now
				// Event evt = getEvent(eventName);
				// if(evt==null){
				// addErrorNotExist(TaskElement.EVENT,eventName,token);
				// break;
				// }else
				if (!usedEvent(eventName)) {
					addErrorEventAlreadyUsed(TaskElement.EVENT, eventName,
							token);
					break;
				}

				EventWrapper eventWrapper = CompositeControlFactory.eINSTANCE
						.createEventWrapper();
				// eventWrapper.setEvent(evt);
				eventWrapper.setEventName(eventName);

				if (parentComposite instanceof Branch) {
					Branch branch = (Branch) parentComposite;
					if (branch.getEventWrapper() == null
							|| branch.getEventWrapper().getEventName()
									.isEmpty())
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
							addErrorElseIfMisplaced(TaskingGrammarUtils
									.outputTextOtherSubBranch(eventName)
									.toString(), token);
							break;
						}
					}
					if (subBranch.getEventWrapper() == null
							|| subBranch.getEventWrapper().getEventName()
									.isEmpty())
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
	
	private void loadAllAxoims() throws RodinDBException {
		EObject root = parentTask.eContainer();
		while (root != null && !(root instanceof MachineImpl)) {
			root = root.eContainer();
		}

		MachineImpl machine = (MachineImpl) root;
		for (Context cntx : machine.getSees()) {
			for (Axiom a : cntx.getAxioms())
				axoimtList.add(a);
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
	
	// manage branching 
	
	private Guard checkImplicitBranching(String eventName) {
		
		Event event = getEvent(eventName);
		if (event != null) {
			for (Guard g : event.getGuards()) {
				if (isBranchingGuard(g))
					return g;
			}
		}
		
		return null;
	}
	
	public boolean isBranchingGuard(Guard g) {
		Attribute a = g.getAttributes().get(
				CodeGenTasking.BRANCHING_ATTRIBUTE_IDENT);

		if (a != null) {
			if (a.getValue().equals("Branching")) {
				return true;
			}
		}

		return false;
	}
	
	private String generateBranchingTaskBody(String eventName, Guard branchingGrd, boolean isLastToken) throws RodinDBException {
		int i = 1;
		int firstIndexS = getBranchingFirstIndex(branchingGrd);
		int lastIndexS = getBranchingLastIndex(branchingGrd);
		
		String branchingStr = "if " + eventName + (i++) + "\n";
		for (int j = 0; j < lastIndexS-firstIndexS-1; j++) {
			branchingStr = branchingStr + "elseif " + eventName + (i++) + "\n";
		}
		branchingStr = branchingStr + "else " + eventName + i;
		if (!isLastToken)
			branchingStr = branchingStr + ";";
		
		return branchingStr;
	}
	
	// create events/guards/actions required to represent the hidden branching in eventName
	private void processBranching(String eventName, Guard branchingGrd) throws RodinDBException {
		Event event = getEvent(eventName);
		EObject root = parentTask.eContainer();
		while (root != null && !(root instanceof MachineImpl)) {
			root = root.eContainer();
		}

		MachineImpl machine = (MachineImpl) root;
		
		String par = getBranchingParameter(branchingGrd);
		int firstIndexS = getBranchingFirstIndex(branchingGrd);
		int lastIndexS = getBranchingLastIndex(branchingGrd);
	
		for (int i = firstIndexS; i<= lastIndexS; i++) {
			//create branching event
			Event e = MachineFactoryImpl.eINSTANCE.createEvent();
			e.setGenerated(true);
			e.setName(eventName + i);
			//add branching guard
			Guard branchG = MachineFactoryImpl.eINSTANCE.createGuard();
			branchG.setGenerated(true);
			branchG.setName("grd1");
			branchG.setPredicate(par + EQUALS_SYMBOL + i);
			e.getGuards().add(branchG);
			if (event != null) {
				int n = 2;
				for (Guard grd : event.getGuards()) {
					if (!isBranchingGuard(grd)) {
						Guard g = MachineFactoryImpl.eINSTANCE.createGuard();
						g.setGenerated(true);
						g.setName("grd"+ n++);
						g.setPredicate(grd.getPredicate().toString().replaceAll(par, Integer.toString(i)));
						//call simplifation from core and add a axiom of "i" = i to avoid the replacing above
						e.getGuards().add(g);
					}
				}
			}
			
			// add branching action(s)
			if (event != null) {
				int n = 1;
				for (Action act : event.getActions()) {
					Action a = MachineFactoryImpl.eINSTANCE.createAction();
					a.setGenerated(true);
					a.setName("act"+ n++);
					a.setAction(act.getAction().toString().replaceAll(par, Integer.toString(i)));
					e.getActions().add(a);
				}
			}
			
			machine.getEvents().add(e);
		}	
	}
	
	private boolean isLastToken(String str) {
		if (inputString.indexOf(str) == inputString.length()-str.length())
			return true;
		return false;
	}
	
	
	String getBranchingParameter(Guard guard) {
		String par = "";
		String gStr = guard.getPredicate().trim();
		String[] gSplit = gStr.split(ELEMENT_OF);

		if (gSplit != null && gSplit.length == 2) {
			par = gSplit[0].trim();
		}
		
		return par;
	}
	
	Integer getBranchingFirstIndex(Guard guard) throws RodinDBException {
		String firstIndexS = "";
		int firstIndex = 0;
		String gStr = guard.getPredicate().trim();
		String[] gSplit1 = gStr.split(ELEMENT_OF);

		if (gSplit1 != null && gSplit1.length == 2) {
			gSplit1[1] = gSplit1[1].trim();
			String[] gSplit2 = gSplit1[1].split(UP_TO);
			if (gSplit2 != null && gSplit2.length == 2) {
				firstIndexS = gSplit2[0].trim();			
			}
		}	
		
		if (isInteger(firstIndexS))
			firstIndex = Integer.parseInt(firstIndexS);
		// if not integer should be a constant
		else {
			loadAllAxoims();
			firstIndex = Integer.parseInt(findConstantValue(firstIndexS));
		}
		return firstIndex;
	}
	
	private String findConstantValue(String firstIndexS) {
		for (Axiom c : axoimtList) {
			String pred = c.getPredicate();
			if (pred.contains(EQUALS_SYMBOL)) {
				int loc = pred.indexOf(EQUALS_SYMBOL);
				String id = pred.substring(0, loc).trim();
				if (id == firstIndexS) {
						String type = pred.substring(pred.lastIndexOf(EQUALS_SYMBOL) + 1,
					pred.length());
						return (type.trim());
				}
			}
		}
		return null;
	}

	int getBranchingLastIndex(Guard guard) throws RodinDBException {
		String lastIndexS= "";
		int lastIndex = 0;
		String gStr = guard.getPredicate().trim();
		String[] gSplit1 = gStr.split(ELEMENT_OF);

		if (gSplit1 != null && gSplit1.length == 2) {
			gSplit1[1] = gSplit1[1].trim();
			String[] gSplit2 = gSplit1[1].split(UP_TO);
			if (gSplit2 != null && gSplit2.length == 2) {
				lastIndexS = gSplit2[1].trim();			
			}
		}	
		
		if (isInteger(lastIndexS))
			lastIndex = Integer.parseInt(lastIndexS);
		// if not integer should be a constant
		else {
			loadAllAxoims();
			//lastIndex = Integer.parseInt(findConstantValue(lastIndexS));
			lastIndex = 3;
		}
		return lastIndex;
	}
	
	boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}


}
