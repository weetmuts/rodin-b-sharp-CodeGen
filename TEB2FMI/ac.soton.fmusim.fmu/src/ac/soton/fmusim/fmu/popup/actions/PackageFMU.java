package ac.soton.fmusim.fmu.popup.actions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;

import ac.soton.fmusim.codegen.FMUTranslatorException;
import ac.soton.fmusim.fmu.FMUPackagerPlugin;

public class PackageFMU implements IObjectActionDelegate {

	@SuppressWarnings("unused")
	private Shell shell;
	private IStructuredSelection selection;
	private String projectName;
	private IProject sourceProject;
	private String modelIdentifier;
	private String osBits;
	private String osName;

	/**
	 * Constructor for Action1.
	 */
	public PackageFMU() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			sourceProject = (IProject) selection.getFirstElement();
			IFile srcDescriptionFile = getSourceDescriptionFile(sourceProject);
			packageFMU(srcDescriptionFile);
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR,
					FMUPackagerPlugin.PLUGIN_ID,
					"Packaging FMU Failed: CoreException:" + e.getMessage()
							+ ":\n", e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
			e.printStackTrace();
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR,
					FMUPackagerPlugin.PLUGIN_ID,
					"Packaging FMU Failed: IOException:" + e.getMessage()
							+ ":\n", e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
			e.printStackTrace();
		} catch (FMUTranslatorException e) {
			Status status = new Status(IStatus.ERROR,
					FMUPackagerPlugin.PLUGIN_ID,
					"Packaging FMU Failed:" + e.getMessage()
							+ ":\n", e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
			e.printStackTrace();
		}

	}

	private void packageFMU(IFile srcDescriptionFile) throws CoreException,
			FileNotFoundException, IOException, FMUTranslatorException {
		IFile binaryFile = null;
		projectName = sourceProject.getName();
		IFolder fmuCodeFolder = sourceProject.getFolder("src");
		IFolder fmuExternalsFolder = sourceProject.getFolder("external");

		// set up the zip output
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject targetProject = root.getProject(projectName + "FMU");
		// create a new project
		if (!targetProject.exists())
			targetProject.create(null);
		if (!targetProject.isOpen())
			targetProject.open(null);
		// this will be the new zip file
		IPath path = srcDescriptionFile.getRawLocation();
		modelIdentifier = path.removeFileExtension().lastSegment();
		IFile targetZipFile = targetProject.getFile(modelIdentifier + ".fmu");
		String targetZipName = targetZipFile.getRawLocation().toString();
		// get output streams to write to the zip
		FileOutputStream fOut = new FileOutputStream(targetZipName);
		ZipOutputStream zipOut = new ZipOutputStream(fOut);

		// Find where the binaries are stored
		List<IResource> projectMembersList = Arrays.asList(sourceProject
				.members());
		List<IResource> releaseFolderList = new ArrayList<IResource>();

		// find release folders
		for (IResource resource : projectMembersList) {
			if (IResource.FOLDER == resource.getType()) {
				if (resource.getName().startsWith("Release")) {
					releaseFolderList.add(resource);
				}
			}
		}

		if (releaseFolderList.size() == 0) {
			zipOut.close();
			throw new FMUTranslatorException(
					"There are no files to package \n "
							+ "Ensure the following format for the target folder \n"
							+ "Release_<archictecture><bits>_<osname><bits> \n"
							+ "e.g Release_X86_64_Linux64 \n"
							+ "Release_X86_64_Win64");
		}

		// process release folders
		for (IResource resource : releaseFolderList) {
			IFolder releaseBinariesFolder = (IFolder) resource;
			String folderName = resource.getName();
			String[] folderSplit = folderName.split("_");
			osName = folderSplit[folderSplit.length - 1].toLowerCase();

			// Construct the libraryName -
			// this will need to change - for other targets
			String fileExt = "unknown";
			String filePre = "unKnown";
			if (osName.startsWith("linux")) {
				filePre = "lib";
				fileExt = ".so";
				osBits = osName.replace("linux", "");
			}
			if (osName.startsWith("win")) {
				filePre = "";
				fileExt = ".dll";
				osBits = osName.replace("win", "");
			}
			String sourceBinaryFileName = filePre + projectName + fileExt;
			// Get the binary.so
			IFile releaseBinaryFile = releaseBinariesFolder
					.getFile(sourceBinaryFileName);
			
			
			if (!releaseBinaryFile.exists()) {
				FileDialog fd = new FileDialog(shell);
				String fname = fd.open();
				IPath p = new Path(fname);
				String lastSegment = p.lastSegment();
				
				releaseBinaryFile = releaseBinariesFolder.getFile(lastSegment);
			}
			
			if (!releaseBinaryFile.exists()) {
				throw new IOException("Error no suitable library discovered,\n"	+
						"try a WORKSPACE REFRESH" +
						" (since the compiler doesn't seem to do it)");
			} else
				binaryFile = releaseBinaryFile;

			// package the binary file
			packageBinaryFile(binaryFile, zipOut);

		}

		// package the model description
		packageModelDescription(srcDescriptionFile, zipOut);
		// package the source files
		packageSources(fmuCodeFolder, fmuExternalsFolder, zipOut);
		zipOut.close();
		targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	// We'll package the source code here
	private void packageSources(IFolder fmuCodeFolder,
			IFolder fmuExternalsFolder, ZipOutputStream zipOut)
			throws CoreException, IOException {
		List<IResource> sourceFiles1 = Arrays.asList(fmuCodeFolder.members());
		List<IResource> sourceFiles2 = Arrays.asList(fmuExternalsFolder
				.members());
		writeSources(fmuCodeFolder, zipOut, sourceFiles1);
		writeSources(fmuExternalsFolder, zipOut, sourceFiles2);
	}

	private void writeSources(IFolder fmuSourcesFolder, ZipOutputStream zipOut,
			List<IResource> sourceFiles) throws CoreException, IOException {
		// for each source file
		for (IResource resource : sourceFiles) {
			IPath fullPath = resource.getFullPath();
			String resourceName = fullPath.lastSegment();
			boolean ignore = false;
			// ignore the file if it is one of these
			if (resourceName.equalsIgnoreCase("fmiModelFunctions.h")
					|| resourceName.equalsIgnoreCase("fmiModelTypes.h")) {
				ignore = true;
			}

			if (!ignore) {
				// construct a streamReader
				IFile srcFile = fmuSourcesFolder.getFile(resourceName);
				InputStream srcFileStream = srcFile.getContents();
				InputStreamReader srcStreamReader = new InputStreamReader(
						srcFileStream);
				// add the source file entry
				ZipEntry ze = new ZipEntry("sources" + File.separatorChar
						+ resourceName);
				zipOut.putNextEntry(ze);
				// write the source file content
				int value = srcStreamReader.read();
				while (value >= 0) {
					zipOut.write(value);
					value = srcStreamReader.read();
				}
				srcStreamReader.close();
			}
		}
	}

	private void packageBinaryFile(IFile binaryFile, ZipOutputStream zipOut)
			throws CoreException, FileNotFoundException, IOException {
		String sourceBinaryFileName = binaryFile.getName();
		String fileExt = binaryFile.getRawLocation().getFileExtension();
		// get a reader for the library .so
		if (!binaryFile.isAccessible())
			throw new FileNotFoundException("Cannot Find "
					+ sourceBinaryFileName);
		InputStream binaryStream = binaryFile.getContents();
		BufferedInputStream bufferedStreamReader = new BufferedInputStream(
				binaryStream);

		// create a zip entry
		String tgtDirectory = "";
		if (osName.startsWith("linux")) {
			if (osBits.equals("64"))
				tgtDirectory = "linux64";
			else if (osBits.equals("32"))
				tgtDirectory = "linux32";
		} else if (osName.startsWith("win")) {
			if (osBits.equals("64"))
				tgtDirectory = "win64";
			else if (osBits.equals("32"))
				tgtDirectory = "win32";
		}

		// add the binary file entry
		ZipEntry ze = new ZipEntry("binaries" + File.separatorChar
				+ tgtDirectory + File.separatorChar + modelIdentifier + "."
				+ fileExt);
		zipOut.putNextEntry(ze);

		// write the file to the zip entry
		// int value = binaryStreamReader.read();
		int value = bufferedStreamReader.read();
		while (value >= 0) {
			zipOut.write(value);
			value = bufferedStreamReader.read();
		}
		bufferedStreamReader.close();
	}

	private void packageModelDescription(IFile srcDescriptionFile,
			ZipOutputStream zipOut) throws CoreException, IOException {
		InputStream srcDescriptionStream = srcDescriptionFile.getContents();
		InputStreamReader descriptionStreamReader = new InputStreamReader(
				srcDescriptionStream);
		
		
		
		// Create the target description path. It goes in the archive root
		String tgtDescriptionFileName = "modelDescription.xml";

		// create a zip entry
		ZipEntry ze = new ZipEntry(tgtDescriptionFileName);
		zipOut.putNextEntry(ze);
		
// Begin new approach to writing the XML
// filtering out the documentRoot tag
		BufferedReader bufferedReader = new BufferedReader(descriptionStreamReader);

		
		String line = bufferedReader.readLine();
		
		while(line != null){
			if(!line.contains("DocumentRoot")){
				if(line.contains("xsi:")){
					line = line.replace("xsi:", "");
				}
				
				for(int index = 0; index < line.length(); index++){
					char l = line.charAt(index);
					zipOut.write(l);
				}
				zipOut.write('\n');
			}
			line = bufferedReader.readLine();
		}
// end new approach		
		
		
		// write the file to the zip entry
//		int value = descriptionStreamReader.read();
//		while (value >= 0) {
//			zipOut.write(value);
//			value = descriptionStreamReader.read();
//		}
		descriptionStreamReader.close();
	}

	private IFile getSourceDescriptionFile(IProject sourceProject)
			throws CoreException, FileNotFoundException {
		IFolder srcDescriptionsFolder = sourceProject.getFolder("descriptions");
		IResource[] members = srcDescriptionsFolder.members();
		if (members.length > 1)
			throw new FileNotFoundException(
					"Found too many files in the descriptions folder: "
							+ srcDescriptionsFolder.getName());
		IResource srcDescriptionResource = members[0];
		String srcDescriptionFileName = srcDescriptionResource.getName();
		IFile srcDescriptionFile = srcDescriptionsFolder
				.getFile(srcDescriptionFileName);
		return srcDescriptionFile;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
