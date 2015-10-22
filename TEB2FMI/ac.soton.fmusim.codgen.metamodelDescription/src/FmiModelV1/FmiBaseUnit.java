/**
 */
package FmiModelV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Base Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Conversions between units
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.FmiBaseUnit#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModelV1.FmiBaseUnit#getDisplayUnitDefinition <em>Display Unit Definition</em>}</li>
 *   <li>{@link FmiModelV1.FmiBaseUnit#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getFmiBaseUnit()
 * @model extendedMetaData="name='fmiBaseUnit' kind='elementOnly'"
 * @generated
 */
public interface FmiBaseUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see FmiModelV1.FmiModelV1Package#getFmiBaseUnit_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Display Unit Definition</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModelV1.DisplayUnitDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unit = offset + gain*displayUnit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Unit Definition</em>' containment reference list.
	 * @see FmiModelV1.FmiModelV1Package#getFmiBaseUnit_DisplayUnitDefinition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DisplayUnitDefinition' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DisplayUnitDefinitionType> getDisplayUnitDefinition();

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
	 * @see FmiModelV1.FmiModelV1Package#getFmiBaseUnit_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiBaseUnit#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // FmiBaseUnit
