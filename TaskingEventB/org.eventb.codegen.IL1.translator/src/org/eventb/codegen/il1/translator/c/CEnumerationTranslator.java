package org.eventb.codegen.il1.translator.c;

import java.util.ArrayList;

import org.eventb.codegen.il1.Enumeration;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.core.AbstractEnumerationIL1Translator;
import org.eventb.codegen.il1.translator.core.AbstractIL1TranslatorUtils;

public class CEnumerationTranslator extends AbstractEnumerationIL1Translator {

	@Override
	protected ArrayList<String> declareEnumeration(String enumerationName,
			ArrayList<String> literals, Enumeration actualSource, IL1TranslationManager translationManager) {
		
		ArrayList<String> outCode = new ArrayList<String>();
		outCode.add("typedef enum " + enumerationName);		//	typedef needed to stop compiler complaining
		outCode.add("{");
		
		for (String l : literals)
		{
			outCode.add(l + ",");
		}
		
		outCode.add("} " + enumerationName + ";");		//	enumerationName needed at end to stop compiler complaining
		
		
		
		
		return outCode;
	}

	@Override
	protected AbstractIL1TranslatorUtils getTranslatorUtils() {		
		return new CTranslatorUtils();
	}

}
