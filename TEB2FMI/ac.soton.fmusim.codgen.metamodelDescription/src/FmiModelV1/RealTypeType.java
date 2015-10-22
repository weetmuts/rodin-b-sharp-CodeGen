/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.RealTypeType#getDisplayUnit <em>Display Unit</em>}</li>
 *   <li>{@link FmiModelV1.RealTypeType#getMax <em>Max</em>}</li>
 *   <li>{@link FmiModelV1.RealTypeType#getMin <em>Min</em>}</li>
 *   <li>{@link FmiModelV1.RealTypeType#getNominal <em>Nominal</em>}</li>
 *   <li>{@link FmiModelV1.RealTypeType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link FmiModelV1.RealTypeType#isRelativeQuantity <em>Relative Quantity</em>}</li>
 *   <li>{@link FmiModelV1.RealTypeType#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getRealTypeType()
 * @model extendedMetaData="name='RealType_._type' kind='empty'"
 * @generated
 */
public interface RealTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default display unit, provided the conversion of displayUnit to unit is defined in UnitDefinitions (fmiBaseUnit).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Unit</em>' attribute.
	 * @see #setDisplayUnit(String)
	 * @see FmiModelV1.FmiModelV1Package#getRealTypeType_DisplayUnit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='displayUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayUnit();

	/**
	 * Sets the value of the '{@link FmiModelV1.RealTypeType#getDisplayUnit <em>Display Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Unit</em>' attribute.
	 * @see #getDisplayUnit()
	 * @generated
	 */
	void setDisplayUnit(String value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(double)
	 * @see FmiModelV1.FmiModelV1Package#getRealTypeType_Max()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link FmiModelV1.RealTypeType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.RealTypeType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(double)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.RealTypeType#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(double)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(double)
	 * @see FmiModelV1.FmiModelV1Package#getRealTypeType_Min()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link FmiModelV1.RealTypeType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.RealTypeType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(double)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.RealTypeType#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(double)
	 * @generated
	 */
	boolean isSetMin();

	/**
	 * Returns the value of the '<em><b>Nominal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal</em>' attribute.
	 * @see #isSetNominal()
	 * @see #unsetNominal()
	 * @see #setNominal(double)
	 * @see FmiModelV1.FmiModelV1Package#getRealTypeType_Nominal()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='nominal' namespace='##targetNamespace'"
	 * @generated
	 */
	double getNominal();

	/**
	 * Sets the value of the '{@link FmiModelV1.RealTypeType#getNominal <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal</em>' attribute.
	 * @see #isSetNominal()
	 * @see #unsetNominal()
	 * @see #getNominal()
	 * @generated
	 */
	void setNominal(double value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.RealTypeType#getNominal <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominal()
	 * @see #getNominal()
	 * @see #setNominal(double)
	 * @generated
	 */
	void unsetNominal();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.RealTypeType#getNominal <em>Nominal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal</em>' attribute is set.
	 * @see #unsetNominal()
	 * @see #getNominal()
	 * @see #setNominal(double)
	 * @generated
	 */
	boolean isSetNominal();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(String)
	 * @see FmiModelV1.FmiModelV1Package#getRealTypeType_Quantity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuantity();

	/**
	 * Sets the value of the '{@link FmiModelV1.RealTypeType#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(String value);

	/**
	 * Returns the value of the '<em><b>Relative Quantity</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If relativeQuantity=true, offset for displayUnit must be ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Quantity</em>' attribute.
	 * @see #isSetRelativeQuantity()
	 * @see #unsetRelativeQuantity()
	 * @see #setRelativeQuantity(boolean)
	 * @see FmiModelV1.FmiModelV1Package#getRealTypeType_RelativeQuantity()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='relativeQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRelativeQuantity();

	/**
	 * Sets the value of the '{@link FmiModelV1.RealTypeType#isRelativeQuantity <em>Relative Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Quantity</em>' attribute.
	 * @see #isSetRelativeQuantity()
	 * @see #unsetRelativeQuantity()
	 * @see #isRelativeQuantity()
	 * @generated
	 */
	void setRelativeQuantity(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.RealTypeType#isRelativeQuantity <em>Relative Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeQuantity()
	 * @see #isRelativeQuantity()
	 * @see #setRelativeQuantity(boolean)
	 * @generated
	 */
	void unsetRelativeQuantity();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.RealTypeType#isRelativeQuantity <em>Relative Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Quantity</em>' attribute is set.
	 * @see #unsetRelativeQuantity()
	 * @see #isRelativeQuantity()
	 * @see #setRelativeQuantity(boolean)
	 * @generated
	 */
	boolean isSetRelativeQuantity();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see FmiModelV1.FmiModelV1Package#getRealTypeType_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link FmiModelV1.RealTypeType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // RealTypeType
