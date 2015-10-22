/**
 */
package FmiModelV1.impl;

import FmiModelV1.EnumerationTypeType;
import FmiModelV1.FmiModelV1Package;
import FmiModelV1.FmiType;
import FmiModelV1.IntegerTypeType;
import FmiModelV1.RealTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fmi Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.FmiTypeImpl#getRealType <em>Real Type</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiTypeImpl#getIntegerType <em>Integer Type</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiTypeImpl#getBooleanType <em>Boolean Type</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiTypeImpl#getStringType <em>String Type</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiTypeImpl#getEnumerationType <em>Enumeration Type</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModelV1.impl.FmiTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FmiTypeImpl extends EObjectImpl implements FmiType {
	/**
	 * The cached value of the '{@link #getRealType() <em>Real Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealType()
	 * @generated
	 * @ordered
	 */
	protected RealTypeType realType;

	/**
	 * The cached value of the '{@link #getIntegerType() <em>Integer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerType()
	 * @generated
	 * @ordered
	 */
	protected IntegerTypeType integerType;

	/**
	 * The cached value of the '{@link #getBooleanType() <em>Boolean Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanType()
	 * @generated
	 * @ordered
	 */
	protected EObject booleanType;

	/**
	 * The cached value of the '{@link #getStringType() <em>String Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringType()
	 * @generated
	 * @ordered
	 */
	protected EObject stringType;

	/**
	 * The cached value of the '{@link #getEnumerationType() <em>Enumeration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationType()
	 * @generated
	 * @ordered
	 */
	protected EnumerationTypeType enumerationType;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.FMI_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealTypeType getRealType() {
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealType(RealTypeType newRealType, NotificationChain msgs) {
		RealTypeType oldRealType = realType;
		realType = newRealType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__REAL_TYPE, oldRealType, newRealType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealType(RealTypeType newRealType) {
		if (newRealType != realType) {
			NotificationChain msgs = null;
			if (realType != null)
				msgs = ((InternalEObject)realType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__REAL_TYPE, null, msgs);
			if (newRealType != null)
				msgs = ((InternalEObject)newRealType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__REAL_TYPE, null, msgs);
			msgs = basicSetRealType(newRealType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__REAL_TYPE, newRealType, newRealType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerTypeType getIntegerType() {
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerType(IntegerTypeType newIntegerType, NotificationChain msgs) {
		IntegerTypeType oldIntegerType = integerType;
		integerType = newIntegerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__INTEGER_TYPE, oldIntegerType, newIntegerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerType(IntegerTypeType newIntegerType) {
		if (newIntegerType != integerType) {
			NotificationChain msgs = null;
			if (integerType != null)
				msgs = ((InternalEObject)integerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__INTEGER_TYPE, null, msgs);
			if (newIntegerType != null)
				msgs = ((InternalEObject)newIntegerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__INTEGER_TYPE, null, msgs);
			msgs = basicSetIntegerType(newIntegerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__INTEGER_TYPE, newIntegerType, newIntegerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBooleanType() {
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanType(EObject newBooleanType, NotificationChain msgs) {
		EObject oldBooleanType = booleanType;
		booleanType = newBooleanType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE, oldBooleanType, newBooleanType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanType(EObject newBooleanType) {
		if (newBooleanType != booleanType) {
			NotificationChain msgs = null;
			if (booleanType != null)
				msgs = ((InternalEObject)booleanType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE, null, msgs);
			if (newBooleanType != null)
				msgs = ((InternalEObject)newBooleanType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE, null, msgs);
			msgs = basicSetBooleanType(newBooleanType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE, newBooleanType, newBooleanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStringType() {
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringType(EObject newStringType, NotificationChain msgs) {
		EObject oldStringType = stringType;
		stringType = newStringType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__STRING_TYPE, oldStringType, newStringType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringType(EObject newStringType) {
		if (newStringType != stringType) {
			NotificationChain msgs = null;
			if (stringType != null)
				msgs = ((InternalEObject)stringType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__STRING_TYPE, null, msgs);
			if (newStringType != null)
				msgs = ((InternalEObject)newStringType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__STRING_TYPE, null, msgs);
			msgs = basicSetStringType(newStringType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__STRING_TYPE, newStringType, newStringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationTypeType getEnumerationType() {
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerationType(EnumerationTypeType newEnumerationType, NotificationChain msgs) {
		EnumerationTypeType oldEnumerationType = enumerationType;
		enumerationType = newEnumerationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE, oldEnumerationType, newEnumerationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationType(EnumerationTypeType newEnumerationType) {
		if (newEnumerationType != enumerationType) {
			NotificationChain msgs = null;
			if (enumerationType != null)
				msgs = ((InternalEObject)enumerationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE, null, msgs);
			if (newEnumerationType != null)
				msgs = ((InternalEObject)newEnumerationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE, null, msgs);
			msgs = basicSetEnumerationType(newEnumerationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE, newEnumerationType, newEnumerationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.FMI_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelV1Package.FMI_TYPE__REAL_TYPE:
				return basicSetRealType(null, msgs);
			case FmiModelV1Package.FMI_TYPE__INTEGER_TYPE:
				return basicSetIntegerType(null, msgs);
			case FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE:
				return basicSetBooleanType(null, msgs);
			case FmiModelV1Package.FMI_TYPE__STRING_TYPE:
				return basicSetStringType(null, msgs);
			case FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE:
				return basicSetEnumerationType(null, msgs);
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
			case FmiModelV1Package.FMI_TYPE__REAL_TYPE:
				return getRealType();
			case FmiModelV1Package.FMI_TYPE__INTEGER_TYPE:
				return getIntegerType();
			case FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE:
				return getBooleanType();
			case FmiModelV1Package.FMI_TYPE__STRING_TYPE:
				return getStringType();
			case FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE:
				return getEnumerationType();
			case FmiModelV1Package.FMI_TYPE__DESCRIPTION:
				return getDescription();
			case FmiModelV1Package.FMI_TYPE__NAME:
				return getName();
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
			case FmiModelV1Package.FMI_TYPE__REAL_TYPE:
				setRealType((RealTypeType)newValue);
				return;
			case FmiModelV1Package.FMI_TYPE__INTEGER_TYPE:
				setIntegerType((IntegerTypeType)newValue);
				return;
			case FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE:
				setBooleanType((EObject)newValue);
				return;
			case FmiModelV1Package.FMI_TYPE__STRING_TYPE:
				setStringType((EObject)newValue);
				return;
			case FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE:
				setEnumerationType((EnumerationTypeType)newValue);
				return;
			case FmiModelV1Package.FMI_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FmiModelV1Package.FMI_TYPE__NAME:
				setName((String)newValue);
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
			case FmiModelV1Package.FMI_TYPE__REAL_TYPE:
				setRealType((RealTypeType)null);
				return;
			case FmiModelV1Package.FMI_TYPE__INTEGER_TYPE:
				setIntegerType((IntegerTypeType)null);
				return;
			case FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE:
				setBooleanType((EObject)null);
				return;
			case FmiModelV1Package.FMI_TYPE__STRING_TYPE:
				setStringType((EObject)null);
				return;
			case FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE:
				setEnumerationType((EnumerationTypeType)null);
				return;
			case FmiModelV1Package.FMI_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FmiModelV1Package.FMI_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case FmiModelV1Package.FMI_TYPE__REAL_TYPE:
				return realType != null;
			case FmiModelV1Package.FMI_TYPE__INTEGER_TYPE:
				return integerType != null;
			case FmiModelV1Package.FMI_TYPE__BOOLEAN_TYPE:
				return booleanType != null;
			case FmiModelV1Package.FMI_TYPE__STRING_TYPE:
				return stringType != null;
			case FmiModelV1Package.FMI_TYPE__ENUMERATION_TYPE:
				return enumerationType != null;
			case FmiModelV1Package.FMI_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FmiModelV1Package.FMI_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FmiTypeImpl
