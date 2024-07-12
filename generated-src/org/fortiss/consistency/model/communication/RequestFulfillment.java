/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Request Fulfillment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of the levels of request fulfillment.
 * <!-- end-model-doc -->
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getRequestFulfillment()
 * @model
 * @generated
 */
public enum RequestFulfillment implements Enumerator {
	/**
	 * The '<em><b>FULLY PROVIDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_PROVIDED_VALUE
	 * @generated
	 * @ordered
	 */
	FULLY_PROVIDED(2, "FULLY_PROVIDED", "FULLY_PROVIDED"),

	/**
	 * The '<em><b>PARTIALLY PROVIDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_PROVIDED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_PROVIDED(1, "PARTIALLY_PROVIDED", "PARTIALLY_PROVIDED"),

	/**
	 * The '<em><b>REJECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(0, "REJECTED", "REJECTED");

	/**
	 * The '<em><b>FULLY PROVIDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_PROVIDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULLY_PROVIDED_VALUE = 2;

	/**
	 * The '<em><b>PARTIALLY PROVIDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_PROVIDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_PROVIDED_VALUE = 1;

	/**
	 * The '<em><b>REJECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Request Fulfillment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequestFulfillment[] VALUES_ARRAY =
		new RequestFulfillment[] {
			FULLY_PROVIDED,
			PARTIALLY_PROVIDED,
			REJECTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Request Fulfillment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequestFulfillment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Request Fulfillment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestFulfillment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestFulfillment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Fulfillment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestFulfillment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestFulfillment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Fulfillment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestFulfillment get(int value) {
		switch (value) {
			case FULLY_PROVIDED_VALUE: return FULLY_PROVIDED;
			case PARTIALLY_PROVIDED_VALUE: return PARTIALLY_PROVIDED;
			case REJECTED_VALUE: return REJECTED;
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
	private RequestFulfillment(int value, String name, String literal) {
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
	
} //RequestFulfillment
