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
 * A representation of the literals of the enumeration '<em><b>Feedback Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of feedback levels for consistency rules.
 * <!-- end-model-doc -->
 * @see org.fortiss.consistency.model.ConsistencyPackage#getFeedbackLevel()
 * @model
 * @generated
 */
public enum FeedbackLevel implements Enumerator {
	/**
	 * The '<em><b>INCONSISTENCY WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENCY_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	INCONSISTENCY_WARNING(0, "INCONSISTENCY_WARNING", "INCONSISTENCY_WARNING"),

	/**
	 * The '<em><b>RULE WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	RULE_WARNING(1, "RULE_WARNING", "RULE_WARNING"),

	/**
	 * The '<em><b>CAUSE WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUSE_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	CAUSE_WARNING(2, "CAUSE_WARNING", "CAUSE_WARNING"),

	/**
	 * The '<em><b>FULL WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_WARNING(3, "FULL_WARNING", "FULL_WARNING");

	/**
	 * The '<em><b>INCONSISTENCY WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENCY_WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCONSISTENCY_WARNING_VALUE = 0;

	/**
	 * The '<em><b>RULE WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RULE_WARNING_VALUE = 1;

	/**
	 * The '<em><b>CAUSE WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUSE_WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAUSE_WARNING_VALUE = 2;

	/**
	 * The '<em><b>FULL WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULL_WARNING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Feedback Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeedbackLevel[] VALUES_ARRAY =
		new FeedbackLevel[] {
			INCONSISTENCY_WARNING,
			RULE_WARNING,
			CAUSE_WARNING,
			FULL_WARNING,
		};

	/**
	 * A public read-only list of all the '<em><b>Feedback Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeedbackLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feedback Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackLevel get(int value) {
		switch (value) {
			case INCONSISTENCY_WARNING_VALUE: return INCONSISTENCY_WARNING;
			case RULE_WARNING_VALUE: return RULE_WARNING;
			case CAUSE_WARNING_VALUE: return CAUSE_WARNING;
			case FULL_WARNING_VALUE: return FULL_WARNING;
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
	private FeedbackLevel(int value, String name, String literal) {
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
	
} //FeedbackLevel
