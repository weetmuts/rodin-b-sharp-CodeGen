package ac.soton.fmusim.codegen;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.VariableDecl;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.core.ast.Type;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;
import org.rodinp.core.IRodinDB;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

import FmiModel.BooleanType;
import FmiModel.CausalityType;
import FmiModel.CoSimulationType;
import FmiModel.DefaultExperimentType;
import FmiModel.DocumentRoot;
import FmiModel.FmiModelDescriptionType;
import FmiModel.FmiModelFactory;
import FmiModel.FmiScalarVariable;
import FmiModel.InitialType;
import FmiModel.InputType;
import FmiModel.InputsType;
import FmiModel.IntegerType;
import FmiModel.ModelStructureType;
import FmiModel.ModelVariablesType;
import FmiModel.OutputType;
import FmiModel.OutputsType;
import FmiModel.RealType1;
import FmiModel.StringType;
import FmiModel.VariabilityType;
import FmiModel.util.FmiModelResourceImpl;
import ac.soton.fmusim.components.EventBComponent;
import ac.soton.fmusim.components.Port;

// This class is the entry point for the translation proper. 
// UNLIKE the existing C code generator, it does not extend AbstractProgramIL1Translator.
// It is not related to the extensibility mechanism implemented by Chris, i.e. does not
// use an extension point. However, protected objects, and those nested within, do use it.

public class FMUModelDescriptionV2_0 {
//	// Declaration of Types handled by the translator.
	private static final String REAL = "Real";
	private static final String STRING = "String";
	private static final String BOOLEAN = "Boolean";
	private static final String INTEGER = "Integer";
	// The program linked to the model description
	private Program program;
	// source a target projects
	private IRodinProject sourceRodinProject;
	private IProject targetProject;
	private TaskingTranslationManager taskingTranslationManager;
	// keep track of the counts of integers etc
	private int realVariableCount = 0;
	private int stringVariableCount = 0;
	private int integerVariableCount = 0;
	private int boolVariableCount = 0;
	// info from the diagram
	private EventBComponent eventBComponent;
	private List<String> inputPortNames;
	private List<String> outputPortNames;

	public FMUModelDescriptionV2_0(Program program_, TaskingTranslationManager taskingTranslationManager_,
			IProject targetProject_, EventBComponent eventBComponent_){
		program = program_;
		taskingTranslationManager = taskingTranslationManager_;
		targetProject = targetProject_;
		eventBComponent = eventBComponent_;
	}
	
	public void create() throws CModelException, IOException, TaskingTranslationException, CoreException
			 {
		IRodinDB rodinDB = RodinCore.getRodinDB();
		sourceRodinProject = rodinDB.getRodinProject(program.getProjectName());
		// Create a target Directory
		// From the program, we can create the modelDescription file
		createModelDescriptionFile(program);
	}

