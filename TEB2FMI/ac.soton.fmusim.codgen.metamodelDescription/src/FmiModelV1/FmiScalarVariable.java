/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Scalar Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties of a scalar variable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getReal <em>Real</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getInteger <em>Integer</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getString <em>String</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getDirectDependency <em>Direct Dependency</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getAlias <em>Alias</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getCausality <em>Causality</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getName <em>Name</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link FmiModelV1.FmiScalarVariable#getVariability <em>Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable()
 * @model extendedMetaData="name='fmiScalarVariable' kind='elementOnly'"
 * @generated
 */
public interface FmiScalarVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' containment reference.
	 * @see #setReal(RealType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Real()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getReal();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getReal <em>Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' containment reference.
	 * @see #getReal()
	 * @generated
	 */
	void setReal(RealType value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' containment reference.
	 * @see #setInteger(IntegerType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Integer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Integer' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerType getInteger();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(IntegerType value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' containment reference.
	 * @see #setBoolean(BooleanType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Boolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanType getBoolean();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getBoolean <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' containment reference.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(BooleanType value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(StringType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getString();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(StringType value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference.
	 * @see #setEnumeration(EnumerationType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Enumeration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Enumeration' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationType getEnumeration();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getEnumeration <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' containment reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(EnumerationType value);

	/**
	 * Returns the value of the '<em><b>Direct Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only allowed, if causality = output. If not present, the output depends on all inputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Dependency</em>' containment reference.
	 * @see #setDirectDependency(DirectDependencyType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_DirectDependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectDependency' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectDependencyType getDirectDependency();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getDirectDependency <em>Direct Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Dependency</em>' containment reference.
	 * @see #getDirectDependency()
	 * @generated
	 */
	void setDirectDependency(DirectDependencyType value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * The default value is <code>"noAlias"</code>.
	 * The literals are from the enumeration {@link FmiModelV1.AliasType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If negatedAlias, the value referenced by valueReference must be negated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see FmiModelV1.AliasType
	 * @see #isSetAlias()
	 * @see #unsetAlias()
	 * @see #setAlias(AliasType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Alias()
	 * @model default="noAlias" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasType getAlias();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see FmiModelV1.AliasType
	 * @see #isSetAlias()
	 * @see #unsetAlias()
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(AliasType value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiScalarVariable#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlias()
	 * @see #getAlias()
	 * @see #setAlias(AliasType)
	 * @generated
	 */
	void unsetAlias();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiScalarVariable#getAlias <em>Alias</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alias</em>' attribute is set.
	 * @see #unsetAlias()
	 * @see #getAlias()
	 * @see #setAlias(AliasType)
	 * @generated
	 */
	boolean isSetAlias();

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' attribute.
	 * The default value is <code>"internal"</code>.
	 * The literals are from the enumeration {@link FmiModelV1.CausalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * internal: After initialization only allowed to get value, e.g., for result storage; none: tool specific variable that does not influence simulation (e.g. switch logging on)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality</em>' attribute.
	 * @see FmiModelV1.CausalityType
	 * @see #isSetCausality()
	 * @see #unsetCausality()
	 * @see #setCausality(CausalityType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Causality()
	 * @model default="internal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='causality' namespace='##targetNamespace'"
	 * @generated
	 */
	CausalityType getCausality();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' attribute.
	 * @see FmiModelV1.CausalityType
	 * @see #isSetCausality()
	 * @see #unsetCausality()
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(CausalityType value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiScalarVariable#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCausality()
	 * @see #getCausality()
	 * @see #setCausality(CausalityType)
	 * @generated
	 */
	void unsetCausality();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiScalarVariable#getCausality <em>Causality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Causality</em>' attribute is set.
	 * @see #unsetCausality()
	 * @see #getCausality()
	 * @see #setCausality(CausalityType)
	 * @generated
	 */
	boolean isSetCausality();

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
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getDescription <em>Description</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier of variable, e.g. "a.b.mod[3,4].'#123'.c"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for variable value in function calls (not necessarily unique with respect to all variables)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Reference</em>' attribute.
	 * @see #isSetValueReference()
	 * @see #unsetValueReference()
	 * @see #setValueReference(long)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_ValueReference()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	long getValueReference();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getValueReference <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' attribute.
	 * @see #isSetValueReference()
	 * @see #unsetValueReference()
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(long value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiScalarVariable#getValueReference <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueReference()
	 * @see #getValueReference()
	 * @see #setValueReference(long)
	 * @generated
	 */
	void unsetValueReference();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiScalarVariable#getValueReference <em>Value Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Reference</em>' attribute is set.
	 * @see #unsetValueReference()
	 * @see #getValueReference()
	 * @see #setValueReference(long)
	 * @generated
	 */
	boolean isSetValueReference();

	/**
	 * Returns the value of the '<em><b>Variability</b></em>' attribute.
	 * The default value is <code>"continuous"</code>.
	 * The literals are from the enumeration {@link FmiModelV1.VariabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability</em>' attribute.
	 * @see FmiModelV1.VariabilityType
	 * @see #isSetVariability()
	 * @see #unsetVariability()
	 * @see #setVariability(VariabilityType)
	 * @see FmiModelV1.FmiModelV1Package#getFmiScalarVariable_Variability()
	 * @model default="continuous" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='variability' namespace='##targetNamespace'"
	 * @generated
	 */
	VariabilityType getVariability();

	/**
	 * Sets the value of the '{@link FmiModelV1.FmiScalarVariable#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability</em>' attribute.
	 * @see FmiModelV1.VariabilityType
	 * @see #isSetVariability()
	 * @see #unsetVariability()
	 * @see #getVariability()
	 * @generated
	 */
	void setVariability(VariabilityType value);

	/**
	 * Unsets the value of the '{@link FmiModelV1.FmiScalarVariable#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariability()
	 * @see #getVariability()
	 * @see #setVariability(VariabilityType)
	 * @generated
	 */
	void unsetVariability();

	/**
	 * Returns whether the value of the '{@link FmiModelV1.FmiScalarVariable#getVariability <em>Variability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variability</em>' attribute is set.
	 * @see #unsetVariability()
	 * @see #getVariability()
	 * @see #setVariability(VariabilityType)
	 * @generated
	 */
	boolean isSetVariability();

} // FmiScalarVariable
