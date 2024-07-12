/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing an entry for an exception (in a clearance definition).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.ExceptionEntry#getExceptionAttributes <em>Exception Attributes</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getExceptionEntry()
 * @model
 * @generated
 */
public interface ExceptionEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.model.ExceptionAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Attributes</em>' containment reference list.
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getExceptionEntry_ExceptionAttributes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ExceptionAttribute> getExceptionAttributes();

} // ExceptionEntry
