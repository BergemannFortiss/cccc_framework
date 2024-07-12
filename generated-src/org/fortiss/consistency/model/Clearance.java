/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a clearance definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.Clearance#getBasisForClearance <em>Basis For Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.Clearance#getExceptionEntries <em>Exception Entries</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getClearance()
 * @model
 * @generated
 */
public interface Clearance extends EObject {
	/**
	 * Returns the value of the '<em><b>Basis For Clearance</b></em>' attribute.
	 * The literals are from the enumeration {@link org.fortiss.consistency.model.ClearanceBasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis For Clearance</em>' attribute.
	 * @see org.fortiss.consistency.model.ClearanceBasis
	 * @see #setBasisForClearance(ClearanceBasis)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getClearance_BasisForClearance()
	 * @model
	 * @generated
	 */
	ClearanceBasis getBasisForClearance();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.Clearance#getBasisForClearance <em>Basis For Clearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis For Clearance</em>' attribute.
	 * @see org.fortiss.consistency.model.ClearanceBasis
	 * @see #getBasisForClearance()
	 * @generated
	 */
	void setBasisForClearance(ClearanceBasis value);

	/**
	 * Returns the value of the '<em><b>Exception Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.model.ExceptionEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Entries</em>' containment reference list.
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getClearance_ExceptionEntries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ExceptionEntry> getExceptionEntries();

} // Clearance
