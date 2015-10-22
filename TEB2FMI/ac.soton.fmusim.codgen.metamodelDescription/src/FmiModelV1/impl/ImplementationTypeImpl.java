/**
 */
package FmiModelV1.impl;

import FmiModelV1.CoSimulation_StandAloneType;
import FmiModelV1.FmiModelV1Package;
import FmiModelV1.ImplementationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelV1.impl.ImplementationTypeImpl#getCoSimulation_StandAlone <em>Co Simulation Stand Alone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationTypeImpl extends EObjectImpl implements ImplementationType {
	/**
	 * The cached value of the '{@link #getCoSimulation_StandAlone() <em>Co Simulation Stand Alone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoSimulation_StandAlone()
	 * @generated
	 * @ordered
	 */
	protected CoSimulation_StandAloneType coSimulation_StandAlone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelV1Package.Literals.IMPLEMENTATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoSimulation_StandAloneType getCoSimulation_StandAlone() {
		return coSimulation_StandAlone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoSimulation_StandAlone(CoSimulation_StandAloneType newCoSimulation_StandAlone, NotificationChain msgs) {
		CoSimulation_StandAloneType oldCoSimulation_StandAlone = coSimulation_StandAlone;
		coSimulation_StandAlone = newCoSimulation_StandAlone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE, oldCoSimulation_StandAlone, newCoSimulation_StandAlone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoSimulation_StandAlone(CoSimulation_StandAloneType newCoSimulation_StandAlone) {
		if (newCoSimulation_StandAlone != coSimulation_StandAlone) {
			NotificationChain msgs = null;
			if (coSimulation_StandAlone != null)
				msgs = ((InternalEObject)coSimulation_StandAlone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE, null, msgs);
			if (newCoSimulation_StandAlone != null)
				msgs = ((InternalEObject)newCoSimulation_StandAlone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE, null, msgs);
			msgs = basicSetCoSimulation_StandAlone(newCoSimulation_StandAlone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE, newCoSimulation_StandAlone, newCoSimulation_StandAlone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE:
				return basicSetCoSimulation_StandAlone(null, msgs);
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
			case FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE:
				return getCoSimulation_StandAlone();
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
			case FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE:
				setCoSimulation_StandAlone((CoSimulation_StandAloneType)newValue);
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
			case FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE:
				setCoSimulation_StandAlone((CoSimulation_StandAloneType)null);
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
			case FmiModelV1Package.IMPLEMENTATION_TYPE__CO_SIMULATION_STAND_ALONE:
				return coSimulation_StandAlone != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationTypeImpl
