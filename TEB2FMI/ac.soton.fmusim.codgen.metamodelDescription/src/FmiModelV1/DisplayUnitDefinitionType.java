/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Unit Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.DisplayUnitDefinitionType#getDisplayUnit <em>Display Unit</em>}</li>
 *   <li>{@link FmiModelV1.DisplayUnitDefinitionType#getGain <em>Gain</em>}</li>
 *   <li>{@link FmiModelV1.DisplayUnitDefinitionType#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getDisplayUnitDefinitionType()
 * @model extendedMetaData="name='DisplayUnitDefinition_._type' kind='empty'"
 * @generated
 */
public interface DisplayUnitDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Unit</em>' attribute.
	 * @see #setDisplayUnit(String)
	 * @see FmiModelV1.FmiModelV1Package#getDisplayUnitDefinitionType_DisplayUnit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='displayUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayUnit();

	/**
	 * Sets the value of the '{@link FmiModelV1.DisplayUnitDefinitionType#getDisplayUnit <em>Display Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Unit</em>' attribute.
	 * @see #getDisplayUnit()
	 * @generated
	 */
	void setDisplayUnit(String value);

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see #isSetGain()
	 * @see #unsetGain()
	 * @see #setGain(double)
	 * @see FmiModelV1.FmiModelV1Package#getDisplayUnitDefinitionType_Gain()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='gain' namespace='##targetNamespace'"
	 * @generated
	 */
	double getGain();

	/**
	 * Sets the value of the '{@link FmiModelV1.DisplayUnitDefinitionType#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #isSetGain()
	 * @see #unsetGain()
	 * @see #getGain()
	 * @generated
	 */
	void setGain(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.DisplayUnitDefinitionType#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGain()
	 * @see #getGain()
	 * @see #setGain(double)
	 * @generated
	 */
	void unsetGain();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.DisplayUnitDefinitionType#getGain <em>Gain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gain</em>' attribute is set.
	 * @see #unsetGain()
	 * @see #getGain()
	 * @see #setGain(double)
	 * @generated
	 */
	boolean isSetGain();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(double)
	 * @see FmiModelV1.FmiModelV1Package#getDisplayUnitDefinitionType_Offset()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link FmiModelV1.DisplayUnitDefinitionType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.DisplayUnitDefinitionType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.DisplayUnitDefinitionType#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	boolean isSetOffset();

} // DisplayUnitDefinitionType
