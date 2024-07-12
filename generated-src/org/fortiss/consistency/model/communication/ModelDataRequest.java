/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.model.BasicElementInformation;

import org.fortiss.consistency.model.views.ConsistencyViewtype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Data Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a container for a model data request (message).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.ModelDataRequest#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ModelDataRequest#getTargetedAdapter <em>Targeted Adapter</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ModelDataRequest#getViewtype <em>Viewtype</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ModelDataRequest#getNeededElementsInfo <em>Needed Elements Info</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ModelDataRequest#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataRequest()
 * @model
 * @generated
 */
public interface ModelDataRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Identifier</em>' attribute.
	 * @see #setRequestIdentifier(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataRequest_RequestIdentifier()
	 * @model
	 * @generated
	 */
	String getRequestIdentifier();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getRequestIdentifier <em>Request Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Identifier</em>' attribute.
	 * @see #getRequestIdentifier()
	 * @generated
	 */
	void setRequestIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Targeted Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeted Adapter</em>' attribute.
	 * @see #setTargetedAdapter(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataRequest_TargetedAdapter()
	 * @model
	 * @generated
	 */
	String getTargetedAdapter();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getTargetedAdapter <em>Targeted Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targeted Adapter</em>' attribute.
	 * @see #getTargetedAdapter()
	 * @generated
	 */
	void setTargetedAdapter(String value);

	/**
	 * Returns the value of the '<em><b>Viewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewtype</em>' containment reference.
	 * @see #setViewtype(ConsistencyViewtype)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataRequest_Viewtype()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ConsistencyViewtype getViewtype();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getViewtype <em>Viewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewtype</em>' containment reference.
	 * @see #getViewtype()
	 * @generated
	 */
	void setViewtype(ConsistencyViewtype value);

	/**
	 * Returns the value of the '<em><b>Needed Elements Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.model.BasicElementInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed Elements Info</em>' containment reference list.
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataRequest_NeededElementsInfo()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<BasicElementInformation> getNeededElementsInfo();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(UserDetailedInformation)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataRequest_User()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UserDetailedInformation getUser();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(UserDetailedInformation value);

} // ModelDataRequest
