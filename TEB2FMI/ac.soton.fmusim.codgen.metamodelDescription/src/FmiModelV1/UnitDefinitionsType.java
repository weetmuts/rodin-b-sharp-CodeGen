/**
 */
package FmiModelV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.UnitDefinitionsType#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModelV1.UnitDefinitionsType#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getUnitDefinitionsType()
 * @model extendedMetaData="name='UnitDefinitions_._type' kind='elementOnly'"
 * @generated
 */
public interface UnitDefinitionsType extends EObject {
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
	 * @see FmiModelV1.FmiModelV1Package#getUnitDefinitionsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModelV1.FmiBaseUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Unit</em>' containment reference list.
	 * @see FmiModelV1.FmiModelV1Package#getUnitDefinitionsType_BaseUnit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BaseUnit' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<FmiBaseUnit> getBaseUnit();

} // UnitDefinitionsType
