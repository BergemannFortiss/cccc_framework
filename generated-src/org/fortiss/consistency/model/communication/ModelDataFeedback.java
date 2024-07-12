/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.model.views.ConsistencyView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Data Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a container for a model data feedback (message).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.ModelDataFeedback#getRequestFulfillment <em>Request Fulfillment</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ModelDataFeedback#getProvidedData <em>Provided Data</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataFeedback()
 * @model
 * @generated
 */
public interface ModelDataFeedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Fulfillment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.fortiss.consistency.model.communication.RequestFulfillment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Fulfillment</em>' attribute.
	 * @see org.fortiss.consistency.model.communication.RequestFulfillment
	 * @see #setRequestFulfillment(RequestFulfillment)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataFeedback_RequestFulfillment()
	 * @model
	 * @generated
	 */
	RequestFulfillment getRequestFulfillment();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ModelDataFeedback#getRequestFulfillment <em>Request Fulfillment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Fulfillment</em>' attribute.
	 * @see org.fortiss.consistency.model.communication.RequestFulfillment
	 * @see #getRequestFulfillment()
	 * @generated
	 */
	void setRequestFulfillment(RequestFulfillment value);

	/**
	 * Returns the value of the '<em><b>Provided Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Data</em>' containment reference.
	 * @see #setProvidedData(ConsistencyView)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getModelDataFeedback_ProvidedData()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ConsistencyView getProvidedData();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ModelDataFeedback#getProvidedData <em>Provided Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Data</em>' containment reference.
	 * @see #getProvidedData()
	 * @generated
	 */
	void setProvidedData(ConsistencyView value);

} // ModelDataFeedback
