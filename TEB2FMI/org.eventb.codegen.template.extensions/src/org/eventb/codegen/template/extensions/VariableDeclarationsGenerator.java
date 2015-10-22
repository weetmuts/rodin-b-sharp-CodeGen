package org.eventb.codegen.template.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

import FmiModelV1.DocumentRoot;
import FmiModelV1.FmiScalarVariable;
import ac.soton.fmusim.codegen.FMUTranslatorHelper;
import ac.soton.fmusim.codegen.ModelDescriptionManager;

public class VariableDeclarationsGenerator implements IGenerator {

	private Protected protectedSource = null;
	private ClassHeaderInformation headerInfo = null;

	@Override
	public List<String> generate(IGeneratorData data) {
		IL1TranslationManager translationManager = null;
		List<String> outCode = new ArrayList<String>();
		List<Object> dataList = data.getDataList();
		for (Object obj : dataList) {
			if (obj instanceof Protected) {
				protectedSource = (Protected) obj;
			} else if (obj instanceof IL1TranslationManager) {
				translationManager = (IL1TranslationManager) obj;
			}
		}
		headerInfo  = FMUTranslatorHelper.setupHeader(protectedSource, translationManager);
		processVariableDecls(outCode);
		return outCode;
	}

	// Add an FMI ValueReference declaration and initialisation
	// for each variable in the C target FMU's header. 
	private void processVariableDecls(List<String> outCode) {
		String machineName = protectedSource.getMachineName();
		List<DocumentRoot> docs = ModelDescriptionManager.getDefault()
				.getDocumentRootList();
		// find the document root for this IL1 protected
		for (DocumentRoot docRoot : docs) {
			if (docRoot.getFmiModelDescription().getModelName()
					.equals(machineName)) {
				// we have found the related modelDescription file, 
				// get the scalars.
				EList<FmiScalarVariable> scalars = docRoot
						.getFmiModelDescription().getModelVariables()
						.getScalarVariable();
				// Each of the scalars give rise to an FMI ValueReference
				for (FmiScalarVariable scalar : scalars) {
					// get the variable name and value reference into a
					// declaration, and put it in the header.
					String headerString = "static fmiValueReference " + scalar.getName() + "_"
							+ machineName + "_ = " + scalar.getValueReference()
							+ ";";
					headerInfo.getHeaderEntries().add(headerString);
				}
				// when we are done iterating through the scalars we can quit
				// the search
				break;
			}
		}
	}
}
