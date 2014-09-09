/**
 *
 */
package org.eventb.codegen.tasking.utils;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.tasking.CodeGenTasking;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.impl.StringToAttributeMapEntryImpl;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.keyboard.RodinKeyboardPlugin;

import tasking.MachineType;
import ac.soton.compositionmodel.core.compositionmodel.CombinedEventMachine;
import ac.soton.compositionmodel.core.compositionmodel.ComposedEvent;
import ac.soton.compositionmodel.core.compositionmodel.ComposedMachine;

/**
 * @author renatosilva
 * 
 */
public final class CodeGenTaskingUtils {

	public final static String ELEMENT_OF = RodinKeyboardPlugin.getDefault()
			.translate("\\in");
	public final static String ASSIGNMENT_ELEMENT_IN = RodinKeyboardPlugin
			.getDefault().translate("\\bcmin");
	public final static String ASSIGNMENT_SYMBOL = RodinKeyboardPlugin
			.getDefault().translate("\\bcmeq");
	public final static String EQUALS_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("=");
	public final static String NOT_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("\\lnot");
	public final static String FALSE_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("\\bfalse");
	public final static String TRUE_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("\\btrue");
	public final static String AND_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("\\land");
	public final static String OR_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("\\lor");
	public final static String MINUS_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("-");
	public final static String INT_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("INT");
	public final static String BOOL_SYMBOL = RodinKeyboardPlugin.getDefault()
			.translate("BOOL");

	public static MachineType getTaskType(final MachineImpl machine) {
		for (AbstractExtension eObj : machine.getExtensions()) {
			if (eObj instanceof tasking.Task
					|| eObj instanceof tasking.AutoTask_Machine
					|| eObj instanceof tasking.Shared_Machine
					|| eObj instanceof tasking.Environ_Machine
					|| eObj instanceof tasking.FMU_Machine) {
				return (MachineType) eObj;
			}
		}

		return null;
	}

	public static void cloneAutoTaskToFMU(MachineImpl machine) {
		EList<AbstractExtension> extensions = machine.getExtensions();
		AbstractExtension oldExtension = null;
		tasking.FMU_Machine fmuMachine = null;
		// look for an autotask machine to convert to an FMUMachine
		for (AbstractExtension eObj : extensions) {
			if (eObj instanceof tasking.AutoTask_Machine) {
				tasking.AutoTask_Machine atMachine = (tasking.AutoTask_Machine) eObj;
				fmuMachine = tasking.TaskingFactory.eINSTANCE
						.createFMU_Machine();
				fmuMachine.getAnnotations().addAll(atMachine.getAnnotations());
				fmuMachine.getAttributes().addAll(atMachine.getAttributes());
				fmuMachine.setGenerated(atMachine.isGenerated());
				fmuMachine.setLocalGenerated(atMachine.isLocalGenerated());
				fmuMachine.setPriority(atMachine.getPriority());
				fmuMachine.setTaskBody(atMachine.getTaskBody());
				fmuMachine.setTaskType(atMachine.getTaskType());
				oldExtension = eObj;
				break;
			} else if (eObj instanceof tasking.Task) {
				tasking.Task taskMachine = (tasking.Task) eObj;
				fmuMachine = tasking.TaskingFactory.eINSTANCE
						.createFMU_Machine();
				fmuMachine.getAnnotations()
						.addAll(taskMachine.getAnnotations());
				fmuMachine.getAttributes().addAll(taskMachine.getAttributes());
				fmuMachine.setGenerated(taskMachine.isGenerated());
				fmuMachine.setLocalGenerated(taskMachine.isLocalGenerated());
				fmuMachine.setPriority(taskMachine.getPriority());
				fmuMachine.setTaskBody(taskMachine.getTaskBody());
				fmuMachine.setTaskType(taskMachine.getTaskType());
				oldExtension = eObj;
				break;
			}
		}
		// replace the old task extension with the newly created fmu extension
		extensions.remove(oldExtension);
		extensions.add(fmuMachine);
	}

	public static void cloneEnvironTaskToFMU(MachineImpl machine) {
		EList<AbstractExtension> extensions = machine.getExtensions();
		AbstractExtension oldExtension = null;
		tasking.FMU_Machine fmuMachine = null;
		// look for an environ task to convert to an FMUMachine
		for (AbstractExtension eObj : extensions) {
			if (eObj instanceof tasking.Environ_Machine) {
				tasking.Environ_Machine environMachine = (tasking.Environ_Machine) eObj;
				fmuMachine = tasking.TaskingFactory.eINSTANCE
						.createFMU_Machine();
				fmuMachine.getAnnotations().addAll(
						environMachine.getAnnotations());
				fmuMachine.getAttributes().addAll(
						environMachine.getAttributes());
				fmuMachine.setGenerated(environMachine.isGenerated());
				fmuMachine.setLocalGenerated(environMachine.isLocalGenerated());
				fmuMachine.setPriority(environMachine.getPriority());
				fmuMachine.setTaskBody(environMachine.getTaskBody());
				fmuMachine.setTaskType(environMachine.getTaskType());
				oldExtension = eObj;
				break;
			}
		}
		// replace the old task extension with the newly created fmu extension
		extensions.remove(oldExtension);
		extensions.add(fmuMachine);
	}

