/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing the condition of a consistency rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.RuleCondition#getOriginalExpression <em>Original Expression</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.RuleCondition#getModifiedExpression <em>Modified Expression</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getRuleCondition()
 * @model
 * @generated
 */
public interface RuleCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Expression</em>' attribute.
	 * @see #setOriginalExpression(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getRuleCondition_OriginalExpression()
	 * @model
	 * @generated
	 */
	String getOriginalExpression();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.RuleCondition#getOriginalExpression <em>Original Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Expression</em>' attribute.
	 * @see #getOriginalExpression()
	 * @generated
	 */
	void setOriginalExpression(String value);

	/**
	 * Returns the value of the '<em><b>Modified Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Expression</em>' attribute.
	 * @see #setModifiedExpression(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getRuleCondition_ModifiedExpression()
	 * @model
	 * @generated
	 */
	String getModifiedExpression();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.RuleCondition#getModifiedExpression <em>Modified Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Expression</em>' attribute.
	 * @see #getModifiedExpression()
	 * @generated
	 */
	void setModifiedExpression(String value);

} // RuleCondition
