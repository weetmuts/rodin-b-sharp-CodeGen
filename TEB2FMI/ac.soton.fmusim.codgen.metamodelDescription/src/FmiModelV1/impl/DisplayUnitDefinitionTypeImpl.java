/**
 */
package FmiModelV1.impl;

import FmiModelV1.DisplayUnitDefinitionType;
import FmiModelV1.FmiModelV1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Unit Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.DisplayUnitDefinitionTypeImpl#getDisplayUnit <em>Display Unit</em>}</li>
 *   <li>{@link FmiModelV1.impl.DisplayUnitDefinitionTypeImpl#getGain <em>Gain</em>}</li>
 *   <li>{@link FmiModelV1.impl.DisplayUnitDefinitionTypeImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisplayUnitDefinitionTypeImpl extends EObjectImpl implements DisplayUnitDefinitionType {
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
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected static final double GAIN_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected double gain = GAIN_EDEFAULT;

	/**
	 * This is true if the Gain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gainESet;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected double offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayUnitDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.DISPLAY_UNIT_DEFINITION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__DISPLAY_UNIT, oldDisplayUnit, displayUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGain(double newGain) {
		double oldGain = gain;
		gain = newGain;
		boolean oldGainESet = gainESet;
		gainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__GAIN, oldGain, gain, !oldGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGain() {
		double oldGain = gain;
		boolean oldGainESet = gainESet;
		gain = GAIN_EDEFAULT;
		gainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__GAIN, oldGain, GAIN_EDEFAULT, oldGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGain() {
		return gainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(double newOffset) {
		double oldOffset = offset;
		offset = newOffset;
		boolean oldOffsetESet = offsetESet;
		offsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__OFFSET, oldOffset, offset, !oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffset() {
		double oldOffset = offset;
		boolean oldOffsetESet = offsetESet;
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__DISPLAY_UNIT:
				return getDisplayUnit();
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__GAIN:
				return getGain();
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__OFFSET:
				return getOffset();
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
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__DISPLAY_UNIT:
				setDisplayUnit((String)newValue);
				return;
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__GAIN:
				setGain((Double)newValue);
				return;
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__OFFSET:
				setOffset((Double)newValue);
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
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__DISPLAY_UNIT:
				setDisplayUnit(DISPLAY_UNIT_EDEFAULT);
				return;
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__GAIN:
				unsetGain();
				return;
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__OFFSET:
				unsetOffset();
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
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__DISPLAY_UNIT:
				return DISPLAY_UNIT_EDEFAULT == null ? displayUnit != null : !DISPLAY_UNIT_EDEFAULT.equals(displayUnit);
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__GAIN:
				return isSetGain();
			case FmiModelV1Package.DISPLAY_UNIT_DEFINITION_TYPE__OFFSET:
				return isSetOffset();
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
		result.append(", gain: ");
		if (gainESet) result.append(gain); else result.append("<unset>");
		result.append(", offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DisplayUnitDefinitionTypeImpl
