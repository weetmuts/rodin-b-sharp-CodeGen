/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.ImplementationType#getCoSimulation_StandAlone <em>Co Simulation Stand Alone</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getImplementationType()
 * @model extendedMetaData="name='Implementation_._type' kind='elementOnly'"
 * @generated
 */
public interface ImplementationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Co Simulation Stand Alone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Co Simulation Stand Alone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co Simulation Stand Alone</em>' containment reference.
	 * @see #setCoSimulation_StandAlone(CoSimulation_StandAloneType)
	 * @see FmiModelV1.FmiModelV1Package#getImplementationType_CoSimulation_StandAlone()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	CoSimulation_StandAloneType getCoSimulation_StandAlone();

	/**
	 * Sets the value of the '{@link FmiModelV1.ImplementationType#getCoSimulation_StandAlone <em>Co Simulation Stand Alone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co Simulation Stand Alone</em>' containment reference.
	 * @see #getCoSimulation_StandAlone()
	 * @generated
	 */
	void setCoSimulation_StandAlone(CoSimulation_StandAloneType value);

} // ImplementationType
