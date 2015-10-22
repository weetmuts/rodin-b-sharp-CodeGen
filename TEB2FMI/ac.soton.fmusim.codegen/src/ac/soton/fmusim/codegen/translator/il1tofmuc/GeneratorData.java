package ac.soton.fmusim.codegen.translator.il1tofmuc;

import java.util.ArrayList;
import java.util.List;

import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.templates.IGeneratorData;

// Generator Data for FMU translation:
// This is a class holding the information to be used for translation
// in the FMU template generators.
// In FMU translation the translation manager will almost always
// be required so we add a field for it. 
// The data list is more dynamic, and will contain different objects
// depending on the translation being undertaken.
public class GeneratorData implements IGeneratorData {
	
	IL1TranslationManager translationManager = null;
	private List<Object> dataList = new ArrayList<Object>();
	
	public List<Object> getDataList() {
		return dataList;
	}

}
