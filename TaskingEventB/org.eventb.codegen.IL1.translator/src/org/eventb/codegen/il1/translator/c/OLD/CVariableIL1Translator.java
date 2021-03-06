package org.eventb.codegen.il1.translator.c.OLD;

import java.util.ArrayList;

import org.eventb.codegen.il1.FullyTranslatedDecl;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.PartiallyTranslatedDecl;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.il1.TranslatedDecl;
import org.eventb.codegen.il1.VariableDecl;
import org.eventb.codegen.il1.translator.AbstractIL1Translator;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.il1.translator.TargetLanguage;
@Deprecated
public class CVariableIL1Translator extends AbstractIL1Translator{

	@Override
	public ArrayList<String> translate(IL1Element source,
			IL1TranslationManager translationManager, TargetLanguage targetLanguage)
			throws IL1TranslationUnhandledTypeException {
		
		ArrayList<String> outCode = new ArrayList<String>();
		VariableDecl actualSource = (VariableDecl)source;
		
		TranslatedDecl translated = translationManager.translateDeclaration(actualSource, targetLanguage);
		
		String machineName = "";
		Task t = translationManager.getParentTask(actualSource);
		if (t != null)
		{
			machineName = t.getName();
		}
		else
		{
			Protected p = translationManager.getParentProtected(actualSource);
			machineName = p.getName();
		}
		
		
		if (translated instanceof PartiallyTranslatedDecl)
		{
//			outCode.add(translated.getType() + " " + actualSource.getIdentifier() + "_" + machineName +  " = " + ((PartiallyTranslatedDecl)translated).getPartialInitialisationExpression() + ";");
			String declLine = translated.getType() + " " + actualSource.getIdentifier() + "_" + machineName;
			
			String init = ((PartiallyTranslatedDecl)translated).getPartialInitialisationExpression();
			if (init != null && !init.equals(""))
			{
				declLine += " = " + init + ";";
			}
			else
			{
				declLine += ";";
			}	
			
			outCode.add(declLine);
		}
		else if (translated instanceof FullyTranslatedDecl)
		{
			//	
			//	outCode.addAll(((FullyTranslatedDecl) translated).getFullInitialisationExpression());
			
			//	Update any variable decls in each line of the initialiser
			for (String s : ((FullyTranslatedDecl)translated).getFullInitialisationExpression())
			{
				//	Tokenize gLine to find the variables
				s = translationManager.tokenizeVariablesOperators(s);
				//	Append machine name to the variables
				s = CActionIL1Translator.updateVariableName(s, source, translationManager);
				
				outCode.add(s);
			}
		}
			
		return outCode;		
	}

}
