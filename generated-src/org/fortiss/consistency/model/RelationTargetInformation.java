/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Target Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element containing information about the target of a relation between model elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.RelationTargetInformation#getBasicInformation <em>Basic Information</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.RelationTargetInformation#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.RelationTargetInformation#getRelationComment <em>Relation Comment</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getRelationTargetInformation()
 * @model
 * @generated
 */
public interface RelationTargetInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Information</em>' containment reference.
	 * @see #setBasicInformation(BasicElementInformation)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getRelationTargetInformation_BasicInformation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	BasicElementInformation getBasicInformation();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.RelationTargetInformation#getBasicInformation <em>Basic Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Information</em>' containment reference.
	 * @see #getBasicInformation()
	 * @generated
	 */
	void setBasicInformation(BasicElementInformation value);

	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see #setRelationType(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getRelationTargetInformation_RelationType()
	 * @model
	 * @generated
	 */
	String getRelationType();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.RelationTargetInformation#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(String value);

	/**
	 * Returns the value of the '<em><b>Relation Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Comment</em>' attribute.
	 * @see #setRelationComment(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getRelationTargetInformation_RelationComment()
	 * @model
	 * @generated
	 */
	String getRelationComment();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.RelationTargetInformation#getRelationComment <em>Relation Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Comment</em>' attribute.
	 * @see #getRelationComment()
	 * @generated
	 */
	void setRelationComment(String value);

} // RelationTargetInformation
