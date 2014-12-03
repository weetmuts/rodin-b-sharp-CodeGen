package org.eventb.codegen.il1.translator.c;

import java.util.ArrayList;

import org.eventb.codegen.il1.FullyTranslatedDecl;
import org.eventb.codegen.il1.VariableDecl;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.core.AbstractVariableIL1Translator;

public class CVariableTranslator extends AbstractVariableIL1Translator {

	@Override
	protected String generateVariableDeclaration(String type,
			String identifier, String initialisation, String machineName,
			boolean isProtected) {


		if (initialisation != null && !initialisation.equals(""))
		{
			return type + " " + identifier + "_" + machineName + " = " + initialisation + ";";			
		}
		else
		{
			return type + " " + identifier + "_" + machineName + ";";
		}
		
	}

	@Override
	protected ArrayList<String> handleFullyTranslatedDecl(
			FullyTranslatedDecl decl, VariableDecl actualSource,
			String machineName, IL1TranslationManager translationManager) {
		
		ArrayList<String> outCode = new ArrayList<String>();
		//	Update any variable decls in each line of the initialiser
		for (String s : decl.getFullInitialisationExpression())
		{
			//	Tokenize gLine to find the variables
			s = translationManager.tokenizeVariablesOperators(s);
			//	Append machine name to the variables
			//s = CActionIL1Translator.updateVariableName(s, actualSource, translationManager);
			CTranslatorUtils utils = new CTranslatorUtils();
			s = utils.updateVariableName(s, actualSource, translationManager);

			if(decl.getType() != null){
				s = decl.getType() + " " +s;
			}			
			outCode.add(s + ";");
		}
				
		return outCode;
	}

}
