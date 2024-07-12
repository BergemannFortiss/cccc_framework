/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Violation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of consistency violations types.
 * <!-- end-model-doc -->
 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyViolationType()
 * @model
 * @generated
 */
public enum ConsistencyViolationType implements Enumerator {
	/**
	 * The '<em><b>FOUND INCONSISTENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUND_INCONSISTENCY_VALUE
	 * @generated
	 * @ordered
	 */
	FOUND_INCONSISTENCY(0, "FOUND_INCONSISTENCY", "FOUND_INCONSISTENCY"),

	/**
	 * The '<em><b>EXPERIENCED EXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERIENCED_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPERIENCED_EXCEPTION(1, "EXPERIENCED_EXCEPTION", "EXPERIENCED_EXCEPTION"),

	/**
	 * The '<em><b>BLOCKED ACCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKED_ACCESS(2, "BLOCKED_ACCESS", "BLOCKED_ACCESS");

	/**
	 * The '<em><b>FOUND INCONSISTENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUND_INCONSISTENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOUND_INCONSISTENCY_VALUE = 0;

	/**
	 * The '<em><b>EXPERIENCED EXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERIENCED_EXCEPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPERIENCED_EXCEPTION_VALUE = 1;

	/**
	 * The '<em><b>BLOCKED ACCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_ACCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED_ACCESS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Violation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsistencyViolationType[] VALUES_ARRAY =
		new ConsistencyViolationType[] {
			FOUND_INCONSISTENCY,
			EXPERIENCED_EXCEPTION,
			BLOCKED_ACCESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Violation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsistencyViolationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Violation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsistencyViolationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsistencyViolationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Violation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsistencyViolationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsistencyViolationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Violation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsistencyViolationType get(int value) {
		switch (value) {
			case FOUND_INCONSISTENCY_VALUE: return FOUND_INCONSISTENCY;
			case EXPERIENCED_EXCEPTION_VALUE: return EXPERIENCED_EXCEPTION;
			case BLOCKED_ACCESS_VALUE: return BLOCKED_ACCESS;
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
	private ConsistencyViolationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ConsistencyViolationType
