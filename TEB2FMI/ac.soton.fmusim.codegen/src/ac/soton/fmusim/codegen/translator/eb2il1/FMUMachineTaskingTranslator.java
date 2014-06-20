package ac.soton.fmusim.codegen.translator.eb2il1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.LocalRemote;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.tasking.AbstractTaskingTranslator;
import org.eventb.codegen.tasking.CodeGenTasking;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;

import tasking.FMU_Machine;

import compositeControl.CompositeControl;

public class FMUMachineTaskingTranslator extends AbstractTaskingTranslator {

	

	public static List<Subroutine> communicatingSubroutines;

	@Override
	public IL1Element translate(EventBElement source, IL1Element target,
			TaskingTranslationManager translationManager)
			throws TaskingTranslationUnhandledTypeException {

		MachineImpl containingMachine = (MachineImpl) source.eContainer();
		// This is where we create protected object from the FMU
		Protected protectedObj = Il1Factory.eINSTANCE.createProtected();
		// Translate the FMU as a shared machine
		// Get the events
		EList<Event> events = containingMachine.getEvents();
		// Get the previous translations
		Map<String, IL1Element> storedElements = translationManager
				.getStoredElements();

		// This is where we stash the translated subroutines
		// for translation to the FMIDoStep
		List<Subroutine> fmiDoStepSubroutineList = new ArrayList<Subroutine>();
		communicatingSubroutines = new ArrayList<Subroutine>();
		
		Iterator<String> keysIterator = storedElements.keySet().iterator();
		while (keysIterator.hasNext()) {
			String nxt = keysIterator.next();
			// for each of the events look for the corresponding translation.
			// and add it to the list.
			for (Event evt : events) {
				// find the event/subroutine & machine names in the key of
				// stored element.
				if (nxt.contains(evt.getName())
						&& nxt.contains(containingMachine.getName())) {
					IL1Element value = storedElements.get(nxt);
					// make sure we have a subroutine
					if (value instanceof Subroutine) {
						Subroutine subroutine = (Subroutine) value;
						// Now check that the value is a subroutine with the
						// correct name and machine name.
						if (subroutine.getMachineName().equalsIgnoreCase(
								containingMachine.getName())
								&& subroutine.getName().equals(evt.getName())) {
							// if a corresponding translation exists then add it to the
							// list of subroutines to be added to the protected, that is
							// unless it has parameters. In FMU translation parameters
							// only exist in communication events (between components),
							// this is handled by the master during simulation.
							// Any subroutines added are necessarily temporary,
							// since they are in-lined in the do-step
							EList<Parameter> formalParameters = subroutine.getFormalParameters();
							// partition into communicating and doStep subroutines
							if( formalParameters == null || formalParameters.size() == 0){
								// non-communicating subroutines are temporary, since events
								// can be in-lined. 
								subroutine.setTemporary(true);
								fmiDoStepSubroutineList.add(subroutine);
							} else{
								// Communicating subroutines are required for
								// getters and setter info
								subroutine.setTemporary(false);
								communicatingSubroutines.add(subroutine);
								translationManager.getCommunicatingSubroutines().add(subroutine);
								protectedObj.getSubroutines().add(subroutine);
							}
						}
					}
				}
			}
		}

		// now add data to the protected object
		if (fmiDoStepSubroutineList.size() > 0) {
			protectedObj.setMachineName(containingMachine.getName());
			protectedObj.setName(containingMachine.getName());
			protectedObj.setProjectName(TaskingTranslationManager.getProject()
					.getName());
			protectedObj.getSubroutines().addAll(fmiDoStepSubroutineList);
		}
		// An FMU with no subroutines is useless
		else {
			throw new TaskingTranslationUnhandledTypeException(source);
		}

		// Get the task body.
		EList<AbstractExtension> extensionList = containingMachine
				.getExtensions();
		for (AbstractExtension ext : extensionList) {
			if (ext instanceof FMU_Machine) {
				FMU_Machine fmuMch = (FMU_Machine) ext;
				CompositeControl taskBody = fmuMch.getTaskBody();
				Command b = null;
				try {
					IL1Element translated = translationManager.translate(taskBody);
					if(translated instanceof Command){
						b = (Command) translated;
					}
					// if we have a subroutine in a local remote - we use this
					else if(translated instanceof LocalRemote){
						LocalRemote localRemote = (LocalRemote) translated;
						if(localRemote.getRemoteSubroutine() != null){
							// there should be no synchronizing in the FMU unless we 
							// implement nested FMUs at a later date
							throw new TaskingTranslationException("FMU found with illegal translation to remote call: " + protectedObj.getMachineName() );
						}
						else{
							// we need to expand the subroutine body, in order to add the actions 
							Subroutine localSubroutine = localRemote.getLocalSubroutine();
							localSubroutine.setMachineName(protectedObj.getName());
							localSubroutine.setProjectName(protectedObj.getProjectName());
							b = localSubroutine.getBody();
							
						}
					}
				} catch (TaskingTranslationException e) {
					Status status = new Status(IStatus.ERROR,
							CodeGenTasking.PLUGIN_ID,
							"Failed Translation: TaskingTranslationException:"
									+ e.getMessage(), e);
					StatusManager.getManager().handle(status,
							StatusManager.SHOW);
				}
				Subroutine fmiDoStep = Il1Factory.eINSTANCE.createSubroutine();
				// Add machine names etc......
				fmiDoStep.setBody(b);
				fmiDoStep.setName("fmiDoStep");
				fmiDoStep.setMachineName(containingMachine.getName());
				fmiDoStep.setProjectName(TaskingTranslationManager.getProject().getName());
				fmiDoStep.setTemporary(false);

				protectedObj.getSubroutines().add(fmiDoStep);
			}
		}
		return protectedObj;
	}
}
