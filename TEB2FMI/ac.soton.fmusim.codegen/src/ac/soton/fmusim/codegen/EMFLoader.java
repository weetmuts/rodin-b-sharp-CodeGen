package ac.soton.fmusim.codegen;

import java.util.ArrayList;

import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.codegen.tasking.RodinToEMFConverter;
import org.eventb.core.IContextRoot;
import org.eventb.core.IExtendsContext;
import org.eventb.core.ISeesContext;
import org.eventb.core.basis.ContextRoot;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.context.impl.ContextImpl;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.RodinDBException;

public class EMFLoader {
	public static RMLDataStruct loadEMFMachinesContexts(MachineRoot machineRoot)
			throws RodinDBException {
		MachineImpl machine = RodinToEMFConverter.loadMachine(machineRoot);
		// load all the machine components into a pre-prepared structure.
		LoadedEMFComponents loadedEMFComponents = new LoadedEMFComponents(machine);
		// Load all contexts
		ArrayList<String> contextNamesLoaded = new ArrayList<String>();
		ArrayList<ContextImpl> contextsList = new ArrayList<ContextImpl>();

		ISeesContext[] sees = machineRoot.getSeesClauses();
		// iterate through the machines' seen contexts
		for (ISeesContext s : sees) {
			IContextRoot contextRoot = s.getSeenContextRoot();
			processContextRoot(loadedEMFComponents, contextNamesLoaded,
					contextsList, contextRoot);
		}
		return loadedEMFComponents;
	}

	private static void processContextRoot(RMLDataStruct loadedEMFComponents,
			ArrayList<String> contextNamesLoaded,
			ArrayList<ContextImpl> contexts, IContextRoot cr)
			throws RodinDBException {

		// iterate through the contexts extended contexts
		IExtendsContext[] extendsClauses = cr.getExtendsClauses();
		for (IExtendsContext extCtx : extendsClauses) {
			IContextRoot seenCR = extCtx.getAbstractContextRoot();
			// recurse through the extended contexts, adding the relevant info
			// as #1 below
			processContextRoot(loadedEMFComponents, contextNamesLoaded,
					contexts, seenCR);
		}

		loadedEMFComponents.contextContainerMap.put(cr.getElementName(), cr
				.getRodinProject().getElementName());

		String cName = cr.getEventBProject() + "/" + cr.getElementName();
		if (!contextNamesLoaded.contains(cName)) {
			ContextImpl context = (ContextImpl) RodinToEMFConverter
					.loadContext((ContextRoot) cr);
			contextNamesLoaded.add(cName);
			contexts.add(context);
			loadedEMFComponents.contextList.add(context);
		}

	}

}
