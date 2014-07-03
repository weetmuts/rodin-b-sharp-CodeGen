package org.eventb.codegen.tasking.statemachines;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.codegen.il1.Call;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.If;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.tasking.RodinToEMFConverter;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.impl.MachineImpl;

import ac.soton.eventb.statemachines.AbstractNode;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Transition;
import ac.soton.eventb.statemachines.impl.StatemachineImpl;

import compositeControl.Branch;
import compositeControl.CompositeControl;
import compositeControl.CompositeControlFactory;
import compositeControl.EventWrapper;
import compositeControl.SubBranch;

public class Experiment {

	private static Experiment singleton = null;

	public static Experiment getDefault() {
		if (singleton == null) {
			singleton = new Experiment();
			return singleton;
		} else {
			return singleton;
		}
	}

	public Call run(EventBElement source, IL1Element actualTarget,
			TaskingTranslationManager translationManager)
			throws TaskingTranslationException {

		StatemachineImpl statemachine = (StatemachineImpl) source;
		MachineImpl parentMachine = TaskingTranslationManager
				.getParentMachine(statemachine);

		// It is useful to have a map of stateNames to a list of outgoing events
		Map<String, List<Event>> stateEventMap = new HashMap<String, List<Event>>();

		String stateMachineName = statemachine.getName();
		// Get the names of the states from the nodes.
		EList<AbstractNode> nodes = statemachine.getNodes();
		List<String> stateNames = new ArrayList<String>();

		// A new list to store the subroutines: one per state.
		Map<String, Subroutine> stateSubroutineMap = new HashMap<String, Subroutine>();

		// Initial -initialisation> A
		// A -t1> B
		// A -t2> C
		// B -t3> C
		// C -t4> B
		// C -t5> C

		// entryPoint: call A
		// A: if t1; call B
		// elseif t2; call C;
		// B: t3; call C
		// C: if t4; call C
		// elseif t5; call A

		for (AbstractNode node : nodes) {
			int branchCount = 0;

			if (node instanceof Initial) {
				// The initial transition supplies the
				// entry point (the first state)
			} else if (node instanceof State) {
				State si = (State) node;
				String stateName = si.getName();
				stateNames.add(stateName);

				EList<Transition> outGoing = si.getOutgoing();
				// add the events of the outgoing transition to the hashmap
				branchCount = branchCount + outGoing.size();

				List<Event> eventList = new ArrayList<Event>();
				for (Transition t : outGoing) {
					EList<Event> events = t.getElaborates();
					// sometimes we obtain a proxy which will need to be
					// resolved
					for (Event event : events) {
						if (event.eIsProxy()) {
							event = (Event) EcoreUtil.resolve(event,
									RodinToEMFConverter.machineResSet);
						}
						// add this event to the list of transition elaborates
						// events
						// these events do not need to be constructed in
						// machines
						if (!TaskingTranslationManager.elaboratesNamesList
								.contains(event.getName())) {
							TaskingTranslationManager.elaboratesNamesList
									.add(event.getName());
						}
						eventList.add(event);
						translationManager.getEventTargMap().put(event,
								t.getTarget());

						// this is where we store the link between the event and
						// the statemachine
						// that has a transition that elaborates it.
						TaskingTranslationManager.getEvent_SM_Map().put(event,
								stateMachineName);

					}
				}
				stateEventMap.put(stateName, eventList);
			}
		}

		String projectName = translationManager
				.getProjectName((MachineImpl) parentMachine);

		// non-initial transitions relate to an ACTION, SEQ or BRANCH statements

		for (String currentStateName : stateNames) {

			// Each outgoing transition of a state may have event elaborations.
			// We have an action, seq or branch for each event of an outgoing
			// transition.
			// The guard maps to a branch condition, and actions to updates
			// Each transition is associated with '[guards] -> state'
			// First: get the events associated with outgoing transitions of the
			// current state.
			List<Event> events = stateEventMap.get(currentStateName);
			// if there are no events then no further action is required for
			// this state since there are no outgoing transitions
			if (events == null || events.size() == 0) {
				break;
			} else if (events.size() == 1) {
				// if there is just one outgoing transition then there are no
				// branch options within the case itself, just output the action

				Event event = events.get(0);
				// we modify this event, so add this to the list of events that
				// need to be translated, rather than recovered from the
				// first-pass
				// store.
				translationManager.getDoNotRecoverPreviousTranslationList()
						.add(event);
				// This subroutine has the wrong name
				Subroutine tmpSubroutine = (Subroutine) translationManager
						.translate(event);
				Command originalBody = tmpSubroutine.getBody();

				// If we have a guard other than the existing case guard
				// and typing guards we need to add a branch.
				// so filter out these guards
				EList<Guard> guards = event.getGuards();
				// remove any typing guards
				List<Guard> cleanedUpGuards = new ArrayList<Guard>();
				for (Guard g : guards) {
					String predicate = g.getPredicate();
					predicate = CodeGenTaskingUtils
							.makeSingleSpaceBetweenElements(predicate);
					String casePredicate = stateMachineName + " = "
							+ currentStateName;
					if (predicate.equals(casePredicate)) {
						// if we have encountered the case predicate then ignore
						// it
						break;
					} else if (!predicate
							.contains(CodeGenTaskingUtils.ELEMENT_OF)) {
						cleanedUpGuards.add(g);
					}
				}

				// In the case of a non synchronous (process state-machine)
				// there should be no guards here
				if (cleanedUpGuards.size() > 0) {
					throw new TaskingTranslationException(
							"Guard not allowed on a single outgoing transition in: "
									+ event.getName());
				}

				// The code above removes the guard that appears in the 'case' statement
				// of a state-machine implementation.
				
				// We also replace the state-update assignment with a call to the 
				// next-state subroutine. We repeat the algorithm above for actions,
				// then substitute in a call instead.
				
				// remove the state update action from the event actions
				removeStateUpdateAction(stateMachineName, event);
				
				// NEW: I think we can just work with the subroutine
				// that we store in the map
				tmpSubroutine.setName(currentStateName);
				stateSubroutineMap.put(currentStateName, tmpSubroutine);
				// Add the next call!!!
				// >>>>>>>>>>>>>>>>>>>>>
				
			} else if (events.size() > 1) {
				// Else if there is more than one outgoing transition,
				// Create a temporary Tasking Event-B branch and translate this
				// using the existing TEB-IL1 translator.
				Branch branch = CompositeControlFactory.eINSTANCE
						.createBranch();
				// on the first iteration there is no parent
				CompositeControl parent = null;
				// if there are associated events
				boolean first = true;
				for (Event event : events) {
					// We need to add a branch to the code:
					// evt1: if g = true then a ; sm_state = B end.
					// The next state is stored in a Map of (Event X State),
					// generated above.

					// we modify this event, so add this to the list of events
					// that need
					// to be translated rather than recovered from the
					// first-pass store.
					translationManager.getDoNotRecoverPreviousTranslationList()
							.add(event);

					// we will first remove the unwanted guards from the events
					// We can remove a controller variable from the condition
					EList<Guard> guards = event.getGuards();
					int idx = -1;
					boolean found = false;
					for (Guard guard : guards) {
						idx++;
						String predicate = CodeGenTaskingUtils
								.makeSingleSpaceBetweenElements(guard
										.getPredicate());
						String casePredicate = stateMachineName + " = "
								+ currentStateName;
						if (predicate.equals(casePredicate)) {
							found = true;
							break;
						}
					}
					if (found) {
						guards.remove(idx);
					}
					// remove the state update action from the event actions
					removeStateUpdateAction(stateMachineName, event);
					
					if (first) {
						EventWrapper wrapper = CompositeControlFactory.eINSTANCE
								.createEventWrapper();
						first = false;
						wrapper.setEvent(event);
						branch.setEventWrapper(wrapper);
						// this first time - the branch is the parent
						parent = branch;
					} else {
						EventWrapper wrapper = CompositeControlFactory.eINSTANCE
								.createEventWrapper();
						wrapper.setEvent(event);
						SubBranch subBranch = CompositeControlFactory.eINSTANCE
								.createSubBranch();
						subBranch.setEventWrapper(wrapper);

						if (parent instanceof Branch) {
							// set the parent's subBranch
							Branch parentBranch = (Branch) parent;
							parentBranch.setSubBranch(subBranch);
							// the new parent is now the subBranch
							parent = subBranch;
						} else if (parent instanceof SubBranch) {
							SubBranch parentSubBranch = (SubBranch) parent;
							parentSubBranch.setSubBranch(subBranch);
							parent = subBranch;
						}
					}
				}

				// THIS IS WHERE THE CASE BRANCHING STRUCTURE IS TRANSLATED
				// We now have a temporary Event-B branch structure of the
				// outgoing transitions of the current state.
				// Translate this now to IL1...

				// NEW: This is the branch that we want to embed in the
				// subroutine.
				// we need to adjust the body to add further sequences at the
				// root.
				// Add the initial Entry's call to the first state at the
				// beginning
				// of the sequence, add the branch from the IF.
				// In addition, add a Call to the 'next-state' on the end of
				// each the transitions.

				// and add a Call to the 'next-state subroutine' for each branch

				If translated = (If) translationManager.translate(branch);
				
				
				
				System.out.println();

				Subroutine subroutine = Il1Factory.eINSTANCE.createSubroutine();
				subroutine.setName(currentStateName);
				subroutine.setBody(translated);
				stateSubroutineMap.put(currentStateName, subroutine);
			}
		}

		// Add the subroutines and decls to the protected/tasks
		Subroutine subroutine = Il1Factory.eINSTANCE.createSubroutine();
		subroutine.setMachineName(parentMachine.getName());
		subroutine.setName(statemachine.getName() + "stateMachine");
		subroutine.setProjectName(projectName);
		if (actualTarget instanceof Protected) {
			Protected p = (Protected) actualTarget;
			p.getSubroutines().add(subroutine);
		} else if (actualTarget instanceof Task) {
			Task t = (Task) actualTarget;
			t.getSubroutines().add(subroutine);
		}
		// subroutine.setBody(command);

		// Now we should create and return the call to the subroutine
		Call call = Il1Factory.eINSTANCE.createCall();
		Subroutine subroutineCopy = EcoreUtil.copy(subroutine);
		call.setSubroutine(subroutineCopy);
		call.setMachineName(parentMachine.getName());
		call.setProjectName(projectName);

		return call;

	}

	private void removeStateUpdateAction(String stateMachineName, Event event) {
		// The code above removes the guard that appears in the 'case' statement
		// of a state-machine implementation.
		
		// We also replace the state-update assignment with a call to the 
		// next-state subroutine. We repeat the algorithm above for actions,
		// then substitute in a call instead.
		
		EList<Action> actionList = event.getActions();
		int idx2 = -1;
		boolean found2 = false;
		for (Action action : actionList) {
			idx2++;
			String actionString = CodeGenTaskingUtils
					.makeSingleSpaceBetweenElements(action
							.getAction());
			String nextStateAssignment = stateMachineName + " "+ CodeGenTaskingUtils.ASSIGNMENT_SYMBOL + " ";
			if (actionString.startsWith(nextStateAssignment)) {
				found2 = true;
				break;
			}
		}
		if (found2) {
			actionList.remove(idx2);
		}
	}

}
