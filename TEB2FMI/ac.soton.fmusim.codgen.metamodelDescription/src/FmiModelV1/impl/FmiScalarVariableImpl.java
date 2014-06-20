/**
 */
package FmiModelV1.impl;

import FmiModelV1.AliasType;
import FmiModelV1.BooleanType;
import FmiModelV1.CausalityType;
import FmiModelV1.DirectDependencyType;
import FmiModelV1.EnumerationType;
import FmiModelV1.FmiModelV1Package;
import FmiModelV1.FmiScalarVariable;
import FmiModelV1.IntegerType;
import FmiModelV1.RealType;
import FmiModelV1.StringType;
import FmiModelV1.VariabilityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fmi Scalar Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getReal <em>Real</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getString <em>String</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getDirectDependency <em>Direct Dependency</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiScalarVariableImpl#getVariability <em>Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FmiScalarVariableImpl extends EObjectImpl implements FmiScalarVariable {
	/**
	 * The cached value of the '{@link #getReal() <em>Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected RealType real;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected IntegerType integer;

	/**
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected BooleanType boolean_;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected StringType string;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EnumerationType enumeration;

	/**
	 * The cached value of the '{@link #getDirectDependency() <em>Direct Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectDependency()
	 * @generated
	 * @ordered
	 */
	protected DirectDependencyType directDependency;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final AliasType ALIAS_EDEFAULT = AliasType.NO_ALIAS;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected AliasType alias = ALIAS_EDEFAULT;

	/**
	 * This is true if the Alias attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aliasESet;

	/**
	 * The default value of the '{@link #getCausality() <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected static final CausalityType CAUSALITY_EDEFAULT = CausalityType.INTERNAL;

	/**
	 * The cached value of the '{@link #getCausality() <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected CausalityType causality = CAUSALITY_EDEFAULT;

	/**
	 * This is true if the Causality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean causalityESet;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueReference() <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_REFERENCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValueReference() <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReference()
	 * @generated
	 * @ordered
	 */
	protected long valueReference = VALUE_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Value Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueReferenceESet;

	/**
	 * The default value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected static final VariabilityType VARIABILITY_EDEFAULT = VariabilityType.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected VariabilityType variability = VARIABILITY_EDEFAULT;

	/**
	 * This is true if the Variability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean variabilityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiScalarVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.FMI_SCALAR_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType getReal() {
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReal(RealType newReal, NotificationChain msgs) {
		RealType oldReal = real;
		real = newReal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL, oldReal, newReal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReal(RealType newReal) {
		if (newReal != real) {
			NotificationChain msgs = null;
			if (real != null)
				msgs = ((InternalEObject)real).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL, null, msgs);
			if (newReal != null)
				msgs = ((InternalEObject)newReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL, null, msgs);
			msgs = basicSetReal(newReal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL, newReal, newReal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType getInteger() {
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteger(IntegerType newInteger, NotificationChain msgs) {
		IntegerType oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER, oldInteger, newInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteger(IntegerType newInteger) {
		if (newInteger != integer) {
			NotificationChain msgs = null;
			if (integer != null)
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER, newInteger, newInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolean(BooleanType newBoolean, NotificationChain msgs) {
		BooleanType oldBoolean = boolean_;
		boolean_ = newBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN, oldBoolean, newBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(BooleanType newBoolean) {
		if (newBoolean != boolean_) {
			NotificationChain msgs = null;
			if (boolean_ != null)
				msgs = ((InternalEObject)boolean_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN, null, msgs);
			if (newBoolean != null)
				msgs = ((InternalEObject)newBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN, null, msgs);
			msgs = basicSetBoolean(newBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN, newBoolean, newBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(StringType newString, NotificationChain msgs) {
		StringType oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(StringType newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType getEnumeration() {
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(EnumerationType newEnumeration, NotificationChain msgs) {
		EnumerationType oldEnumeration = enumeration;
		enumeration = newEnumeration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION, oldEnumeration, newEnumeration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(EnumerationType newEnumeration) {
		if (newEnumeration != enumeration) {
			NotificationChain msgs = null;
			if (enumeration != null)
				msgs = ((InternalEObject)enumeration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION, null, msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION, null, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION, newEnumeration, newEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectDependencyType getDirectDependency() {
		return directDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectDependency(DirectDependencyType newDirectDependency, NotificationChain msgs) {
		DirectDependencyType oldDirectDependency = directDependency;
		directDependency = newDirectDependency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY, oldDirectDependency, newDirectDependency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectDependency(DirectDependencyType newDirectDependency) {
		if (newDirectDependency != directDependency) {
			NotificationChain msgs = null;
			if (directDependency != null)
				msgs = ((InternalEObject)directDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY, null, msgs);
			if (newDirectDependency != null)
				msgs = ((InternalEObject)newDirectDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY, null, msgs);
			msgs = basicSetDirectDependency(newDirectDependency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY, newDirectDependency, newDirectDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasType getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(AliasType newAlias) {
		AliasType oldAlias = alias;
		alias = newAlias == null ? ALIAS_EDEFAULT : newAlias;
		boolean oldAliasESet = aliasESet;
		aliasESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__ALIAS, oldAlias, alias, !oldAliasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlias() {
		AliasType oldAlias = alias;
		boolean oldAliasESet = aliasESet;
		alias = ALIAS_EDEFAULT;
		aliasESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_SCALAR_VARIABLE__ALIAS, oldAlias, ALIAS_EDEFAULT, oldAliasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlias() {
		return aliasESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityType getCausality() {
		return causality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausality(CausalityType newCausality) {
		CausalityType oldCausality = causality;
		causality = newCausality == null ? CAUSALITY_EDEFAULT : newCausality;
		boolean oldCausalityESet = causalityESet;
		causalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__CAUSALITY, oldCausality, causality, !oldCausalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCausality() {
		CausalityType oldCausality = causality;
		boolean oldCausalityESet = causalityESet;
		causality = CAUSALITY_EDEFAULT;
		causalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_SCALAR_VARIABLE__CAUSALITY, oldCausality, CAUSALITY_EDEFAULT, oldCausalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCausality() {
		return causalityESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValueReference() {
		return valueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueReference(long newValueReference) {
		long oldValueReference = valueReference;
		valueReference = newValueReference;
		boolean oldValueReferenceESet = valueReferenceESet;
		valueReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__VALUE_REFERENCE, oldValueReference, valueReference, !oldValueReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueReference() {
		long oldValueReference = valueReference;
		boolean oldValueReferenceESet = valueReferenceESet;
		valueReference = VALUE_REFERENCE_EDEFAULT;
		valueReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_SCALAR_VARIABLE__VALUE_REFERENCE, oldValueReference, VALUE_REFERENCE_EDEFAULT, oldValueReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueReference() {
		return valueReferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType getVariability() {
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariability(VariabilityType newVariability) {
		VariabilityType oldVariability = variability;
		variability = newVariability == null ? VARIABILITY_EDEFAULT : newVariability;
		boolean oldVariabilityESet = variabilityESet;
		variabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_SCALAR_VARIABLE__VARIABILITY, oldVariability, variability, !oldVariabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariability() {
		VariabilityType oldVariability = variability;
		boolean oldVariabilityESet = variabilityESet;
		variability = VARIABILITY_EDEFAULT;
		variabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.FMI_SCALAR_VARIABLE__VARIABILITY, oldVariability, VARIABILITY_EDEFAULT, oldVariabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariability() {
		return variabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL:
				return basicSetReal(null, msgs);
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER:
				return basicSetInteger(null, msgs);
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING:
				return basicSetString(null, msgs);
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION:
				return basicSetEnumeration(null, msgs);
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY:
				return basicSetDirectDependency(null, msgs);
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
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL:
				return getReal();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER:
				return getInteger();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN:
				return getBoolean();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING:
				return getString();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION:
				return getEnumeration();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY:
				return getDirectDependency();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ALIAS:
				return getAlias();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__CAUSALITY:
				return getCausality();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DESCRIPTION:
				return getDescription();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__NAME:
				return getName();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VALUE_REFERENCE:
				return getValueReference();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VARIABILITY:
				return getVariability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL:
				setReal((RealType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER:
				setInteger((IntegerType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN:
				setBoolean((BooleanType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING:
				setString((StringType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION:
				setEnumeration((EnumerationType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY:
				setDirectDependency((DirectDependencyType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ALIAS:
				setAlias((AliasType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__CAUSALITY:
				setCausality((CausalityType)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VALUE_REFERENCE:
				setValueReference((Long)newValue);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VARIABILITY:
				setVariability((VariabilityType)newValue);
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
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL:
				setReal((RealType)null);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER:
				setInteger((IntegerType)null);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN:
				setBoolean((BooleanType)null);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING:
				setString((StringType)null);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION:
				setEnumeration((EnumerationType)null);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY:
				setDirectDependency((DirectDependencyType)null);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ALIAS:
				unsetAlias();
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__CAUSALITY:
				unsetCausality();
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VALUE_REFERENCE:
				unsetValueReference();
				return;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VARIABILITY:
				unsetVariability();
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
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__REAL:
				return real != null;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__INTEGER:
				return integer != null;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__BOOLEAN:
				return boolean_ != null;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__STRING:
				return string != null;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ENUMERATION:
				return enumeration != null;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DIRECT_DEPENDENCY:
				return directDependency != null;
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__ALIAS:
				return isSetAlias();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__CAUSALITY:
				return isSetCausality();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VALUE_REFERENCE:
				return isSetValueReference();
			case FmiModelV1Package.FMI_SCALAR_VARIABLE__VARIABILITY:
				return isSetVariability();
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
		result.append(" (alias: ");
		if (aliasESet) result.append(alias); else result.append("<unset>");
		result.append(", causality: ");
		if (causalityESet) result.append(causality); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", valueReference: ");
		if (valueReferenceESet) result.append(valueReference); else result.append("<unset>");
		result.append(", variability: ");
		if (variabilityESet) result.append(variability); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FmiScalarVariableImpl
