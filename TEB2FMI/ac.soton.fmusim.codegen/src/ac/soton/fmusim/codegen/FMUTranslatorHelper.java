package ac.soton.fmusim.codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;

public class FMUTranslatorHelper {

	private static FMUTranslatorHelper helper;

	public static FMUTranslatorHelper getDefault() {
		if (helper == null) {
			helper = new FMUTranslatorHelper();
		}
		return helper;
	}

	public BufferedWriter createBufferedWriter(IProject project,
			String targetDirectoryName, String targetFileName)
			throws IOException {
		IProject targetProject = project;
		IFolder resourceTargetFolder = targetProject
				.getFolder(targetDirectoryName);
		IFile resourceTargetFile = resourceTargetFolder.getFile(targetFileName);
		File targetFile = new File(resourceTargetFile.getRawLocationURI());
		FileWriter fw = new FileWriter(targetFile);
		BufferedWriter bw = new BufferedWriter(fw);
		return bw;
	}

	public BufferedWriter createBufferedWriter(IFolder resourceTargetFolder,
			String targetFileName) throws IOException, IL1TranslationException {
		IFile resourceTargetFile = resourceTargetFolder.getFile(targetFileName);
		File targetFile = new File(resourceTargetFile.getRawLocationURI());
		FileWriter fw = new FileWriter(targetFile);
		if (!targetFile.exists()) {
			boolean success = targetFile.createNewFile();
			if (!success)
				throw new IL1TranslationException(
						"Failed to create new targetFile: "
								+ resourceTargetFile.getName() + "/"
								+ targetFileName);
		}
		if (!targetFile.canWrite()) {
			throw new IL1TranslationException("Unable to write to targetFile"
					+ resourceTargetFile.getName() + "/"
					+ targetFileName);
		}

		BufferedWriter bw = new BufferedWriter(fw);
		return bw;
	}
	
	// This method finds or creates a new header for this C target,
	// as defined by the protectedSource.
	public static ClassHeaderInformation setupHeader(Protected protectedSource,
			IL1TranslationManager translationManager) {
		ClassHeaderInformation headerInfo_ = null;
		// These subroutines all belong to one shared machine/object, so they
		// have a common c source file, and also header file. Lets get/create a
		// header, and store
		// the generated subroutines after processing.
		ArrayList<ClassHeaderInformation> headerList = translationManager
				.getClassHeaderInformation();
		// look for an existing header for the class
		boolean found = false;
		for (ClassHeaderInformation classHeader : headerList) {
			String className = classHeader.getClassName();
			if (className.equals(protectedSource.getName())) {
				headerInfo_ = classHeader;
				// save the headers, this will be used later on
				found = true;
				break;
			}
		}

		// if the header did not exist create a new one
		if (!found) {
			headerInfo_ = new ClassHeaderInformation();
			headerInfo_.setClassName(protectedSource.getName());
			translationManager.addClassHeaderInformation(headerInfo_);
		}
		return headerInfo_;
	}

}
