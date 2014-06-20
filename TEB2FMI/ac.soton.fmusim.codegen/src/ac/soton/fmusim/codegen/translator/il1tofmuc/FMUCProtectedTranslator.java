package ac.soton.fmusim.codegen.translator.il1tofmuc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.core.AbstractProtectedIL1Translator;
import org.eventb.codegen.templates.util.TemplateException;
import org.eventb.codegen.templates.util.TemplateProcessor;

import ac.soton.fmusim.codegen.FMUTranslator;
import ac.soton.fmusim.codegen.FMUTranslatorPlugin;

public class FMUCProtectedTranslator extends AbstractProtectedIL1Translator {

	private Protected actualSource = null;
	private ArrayList<ArrayList<String>> subList = null;
	private IL1TranslationManager translationManager = null;

	@Override
	public ArrayList<String> generateProtectedCode(
			ArrayList<ArrayList<String>> declList,
			ArrayList<ArrayList<String>> subList_, String name,
			Protected actualSource_, IL1TranslationManager translationManager_,
			TargetLanguage targetLanguage) {
		// Set a private static field to be used by the 'current' translation
		actualSource = actualSource_;
		subList = subList_;
		translationManager = translationManager_;

		try {
			// check that event parameters have unique names.
			// Else it upsets their record in the type environment.
			parameterCheck(actualSource);
			useTemplates();
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: CoreException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IOException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (TemplateException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: TemplateException :", e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IL1TranslationException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IL1TranslationException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (Exception e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IL1TranslationException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		}
		ArrayList<String> outCode = new ArrayList<String>();
		
		// If any subroutines have been generated during the template
		// instantiation we can add the subroutine signatures 
		// to the header here.
		outCode.add("");
		if (subList.size() > 0) {
			ClassHeaderInformation headerInfo = new ClassHeaderInformation();
			headerInfo.setClassName(actualSource.getName());
			for (ArrayList<String> sub : subList) {
				// The first line will contain the information to be placed in
				// the header file for this machine
				for (String s : sub) {
					headerInfo.getHeaderEntries().add(s + ";");
					outCode.add("");
				}
			}
			translationManager.addClassHeaderInformation(headerInfo);
		}
		return outCode;
	}

	private void parameterCheck(Protected prot) throws Exception {
		EList<Subroutine> subroutineList = prot.getSubroutines();
		List<String> paramNameList = new ArrayList<String>();
		List<String> paramNameRepeatList = new ArrayList<String>();
		for (Subroutine subroutine : subroutineList) {
			EList<Parameter> paramList = subroutine.getFormalParameters();

			for (Parameter param : paramList) {
				if (!paramNameList.contains(param.getIdentifier())) {
					paramNameList.add(param.getIdentifier());
				} else {
					paramNameRepeatList.add(param.getIdentifier());
				}
			}
			if (paramNameRepeatList.size() > 0) {
				throw new Exception(
						"\n The following duplicate parameter names should be unique "
								+ paramNameRepeatList.toString() + "\n");
			}
		}
	}

	private void useTemplates() throws Exception {
		// Create the Template Processor
		TemplateProcessor templateProcessor = TemplateProcessor.getDefault();
		// Initialise the template processor with the TARGET and SOURCE information.
		templateProcessor.initialiseTarget(FMUTranslator.targetProject,
				FMUTranslator.GENERATED_SRC_FOLDER);
		templateProcessor.initialiseSource(FMUTranslator.sourceRodinProject,
				FMUTranslator.TEMPLATES_SRC_FOLDER);
		// Get the processor to instantiate the 'Top-Level' template.
		// Templates contained 'within' are handled by the processor
		// and TemplateHelper. We can pass a data object to assist with the
		// translation, so we pass the actual source object, we could make this
		// more complex if necessary (and add constraints)
		GeneratorData generatorData = new GeneratorData();
		List<Object> generatorDataList = generatorData.getDataList();
		generatorDataList.add(actualSource);
		generatorDataList.add(translationManager);
		templateProcessor.instantiateTemplate("fmuTemplate.c", generatorData);
	}
}
