/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a rule element of a consistency rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.RuleElement#getNameInRule <em>Name In Rule</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.RuleElement#getElementClassString <em>Element Class String</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getRuleElement()
 * @model
 * @generated
 */
public interface RuleElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name In Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name In Rule</em>' attribute.
	 * @see #setNameInRule(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getRuleElement_NameInRule()
	 * @model
	 * @generated
	 */
	String getNameInRule();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.RuleElement#getNameInRule <em>Name In Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name In Rule</em>' attribute.
	 * @see #getNameInRule()
	 * @generated
	 */
	void setNameInRule(String value);

	/**
	 * Returns the value of the '<em><b>Element Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Class String</em>' attribute.
	 * @see #setElementClassString(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getRuleElement_ElementClassString()
	 * @model
	 * @generated
	 */
	String getElementClassString();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.RuleElement#getElementClassString <em>Element Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Class String</em>' attribute.
	 * @see #getElementClassString()
	 * @generated
	 */
	void setElementClassString(String value);

} // RuleElement
