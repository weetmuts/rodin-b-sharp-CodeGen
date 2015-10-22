/**
 */
package FmiModelV1.impl;

import FmiModelV1.AliasType;
import FmiModelV1.AnnotationType;
import FmiModelV1.BooleanType;
import FmiModelV1.CapabilitiesType;
import FmiModelV1.CausalityType;
import FmiModelV1.CoSimulation_StandAloneType;
import FmiModelV1.DefaultExperimentType;
import FmiModelV1.DirectDependencyType;
import FmiModelV1.DisplayUnitDefinitionType;
import FmiModelV1.DocumentRoot;
import FmiModelV1.EnumerationType;
import FmiModelV1.EnumerationTypeType;
import FmiModelV1.FmiBaseUnit;
import FmiModelV1.FmiModelDescriptionType;
import FmiModelV1.FmiModelV1Factory;
import FmiModelV1.FmiModelV1Package;
import FmiModelV1.FmiScalarVariable;
import FmiModelV1.FmiType;
import FmiModelV1.ImplementationType;
import FmiModelV1.IntegerType;
import FmiModelV1.IntegerTypeType;
import FmiModelV1.ItemType;
import FmiModelV1.ModelVariablesType;
import FmiModelV1.RealType;
import FmiModelV1.RealTypeType;
import FmiModelV1.StringType;
import FmiModelV1.ToolType;
import FmiModelV1.TypeDefinitionsType;
import FmiModelV1.UnitDefinitionsType;
import FmiModelV1.VariabilityType;
import FmiModelV1.VariableNamingConventionType;
import FmiModelV1.VendorAnnotationsType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelV1PackageImpl extends EPackageImpl implements FmiModelV1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultExperimentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directDependencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayUnitDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiBaseUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiModelDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiScalarVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelVariablesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coSimulation_StandAloneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorAnnotationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aliasTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum causalityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableNamingConventionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aliasTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType causalityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variabilityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variableNamingConventionTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FmiModelV1.FmiModelV1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FmiModelV1PackageImpl() {
		super(eNS_URI, FmiModelV1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FmiModelV1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FmiModelV1Package init() {
		if (isInited) return (FmiModelV1Package)EPackage.Registry.INSTANCE.getEPackage(FmiModelV1Package.eNS_URI);

		// Obtain or create and register package
		FmiModelV1PackageImpl theFmiModelV1Package = (FmiModelV1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FmiModelV1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FmiModelV1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFmiModelV1Package.createPackageContents();

		// Initialize created meta-data
		theFmiModelV1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFmiModelV1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FmiModelV1Package.eNS_URI, theFmiModelV1Package);
		return theFmiModelV1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationType() {
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Name() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Value() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_DeclaredType() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_Fixed() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_Start() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultExperimentType() {
		return defaultExperimentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultExperimentType_StartTime() {
		return (EAttribute)defaultExperimentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultExperimentType_StopTime() {
		return (EAttribute)defaultExperimentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultExperimentType_Tolerance() {
		return (EAttribute)defaultExperimentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectDependencyType() {
		return directDependencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectDependencyType_Group() {
		return (EAttribute)directDependencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectDependencyType_Name() {
		return (EAttribute)directDependencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayUnitDefinitionType() {
		return displayUnitDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayUnitDefinitionType_DisplayUnit() {
		return (EAttribute)displayUnitDefinitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayUnitDefinitionType_Gain() {
		return (EAttribute)displayUnitDefinitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayUnitDefinitionType_Offset() {
		return (EAttribute)displayUnitDefinitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FmiModelDescription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_DeclaredType() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Fixed() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Max() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Min() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Quantity() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Start() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationTypeType() {
		return enumerationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationTypeType_Group() {
		return (EAttribute)enumerationTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationTypeType_Item() {
		return (EReference)enumerationTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationTypeType_Max() {
		return (EAttribute)enumerationTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationTypeType_Min() {
		return (EAttribute)enumerationTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationTypeType_Quantity() {
		return (EAttribute)enumerationTypeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiBaseUnit() {
		return fmiBaseUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiBaseUnit_Group() {
		return (EAttribute)fmiBaseUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiBaseUnit_DisplayUnitDefinition() {
		return (EReference)fmiBaseUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiBaseUnit_Unit() {
		return (EAttribute)fmiBaseUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiModelDescriptionType() {
		return fmiModelDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_UnitDefinitions() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_TypeDefinitions() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_DefaultExperiment() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_VendorAnnotations() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_ModelVariables() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_Implementation() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Author() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Description() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_FmiVersion() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_GenerationDateAndTime() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_GenerationTool() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Guid() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_ModelIdentifier() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_ModelName() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_NumberOfContinuousStates() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_NumberOfEventIndicators() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_VariableNamingConvention() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Version() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiScalarVariable() {
		return fmiScalarVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Real() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Integer() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Boolean() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_String() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Enumeration() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_DirectDependency() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Alias() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Causality() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Description() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Name() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_ValueReference() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Variability() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiType() {
		return fmiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiType_RealType() {
		return (EReference)fmiTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiType_IntegerType() {
		return (EReference)fmiTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiType_BooleanType() {
		return (EReference)fmiTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiType_StringType() {
		return (EReference)fmiTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiType_EnumerationType() {
		return (EReference)fmiTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiType_Description() {
		return (EAttribute)fmiTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiType_Name() {
		return (EAttribute)fmiTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_DeclaredType() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Fixed() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Max() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Min() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Quantity() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Start() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerTypeType() {
		return integerTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerTypeType_Max() {
		return (EAttribute)integerTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerTypeType_Min() {
		return (EAttribute)integerTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerTypeType_Quantity() {
		return (EAttribute)integerTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Description() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Name() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelVariablesType() {
		return modelVariablesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelVariablesType_Group() {
		return (EAttribute)modelVariablesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelVariablesType_ScalarVariable() {
		return (EReference)modelVariablesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_DeclaredType() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_DisplayUnit() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Fixed() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Max() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Min() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Nominal() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Quantity() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_RelativeQuantity() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Start() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Unit() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealTypeType() {
		return realTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTypeType_DisplayUnit() {
		return (EAttribute)realTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTypeType_Max() {
		return (EAttribute)realTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTypeType_Min() {
		return (EAttribute)realTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTypeType_Nominal() {
		return (EAttribute)realTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTypeType_Quantity() {
		return (EAttribute)realTypeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTypeType_RelativeQuantity() {
		return (EAttribute)realTypeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealTypeType_Unit() {
		return (EAttribute)realTypeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_DeclaredType() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_Fixed() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_Start() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolType() {
		return toolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolType_Group() {
		return (EAttribute)toolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolType_Annotation() {
		return (EReference)toolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolType_Name() {
		return (EAttribute)toolTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionsType() {
		return typeDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinitionsType_Group() {
		return (EAttribute)typeDefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinitionsType_Type() {
		return (EReference)typeDefinitionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitDefinitionsType() {
		return unitDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitDefinitionsType_Group() {
		return (EAttribute)unitDefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitDefinitionsType_BaseUnit() {
		return (EReference)unitDefinitionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilitiesType() {
		return capabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanHandleVariableCommunicationStepSize() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanHandleEvents() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanRejectSteps() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanInterpolateInputs() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_MaxOutputDerivativeOrder() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanRunAsynchronuously() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanSignalEvents() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanBeInstantiatedOnlyOncePerProcess() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanNotUseMemoryManagementFunctions() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanGetAndSetFMUstate() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_CanSerializeFMUstate() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_ModelIdentifier() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilitiesType_NeedsExecutionTool() {
		return (EAttribute)capabilitiesTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationType() {
		return implementationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationType_CoSimulation_StandAlone() {
		return (EReference)implementationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoSimulation_StandAloneType() {
		return coSimulation_StandAloneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoSimulation_StandAloneType_Capabilities() {
		return (EReference)coSimulation_StandAloneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendorAnnotationsType() {
		return vendorAnnotationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorAnnotationsType_Group() {
		return (EAttribute)vendorAnnotationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVendorAnnotationsType_Tool() {
		return (EReference)vendorAnnotationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAliasType() {
		return aliasTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCausalityType() {
		return causalityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariabilityType() {
		return variabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableNamingConventionType() {
		return variableNamingConventionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAliasTypeObject() {
		return aliasTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCausalityTypeObject() {
		return causalityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariabilityTypeObject() {
		return variabilityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariableNamingConventionTypeObject() {
		return variableNamingConventionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelV1Factory getFmiModelV1Factory() {
		return (FmiModelV1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		annotationTypeEClass = createEClass(ANNOTATION_TYPE);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__NAME);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__VALUE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__DECLARED_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__FIXED);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__START);

		defaultExperimentTypeEClass = createEClass(DEFAULT_EXPERIMENT_TYPE);
		createEAttribute(defaultExperimentTypeEClass, DEFAULT_EXPERIMENT_TYPE__START_TIME);
		createEAttribute(defaultExperimentTypeEClass, DEFAULT_EXPERIMENT_TYPE__STOP_TIME);
		createEAttribute(defaultExperimentTypeEClass, DEFAULT_EXPERIMENT_TYPE__TOLERANCE);

		directDependencyTypeEClass = createEClass(DIRECT_DEPENDENCY_TYPE);
		createEAttribute(directDependencyTypeEClass, DIRECT_DEPENDENCY_TYPE__GROUP);
		createEAttribute(directDependencyTypeEClass, DIRECT_DEPENDENCY_TYPE__NAME);

		displayUnitDefinitionTypeEClass = createEClass(DISPLAY_UNIT_DEFINITION_TYPE);
		createEAttribute(displayUnitDefinitionTypeEClass, DISPLAY_UNIT_DEFINITION_TYPE__DISPLAY_UNIT);
		createEAttribute(displayUnitDefinitionTypeEClass, DISPLAY_UNIT_DEFINITION_TYPE__GAIN);
		createEAttribute(displayUnitDefinitionTypeEClass, DISPLAY_UNIT_DEFINITION_TYPE__OFFSET);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FMI_MODEL_DESCRIPTION);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__DECLARED_TYPE);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__FIXED);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__MAX);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__MIN);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__QUANTITY);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__START);

		enumerationTypeTypeEClass = createEClass(ENUMERATION_TYPE_TYPE);
		createEAttribute(enumerationTypeTypeEClass, ENUMERATION_TYPE_TYPE__GROUP);
		createEReference(enumerationTypeTypeEClass, ENUMERATION_TYPE_TYPE__ITEM);
		createEAttribute(enumerationTypeTypeEClass, ENUMERATION_TYPE_TYPE__MAX);
		createEAttribute(enumerationTypeTypeEClass, ENUMERATION_TYPE_TYPE__MIN);
		createEAttribute(enumerationTypeTypeEClass, ENUMERATION_TYPE_TYPE__QUANTITY);

		fmiBaseUnitEClass = createEClass(FMI_BASE_UNIT);
		createEAttribute(fmiBaseUnitEClass, FMI_BASE_UNIT__GROUP);
		createEReference(fmiBaseUnitEClass, FMI_BASE_UNIT__DISPLAY_UNIT_DEFINITION);
		createEAttribute(fmiBaseUnitEClass, FMI_BASE_UNIT__UNIT);

		fmiModelDescriptionTypeEClass = createEClass(FMI_MODEL_DESCRIPTION_TYPE);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__AUTHOR);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__GUID);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__VERSION);

		fmiScalarVariableEClass = createEClass(FMI_SCALAR_VARIABLE);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__REAL);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__INTEGER);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__BOOLEAN);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__STRING);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__ENUMERATION);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__ALIAS);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__CAUSALITY);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__DESCRIPTION);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__NAME);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__VALUE_REFERENCE);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__VARIABILITY);

		fmiTypeEClass = createEClass(FMI_TYPE);
		createEReference(fmiTypeEClass, FMI_TYPE__REAL_TYPE);
		createEReference(fmiTypeEClass, FMI_TYPE__INTEGER_TYPE);
		createEReference(fmiTypeEClass, FMI_TYPE__BOOLEAN_TYPE);
		createEReference(fmiTypeEClass, FMI_TYPE__STRING_TYPE);
		createEReference(fmiTypeEClass, FMI_TYPE__ENUMERATION_TYPE);
		createEAttribute(fmiTypeEClass, FMI_TYPE__DESCRIPTION);
		createEAttribute(fmiTypeEClass, FMI_TYPE__NAME);

		integerTypeEClass = createEClass(INTEGER_TYPE);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__DECLARED_TYPE);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__FIXED);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__MAX);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__MIN);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__QUANTITY);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__START);

		integerTypeTypeEClass = createEClass(INTEGER_TYPE_TYPE);
		createEAttribute(integerTypeTypeEClass, INTEGER_TYPE_TYPE__MAX);
		createEAttribute(integerTypeTypeEClass, INTEGER_TYPE_TYPE__MIN);
		createEAttribute(integerTypeTypeEClass, INTEGER_TYPE_TYPE__QUANTITY);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__DESCRIPTION);
		createEAttribute(itemTypeEClass, ITEM_TYPE__NAME);

		modelVariablesTypeEClass = createEClass(MODEL_VARIABLES_TYPE);
		createEAttribute(modelVariablesTypeEClass, MODEL_VARIABLES_TYPE__GROUP);
		createEReference(modelVariablesTypeEClass, MODEL_VARIABLES_TYPE__SCALAR_VARIABLE);

		realTypeEClass = createEClass(REAL_TYPE);
		createEAttribute(realTypeEClass, REAL_TYPE__DECLARED_TYPE);
		createEAttribute(realTypeEClass, REAL_TYPE__DISPLAY_UNIT);
		createEAttribute(realTypeEClass, REAL_TYPE__FIXED);
		createEAttribute(realTypeEClass, REAL_TYPE__MAX);
		createEAttribute(realTypeEClass, REAL_TYPE__MIN);
		createEAttribute(realTypeEClass, REAL_TYPE__NOMINAL);
		createEAttribute(realTypeEClass, REAL_TYPE__QUANTITY);
		createEAttribute(realTypeEClass, REAL_TYPE__RELATIVE_QUANTITY);
		createEAttribute(realTypeEClass, REAL_TYPE__START);
		createEAttribute(realTypeEClass, REAL_TYPE__UNIT);

		realTypeTypeEClass = createEClass(REAL_TYPE_TYPE);
		createEAttribute(realTypeTypeEClass, REAL_TYPE_TYPE__DISPLAY_UNIT);
		createEAttribute(realTypeTypeEClass, REAL_TYPE_TYPE__MAX);
		createEAttribute(realTypeTypeEClass, REAL_TYPE_TYPE__MIN);
		createEAttribute(realTypeTypeEClass, REAL_TYPE_TYPE__NOMINAL);
		createEAttribute(realTypeTypeEClass, REAL_TYPE_TYPE__QUANTITY);
		createEAttribute(realTypeTypeEClass, REAL_TYPE_TYPE__RELATIVE_QUANTITY);
		createEAttribute(realTypeTypeEClass, REAL_TYPE_TYPE__UNIT);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEAttribute(stringTypeEClass, STRING_TYPE__DECLARED_TYPE);
		createEAttribute(stringTypeEClass, STRING_TYPE__FIXED);
		createEAttribute(stringTypeEClass, STRING_TYPE__START);

		toolTypeEClass = createEClass(TOOL_TYPE);
		createEAttribute(toolTypeEClass, TOOL_TYPE__GROUP);
		createEReference(toolTypeEClass, TOOL_TYPE__ANNOTATION);
		createEAttribute(toolTypeEClass, TOOL_TYPE__NAME);

		typeDefinitionsTypeEClass = createEClass(TYPE_DEFINITIONS_TYPE);
		createEAttribute(typeDefinitionsTypeEClass, TYPE_DEFINITIONS_TYPE__GROUP);
		createEReference(typeDefinitionsTypeEClass, TYPE_DEFINITIONS_TYPE__TYPE);

		unitDefinitionsTypeEClass = createEClass(UNIT_DEFINITIONS_TYPE);
		createEAttribute(unitDefinitionsTypeEClass, UNIT_DEFINITIONS_TYPE__GROUP);
		createEReference(unitDefinitionsTypeEClass, UNIT_DEFINITIONS_TYPE__BASE_UNIT);

		capabilitiesTypeEClass = createEClass(CAPABILITIES_TYPE);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_HANDLE_EVENTS);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_REJECT_STEPS);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_INTERPOLATE_INPUTS);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_RUN_ASYNCHRONUOUSLY);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_SIGNAL_EVENTS);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_GET_AND_SET_FM_USTATE);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__CAN_SERIALIZE_FM_USTATE);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__MODEL_IDENTIFIER);
		createEAttribute(capabilitiesTypeEClass, CAPABILITIES_TYPE__NEEDS_EXECUTION_TOOL);

		implementationTypeEClass = createEClass(IMPLEMENTATION_TYPE);
		createEReference(implementationTypeEClass, IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE);

		coSimulation_StandAloneTypeEClass = createEClass(CO_SIMULATION_STAND_ALONE_TYPE);
		createEReference(coSimulation_StandAloneTypeEClass, CO_SIMULATION_STAND_ALONE_TYPE__CAPABILITIES);

		vendorAnnotationsTypeEClass = createEClass(VENDOR_ANNOTATIONS_TYPE);
		createEAttribute(vendorAnnotationsTypeEClass, VENDOR_ANNOTATIONS_TYPE__GROUP);
		createEReference(vendorAnnotationsTypeEClass, VENDOR_ANNOTATIONS_TYPE__TOOL);

		// Create enums
		aliasTypeEEnum = createEEnum(ALIAS_TYPE);
		causalityTypeEEnum = createEEnum(CAUSALITY_TYPE);
		variabilityTypeEEnum = createEEnum(VARIABILITY_TYPE);
		variableNamingConventionTypeEEnum = createEEnum(VARIABLE_NAMING_CONVENTION_TYPE);

		// Create data types
		aliasTypeObjectEDataType = createEDataType(ALIAS_TYPE_OBJECT);
		causalityTypeObjectEDataType = createEDataType(CAUSALITY_TYPE_OBJECT);
		variabilityTypeObjectEDataType = createEDataType(VARIABILITY_TYPE_OBJECT);
		variableNamingConventionTypeObjectEDataType = createEDataType(VARIABLE_NAMING_CONVENTION_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(annotationTypeEClass, AnnotationType.class, "AnnotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanType_Fixed(), theXMLTypePackage.getBoolean(), "fixed", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanType_Start(), theXMLTypePackage.getBoolean(), "start", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultExperimentTypeEClass, DefaultExperimentType.class, "DefaultExperimentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultExperimentType_StartTime(), theXMLTypePackage.getDouble(), "startTime", null, 0, 1, DefaultExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultExperimentType_StopTime(), theXMLTypePackage.getDouble(), "stopTime", null, 0, 1, DefaultExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultExperimentType_Tolerance(), theXMLTypePackage.getDouble(), "tolerance", null, 0, 1, DefaultExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directDependencyTypeEClass, DirectDependencyType.class, "DirectDependencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectDependencyType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DirectDependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectDependencyType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 0, -1, DirectDependencyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(displayUnitDefinitionTypeEClass, DisplayUnitDefinitionType.class, "DisplayUnitDefinitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayUnitDefinitionType_DisplayUnit(), theXMLTypePackage.getNormalizedString(), "displayUnit", null, 1, 1, DisplayUnitDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayUnitDefinitionType_Gain(), theXMLTypePackage.getDouble(), "gain", "1", 0, 1, DisplayUnitDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayUnitDefinitionType_Offset(), theXMLTypePackage.getDouble(), "offset", "0", 0, 1, DisplayUnitDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FmiModelDescription(), this.getFmiModelDescriptionType(), null, "fmiModelDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 1, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Fixed(), theXMLTypePackage.getBoolean(), "fixed", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Start(), theXMLTypePackage.getInt(), "start", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationTypeTypeEClass, EnumerationTypeType.class, "EnumerationTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationTypeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EnumerationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationTypeType_Item(), this.getItemType(), null, "item", null, 0, -1, EnumerationTypeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationTypeType_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, EnumerationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationTypeType_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, EnumerationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationTypeType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, EnumerationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiBaseUnitEClass, FmiBaseUnit.class, "FmiBaseUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFmiBaseUnit_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FmiBaseUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiBaseUnit_DisplayUnitDefinition(), this.getDisplayUnitDefinitionType(), null, "displayUnitDefinition", null, 0, -1, FmiBaseUnit.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiBaseUnit_Unit(), theXMLTypePackage.getNormalizedString(), "unit", null, 1, 1, FmiBaseUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiModelDescriptionTypeEClass, FmiModelDescriptionType.class, "FmiModelDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFmiModelDescriptionType_UnitDefinitions(), this.getUnitDefinitionsType(), null, "unitDefinitions", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_TypeDefinitions(), this.getTypeDefinitionsType(), null, "typeDefinitions", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_DefaultExperiment(), this.getDefaultExperimentType(), null, "defaultExperiment", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_VendorAnnotations(), this.getVendorAnnotationsType(), null, "vendorAnnotations", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_ModelVariables(), this.getModelVariablesType(), null, "ModelVariables", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_Implementation(), this.getImplementationType(), null, "Implementation", null, 0, -1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_FmiVersion(), theXMLTypePackage.getNormalizedString(), "fmiVersion", "1.0", 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_GenerationDateAndTime(), theXMLTypePackage.getDateTime(), "generationDateAndTime", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_GenerationTool(), theXMLTypePackage.getNormalizedString(), "generationTool", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Guid(), theXMLTypePackage.getNormalizedString(), "guid", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_ModelIdentifier(), theXMLTypePackage.getNormalizedString(), "modelIdentifier", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_ModelName(), theXMLTypePackage.getNormalizedString(), "modelName", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_NumberOfContinuousStates(), theXMLTypePackage.getUnsignedInt(), "numberOfContinuousStates", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_NumberOfEventIndicators(), theXMLTypePackage.getUnsignedInt(), "numberOfEventIndicators", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_VariableNamingConvention(), this.getVariableNamingConventionType(), "variableNamingConvention", "flat", 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Version(), theXMLTypePackage.getNormalizedString(), "version", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiScalarVariableEClass, FmiScalarVariable.class, "FmiScalarVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFmiScalarVariable_Real(), this.getRealType(), null, "Real", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_Integer(), this.getIntegerType(), null, "Integer", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_Boolean(), this.getBooleanType(), null, "Boolean", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_String(), this.getStringType(), null, "String", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_Enumeration(), this.getEnumerationType(), null, "enumeration", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_DirectDependency(), this.getDirectDependencyType(), null, "directDependency", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Alias(), this.getAliasType(), "alias", "noAlias", 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Causality(), this.getCausalityType(), "causality", "internal", 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_ValueReference(), theXMLTypePackage.getUnsignedInt(), "valueReference", null, 1, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Variability(), this.getVariabilityType(), "variability", "continuous", 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiTypeEClass, FmiType.class, "FmiType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFmiType_RealType(), this.getRealTypeType(), null, "realType", null, 0, 1, FmiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiType_IntegerType(), this.getIntegerTypeType(), null, "integerType", null, 0, 1, FmiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiType_BooleanType(), ecorePackage.getEObject(), null, "booleanType", null, 0, 1, FmiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiType_StringType(), ecorePackage.getEObject(), null, "stringType", null, 0, 1, FmiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiType_EnumerationType(), this.getEnumerationTypeType(), null, "enumerationType", null, 0, 1, FmiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, FmiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, FmiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Fixed(), theXMLTypePackage.getBoolean(), "fixed", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Start(), theXMLTypePackage.getInt(), "start", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerTypeTypeEClass, IntegerTypeType.class, "IntegerTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerTypeType_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, IntegerTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerTypeType_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, IntegerTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerTypeType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, IntegerTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelVariablesTypeEClass, ModelVariablesType.class, "ModelVariablesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelVariablesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ModelVariablesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelVariablesType_ScalarVariable(), this.getFmiScalarVariable(), null, "ScalarVariable", null, 0, -1, ModelVariablesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(realTypeEClass, RealType.class, "RealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_DisplayUnit(), theXMLTypePackage.getNormalizedString(), "displayUnit", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Fixed(), theXMLTypePackage.getBoolean(), "fixed", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Max(), theXMLTypePackage.getDouble(), "max", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Min(), theXMLTypePackage.getDouble(), "min", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Nominal(), theXMLTypePackage.getDouble(), "nominal", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_RelativeQuantity(), theXMLTypePackage.getBoolean(), "relativeQuantity", "false", 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Start(), theXMLTypePackage.getDouble(), "start", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Unit(), theXMLTypePackage.getNormalizedString(), "unit", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realTypeTypeEClass, RealTypeType.class, "RealTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealTypeType_DisplayUnit(), theXMLTypePackage.getNormalizedString(), "displayUnit", null, 0, 1, RealTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealTypeType_Max(), theXMLTypePackage.getDouble(), "max", null, 0, 1, RealTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealTypeType_Min(), theXMLTypePackage.getDouble(), "min", null, 0, 1, RealTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealTypeType_Nominal(), theXMLTypePackage.getDouble(), "nominal", null, 0, 1, RealTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealTypeType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, RealTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealTypeType_RelativeQuantity(), theXMLTypePackage.getBoolean(), "relativeQuantity", "false", 0, 1, RealTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealTypeType_Unit(), theXMLTypePackage.getNormalizedString(), "unit", null, 0, 1, RealTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringType_Fixed(), theXMLTypePackage.getBoolean(), "fixed", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringType_Start(), theXMLTypePackage.getString(), "start", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolTypeEClass, ToolType.class, "ToolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolType_Annotation(), this.getAnnotationType(), null, "annotation", null, 0, -1, ToolType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, ToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionsTypeEClass, TypeDefinitionsType.class, "TypeDefinitionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDefinitionsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TypeDefinitionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinitionsType_Type(), this.getFmiType(), null, "type", null, 0, -1, TypeDefinitionsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(unitDefinitionsTypeEClass, UnitDefinitionsType.class, "UnitDefinitionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitDefinitionsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, UnitDefinitionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitDefinitionsType_BaseUnit(), this.getFmiBaseUnit(), null, "baseUnit", null, 0, -1, UnitDefinitionsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesTypeEClass, CapabilitiesType.class, "CapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapabilitiesType_CanHandleVariableCommunicationStepSize(), theXMLTypePackage.getBoolean(), "canHandleVariableCommunicationStepSize", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanHandleEvents(), theXMLTypePackage.getBoolean(), "canHandleEvents", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanRejectSteps(), theXMLTypePackage.getBoolean(), "canRejectSteps", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanInterpolateInputs(), theXMLTypePackage.getBoolean(), "canInterpolateInputs", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_MaxOutputDerivativeOrder(), theXMLTypePackage.getUnsignedInt(), "maxOutputDerivativeOrder", "0", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanRunAsynchronuously(), theXMLTypePackage.getBoolean(), "canRunAsynchronuously", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanSignalEvents(), theXMLTypePackage.getBoolean(), "canSignalEvents", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanBeInstantiatedOnlyOncePerProcess(), theXMLTypePackage.getBoolean(), "canBeInstantiatedOnlyOncePerProcess", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanNotUseMemoryManagementFunctions(), theXMLTypePackage.getBoolean(), "canNotUseMemoryManagementFunctions", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanGetAndSetFMUstate(), theXMLTypePackage.getBoolean(), "canGetAndSetFMUstate", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_CanSerializeFMUstate(), theXMLTypePackage.getBoolean(), "canSerializeFMUstate", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_ModelIdentifier(), theXMLTypePackage.getNormalizedString(), "modelIdentifier", null, 1, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilitiesType_NeedsExecutionTool(), theXMLTypePackage.getBoolean(), "needsExecutionTool", "false", 0, 1, CapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationTypeEClass, ImplementationType.class, "ImplementationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationType_CoSimulation_StandAlone(), this.getCoSimulation_StandAloneType(), null, "CoSimulation_StandAlone", null, 0, 1, ImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(coSimulation_StandAloneTypeEClass, CoSimulation_StandAloneType.class, "CoSimulation_StandAloneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoSimulation_StandAloneType_Capabilities(), this.getCapabilitiesType(), null, "Capabilities", null, 0, 1, CoSimulation_StandAloneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorAnnotationsTypeEClass, VendorAnnotationsType.class, "VendorAnnotationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendorAnnotationsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VendorAnnotationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVendorAnnotationsType_Tool(), this.getToolType(), null, "tool", null, 0, -1, VendorAnnotationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aliasTypeEEnum, AliasType.class, "AliasType");
		addEEnumLiteral(aliasTypeEEnum, AliasType.NO_ALIAS);
		addEEnumLiteral(aliasTypeEEnum, AliasType.ALIAS);
		addEEnumLiteral(aliasTypeEEnum, AliasType.NEGATED_ALIAS);

		initEEnum(causalityTypeEEnum, CausalityType.class, "CausalityType");
		addEEnumLiteral(causalityTypeEEnum, CausalityType.INPUT);
		addEEnumLiteral(causalityTypeEEnum, CausalityType.OUTPUT);
		addEEnumLiteral(causalityTypeEEnum, CausalityType.INTERNAL);
		addEEnumLiteral(causalityTypeEEnum, CausalityType.NONE);

		initEEnum(variabilityTypeEEnum, VariabilityType.class, "VariabilityType");
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.CONSTANT);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.PARAMETER);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.DISCRETE);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.CONTINUOUS);

		initEEnum(variableNamingConventionTypeEEnum, VariableNamingConventionType.class, "VariableNamingConventionType");
		addEEnumLiteral(variableNamingConventionTypeEEnum, VariableNamingConventionType.FLAT);
		addEEnumLiteral(variableNamingConventionTypeEEnum, VariableNamingConventionType.STRUCTURED);

		// Initialize data types
		initEDataType(aliasTypeObjectEDataType, AliasType.class, "AliasTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(causalityTypeObjectEDataType, CausalityType.class, "CausalityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(variabilityTypeObjectEDataType, VariabilityType.class, "VariabilityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(variableNamingConventionTypeObjectEDataType, VariableNamingConventionType.class, "VariableNamingConventionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (aliasTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "alias_._type"
		   });		
		addAnnotation
		  (aliasTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "alias_._type:Object",
			 "baseType", "alias_._type"
		   });		
		addAnnotation
		  (annotationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Annotation_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAnnotationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnnotationType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Boolean_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getBooleanType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBooleanType_Fixed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fixed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (causalityTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "causality_._type"
		   });		
		addAnnotation
		  (causalityTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "causality_._type:Object",
			 "baseType", "causality_._type"
		   });		
		addAnnotation
		  (defaultExperimentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DefaultExperiment_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDefaultExperimentType_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDefaultExperimentType_StopTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stopTime",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDefaultExperimentType_Tolerance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tolerance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (directDependencyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DirectDependency_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDirectDependencyType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getDirectDependencyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (displayUnitDefinitionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DisplayUnitDefinition_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDisplayUnitDefinitionType_DisplayUnit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDisplayUnitDefinitionType_Gain(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gain",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDisplayUnitDefinitionType_Offset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "offset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_FmiModelDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fmiModelDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (enumerationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Enumeration_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getEnumerationType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getEnumerationType_Fixed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fixed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (enumerationTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EnumerationType_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnumerationTypeType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getEnumerationTypeType_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Item",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEnumerationTypeType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationTypeType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationTypeType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fmiBaseUnitEClass, 
		   source, 
		   new String[] {
			 "name", "fmiBaseUnit",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmiBaseUnit_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getFmiBaseUnit_DisplayUnitDefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DisplayUnitDefinition",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getFmiBaseUnit_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fmiModelDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fmiModelDescription_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_UnitDefinitions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnitDefinitions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_TypeDefinitions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeDefinitions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_DefaultExperiment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DefaultExperiment",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_VendorAnnotations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VendorAnnotations",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_ModelVariables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModelVariables",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_Implementation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Implementation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_FmiVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fmiVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_GenerationDateAndTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "generationDateAndTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_GenerationTool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "generationTool",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_Guid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "guid",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_ModelIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modelIdentifier",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_ModelName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modelName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_NumberOfContinuousStates(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "numberOfContinuousStates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_NumberOfEventIndicators(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "numberOfEventIndicators",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_VariableNamingConvention(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "variableNamingConvention",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fmiScalarVariableEClass, 
		   source, 
		   new String[] {
			 "name", "fmiScalarVariable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Real(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Real",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Integer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Integer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Boolean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Boolean",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_String(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "String",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Enumeration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Enumeration",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_DirectDependency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DirectDependency",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_Alias(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alias",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_Causality(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "causality",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_ValueReference(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valueReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Variability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "variability",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fmiTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fmiType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmiType_RealType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RealType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiType_IntegerType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IntegerType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiType_BooleanType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BooleanType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiType_StringType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StringType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiType_EnumerationType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EnumerationType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (integerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Integer_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getIntegerType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getIntegerType_Fixed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fixed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (integerTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IntegerType_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIntegerTypeType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerTypeType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerTypeType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Item_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getItemType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modelVariablesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModelVariables_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModelVariablesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getModelVariablesType_ScalarVariable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ScalarVariable",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (realTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Real_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getRealType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType_DisplayUnit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayUnit",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType_Fixed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fixed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Nominal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nominal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType_RelativeQuantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relativeQuantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (realTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RealType_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getRealTypeType_DisplayUnit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealTypeType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealTypeType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealTypeType_Nominal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nominal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealTypeType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealTypeType_RelativeQuantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relativeQuantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealTypeType_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "String_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getStringType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getStringType_Fixed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fixed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStringType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (toolTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Tool_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getToolType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getToolType_Annotation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Annotation",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });			
		addAnnotation
		  (getToolType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeDefinitionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TypeDefinitions_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeDefinitionsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTypeDefinitionsType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Type",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (unitDefinitionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UnitDefinitions_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnitDefinitionsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getUnitDefinitionsType_BaseUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BaseUnit",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });			
		addAnnotation
		  (capabilitiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Capabilities_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanHandleVariableCommunicationStepSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canHandleVariableCommunicationStepSize",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanHandleEvents(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canHandleEvents",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanRejectSteps(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canRunAsynchronuously",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanInterpolateInputs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canInterpolateInputs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_MaxOutputDerivativeOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxOutputDerivativeOrder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanRunAsynchronuously(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canRunAsynchronuously",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanSignalEvents(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canSignalEvents",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanBeInstantiatedOnlyOncePerProcess(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canBeInstantiatedOnlyOncePerProcess",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanNotUseMemoryManagementFunctions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canNotUseMemoryManagementFunctions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanGetAndSetFMUstate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canGetAndSetFMUstate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCapabilitiesType_CanSerializeFMUstate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canSerializeFMUstate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCapabilitiesType_ModelIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modelIdentifier",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCapabilitiesType_NeedsExecutionTool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "needsExecutionTool",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (implementationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Implementation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (coSimulation_StandAloneTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CoSimulation_StandAloneType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (variabilityTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "variability_._type"
		   });		
		addAnnotation
		  (variabilityTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "variability_._type:Object",
			 "baseType", "variability_._type"
		   });		
		addAnnotation
		  (variableNamingConventionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "variableNamingConvention_._type"
		   });		
		addAnnotation
		  (variableNamingConventionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "variableNamingConvention_._type:Object",
			 "baseType", "variableNamingConvention_._type"
		   });		
		addAnnotation
		  (vendorAnnotationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VendorAnnotations_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVendorAnnotationsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVendorAnnotationsType_Tool(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tool",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });
	}

} //FmiModelV1PackageImpl