	private void createModelDescriptionFile(Program program)
			throws IOException, TaskingTranslationException, CModelException,
			CoreException {
		// retrieve the (one and only) fmuMachine being translated
		Machine machine = taskingTranslationManager.getFMUMachineList().get(0);

		// Reset the value reference array indices for each machine.
		realVariableCount = 0;
		stringVariableCount = 0;
		integerVariableCount = 0;
		boolVariableCount = 0;
		// Each fmuMachine will have its own DocumentRoot
		DocumentRoot docRoot = FmiModelFactory.eINSTANCE.createDocumentRoot();
		ModelDescriptionManager modelDescriptionsManager = ModelDescriptionManager.getDefault();
		// add this machine documentroot to the list
// **************************************************************************//		
// IF we implement an FMI V2 version of this, we will need to add a 
// modelDescriptionsManager that can handle  FmiModelFactory.DocumentRoot.
// Since We only handle FMU v1 in the current manager.
//		such as
//		FmiModel.DocumentRoot docRoot = FmiModelFactory.eINSTANCE.createDocumentRoot();
//		modelDescriptionsManagerV2.getDocumentRootList().add(docRoot);
// **************************************************************************//
		
		// set various values
		FmiModelDescriptionType descriptionType = FmiModelFactory.eINSTANCE
				.createFmiModelDescriptionType();
		
		// Add default experiment to store the stepSize
		DefaultExperimentType defaultExperimentType = FmiModelFactory.eINSTANCE.createDefaultExperimentType();
		descriptionType.setDefaultExperiment(defaultExperimentType);
		defaultExperimentType.setStepSize(eventBComponent.getStepPeriod());
		
		// Add the modelStructure Attribute
		ModelStructureType modelStructureType = FmiModelFactory.eINSTANCE.createModelStructureType();
		descriptionType.setModelStructure(modelStructureType);
		
		docRoot.setFmiModelDescription(descriptionType);
		descriptionType.setFmiVersion("2.0");
		descriptionType.setGenerationTool("EB2FMU");
		descriptionType.setAuthor("University of Southampton");
		XMLGregorianCalendar xmlGC = makeDate();
		descriptionType.setGenerationDateAndTime(xmlGC);
		descriptionType.setGuid("GUID_" + machine.getName() + "_"
				+ xmlGC.toXMLFormat());
		descriptionType.setModelName(machine.getName());
		descriptionType.setNumberOfEventIndicators(0);
		// This is a co-simulation
		CoSimulationType coSimType = FmiModelFactory.eINSTANCE
				.createCoSimulationType();
		descriptionType.getCoSimulation().add(coSimType);
		coSimType.setModelIdentifier(machine.getName());
		// This is where we store the FMI scalar variables
		ModelVariablesType modelVarsType = FmiModelFactory.eINSTANCE
				.createModelVariablesType();
		descriptionType.setModelVariables(modelVarsType);
		// Get the info to obtain the type environment
		IRodinFile mchFile = sourceRodinProject.getRodinFile(machine.getName()
				+ ".bum");
		MachineRoot root = (MachineRoot) mchFile.getRoot();
		EList<Variable> variableList = machine.getVariables();
		// get the FMI type from the type environment
		ITypeEnvironment typeEnv = taskingTranslationManager
				.getTypeEnvironment(root);
		// extract a list of input/output port names
		setupInputOutputPortNames();
		// Iterate through the machine's variables and generate FMIScalar
		// values
		TreeIterator<EObject> contents = program.eAllContents();
		// variable decl list is used to translate variables to scalars
		ArrayList<VariableDecl> variableDeclList = createVariableDeclList(contents);

		for (Variable var : variableList) {
			variableToFMIScalar(modelVarsType, typeEnv, var, variableDeclList, descriptionType);
		}
		
		// END OF BUILD modelDescription.xml
		
		// Now deal with persisting it.
		// Create a descriptions folder.
		String fileName = machine.getName()
				+ "."
				+ FmiModelFactory.eINSTANCE.getEPackage().getName()
						.toLowerCase();
		File newFile = createNewFile(fileName, "descriptions");
		String netUri = newFile.toURI().toString();
		URI emfURI = URI.createURI(netUri);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(emfURI);
		if (resource instanceof FmiModelResourceImpl) {
			FmiModelResourceImpl fmiModelRes = (FmiModelResourceImpl) resource;
			fmiModelRes.setEncoding("UTF-8");
		}
		resource.getContents().add(docRoot);
		resource.save(Collections.EMPTY_MAP);
	}// end of createModelDescriptionFile(...);

	// create a new file, with fileName, in the named subFolder of 'the'
	// targetProject.
	private File createNewFile(String fileName, String subFolderName)
			throws CoreException, IOException {
		IFolder newFolder = targetProject.getFolder(subFolderName);
		if (!newFolder.exists()) {
			newFolder.create(true, true, null);
		}

		// construct the new fileName for the model description
		String directoryPath = newFolder.getRawLocation().toString()
				+ File.separatorChar;
		// construct the new fileName path for the model description
		String fPathName = directoryPath + fileName;
		File newFile = new File(fPathName);
		boolean success = newFile.createNewFile();
		// force creation of a new file
		if (!success) {
			newFile.delete();
			newFile.createNewFile();
		}
		return newFile;
	}

