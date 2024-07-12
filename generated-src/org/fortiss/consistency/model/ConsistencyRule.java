/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a consistency rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyRule#getRuleScope <em>Rule Scope</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyRule#getRuleContext <em>Rule Context</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyRule#getRuleCondition <em>Rule Condition</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConsistencyRule#getConfidentialityStatus <em>Confidentiality Status</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyRule()
 * @model
 * @generated
 */
public interface ConsistencyRule extends IHasIdAndName, IHasComment {
	/**
	 * Returns the value of the '<em><b>Rule Scope</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Scope</em>' attribute list.
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyRule_RuleScope()
	 * @model
	 * @generated
	 */
	EList<String> getRuleScope();

	/**
	 * Returns the value of the '<em><b>Rule Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.model.AbstractElementRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Context</em>' containment reference list.
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyRule_RuleContext()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AbstractElementRelation> getRuleContext();

	/**
	 * Returns the value of the '<em><b>Rule Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Condition</em>' containment reference.
	 * @see #setRuleCondition(RuleCondition)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyRule_RuleCondition()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	RuleCondition getRuleCondition();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConsistencyRule#getRuleCondition <em>Rule Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Condition</em>' containment reference.
	 * @see #getRuleCondition()
	 * @generated
	 */
	void setRuleCondition(RuleCondition value);

	/**
	 * Returns the value of the '<em><b>Confidentiality Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality Status</em>' containment reference.
	 * @see #setConfidentialityStatus(ConfidentialityStatus)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConsistencyRule_ConfidentialityStatus()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ConfidentialityStatus getConfidentialityStatus();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConsistencyRule#getConfidentialityStatus <em>Confidentiality Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality Status</em>' containment reference.
	 * @see #getConfidentialityStatus()
	 * @generated
	 */
	void setConfidentialityStatus(ConfidentialityStatus value);

} // ConsistencyRule
