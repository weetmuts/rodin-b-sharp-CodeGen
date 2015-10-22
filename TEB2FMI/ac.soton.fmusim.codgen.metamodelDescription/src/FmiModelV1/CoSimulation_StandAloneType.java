/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Co Simulation Stand Alone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.CoSimulation_StandAloneType#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getCoSimulation_StandAloneType()
 * @model extendedMetaData="name='CoSimulation_StandAloneType' kind='elementOnly'"
 * @generated
 */
public interface CoSimulation_StandAloneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(CapabilitiesType)
	 * @see FmiModelV1.FmiModelV1Package#getCoSimulation_StandAloneType_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	CapabilitiesType getCapabilities();

	/**
	 * Sets the value of the '{@link FmiModelV1.CoSimulation_StandAloneType#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CapabilitiesType value);

} // CoSimulation_StandAloneType
