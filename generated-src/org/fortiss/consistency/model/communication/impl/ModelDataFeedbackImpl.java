/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.communication.CommunicationPackage;
import org.fortiss.consistency.model.communication.ModelDataFeedback;
import org.fortiss.consistency.model.communication.RequestFulfillment;

import org.fortiss.consistency.model.views.ConsistencyView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Data Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ModelDataFeedbackImpl#getRequestFulfillment <em>Request Fulfillment</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ModelDataFeedbackImpl#getProvidedData <em>Provided Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelDataFeedbackImpl extends EObjectImpl implements ModelDataFeedback {
	/**
	 * The default value of the '{@link #getRequestFulfillment() <em>Request Fulfillment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestFulfillment()
	 * @generated
	 * @ordered
	 */
	protected static final RequestFulfillment REQUEST_FULFILLMENT_EDEFAULT = RequestFulfillment.FULLY_PROVIDED;

	/**
	 * The cached value of the '{@link #getRequestFulfillment() <em>Request Fulfillment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestFulfillment()
	 * @generated
	 * @ordered
	 */
	protected RequestFulfillment requestFulfillment = REQUEST_FULFILLMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProvidedData() <em>Provided Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedData()
	 * @generated
	 * @ordered
	 */
	protected ConsistencyView providedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelDataFeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.MODEL_DATA_FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestFulfillment getRequestFulfillment() {
		return requestFulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestFulfillment(RequestFulfillment newRequestFulfillment) {
		RequestFulfillment oldRequestFulfillment = requestFulfillment;
		requestFulfillment = newRequestFulfillment == null ? REQUEST_FULFILLMENT_EDEFAULT : newRequestFulfillment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT, oldRequestFulfillment, requestFulfillment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyView getProvidedData() {
		if (providedData != null && providedData.eIsProxy()) {
			InternalEObject oldProvidedData = (InternalEObject)providedData;
			providedData = (ConsistencyView)eResolveProxy(oldProvidedData);
			if (providedData != oldProvidedData) {
				InternalEObject newProvidedData = (InternalEObject)providedData;
				NotificationChain msgs = oldProvidedData.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA, null, null);
				if (newProvidedData.eInternalContainer() == null) {
					msgs = newProvidedData.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA, oldProvidedData, providedData));
			}
		}
		return providedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyView basicGetProvidedData() {
		return providedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedData(ConsistencyView newProvidedData, NotificationChain msgs) {
		ConsistencyView oldProvidedData = providedData;
		providedData = newProvidedData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA, oldProvidedData, newProvidedData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedData(ConsistencyView newProvidedData) {
		if (newProvidedData != providedData) {
			NotificationChain msgs = null;
			if (providedData != null)
				msgs = ((InternalEObject)providedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA, null, msgs);
			if (newProvidedData != null)
				msgs = ((InternalEObject)newProvidedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA, null, msgs);
			msgs = basicSetProvidedData(newProvidedData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA, newProvidedData, newProvidedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA:
				return basicSetProvidedData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT:
				return getRequestFulfillment();
			case CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA:
				if (resolve) return getProvidedData();
				return basicGetProvidedData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommunicationPackage.MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT:
				setRequestFulfillment((RequestFulfillment)newValue);
				return;
			case CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA:
				setProvidedData((ConsistencyView)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommunicationPackage.MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT:
				setRequestFulfillment(REQUEST_FULFILLMENT_EDEFAULT);
				return;
			case CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA:
				setProvidedData((ConsistencyView)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommunicationPackage.MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT:
				return requestFulfillment != REQUEST_FULFILLMENT_EDEFAULT;
			case CommunicationPackage.MODEL_DATA_FEEDBACK__PROVIDED_DATA:
				return providedData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (requestFulfillment: ");
		result.append(requestFulfillment);
		result.append(')');
		return result.toString();
	}

} //ModelDataFeedbackImpl
