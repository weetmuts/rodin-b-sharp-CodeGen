package ac.soton.fmusim.codegen.popup.actions;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.eventb.codegen.templates.util.TemplateException;
import org.osgi.service.prefs.BackingStoreException;
import org.rodinp.core.RodinDBException;

import ac.soton.fmusim.codegen.FMUTranslator;
import ac.soton.fmusim.codegen.FMUTranslatorException;
import ac.soton.fmusim.codegen.FMUTranslatorPlugin;

public class CodeGenV1_0 implements IObjectActionDelegate {

	private IStructuredSelection selection;

	/**
	 * Constructor for Action1.
	 */
	public CodeGenV1_0() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			// This method invokes the translation from Event-B to FMU Version 1.0
			FMUTranslator fmuTranslator = new FMUTranslator();
			fmuTranslator.setTargetFMIVersion(FMUTranslator.FMI_VERSION_1_0);
			fmuTranslator.translateToFMU(selection);
			// catch all the things that may go wrong
		} catch (RodinDBException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: RodinDBException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (TaskingTranslationUnhandledTypeException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: TaskingTranslationUnhandledTypeException:"
							+ e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (TaskingTranslationException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: TaskingTranslationException:"
							+ e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (BackingStoreException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: BackingStoreException:"
							+ e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: CoreException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IOException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (URISyntaxException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: URISyntaxException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IL1TranslationUnhandledTypeException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IL1TranslationUnhandledTypeException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (TemplateException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: TemplateException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IL1TranslationException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IL1TranslationException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (FMUTranslatorException e) {
			Status status = new Status(IStatus.ERROR, FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: FMUTranslationException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