	public static Event getComposedEvent(
			TaskingTranslationManager taskingTranslationManager,
			String project, String machineName, String eventName) {

		ComposedMachine composedMch = taskingTranslationManager
				.getComposedMachine(project, machineName, eventName);

		if (composedMch != null) {
			EList<ComposedEvent> composesEvents = composedMch
					.getComposesEvents();
			for (ComposedEvent composedEvt : composesEvents) {
				EList<CombinedEventMachine> combinesEvts = composedEvt
						.getCombinesEvents();
				boolean match = false;
				int index = -1;
				for (CombinedEventMachine cem : combinesEvts) {
					index++;
					if (cem.getMachineName().equals(machineName)
							&& cem.getEventName().equals(eventName)) {
						// we have found a combined event machine with the
						// machineName.eventName
						// we need to see what it pairs with, if anything
						match = true;
						break;
					}
				}
				if (combinesEvts.size() > 1 && match == true) {
					if (index == 0) {
						Event pairedEvent = combinesEvts.get(1).getEvent();
						String mchName = combinesEvts.get(1).getMachineName();
						pairedEvent = (Event) taskingTranslationManager
								.getElementUsingProxy(pairedEvent, mchName);
						return pairedEvent;
					} else if (index == 1) {
						Event pairedEvent = combinesEvts.get(0).getEvent();
						String mchName = combinesEvts.get(0).getMachineName();
						pairedEvent = (Event) taskingTranslationManager
								.getElementUsingProxy(pairedEvent, mchName);
						return pairedEvent;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Adds the typing flag to an EventB element
	 * 
	 * @param element
	 *            The element to add the attribute to.
	 * @param typing
	 *            True if to add Typing, false to add NonTyping
	 */
	public static void addTaskingAttribute(EventBElement element, boolean typing) {
		Attribute typingAttribute = CoreFactory.eINSTANCE.createAttribute();
		if (typing)
			typingAttribute.setValue("Typing");
		else
			typingAttribute.setValue("NonTyping");

		element.getAttributes()
				.add(new CGStringToAttributeMapEntry(
						CodeGenTasking.TYPING_ATTRIBUTE_IDENT, typingAttribute));
	}

	public static boolean hasTypingAttribute(EventBElement element) {
		return element.getAttributes().contains(
				CodeGenTasking.TYPING_ATTRIBUTE_IDENT);
	}

	public static String getTypingAttribute(EventBElement element) {
		return (String) element.getAttributes()
				.get(CodeGenTasking.TYPING_ATTRIBUTE_IDENT).getValue();
	}

	public static class CGStringToAttributeMapEntry extends
			StringToAttributeMapEntryImpl {
		public CGStringToAttributeMapEntry(String string, Attribute attribute) {
			this.setKey(string);
			this.setValue(attribute);
		}

	}

	public static String getTypedVariable(String predicateString) {
		// Spaces are not always present between text and non-text
		predicateString = makeSingleSpaceBetweenElements(predicateString);
		predicateString = predicateString.trim();

		if (predicateString.length() == 0)
			return "";

		String lhs = predicateString.split(" ")[0];

		return lhs.trim();

	};

	public static String makeSingleSpaceBetweenElements(String predIn) {
		// first remove spaces
		predIn = predIn.replace(" ", "");

		String pred = "";

		boolean lastNormal = true;

		for (char c : predIn.toCharArray()) {
			boolean currentNormal = ((c >= 'a' && c <= 'z')
					|| (c >= 'A' && c <= 'Z') || c == ' ' 
					|| c == '_' || (c >= '0' && c <= '9')
					|| Character.toString(c).equals(CodeGenTaskingUtils.INT_SYMBOL)
					|| Character.toString(c).equals(CodeGenTaskingUtils.BOOL_SYMBOL));

			if (lastNormal && currentNormal) {
				// do nothing special
			} else if (lastNormal && !currentNormal) {
				// add a space
				pred += ' ';
			} else if (!lastNormal && currentNormal) {
				// add a space
				pred += ' ';
			} else if (!lastNormal && !currentNormal) {
				// do nothing special
			}

			lastNormal = currentNormal;
			pred += c;
		}

		return pred;
	}

	public static String extractFullExceptionMessage(Exception e) {
		String initialMessage = e.getMessage() + "\n";
		StackTraceElement[] stackTraceArray = e.getStackTrace();
		for (int idx = 0; idx < stackTraceArray.length; idx++) {
			initialMessage = initialMessage + stackTraceArray[idx] + "\n";
		}
		return initialMessage;
	}
}
