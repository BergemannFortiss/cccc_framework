/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a violation of a consistency rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyViolation#getViolationType <em>Violation Type</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyViolation#getViolationTypeExplanation <em>Violation Type Explanation</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyViolation#getViolatedRule <em>Violated Rule</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyViolation#getCause <em>Cause</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyViolation#getUsedContextData <em>Used Context Data</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyViolation()
 * @model
 * @generated
 */
public interface ConsistencyViolation extends IHasName {
	/**
	 * Returns the value of the '<em><b>Violation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.fortiss.consistency.model.ConsistencyViolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Type</em>' attribute.
	 * @see org.fortiss.consistency.model.ConsistencyViolationType
	 * @see #setViolationType(ConsistencyViolationType)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyViolation_ViolationType()
	 * @model
	 * @generated
	 */
	ConsistencyViolationType getViolationType();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConsistencyViolation#getViolationType <em>Violation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violation Type</em>' attribute.
	 * @see org.fortiss.consistency.model.ConsistencyViolationType
	 * @see #getViolationType()
	 * @generated
	 */
	void setViolationType(ConsistencyViolationType value);

	/**
	 * Returns the value of the '<em><b>Violation Type Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Type Explanation</em>' attribute.
	 * @see #setViolationTypeExplanation(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyViolation_ViolationTypeExplanation()
	 * @model
	 * @generated
	 */
	String getViolationTypeExplanation();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConsistencyViolation#getViolationTypeExplanation <em>Violation Type Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violation Type Explanation</em>' attribute.
	 * @see #getViolationTypeExplanation()
	 * @generated
	 */
	void setViolationTypeExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Violated Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violated Rule</em>' containment reference.
	 * @see #setViolatedRule(ConsistencyRule)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyViolation_ViolatedRule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ConsistencyRule getViolatedRule();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConsistencyViolation#getViolatedRule <em>Violated Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violated Rule</em>' containment reference.
	 * @see #getViolatedRule()
	 * @generated
	 */
	void setViolatedRule(ConsistencyRule value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' attribute.
	 * @see #setCause(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyViolation_Cause()
	 * @model
	 * @generated
	 */
	String getCause();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConsistencyViolation#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(String value);

	/**
	 * Returns the value of the '<em><b>Used Context Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Context Data</em>' containment reference.
	 * @see #setUsedContextData(ContextWrapper)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyViolation_UsedContextData()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ContextWrapper getUsedContextData();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConsistencyViolation#getUsedContextData <em>Used Context Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Context Data</em>' containment reference.
	 * @see #getUsedContextData()
	 * @generated
	 */
	void setUsedContextData(ContextWrapper value);

} // ConsistencyViolation
