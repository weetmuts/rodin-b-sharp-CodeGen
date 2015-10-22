package ac.soton.fmusim.codegen.translator.il1tofmuc;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.InParameter;
import org.eventb.codegen.il1.OutParameter;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.c.CTranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractIL1TranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractSubroutineIL1Translator;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.core.ast.Type;
import org.eventb.core.basis.MachineRoot;

import ac.soton.fmusim.codegen.FMUTranslator;

public class FMUCSubroutineTranslator extends AbstractSubroutineIL1Translator {

	@Override
	protected ArrayList<String> generateFunction(String name,
			ArrayList<String> parameterDefinitions,
			ArrayList<ArrayList<String>> localVariables, String guardList,
			ArrayList<String> body, boolean isProtected, boolean isEnviron,
			String machineName, Subroutine actualSource,
			IL1TranslationManager translationManager)
			throws IL1TranslationException {


		
		// DELETE THIS AFTER TESTING THAT IT NO LONGER HAS SIDE EFFECTS
		
		ArrayList<String> outCode = new ArrayList<String>();

		EList<Parameter> formalParams = actualSource.getFormalParameters();
		String fmiTypeName = null;
		String communicationDirection = null;

		// >>>>> // if this has parameter(s) then it must be a getXXX or SetXXX
		// for the master
		if (formalParams.size() > 0) {
			// Get any of the subroutine parameters, they should all be either
			// incoming, or outgoing
			Parameter subroutineParam = formalParams.get(0);
			// we also need the original event parameter to see if it incoming
			// or outgoing
			// FMU Out = master GET
			// ... the setter passes a const array.
			String settersArrayModifier = "";
			if (subroutineParam instanceof OutParameter) {
				communicationDirection = "Get";
			}
			// FMU In = master Set
			else if (subroutineParam instanceof InParameter) {
				communicationDirection = "Set";
				settersArrayModifier = "const ";
			}
			String exampleParamName = subroutineParam.getIdentifier();
			String projectName = actualSource.getProjectName();
			fmiTypeName = getFMITypeName(projectName, machineName,
					exampleParamName, translationManager);

			// Format the parameters
			String fmiAPIparameters = "fmiComponent c, const fmiValueReference vr[], "
					+ "size_t nvr, "
					+ settersArrayModifier // this has been set to 'const' for a setter 
					+ "fmiInteger value[]";

			// pass the code out
			outCode.add("fmiStatus fmi" + communicationDirection + fmiTypeName + "("
					+ fmiAPIparameters + ")");
		}
		// >>>>> // else it must be an fmiDOStep subroutine
		else {
			// Format the parameters
			String fmiAPIparameters = "fmiComponent *c, fmiReal currentCommunicationPoint,"
					+ " fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint";
		}
		return null;
	}

	private String getFMITypeName(String projectName, String machineName,
			String variableName, IL1TranslationManager translationManager) {
		String fmiTypeName;
		MachineRoot root = (MachineRoot) translationManager.getSourceRoot(
				projectName, machineName);
		// get the FMI type from the type environment
		ITypeEnvironment typeEnv = translationManager
				.getTypeEnvironment(root);
		Type type = typeEnv.getType(variableName);
		// FIXIT BUG -- This returns the wrong type when you have two parameters 
		// in different events with the same name
		
		// We hard Code the translation of the parameter Type String here
		fmiTypeName = FMUTranslator.getFMITypeString(type);
		return fmiTypeName;
	}

	

	@Override
	protected String generateParameterDefinition(String type,
			String identifier, ParameterType parameterType) {
		String paramDefn = "";

		// Out parameters (to the calling subroutine) will be using the Pointer
		// class.
		switch (parameterType) {
		case OUT:
			paramDefn = type + " *" + identifier;
			break;
		case IN:
		default:
			paramDefn = type + " " + identifier;
			break;
		}

		return paramDefn;
	}

	@Override
	protected AbstractIL1TranslatorUtils getTranslatorUtils() {
		return new CTranslatorUtils();
	}

}
