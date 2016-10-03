/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Literal Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.FilterPackage#getLiteralType()
 * @model
 * @generated
 */
public enum LiteralType implements Enumerator {
	/**
	 * The '<em><b>Unfolded Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNFOLDED_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	UNFOLDED_INPUT(0, "UnfoldedInput", "UnfoldedInput"),

	/**
	 * The '<em><b>Unfolded Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNFOLDED_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	UNFOLDED_OUTPUT(1, "UnfoldedOutput", "UnfoldedOutput"),

	/**
	 * The '<em><b>Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTION(2, "Description", "Description");

	/**
	 * The '<em><b>Unfolded Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unfolded Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNFOLDED_INPUT
	 * @model name="UnfoldedInput"
	 * @generated
	 * @ordered
	 */
	public static final int UNFOLDED_INPUT_VALUE = 0;

	/**
	 * The '<em><b>Unfolded Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unfolded Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNFOLDED_OUTPUT
	 * @model name="UnfoldedOutput"
	 * @generated
	 * @ordered
	 */
	public static final int UNFOLDED_OUTPUT_VALUE = 1;

	/**
	 * The '<em><b>Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Description</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION
	 * @model name="Description"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Literal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LiteralType[] VALUES_ARRAY =
		new LiteralType[] {
			UNFOLDED_INPUT,
			UNFOLDED_OUTPUT,
			DESCRIPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Literal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LiteralType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Literal Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiteralType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Literal Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiteralType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Literal Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralType get(int value) {
		switch (value) {
			case UNFOLDED_INPUT_VALUE: return UNFOLDED_INPUT;
			case UNFOLDED_OUTPUT_VALUE: return UNFOLDED_OUTPUT;
			case DESCRIPTION_VALUE: return DESCRIPTION;
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
	private LiteralType(int value, String name, String literal) {
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
	
} //LiteralType
