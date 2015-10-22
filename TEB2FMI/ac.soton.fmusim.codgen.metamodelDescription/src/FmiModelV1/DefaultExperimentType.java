/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Experiment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.DefaultExperimentType#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link FmiModelV1.DefaultExperimentType#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link FmiModelV1.DefaultExperimentType#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getDefaultExperimentType()
 * @model extendedMetaData="name='DefaultExperiment_._type' kind='empty'"
 * @generated
 */
public interface DefaultExperimentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #isSetStartTime()
	 * @see #unsetStartTime()
	 * @see #setStartTime(double)
	 * @see FmiModelV1.FmiModelV1Package#getDefaultExperimentType_StartTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='startTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStartTime();

	/**
	 * Sets the value of the '{@link FmiModelV1.DefaultExperimentType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #isSetStartTime()
	 * @see #unsetStartTime()
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.DefaultExperimentType#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartTime()
	 * @see #getStartTime()
	 * @see #setStartTime(double)
	 * @generated
	 */
	void unsetStartTime();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.DefaultExperimentType#getStartTime <em>Start Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Time</em>' attribute is set.
	 * @see #unsetStartTime()
	 * @see #getStartTime()
	 * @see #setStartTime(double)
	 * @generated
	 */
	boolean isSetStartTime();

	/**
	 * Returns the value of the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time</em>' attribute.
	 * @see #isSetStopTime()
	 * @see #unsetStopTime()
	 * @see #setStopTime(double)
	 * @see FmiModelV1.FmiModelV1Package#getDefaultExperimentType_StopTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='stopTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStopTime();

	/**
	 * Sets the value of the '{@link FmiModelV1.DefaultExperimentType#getStopTime <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Time</em>' attribute.
	 * @see #isSetStopTime()
	 * @see #unsetStopTime()
	 * @see #getStopTime()
	 * @generated
	 */
	void setStopTime(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.DefaultExperimentType#getStopTime <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStopTime()
	 * @see #getStopTime()
	 * @see #setStopTime(double)
	 * @generated
	 */
	void unsetStopTime();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.DefaultExperimentType#getStopTime <em>Stop Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stop Time</em>' attribute is set.
	 * @see #unsetStopTime()
	 * @see #getStopTime()
	 * @see #setStopTime(double)
	 * @generated
	 */
	boolean isSetStopTime();

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default relative integration tolerance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #isSetTolerance()
	 * @see #unsetTolerance()
	 * @see #setTolerance(double)
	 * @see FmiModelV1.FmiModelV1Package#getDefaultExperimentType_Tolerance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='tolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTolerance();

	/**
	 * Sets the value of the '{@link FmiModelV1.DefaultExperimentType#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #isSetTolerance()
	 * @see #unsetTolerance()
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.DefaultExperimentType#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTolerance()
	 * @see #getTolerance()
	 * @see #setTolerance(double)
	 * @generated
	 */
	void unsetTolerance();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.DefaultExperimentType#getTolerance <em>Tolerance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tolerance</em>' attribute is set.
	 * @see #unsetTolerance()
	 * @see #getTolerance()
	 * @see #setTolerance(double)
	 * @generated
	 */
	boolean isSetTolerance();

} // DefaultExperimentType
