/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type attributes of a scalar variable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.FmiType#getRealType <em>Real Type</em>}</li>
 *   <li>{@link FmiModelV1.FmiType#getIntegerType <em>Integer Type</em>}</li>
 *   <li>{@link FmiModelV1.FmiType#getBooleanType <em>Boolean Type</em>}</li>
 *   <li>{@link FmiModelV1.FmiType#getStringType <em>String Type</em>}</li>
 *   <li>{@link FmiModelV1.FmiType#getEnumerationType <em>Enumeration Type</em>}</li>
 *   <li>{@link FmiModelV1.FmiType#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModelV1.FmiType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getFmiType()
 * @model extendedMetaData="name='fmiType' kind='elementOnly'"
 * @generated
 */
public interface FmiType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Type</em>' containment reference.
	 * @see #setRealType(RealTypeType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiType_RealType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealType' namespace='##targetNamespace'"
	 * @generated
	 */
	RealTypeType getRealType();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiType#getRealType <em>Real Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Type</em>' containment reference.
	 * @see #getRealType()
	 * @generated
	 */
	void setRealType(RealTypeType value);

	/**
	 * Returns the value of the '<em><b>Integer Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Type</em>' containment reference.
	 * @see #setIntegerType(IntegerTypeType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiType_IntegerType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntegerType' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerTypeType getIntegerType();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiType#getIntegerType <em>Integer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Type</em>' containment reference.
	 * @see #getIntegerType()
	 * @generated
	 */
	void setIntegerType(IntegerTypeType value);

	/**
	 * Returns the value of the '<em><b>Boolean Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Type</em>' containment reference.
	 * @see #setBooleanType(EObject)
	 * @see FmiModelV1.FmiModelV1Package#getFmiType_BooleanType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BooleanType' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getBooleanType();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiType#getBooleanType <em>Boolean Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Type</em>' containment reference.
	 * @see #getBooleanType()
	 * @generated
	 */
	void setBooleanType(EObject value);

	/**
	 * Returns the value of the '<em><b>String Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Type</em>' containment reference.
	 * @see #setStringType(EObject)
	 * @see FmiModelV1.FmiModelV1Package#getFmiType_StringType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StringType' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStringType();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiType#getStringType <em>String Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Type</em>' containment reference.
	 * @see #getStringType()
	 * @generated
	 */
	void setStringType(EObject value);

	/**
	 * Returns the value of the '<em><b>Enumeration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Type</em>' containment reference.
	 * @see #setEnumerationType(EnumerationTypeType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiType_EnumerationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumerationType' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationTypeType getEnumerationType();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiType#getEnumerationType <em>Enumeration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Type</em>' containment reference.
	 * @see #getEnumerationType()
	 * @generated
	 */
	void setEnumerationType(EnumerationTypeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FmiType
