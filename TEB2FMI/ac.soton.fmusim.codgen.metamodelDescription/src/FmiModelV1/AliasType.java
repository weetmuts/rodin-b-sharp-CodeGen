/**
 */
package FmiModelV1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Alias Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FmiModelV1.FmiModelV1Package#getAliasType()
 * @model extendedMetaData="name='alias_._type'"
 * @generated
 */
public enum AliasType implements Enumerator {
	/**
	 * The '<em><b>No Alias</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ALIAS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ALIAS(0, "noAlias", "noAlias"),

	/**
	 * The '<em><b>Alias</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIAS_VALUE
	 * @generated
	 * @ordered
	 */
	ALIAS(1, "alias", "alias"),

	/**
	 * The '<em><b>Negated Alias</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATED_ALIAS_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATED_ALIAS(2, "negatedAlias", "negatedAlias");

	/**
	 * The '<em><b>No Alias</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Alias</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ALIAS
	 * @model name="noAlias"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ALIAS_VALUE = 0;

	/**
	 * The '<em><b>Alias</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alias</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALIAS
	 * @model name="alias"
	 * @generated
	 * @ordered
	 */
	public static final int ALIAS_VALUE = 1;

	/**
	 * The '<em><b>Negated Alias</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negated Alias</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATED_ALIAS
	 * @model name="negatedAlias"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATED_ALIAS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Alias Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AliasType[] VALUES_ARRAY =
		new AliasType[] {
			NO_ALIAS,
			ALIAS,
			NEGATED_ALIAS,
		};

	/**
	 * A public read-only list of all the '<em><b>Alias Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AliasType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Alias Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AliasType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AliasType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alias Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AliasType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AliasType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alias Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AliasType get(int value) {
		switch (value) {
			case NO_ALIAS_VALUE: return NO_ALIAS;
			case ALIAS_VALUE: return ALIAS;
			case NEGATED_ALIAS_VALUE: return NEGATED_ALIAS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AliasType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AliasType
