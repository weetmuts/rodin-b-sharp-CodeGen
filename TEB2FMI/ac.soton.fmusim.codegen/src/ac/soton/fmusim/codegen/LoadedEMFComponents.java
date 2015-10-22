package ac.soton.fmusim.codegen;

import java.util.ArrayList;
import java.util.HashMap;

import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.RodinDBException;

import ac.soton.compositionmodel.core.compositionmodel.ComposedMachine;

// This is a specialized class for FMU translation. We know that we will only need
// to load one machine, so we can set the machine array here. We also instantiate
// the other variables, even though we know they won't be used in FMU translation,
// so that they don't throw null pointer exceptions down the line, when used with
// the existing translator code.
public class LoadedEMFComponents extends RMLDataStruct {
	public LoadedEMFComponents(MachineImpl machine) throws RodinDBException {
		machineArray = new Object[1];
		machineArray[0] = machine;
		contextContainerMap = new HashMap<String, String>();
		contextList = new ArrayList<ContextImpl>();
		composedEventMap = new HashMap<String, String>();
		composedMachineList = new ArrayList<ComposedMachine>();
		composedMachineNameList = new ArrayList<String>();
	}
}
