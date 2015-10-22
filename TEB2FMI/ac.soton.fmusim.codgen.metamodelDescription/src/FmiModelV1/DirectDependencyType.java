/**
 */
package FmiModelV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.DirectDependencyType#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModelV1.DirectDependencyType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getDirectDependencyType()
 * @model extendedMetaData="name='DirectDependency_._type' kind='elementOnly'"
 * @generated
 */
public interface DirectDependencyType extends EObject {
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
	 * @see FmiModelV1.FmiModelV1Package#getDirectDependencyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The names of the input variables that are needed to compute this output
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see FmiModelV1.FmiModelV1Package#getDirectDependencyType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getName();

} // DirectDependencyType
