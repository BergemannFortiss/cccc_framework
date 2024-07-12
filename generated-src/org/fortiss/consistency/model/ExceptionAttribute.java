/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing an exception attribute for clearance definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.ExceptionAttribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ExceptionAttribute#getAttributeValue <em>Attribute Value</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ExceptionAttribute#getMatchType <em>Match Type</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getExceptionAttribute()
 * @model
 * @generated
 */
public interface ExceptionAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getExceptionAttribute_AttributeName()
	 * @model
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ExceptionAttribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' attribute.
	 * @see #setAttributeValue(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getExceptionAttribute_AttributeValue()
	 * @model
	 * @generated
	 */
	String getAttributeValue();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ExceptionAttribute#getAttributeValue <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' attribute.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(String value);

	/**
	 * Returns the value of the '<em><b>Match Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.fortiss.consistency.model.MatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Type</em>' attribute.
	 * @see org.fortiss.consistency.model.MatchType
	 * @see #setMatchType(MatchType)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getExceptionAttribute_MatchType()
	 * @model
	 * @generated
	 */
	MatchType getMatchType();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ExceptionAttribute#getMatchType <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Type</em>' attribute.
	 * @see org.fortiss.consistency.model.MatchType
	 * @see #getMatchType()
	 * @generated
	 */
	void setMatchType(MatchType value);

} // ExceptionAttribute
