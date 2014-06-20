package org.eventb.codegen.template.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.c.CTranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractIL1TranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractSubroutineIL1Translator;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

import ac.soton.fmusim.codegen.FMUTranslator;

public class SubroutineListGenerator extends AbstractSubroutineIL1Translator
		implements IGenerator {

	private Protected protectedSource = null;
	private IL1TranslationManager translationManager = null;
	private TargetLanguage targetLanguage = null;
	private ClassHeaderInformation headerInfo = null;

	@Override
	public List<String> generate(IGeneratorData data)
			throws IL1TranslationUnhandledTypeException,
			IL1TranslationException {
		List<String> outCode = new ArrayList<String>();
		List<Object> dataList = data.getDataList();
		for (Object obj : dataList) {
			if (obj instanceof Protected) {
				protectedSource = (Protected) obj;
			} else {
				if (obj instanceof IL1TranslationManager) {
					translationManager = (IL1TranslationManager) obj;
					targetLanguage = translationManager
							.getCurrentTranslationTarget();
				}
			}
		}
		// These subroutines all belong to one shared machine/object, so they
		// have a common c source file, and also header file. Lets get/create a header, and store
		// the generated subroutines after processing.
		ArrayList<ClassHeaderInformation> headerList = translationManager.getClassHeaderInformation();
		// look for an existing header for the class
		boolean found = false;
		for(ClassHeaderInformation classHeader: headerList){
			String className = classHeader.getClassName();
			if(className.equals(protectedSource.getName())){
				headerInfo = classHeader;
				// save the headers, this will be used later on
				found = true;
				break;
			}
		}
		
		// if the header did not exist create a new one
		if(!found){
			headerInfo = new ClassHeaderInformation();
			headerInfo.setClassName(protectedSource.getName());
			translationManager.addClassHeaderInformation(headerInfo);
		}
		// now process the subroutines
		processSubroutines(outCode);
		
		return outCode;
	}

	private void processSubroutines(List<String> outCode)
			throws IL1TranslationException,
			IL1TranslationUnhandledTypeException {
		EList<Subroutine> subroutines = protectedSource.getSubroutines();
		for (Subroutine subroutine : subroutines) {
			ArrayList<String> translate = translate(subroutine,
					translationManager, targetLanguage);
			outCode.addAll(translate);
		}
	}

	@Override
	protected ArrayList<String> generateFunction(String name,
			ArrayList<String> parameterDefinitions,
			ArrayList<ArrayList<String>> localVariables, String guardList,
			ArrayList<String> body, boolean isProtected, boolean isEnviron,
			String machineName, Subroutine actualSource,
			IL1TranslationManager translationManager)
			throws IL1TranslationException {
		ArrayList<String> outCode = new ArrayList<String>();
		
		
			// generate fmiDoStep
			outCode.addAll(generateFMIDoStepFunction(name, parameterDefinitions, localVariables, guardList,
					body, isProtected, isEnviron, machineName, actualSource, translationManager));
			return outCode;
	}

	
	// a generatefunction method that creates:
	// in-line actions for subroutines, derived from the taskbody, into the fmiDoStep function
	// Generate getters/setters for different the types i.e. Integer, Boolean, String, Real
	private ArrayList<String> generateFMIDoStepFunction(String name,
			ArrayList<String> parameterDefinitions,
			ArrayList<ArrayList<String>> localVariables, String guardList,
			ArrayList<String> body, boolean isProtected, boolean isEnviron,
			String machineName, Subroutine actualSource,
			IL1TranslationManager translationManager) throws IL1TranslationException {
		
		ArrayList<String> outCode = new ArrayList<String>();

		// if the subroutine is not communicating then map it to the fmiDoStep
		if(!translationManager.getCommunicatingSubroutines().contains(actualSource)){
			// Format the parameters
			String fmiAPIparameters = "fmiComponent c, fmiReal currentCommunicationPoint,"
					+ " fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint";

			// Uniquely identify each event name using the machine name
			String doStepSignature = "fmiStatus fmiDoStep(" + fmiAPIparameters
					+ ")";
			// This is where we store the function Declaration that goes into
			// the header for the current C file.
			headerInfo.getHeaderEntries().add(doStepSignature + ";");
			outCode.add(doStepSignature);
			outCode.add("{"); // open function

			// Guards
			if (!guardList.equals("")) {
				outCode.add("// Check to see if guard is met");
				outCode.add("if (" + guardList + ")");
				outCode.add("{"); // open guarded
			}

			// Local variables
			for (ArrayList<String> lVars : localVariables) {
				outCode.addAll(lVars);
			}

			List<String> newBody = substituteVariableRefs(body, actualSource,
					translationManager);
			// Body code
			outCode.add("ModelInstance* mc = c;");
			outCode.add("// Translated code");
			outCode.addAll(newBody);

			if (!guardList.equals("")) {
				if (isProtected || isEnviron) {
					outCode.add("");
				}
				outCode.add("}"); // close guarded
			}
			outCode.add("return fmiOK;"); // return OK upon successful
											// completion
			outCode.add("}"); // close function

		}
		// the actual source is communicating
		return outCode;
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

// We may need a GetReal function generator which should look like
// the following >>>>>>
//	private List<String> createGetRealStatement(String fmiTypeName,
//			IL1TranslationManager translationManager)
//			throws IL1TranslationException {
//		String variableArrayRef = FMUTranslator
//				.getVariableRefArrayName(fmiTypeName);
//		List<String> newCode = new ArrayList<String>();
//		newCode.add(fmiStatus getReal(){);	
//		newCode.add("int idx = 0;");
//		newCode.add("ModelInstance* mc = c;");
//		newCode.add("for(; idx < nvr; idx = idx + 1){");
//		newCode.add("value[ idx ] = mc->" + variableArrayRef
//				+ " [ vr[idx] ];");
//		newCode.add("}");
//		newCode.add("}");
//		return newCode;
//	}
//

	private List<String> substituteVariableRefs(ArrayList<String> body,
			Subroutine actualSource, IL1TranslationManager translationManager)
			throws IL1TranslationException {
		// The body code needs to be converted to use the variable
		// references.
		// get the variable declarations
		EList<Declaration> decls = translationManager.getParentProtected(
				actualSource).getDecls();
		// iterate through each line in the subroutine body
		// to create a new body with substitutions if necessary
		List<String> newBody = new ArrayList<String>();
		for (String line : body) {
			// copy the line to work on
			String modifiedCode = line;
			// for each declaration
			for (Declaration d : decls) {
				// modify the statement where we find the declared variable
				modifiedCode = FMUTranslator.updateFieldVariableName(modifiedCode,
						d, translationManager);
			}
			// if the line has been changed
			if (!line.equals(modifiedCode)) {
				newBody.add(modifiedCode);
			}
			// else add the original line
			else {
				newBody.add(line);
			}
		}
		return newBody;
	}

}
