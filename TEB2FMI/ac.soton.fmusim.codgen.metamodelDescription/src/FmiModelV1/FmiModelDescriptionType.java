/**
 */
package FmiModelV1;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Model Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getUnitDefinitions <em>Unit Definitions</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getDefaultExperiment <em>Default Experiment</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getVendorAnnotations <em>Vendor Annotations</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getModelVariables <em>Model Variables</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getAuthor <em>Author</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getGenerationDateAndTime <em>Generation Date And Time</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getGenerationTool <em>Generation Tool</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getGuid <em>Guid</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}</li>
 *   <li>{@link FmiModelV1.FmiModelDescriptionType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType()
 * @model extendedMetaData="name='fmiModelDescription_._type' kind='elementOnly'"
 * @generated
 */
public interface FmiModelDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Definitions</em>' containment reference.
	 * @see #setUnitDefinitions(UnitDefinitionsType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_UnitDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnitDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitDefinitionsType getUnitDefinitions();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getUnitDefinitions <em>Unit Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Definitions</em>' containment reference.
	 * @see #getUnitDefinitions()
	 * @generated
	 */
	void setUnitDefinitions(UnitDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' containment reference.
	 * @see #setTypeDefinitions(TypeDefinitionsType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_TypeDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeDefinitionsType getTypeDefinitions();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getTypeDefinitions <em>Type Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definitions</em>' containment reference.
	 * @see #getTypeDefinitions()
	 * @generated
	 */
	void setTypeDefinitions(TypeDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Default Experiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Experiment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Experiment</em>' containment reference.
	 * @see #setDefaultExperiment(DefaultExperimentType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_DefaultExperiment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultExperiment' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultExperimentType getDefaultExperiment();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getDefaultExperiment <em>Default Experiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Experiment</em>' containment reference.
	 * @see #getDefaultExperiment()
	 * @generated
	 */
	void setDefaultExperiment(DefaultExperimentType value);

	/**
	 * Returns the value of the '<em><b>Vendor Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tool specific data (ignored by other tools)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Annotations</em>' containment reference.
	 * @see #setVendorAnnotations(VendorAnnotationsType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_VendorAnnotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VendorAnnotations' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorAnnotationsType getVendorAnnotations();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getVendorAnnotations <em>Vendor Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Annotations</em>' containment reference.
	 * @see #getVendorAnnotations()
	 * @generated
	 */
	void setVendorAnnotations(VendorAnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Model Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exposed variables of the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Variables</em>' containment reference.
	 * @see #setModelVariables(ModelVariablesType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_ModelVariables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModelVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelVariablesType getModelVariables();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getModelVariables <em>Model Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Variables</em>' containment reference.
	 * @see #getModelVariables()
	 * @generated
	 */
	void setModelVariables(ModelVariablesType value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModelV1.ImplementationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the implementation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_Implementation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImplementationType> getImplementation();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fmi Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmi Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmi Version</em>' attribute.
	 * @see #isSetFmiVersion()
	 * @see #unsetFmiVersion()
	 * @see #setFmiVersion(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_FmiVersion()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='fmiVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFmiVersion();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmi Version</em>' attribute.
	 * @see #isSetFmiVersion()
	 * @see #unsetFmiVersion()
	 * @see #getFmiVersion()
	 * @generated
	 */
	void setFmiVersion(String value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFmiVersion()
	 * @see #getFmiVersion()
	 * @see #setFmiVersion(String)
	 * @generated
	 */
	void unsetFmiVersion();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fmi Version</em>' attribute is set.
	 * @see #unsetFmiVersion()
	 * @see #getFmiVersion()
	 * @see #setFmiVersion(String)
	 * @generated
	 */
	boolean isSetFmiVersion();

	/**
	 * Returns the value of the '<em><b>Generation Date And Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Date And Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Date And Time</em>' attribute.
	 * @see #setGenerationDateAndTime(XMLGregorianCalendar)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_GenerationDateAndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='generationDateAndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGenerationDateAndTime();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getGenerationDateAndTime <em>Generation Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Date And Time</em>' attribute.
	 * @see #getGenerationDateAndTime()
	 * @generated
	 */
	void setGenerationDateAndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Generation Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Tool</em>' attribute.
	 * @see #setGenerationTool(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_GenerationTool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='generationTool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGenerationTool();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getGenerationTool <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Tool</em>' attribute.
	 * @see #getGenerationTool()
	 * @generated
	 */
	void setGenerationTool(String value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fingerprint of xml-file content to verify that xml-file and C-functions are compatible to each other
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_Guid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='guid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(String value);

	/**
	 * Returns the value of the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short class name according to C-syntax (used as prefix of C-functions and as name of the FMU zip-file), e.g. A_B_C
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Identifier</em>' attribute.
	 * @see #setModelIdentifier(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_ModelIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='modelIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelIdentifier();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getModelIdentifier <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Identifier</em>' attribute.
	 * @see #getModelIdentifier()
	 * @generated
	 */
	void setModelIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class name of FMU, e.g. "A.B.C" (several FMU instances are possible)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_ModelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='modelName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Continuous States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Continuous States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Continuous States</em>' attribute.
	 * @see #isSetNumberOfContinuousStates()
	 * @see #unsetNumberOfContinuousStates()
	 * @see #setNumberOfContinuousStates(long)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_NumberOfContinuousStates()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='numberOfContinuousStates' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNumberOfContinuousStates();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Continuous States</em>' attribute.
	 * @see #isSetNumberOfContinuousStates()
	 * @see #unsetNumberOfContinuousStates()
	 * @see #getNumberOfContinuousStates()
	 * @generated
	 */
	void setNumberOfContinuousStates(long value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfContinuousStates()
	 * @see #getNumberOfContinuousStates()
	 * @see #setNumberOfContinuousStates(long)
	 * @generated
	 */
	void unsetNumberOfContinuousStates();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Continuous States</em>' attribute is set.
	 * @see #unsetNumberOfContinuousStates()
	 * @see #getNumberOfContinuousStates()
	 * @see #setNumberOfContinuousStates(long)
	 * @generated
	 */
	boolean isSetNumberOfContinuousStates();

	/**
	 * Returns the value of the '<em><b>Number Of Event Indicators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Event Indicators</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Event Indicators</em>' attribute.
	 * @see #isSetNumberOfEventIndicators()
	 * @see #unsetNumberOfEventIndicators()
	 * @see #setNumberOfEventIndicators(long)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_NumberOfEventIndicators()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='numberOfEventIndicators' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNumberOfEventIndicators();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Event Indicators</em>' attribute.
	 * @see #isSetNumberOfEventIndicators()
	 * @see #unsetNumberOfEventIndicators()
	 * @see #getNumberOfEventIndicators()
	 * @generated
	 */
	void setNumberOfEventIndicators(long value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfEventIndicators()
	 * @see #getNumberOfEventIndicators()
	 * @see #setNumberOfEventIndicators(long)
	 * @generated
	 */
	void unsetNumberOfEventIndicators();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Event Indicators</em>' attribute is set.
	 * @see #unsetNumberOfEventIndicators()
	 * @see #getNumberOfEventIndicators()
	 * @see #setNumberOfEventIndicators(long)
	 * @generated
	 */
	boolean isSetNumberOfEventIndicators();

	/**
	 * Returns the value of the '<em><b>Variable Naming Convention</b></em>' attribute.
	 * The default value is <code>"flat"</code>.
	 * The literals are from the enumeration {@link FmiModelV1.VariableNamingConventionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Naming Convention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Naming Convention</em>' attribute.
	 * @see FmiModelV1.VariableNamingConventionType
	 * @see #isSetVariableNamingConvention()
	 * @see #unsetVariableNamingConvention()
	 * @see #setVariableNamingConvention(VariableNamingConventionType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_VariableNamingConvention()
	 * @model default="flat" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='variableNamingConvention' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableNamingConventionType getVariableNamingConvention();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Naming Convention</em>' attribute.
	 * @see FmiModelV1.VariableNamingConventionType
	 * @see #isSetVariableNamingConvention()
	 * @see #unsetVariableNamingConvention()
	 * @see #getVariableNamingConvention()
	 * @generated
	 */
	void setVariableNamingConvention(VariableNamingConventionType value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariableNamingConvention()
	 * @see #getVariableNamingConvention()
	 * @see #setVariableNamingConvention(VariableNamingConventionType)
	 * @generated
	 */
	void unsetVariableNamingConvention();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variable Naming Convention</em>' attribute is set.
	 * @see #unsetVariableNamingConvention()
	 * @see #getVariableNamingConvention()
	 * @see #setVariableNamingConvention(VariableNamingConventionType)
	 * @generated
	 */
	boolean isSetVariableNamingConvention();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of FMU, e.g., "1.2"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiModelDescriptionType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiModelDescriptionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // FmiModelDescriptionType
