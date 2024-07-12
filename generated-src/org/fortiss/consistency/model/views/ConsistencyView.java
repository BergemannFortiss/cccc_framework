/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.model.IHasIdAndName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consistency View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a consistency view containing all the data needed for a consistency rule evaluation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.views.ConsistencyView#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.views.ViewsPackage#getConsistencyView()
 * @model
 * @generated
 */
public interface ConsistencyView extends IHasIdAndName {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.fortiss.consistency.model.views.ViewsPackage#getConsistencyView_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EObject> getContent();

} // ConsistencyView
