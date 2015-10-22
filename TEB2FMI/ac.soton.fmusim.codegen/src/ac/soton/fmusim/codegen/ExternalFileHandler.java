package ac.soton.fmusim.codegen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.templates.util.TemplateException;
import org.eventb.codegen.templates.util.TemplateHelper;

public class ExternalFileHandler {
	// This method should send the external files from a source location
	// to their target folders. Any templates will be processed and sent to
	// the "src" folder, and other (unchanged) files will be copied to
	// "externals".
	public void handleExternalFiles() throws CoreException, IOException,
			TemplateException, IL1TranslationException {
		// get the external files from the source project
		if (FMUTranslator.sourceRodinProject == null) {
			throw new IL1TranslationException(
					"sourceProject not found in ExternalFileHandler Class");
		}
		List<IResource> externalResources = Arrays
				.asList(FMUTranslator.sourceRodinProject.getNonRodinResources());
		for (IResource resource : externalResources) {
			if (resource.getType() == IResource.FOLDER
					&& resource.getName().equals(
							FMUTranslator.EXTERNAL_SOURCE_FOLDER)) {
				IFolder folder = (IFolder) resource;
				List<IResource> folderMembers = Arrays.asList(folder.members());
				for (IResource member : folderMembers) {
					if (member.getType() == IResource.FILE) {
						IFile resourceFile = (IFile) member;
						String resourceFileName = resourceFile.getName();
						File iFile = new File(resourceFile.getRawLocationURI());
						FileReader reader = new FileReader(iFile);
						BufferedReader br = new BufferedReader(reader);
						// write all lines to a temporary store for processing
						List<String> outputArrayList = new ArrayList<String>();
						// Get a line and copy it. If it has the 'begin
						// markup' tag, then mark it as a template and we will
						// pass it on for special handling.
						boolean finished = false;
						boolean isTemplate = false;
						while (!finished) {
							String line = br.readLine();
							if (line == null) {
								finished = true;
							} else {
								outputArrayList.add(line);
								if (!isTemplate
										&& line.contains(TemplateHelper.TAG_COMMENT_CHARS)) {
									isTemplate = true;
								}
							}
						}
						br.close();
						// if we do not have a template we simply copy the file
						// to the destination.
						if (!isTemplate) {
							FMUTranslatorHelper translatorHelper = FMUTranslatorHelper.getDefault();
							BufferedWriter bw = translatorHelper.createBufferedWriter(
									FMUTranslator.targetProject,
									FMUTranslator.EXTERNAL_SOURCE_FOLDER,
									resourceFileName);
							for (String line : outputArrayList) {
								bw.write(line + "\n");
							}
							bw.close();
						} else
							throw new IL1TranslationException(
									"Template(s) found in 'external' "
											+ "folder, but should be a folder named templates");

					}
				}
				// we have found the externals folder, we can break out of the for loop
				// since we are done processing it.
				break;
			}
		}
	}

//	private BufferedWriter createBufferedWriter(IProject project,
//			String targetDirectoryName, String targetFileName)
//			throws IOException {
//		IProject targetProject = project;
//		IFolder resourceTargetFolder = targetProject
//				.getFolder(targetDirectoryName);
//		IFile resourceTargetFile = resourceTargetFolder.getFile(targetFileName);
//		File targetFile = new File(resourceTargetFile.getRawLocationURI());
//		FileWriter fw = new FileWriter(targetFile);
//		BufferedWriter bw = new BufferedWriter(fw);
//		return bw;
//	}

}