	// The method populates the ModelVariables segment with scalar
	// variables, generated from the variable's type etc.
	private void variableToFMIScalar(ModelVariablesType modelVarsType,
			ITypeEnvironment typeEnv, Variable var,
			ArrayList<VariableDecl> variableDeclList, FmiModelDescriptionType descriptionType) {
		Type type = typeEnv.getType(var.getName());
		// Create and set an fmiScalar value for each variable
		FmiScalarVariable scalar = FmiModelFactory.eINSTANCE
				.createFmiScalarVariable();

		modelVarsType.getScalarVariable().add(scalar);
		scalar.setName(var.getName());
		// All of our translations are to discrete models (currently)
		scalar.setVariability(VariabilityType.DISCRETE);

		String typeString = getFMITypeString(type);

		if (inputPortNames.contains(var.getName())) {
			// set the causality in the scalar
			scalar.setCausality(CausalityType.INPUT);
			scalar.setInitial(InitialType.EXACT);
			// set the input name in the modelStructureType
			createModelStructureInput(var, descriptionType);
			
		} else if (outputPortNames.contains(var.getName())) {
			// set the causality in the scalar
			scalar.setCausality(CausalityType.OUTPUT);
			// set the output name in the modelStructureType
			createModelStructureOutput(var, descriptionType);
		}
		// Add a type if it is an integer
		if (typeString.equals(INTEGER)) {
			scalar.setValueReference(integerVariableCount);
			integerVariableCount++;
			IntegerType integerType = FmiModelFactory.eINSTANCE
					.createIntegerType();
			scalar.setInteger(integerType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						integerType.setStart(Integer.parseInt(varDecl
								.getInitialValue()));
						break;
					}
				}
			}
		}
		// else if it is a real
		else if (typeString.equals(REAL)) {
			scalar.setValueReference(realVariableCount);
			realVariableCount++;
			RealType1 realType = FmiModelFactory.eINSTANCE.createRealType1();
			scalar.setReal(realType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						realType.setStart(Double.parseDouble(varDecl
								.getInitialValue()));
						break;
					}
				}
			}
		}
		// elseif it is a string
		else if (typeString.equals(STRING)) {
			scalar.setValueReference(stringVariableCount);
			stringVariableCount++;
			StringType stringType = FmiModelFactory.eINSTANCE
					.createStringType();
			scalar.setString(stringType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						stringType.setStart(varDecl.getInitialValue());
						break;
					}
				}
			}
		}
		// elsif it is a boolean
		else if (typeString.equals(BOOLEAN)) {
			scalar.setValueReference(boolVariableCount);
			boolVariableCount++;
			BooleanType boolType = FmiModelFactory.eINSTANCE
					.createBooleanType();
			scalar.setBoolean(boolType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						boolType.setStart(Boolean.parseBoolean(varDecl
								.getInitialValue()));
						break;
					}
				}
			}
		}
	}

	private void createModelStructureInput(Variable var, FmiModelDescriptionType descriptionType) {
		ModelStructureType modelStructure = descriptionType.getModelStructure();
		if(modelStructure.getInputs() == null){
			InputsType inputsType = FmiModelFactory.eINSTANCE.createInputsType();
			modelStructure.setInputs(inputsType);
		}
		InputType input = FmiModelFactory.eINSTANCE.createInputType();
		input.setName(var.getName());
		modelStructure.getInputs().getInput().add(input);
	}

	private void createModelStructureOutput(Variable var, FmiModelDescriptionType descriptionType) {
		ModelStructureType modelStructure = descriptionType.getModelStructure();
		if(modelStructure.getOutputs() == null){
			OutputsType outputsType = FmiModelFactory.eINSTANCE.createOutputsType();
			modelStructure.setOutputs(outputsType);
		}
		OutputType output = FmiModelFactory.eINSTANCE.createOutputType();
		output.setName(var.getName());
		modelStructure.getOutputs().getOutput().add(output);
	}

	private ArrayList<VariableDecl> createVariableDeclList(
			TreeIterator<EObject> contents) {
		ArrayList<VariableDecl> variableDeclList = new ArrayList<VariableDecl>();
		while (contents.hasNext()) {
			EObject obj = contents.next();
			if (obj instanceof VariableDecl) {
				variableDeclList.add((VariableDecl) obj);
			}
		}
		return variableDeclList;
	}

	private void setupInputOutputPortNames() {
		// used to define fmiGets and fmiSets functions
		EList<Port> inputPorts = eventBComponent.getInputs();
		EList<Port> outputPorts = eventBComponent.getOutputs();
		// used to find causality
		inputPortNames = new ArrayList<String>();
		outputPortNames = new ArrayList<String>();
		for (Port p : inputPorts) {
			inputPortNames.add(p.getName());
		}
		for (Port p : outputPorts) {
			outputPortNames.add(p.getName());
		}
	}

	private XMLGregorianCalendar makeDate() {
		DatatypeFactory df = null;
		Date date = new Date();
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException dce) {
			throw new IllegalStateException(
					"Exception while obtaining DatatypeFactory instance", dce);
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(date.getTime());
		XMLGregorianCalendar xmlGC = df.newXMLGregorianCalendar(gc);
		return xmlGC;
	}


	// Create the file associated with the output
	// The sourceRes is the container of the MainClass
	// element that we want to transform
	protected static String targetFile(IFile source) throws URISyntaxException {
		java.net.URI location = source.getLocationURI();
		IPath p = new Path(location.getPath());
		IPath newPath = p.removeFileExtension();
		String path = newPath + ".il1";
		return path;
	}

	protected static void saveBaseProgram(Program program, String filename)
			throws IOException {
		URI uri = URI.createFileURI(filename);
		Resource outResource = new XMLResourceFactoryImpl().createResource(uri);
		outResource.getContents().add(program);
		outResource.save(null);
	}

	
	// Given an eventB type, return its FMI equivalent
	public static String getFMITypeString(Type eventBType) {
		String fmiTypeString = null;
		String eventBTypeString = eventBType.toString();
		if (eventBTypeString.equals(CodeGenTaskingUtils.INT_SYMBOL)) {
			fmiTypeString = INTEGER;
		} else if (eventBTypeString.equals(CodeGenTaskingUtils.BOOL_SYMBOL)) {
			fmiTypeString = BOOLEAN;
		} else if (eventBTypeString.equals(STRING)) {
			fmiTypeString = STRING;
		} else if (eventBTypeString.equals(REAL)) {
			fmiTypeString = REAL;
		}
		return fmiTypeString;
	}

}