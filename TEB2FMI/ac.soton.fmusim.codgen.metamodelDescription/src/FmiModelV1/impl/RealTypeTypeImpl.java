/**
 */
package FmiModelV1.impl;

import FmiModelV1.FmiModelV1Package;
import FmiModelV1.RealTypeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.RealTypeTypeImpl#getDisplayUnit <em>Display Unit</em>}</li>
 *   <li>{@link FmiModelV1.impl.RealTypeTypeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link FmiModelV1.impl.RealTypeTypeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link FmiModelV1.impl.RealTypeTypeImpl#getNominal <em>Nominal</em>}</li>
 *   <li>{@link FmiModelV1.impl.RealTypeTypeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link FmiModelV1.impl.RealTypeTypeImpl#isRelativeQuantity <em>Relative Quantity</em>}</li>
 *   <li>{@link FmiModelV1.impl.RealTypeTypeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealTypeTypeImpl extends EObjectImpl implements RealTypeType {
	/**
	 * The default value of the '{@link #getDisplayUnit() <em>Display Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayUnit() <em>Display Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayUnit()
	 * @generated
	 * @ordered
	 */
	protected String displayUnit = DISPLAY_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

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
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * This is true if the Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minESet;

	/**
	 * The default value of the '{@link #getNominal() <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominal() <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal()
	 * @generated
	 * @ordered
	 */
	protected double nominal = NOMINAL_EDEFAULT;

	/**
	 * This is true if the Nominal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalESet;

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
	 * The default value of the '{@link #isRelativeQuantity() <em>Relative Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelativeQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_QUANTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelativeQuantity() <em>Relative Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelativeQuantity()
	 * @generated
	 * @ordered
	 */
	protected boolean relativeQuantity = RELATIVE_QUANTITY_EDEFAULT;

	/**
	 * This is true if the Relative Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativeQuantityESet;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.REAL_TYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayUnit() {
		return displayUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayUnit(String newDisplayUnit) {
		String oldDisplayUnit = displayUnit;
		displayUnit = newDisplayUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.REAL_TYPE_TYPE__DISPLAY_UNIT, oldDisplayUnit, displayUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		boolean oldMaxESet = maxESet;
		maxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.REAL_TYPE_TYPE__MAX, oldMax, max, !oldMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMax() {
		double oldMax = max;
		boolean oldMaxESet = maxESet;
		max = MAX_EDEFAULT;
		maxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.REAL_TYPE_TYPE__MAX, oldMax, MAX_EDEFAULT, oldMaxESet));
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
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		boolean oldMinESet = minESet;
		minESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.REAL_TYPE_TYPE__MIN, oldMin, min, !oldMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMin() {
		double oldMin = min;
		boolean oldMinESet = minESet;
		min = MIN_EDEFAULT;
		minESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.REAL_TYPE_TYPE__MIN, oldMin, MIN_EDEFAULT, oldMinESet));
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
	public double getNominal() {
		return nominal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominal(double newNominal) {
		double oldNominal = nominal;
		nominal = newNominal;
		boolean oldNominalESet = nominalESet;
		nominalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.REAL_TYPE_TYPE__NOMINAL, oldNominal, nominal, !oldNominalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominal() {
		double oldNominal = nominal;
		boolean oldNominalESet = nominalESet;
		nominal = NOMINAL_EDEFAULT;
		nominalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.REAL_TYPE_TYPE__NOMINAL, oldNominal, NOMINAL_EDEFAULT, oldNominalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominal() {
		return nominalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.REAL_TYPE_TYPE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelativeQuantity() {
		return relativeQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeQuantity(boolean newRelativeQuantity) {
		boolean oldRelativeQuantity = relativeQuantity;
		relativeQuantity = newRelativeQuantity;
		boolean oldRelativeQuantityESet = relativeQuantityESet;
		relativeQuantityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.REAL_TYPE_TYPE__RELATIVE_QUANTITY, oldRelativeQuantity, relativeQuantity, !oldRelativeQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelativeQuantity() {
		boolean oldRelativeQuantity = relativeQuantity;
		boolean oldRelativeQuantityESet = relativeQuantityESet;
		relativeQuantity = RELATIVE_QUANTITY_EDEFAULT;
		relativeQuantityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.REAL_TYPE_TYPE__RELATIVE_QUANTITY, oldRelativeQuantity, RELATIVE_QUANTITY_EDEFAULT, oldRelativeQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelativeQuantity() {
		return relativeQuantityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.REAL_TYPE_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelV1Package.REAL_TYPE_TYPE__DISPLAY_UNIT:
				return getDisplayUnit();
			case FmiModelV1Package.REAL_TYPE_TYPE__MAX:
				return getMax();
			case FmiModelV1Package.REAL_TYPE_TYPE__MIN:
				return getMin();
			case FmiModelV1Package.REAL_TYPE_TYPE__NOMINAL:
				return getNominal();
			case FmiModelV1Package.REAL_TYPE_TYPE__QUANTITY:
				return getQuantity();
			case FmiModelV1Package.REAL_TYPE_TYPE__RELATIVE_QUANTITY:
				return isRelativeQuantity();
			case FmiModelV1Package.REAL_TYPE_TYPE__UNIT:
				return getUnit();
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
			case FmiModelV1Package.REAL_TYPE_TYPE__DISPLAY_UNIT:
				setDisplayUnit((String)newValue);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__MAX:
				setMax((Double)newValue);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__MIN:
				setMin((Double)newValue);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__NOMINAL:
				setNominal((Double)newValue);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__QUANTITY:
				setQuantity((String)newValue);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__RELATIVE_QUANTITY:
				setRelativeQuantity((Boolean)newValue);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__UNIT:
				setUnit((String)newValue);
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
			case FmiModelV1Package.REAL_TYPE_TYPE__DISPLAY_UNIT:
				setDisplayUnit(DISPLAY_UNIT_EDEFAULT);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__MAX:
				unsetMax();
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__MIN:
				unsetMin();
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__NOMINAL:
				unsetNominal();
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__RELATIVE_QUANTITY:
				unsetRelativeQuantity();
				return;
			case FmiModelV1Package.REAL_TYPE_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case FmiModelV1Package.REAL_TYPE_TYPE__DISPLAY_UNIT:
				return DISPLAY_UNIT_EDEFAULT == null ? displayUnit != null : !DISPLAY_UNIT_EDEFAULT.equals(displayUnit);
			case FmiModelV1Package.REAL_TYPE_TYPE__MAX:
				return isSetMax();
			case FmiModelV1Package.REAL_TYPE_TYPE__MIN:
				return isSetMin();
			case FmiModelV1Package.REAL_TYPE_TYPE__NOMINAL:
				return isSetNominal();
			case FmiModelV1Package.REAL_TYPE_TYPE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case FmiModelV1Package.REAL_TYPE_TYPE__RELATIVE_QUANTITY:
				return isSetRelativeQuantity();
			case FmiModelV1Package.REAL_TYPE_TYPE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(" (displayUnit: ");
		result.append(displayUnit);
		result.append(", max: ");
		if (maxESet) result.append(max); else result.append("<unset>");
		result.append(", min: ");
		if (minESet) result.append(min); else result.append("<unset>");
		result.append(", nominal: ");
		if (nominalESet) result.append(nominal); else result.append("<unset>");
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", relativeQuantity: ");
		if (relativeQuantityESet) result.append(relativeQuantity); else result.append("<unset>");
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //RealTypeTypeImpl
