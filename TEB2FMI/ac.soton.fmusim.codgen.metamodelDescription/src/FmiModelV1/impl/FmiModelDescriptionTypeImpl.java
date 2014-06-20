/**
 */
package FmiModelV1.impl;

import FmiModelV1.DefaultExperimentType;
import FmiModelV1.FmiModelDescriptionType;
import FmiModelV1.FmiModelV1Package;
import FmiModelV1.ImplementationType;
import FmiModelV1.ModelVariablesType;
import FmiModelV1.TypeDefinitionsType;
import FmiModelV1.UnitDefinitionsType;
import FmiModelV1.VariableNamingConventionType;
import FmiModelV1.VendorAnnotationsType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fmi Model Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getUnitDefinitions <em>Unit Definitions</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getDefaultExperiment <em>Default Experiment</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getVendorAnnotations <em>Vendor Annotations</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getModelVariables <em>Model Variables</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getFmiVersion <em>Fmi Version</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getGenerationDateAndTime <em>Generation Date And Time</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getGenerationTool <em>Generation Tool</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getNumberOfContinuousStates <em>Number Of Continuous States</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getVariableNamingConvention <em>Variable Naming Convention</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiModelDescriptionTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FmiModelDescriptionTypeImpl extends EObjectImpl implements FmiModelDescriptionType {
	/**
	 * The cached value of the '{@link #getUnitDefinitions() <em>Unit Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitDefinitions()
	 * @generated
	 * @ordered
	 */
	protected UnitDefinitionsType unitDefinitions;

	/**
	 * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinitionsType typeDefinitions;

	/**
	 * The cached value of the '{@link #getDefaultExperiment() <em>Default Experiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExperiment()
	 * @generated
	 * @ordered
	 */
	protected DefaultExperimentType defaultExperiment;

	/**
	 * The cached value of the '{@link #getVendorAnnotations() <em>Vendor Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorAnnotations()
	 * @generated
	 * @ordered
	 */
	protected VendorAnnotationsType vendorAnnotations;

	/**
	 * The cached value of the '{@link #getModelVariables() <em>Model Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelVariables()
	 * @generated
	 * @ordered
	 */
	protected ModelVariablesType modelVariables;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationType> implementation;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFmiVersion() <em>Fmi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FMI_VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getFmiVersion() <em>Fmi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmiVersion()
	 * @generated
	 * @ordered
	 */
	protected String fmiVersion = FMI_VERSION_EDEFAULT;

	/**
	 * This is true if the Fmi Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fmiVersionESet;

	/**
	 * The default value of the '{@link #getGenerationDateAndTime() <em>Generation Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GENERATION_DATE_AND_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationDateAndTime() <em>Generation Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar generationDateAndTime = GENERATION_DATE_AND_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerationTool() <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationTool()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationTool() <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationTool()
	 * @generated
	 * @ordered
	 */
	protected String generationTool = GENERATION_TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected String guid = GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String modelIdentifier = MODEL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfContinuousStates() <em>Number Of Continuous States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfContinuousStates()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMBER_OF_CONTINUOUS_STATES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumberOfContinuousStates() <em>Number Of Continuous States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfContinuousStates()
	 * @generated
	 * @ordered
	 */
	protected long numberOfContinuousStates = NUMBER_OF_CONTINUOUS_STATES_EDEFAULT;

	/**
	 * This is true if the Number Of Continuous States attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberOfContinuousStatesESet;

	/**
	 * The default value of the '{@link #getNumberOfEventIndicators() <em>Number Of Event Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEventIndicators()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMBER_OF_EVENT_INDICATORS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumberOfEventIndicators() <em>Number Of Event Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEventIndicators()
	 * @generated
	 * @ordered
	 */
	protected long numberOfEventIndicators = NUMBER_OF_EVENT_INDICATORS_EDEFAULT;

	/**
	 * This is true if the Number Of Event Indicators attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberOfEventIndicatorsESet;

	/**
	 * The default value of the '{@link #getVariableNamingConvention() <em>Variable Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNamingConvention()
	 * @generated
	 * @ordered
	 */
	protected static final VariableNamingConventionType VARIABLE_NAMING_CONVENTION_EDEFAULT = VariableNamingConventionType.FLAT;

	/**
	 * The cached value of the '{@link #getVariableNamingConvention() <em>Variable Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNamingConvention()
	 * @generated
	 * @ordered
	 */
	protected VariableNamingConventionType variableNamingConvention = VARIABLE_NAMING_CONVENTION_EDEFAULT;

	/**
	 * This is true if the Variable Naming Convention attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean variableNamingConventionESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiModelDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDefinitionsType getUnitDefinitions() {
		return unitDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitDefinitions(UnitDefinitionsType newUnitDefinitions, NotificationChain msgs) {
		UnitDefinitionsType oldUnitDefinitions = unitDefinitions;
		unitDefinitions = newUnitDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS, oldUnitDefinitions, newUnitDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitDefinitions(UnitDefinitionsType newUnitDefinitions) {
		if (newUnitDefinitions != unitDefinitions) {
			NotificationChain msgs = null;
			if (unitDefinitions != null)
				msgs = ((InternalEObject)unitDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS, null, msgs);
			if (newUnitDefinitions != null)
				msgs = ((InternalEObject)newUnitDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS, null, msgs);
			msgs = basicSetUnitDefinitions(newUnitDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS, newUnitDefinitions, newUnitDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionsType getTypeDefinitions() {
		return typeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinitions(TypeDefinitionsType newTypeDefinitions, NotificationChain msgs) {
		TypeDefinitionsType oldTypeDefinitions = typeDefinitions;
		typeDefinitions = newTypeDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS, oldTypeDefinitions, newTypeDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinitions(TypeDefinitionsType newTypeDefinitions) {
		if (newTypeDefinitions != typeDefinitions) {
			NotificationChain msgs = null;
			if (typeDefinitions != null)
				msgs = ((InternalEObject)typeDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS, null, msgs);
			if (newTypeDefinitions != null)
				msgs = ((InternalEObject)newTypeDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS, null, msgs);
			msgs = basicSetTypeDefinitions(newTypeDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS, newTypeDefinitions, newTypeDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultExperimentType getDefaultExperiment() {
		return defaultExperiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultExperiment(DefaultExperimentType newDefaultExperiment, NotificationChain msgs) {
		DefaultExperimentType oldDefaultExperiment = defaultExperiment;
		defaultExperiment = newDefaultExperiment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT, oldDefaultExperiment, newDefaultExperiment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultExperiment(DefaultExperimentType newDefaultExperiment) {
		if (newDefaultExperiment != defaultExperiment) {
			NotificationChain msgs = null;
			if (defaultExperiment != null)
				msgs = ((InternalEObject)defaultExperiment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT, null, msgs);
			if (newDefaultExperiment != null)
				msgs = ((InternalEObject)newDefaultExperiment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT, null, msgs);
			msgs = basicSetDefaultExperiment(newDefaultExperiment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT, newDefaultExperiment, newDefaultExperiment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorAnnotationsType getVendorAnnotations() {
		return vendorAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorAnnotations(VendorAnnotationsType newVendorAnnotations, NotificationChain msgs) {
		VendorAnnotationsType oldVendorAnnotations = vendorAnnotations;
		vendorAnnotations = newVendorAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS, oldVendorAnnotations, newVendorAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorAnnotations(VendorAnnotationsType newVendorAnnotations) {
		if (newVendorAnnotations != vendorAnnotations) {
			NotificationChain msgs = null;
			if (vendorAnnotations != null)
				msgs = ((InternalEObject)vendorAnnotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS, null, msgs);
			if (newVendorAnnotations != null)
				msgs = ((InternalEObject)newVendorAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS, null, msgs);
			msgs = basicSetVendorAnnotations(newVendorAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS, newVendorAnnotations, newVendorAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelVariablesType getModelVariables() {
		return modelVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelVariables(ModelVariablesType newModelVariables, NotificationChain msgs) {
		ModelVariablesType oldModelVariables = modelVariables;
		modelVariables = newModelVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES, oldModelVariables, newModelVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelVariables(ModelVariablesType newModelVariables) {
		if (newModelVariables != modelVariables) {
			NotificationChain msgs = null;
			if (modelVariables != null)
				msgs = ((InternalEObject)modelVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES, null, msgs);
			if (newModelVariables != null)
				msgs = ((InternalEObject)newModelVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES, null, msgs);
			msgs = basicSetModelVariables(newModelVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES, newModelVariables, newModelVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationType> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectContainmentEList<ImplementationType>(ImplementationType.class, this, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFmiVersion() {
		return fmiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmiVersion(String newFmiVersion) {
		String oldFmiVersion = fmiVersion;
		fmiVersion = newFmiVersion;
		boolean oldFmiVersionESet = fmiVersionESet;
		fmiVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION, oldFmiVersion, fmiVersion, !oldFmiVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFmiVersion() {
		String oldFmiVersion = fmiVersion;
		boolean oldFmiVersionESet = fmiVersionESet;
		fmiVersion = FMI_VERSION_EDEFAULT;
		fmiVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION, oldFmiVersion, FMI_VERSION_EDEFAULT, oldFmiVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFmiVersion() {
		return fmiVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGenerationDateAndTime() {
		return generationDateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationDateAndTime(XMLGregorianCalendar newGenerationDateAndTime) {
		XMLGregorianCalendar oldGenerationDateAndTime = generationDateAndTime;
		generationDateAndTime = newGenerationDateAndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME, oldGenerationDateAndTime, generationDateAndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationTool() {
		return generationTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationTool(String newGenerationTool) {
		String oldGenerationTool = generationTool;
		generationTool = newGenerationTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL, oldGenerationTool, generationTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuid(String newGuid) {
		String oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GUID, oldGuid, guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelIdentifier() {
		return modelIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelIdentifier(String newModelIdentifier) {
		String oldModelIdentifier = modelIdentifier;
		modelIdentifier = newModelIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER, oldModelIdentifier, modelIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumberOfContinuousStates() {
		return numberOfContinuousStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfContinuousStates(long newNumberOfContinuousStates) {
		long oldNumberOfContinuousStates = numberOfContinuousStates;
		numberOfContinuousStates = newNumberOfContinuousStates;
		boolean oldNumberOfContinuousStatesESet = numberOfContinuousStatesESet;
		numberOfContinuousStatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES, oldNumberOfContinuousStates, numberOfContinuousStates, !oldNumberOfContinuousStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfContinuousStates() {
		long oldNumberOfContinuousStates = numberOfContinuousStates;
		boolean oldNumberOfContinuousStatesESet = numberOfContinuousStatesESet;
		numberOfContinuousStates = NUMBER_OF_CONTINUOUS_STATES_EDEFAULT;
		numberOfContinuousStatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES, oldNumberOfContinuousStates, NUMBER_OF_CONTINUOUS_STATES_EDEFAULT, oldNumberOfContinuousStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfContinuousStates() {
		return numberOfContinuousStatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumberOfEventIndicators() {
		return numberOfEventIndicators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfEventIndicators(long newNumberOfEventIndicators) {
		long oldNumberOfEventIndicators = numberOfEventIndicators;
		numberOfEventIndicators = newNumberOfEventIndicators;
		boolean oldNumberOfEventIndicatorsESet = numberOfEventIndicatorsESet;
		numberOfEventIndicatorsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS, oldNumberOfEventIndicators, numberOfEventIndicators, !oldNumberOfEventIndicatorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfEventIndicators() {
		long oldNumberOfEventIndicators = numberOfEventIndicators;
		boolean oldNumberOfEventIndicatorsESet = numberOfEventIndicatorsESet;
		numberOfEventIndicators = NUMBER_OF_EVENT_INDICATORS_EDEFAULT;
		numberOfEventIndicatorsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS, oldNumberOfEventIndicators, NUMBER_OF_EVENT_INDICATORS_EDEFAULT, oldNumberOfEventIndicatorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfEventIndicators() {
		return numberOfEventIndicatorsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableNamingConventionType getVariableNamingConvention() {
		return variableNamingConvention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableNamingConvention(VariableNamingConventionType newVariableNamingConvention) {
		VariableNamingConventionType oldVariableNamingConvention = variableNamingConvention;
		variableNamingConvention = newVariableNamingConvention == null ? VARIABLE_NAMING_CONVENTION_EDEFAULT : newVariableNamingConvention;
		boolean oldVariableNamingConventionESet = variableNamingConventionESet;
		variableNamingConventionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION, oldVariableNamingConvention, variableNamingConvention, !oldVariableNamingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariableNamingConvention() {
		VariableNamingConventionType oldVariableNamingConvention = variableNamingConvention;
		boolean oldVariableNamingConventionESet = variableNamingConventionESet;
		variableNamingConvention = VARIABLE_NAMING_CONVENTION_EDEFAULT;
		variableNamingConventionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION, oldVariableNamingConvention, VARIABLE_NAMING_CONVENTION_EDEFAULT, oldVariableNamingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariableNamingConvention() {
		return variableNamingConventionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS:
				return basicSetUnitDefinitions(null, msgs);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS:
				return basicSetTypeDefinitions(null, msgs);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT:
				return basicSetDefaultExperiment(null, msgs);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS:
				return basicSetVendorAnnotations(null, msgs);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES:
				return basicSetModelVariables(null, msgs);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION:
				return ((InternalEList<?>)getImplementation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS:
				return getUnitDefinitions();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS:
				return getTypeDefinitions();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT:
				return getDefaultExperiment();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS:
				return getVendorAnnotations();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES:
				return getModelVariables();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION:
				return getImplementation();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__AUTHOR:
				return getAuthor();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION:
				return getDescription();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION:
				return getFmiVersion();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME:
				return getGenerationDateAndTime();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL:
				return getGenerationTool();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GUID:
				return getGuid();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER:
				return getModelIdentifier();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME:
				return getModelName();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES:
				return getNumberOfContinuousStates();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS:
				return getNumberOfEventIndicators();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION:
				return getVariableNamingConvention();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS:
				setUnitDefinitions((UnitDefinitionsType)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS:
				setTypeDefinitions((TypeDefinitionsType)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT:
				setDefaultExperiment((DefaultExperimentType)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS:
				setVendorAnnotations((VendorAnnotationsType)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES:
				setModelVariables((ModelVariablesType)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends ImplementationType>)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION:
				setFmiVersion((String)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME:
				setGenerationDateAndTime((XMLGregorianCalendar)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL:
				setGenerationTool((String)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GUID:
				setGuid((String)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier((String)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES:
				setNumberOfContinuousStates((Long)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS:
				setNumberOfEventIndicators((Long)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION:
				setVariableNamingConvention((VariableNamingConventionType)newValue);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS:
				setUnitDefinitions((UnitDefinitionsType)null);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS:
				setTypeDefinitions((TypeDefinitionsType)null);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT:
				setDefaultExperiment((DefaultExperimentType)null);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS:
				setVendorAnnotations((VendorAnnotationsType)null);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES:
				setModelVariables((ModelVariablesType)null);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION:
				unsetFmiVersion();
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME:
				setGenerationDateAndTime(GENERATION_DATE_AND_TIME_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL:
				setGenerationTool(GENERATION_TOOL_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier(MODEL_IDENTIFIER_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES:
				unsetNumberOfContinuousStates();
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS:
				unsetNumberOfEventIndicators();
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION:
				unsetVariableNamingConvention();
				return;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS:
				return unitDefinitions != null;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS:
				return typeDefinitions != null;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT:
				return defaultExperiment != null;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS:
				return vendorAnnotations != null;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES:
				return modelVariables != null;
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION:
				return isSetFmiVersion();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME:
				return GENERATION_DATE_AND_TIME_EDEFAULT == null ? generationDateAndTime != null : !GENERATION_DATE_AND_TIME_EDEFAULT.equals(generationDateAndTime);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL:
				return GENERATION_TOOL_EDEFAULT == null ? generationTool != null : !GENERATION_TOOL_EDEFAULT.equals(generationTool);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER:
				return MODEL_IDENTIFIER_EDEFAULT == null ? modelIdentifier != null : !MODEL_IDENTIFIER_EDEFAULT.equals(modelIdentifier);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES:
				return isSetNumberOfContinuousStates();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS:
				return isSetNumberOfEventIndicators();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION:
				return isSetVariableNamingConvention();
			case FmiModelV1Package.FMI_MODEL_DESCRIPTION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (author: ");
		result.append(author);
		result.append(", description: ");
		result.append(description);
		result.append(", fmiVersion: ");
		if (fmiVersionESet) result.append(fmiVersion); else result.append("<unset>");
		result.append(", generationDateAndTime: ");
		result.append(generationDateAndTime);
		result.append(", generationTool: ");
		result.append(generationTool);
		result.append(", guid: ");
		result.append(guid);
		result.append(", modelIdentifier: ");
		result.append(modelIdentifier);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", numberOfContinuousStates: ");
		if (numberOfContinuousStatesESet) result.append(numberOfContinuousStates); else result.append("<unset>");
		result.append(", numberOfEventIndicators: ");
		if (numberOfEventIndicatorsESet) result.append(numberOfEventIndicators); else result.append("<unset>");
		result.append(", variableNamingConvention: ");
		if (variableNamingConventionESet) result.append(variableNamingConvention); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //FmiModelDescriptionTypeImpl
