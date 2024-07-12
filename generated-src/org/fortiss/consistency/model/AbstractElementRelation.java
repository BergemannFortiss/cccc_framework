/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing an abstract relation between model elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.AbstractElementRelation#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.AbstractElementRelation#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getAbstractElementRelation()
 * @model
 * @generated
 */
public interface AbstractElementRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' containment reference.
	 * @see #setSourceElement(RuleElement)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getAbstractElementRelation_SourceElement()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	RuleElement getSourceElement();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.AbstractElementRelation#getSourceElement <em>Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' containment reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(RuleElement value);

	/**
	 * Returns the value of the '<em><b>Target Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.model.RuleElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elements</em>' containment reference list.
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getAbstractElementRelation_TargetElements()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<RuleElement> getTargetElements();

} // AbstractElementRelation
