/**
 */
package FmiModelV1.impl;

import FmiModelV1.EnumerationType;
import FmiModelV1.FmiModelV1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.EnumerationTypeImpl#getDeclaredType <em>Declared Type</em>}</li>
 *   <li>{@link FmiModelV1.impl.EnumerationTypeImpl#isFixed <em>Fixed</em>}</li>
 *   <li>{@link FmiModelV1.impl.EnumerationTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link FmiModelV1.impl.EnumerationTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link FmiModelV1.impl.EnumerationTypeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link FmiModelV1.impl.EnumerationTypeImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationTypeImpl extends EObjectImpl implements EnumerationType {
	/**
	 * The default value of the '{@link #getDeclaredType() <em>Declared Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredType()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaredType() <em>Declared Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredType()
	 * @generated
	 * @ordered
	 */
	protected String declaredType = DECLARED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected boolean fixed = FIXED_EDEFAULT;

	/**
	 * This is true if the Fixed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedESet;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * This is true if the Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxESet;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * This is true if the Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minESet;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected String quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * This is true if the Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.ENUMERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclaredType() {
		return declaredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredType(String newDeclaredType) {
		String oldDeclaredType = declaredType;
		declaredType = newDeclaredType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.ENUMERATION_TYPE__DECLARED_TYPE, oldDeclaredType, declaredType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(boolean newFixed) {
		boolean oldFixed = fixed;
		fixed = newFixed;
		boolean oldFixedESet = fixedESet;
		fixedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.ENUMERATION_TYPE__FIXED, oldFixed, fixed, !oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixed() {
		boolean oldFixed = fixed;
		boolean oldFixedESet = fixedESet;
		fixed = FIXED_EDEFAULT;
		fixedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.ENUMERATION_TYPE__FIXED, oldFixed, FIXED_EDEFAULT, oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixed() {
		return fixedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		boolean oldMaxESet = maxESet;
		maxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.ENUMERATION_TYPE__MAX, oldMax, max, !oldMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMax() {
		int oldMax = max;
		boolean oldMaxESet = maxESet;
		max = MAX_EDEFAULT;
		maxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.ENUMERATION_TYPE__MAX, oldMax, MAX_EDEFAULT, oldMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return maxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		boolean oldMinESet = minESet;
		minESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.ENUMERATION_TYPE__MIN, oldMin, min, !oldMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMin() {
		int oldMin = min;
		boolean oldMinESet = minESet;
		min = MIN_EDEFAULT;
		minESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.ENUMERATION_TYPE__MIN, oldMin, MIN_EDEFAULT, oldMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return minESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(String newQuantity) {
		String oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.ENUMERATION_TYPE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		boolean oldStartESet = startESet;
		startESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.ENUMERATION_TYPE__START, oldStart, start, !oldStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStart() {
		int oldStart = start;
		boolean oldStartESet = startESet;
		start = START_EDEFAULT;
		startESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.ENUMERATION_TYPE__START, oldStart, START_EDEFAULT, oldStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStart() {
		return startESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelV1Package.ENUMERATION_TYPE__DECLARED_TYPE:
				return getDeclaredType();
			case FmiModelV1Package.ENUMERATION_TYPE__FIXED:
				return isFixed();
			case FmiModelV1Package.ENUMERATION_TYPE__MAX:
				return getMax();
			case FmiModelV1Package.ENUMERATION_TYPE__MIN:
				return getMin();
			case FmiModelV1Package.ENUMERATION_TYPE__QUANTITY:
				return getQuantity();
			case FmiModelV1Package.ENUMERATION_TYPE__START:
				return getStart();
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
			case FmiModelV1Package.ENUMERATION_TYPE__DECLARED_TYPE:
				setDeclaredType((String)newValue);
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__FIXED:
				setFixed((Boolean)newValue);
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__MAX:
				setMax((Integer)newValue);
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__MIN:
				setMin((Integer)newValue);
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__QUANTITY:
				setQuantity((String)newValue);
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__START:
				setStart((Integer)newValue);
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
			case FmiModelV1Package.ENUMERATION_TYPE__DECLARED_TYPE:
				setDeclaredType(DECLARED_TYPE_EDEFAULT);
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__FIXED:
				unsetFixed();
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__MAX:
				unsetMax();
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__MIN:
				unsetMin();
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case FmiModelV1Package.ENUMERATION_TYPE__START:
				unsetStart();
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
			case FmiModelV1Package.ENUMERATION_TYPE__DECLARED_TYPE:
				return DECLARED_TYPE_EDEFAULT == null ? declaredType != null : !DECLARED_TYPE_EDEFAULT.equals(declaredType);
			case FmiModelV1Package.ENUMERATION_TYPE__FIXED:
				return isSetFixed();
			case FmiModelV1Package.ENUMERATION_TYPE__MAX:
				return isSetMax();
			case FmiModelV1Package.ENUMERATION_TYPE__MIN:
				return isSetMin();
			case FmiModelV1Package.ENUMERATION_TYPE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case FmiModelV1Package.ENUMERATION_TYPE__START:
				return isSetStart();
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
		result.append(" (declaredType: ");
		result.append(declaredType);
		result.append(", fixed: ");
		if (fixedESet) result.append(fixed); else result.append("<unset>");
		result.append(", max: ");
		if (maxESet) result.append(max); else result.append("<unset>");
		result.append(", min: ");
		if (minESet) result.append(min); else result.append("<unset>");
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", start: ");
		if (startESet) result.append(start); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnumerationTypeImpl
