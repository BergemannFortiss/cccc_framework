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
import org.fortiss.consistency.model.communication.UserInitialInformation;
import org.fortiss.consistency.model.communication.UserToken;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Initial Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserInitialInformationImpl#getUserToken <em>User Token</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserInitialInformationImpl#getCurrentLocation <em>Current Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInitialInformationImpl extends EObjectImpl implements UserInitialInformation {
	/**
	 * The cached value of the '{@link #getUserToken() <em>User Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserToken()
	 * @generated
	 * @ordered
	 */
	protected UserToken userToken;

	/**
	 * The default value of the '{@link #getCurrentLocation() <em>Current Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentLocation() <em>Current Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLocation()
	 * @generated
	 * @ordered
	 */
	protected String currentLocation = CURRENT_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInitialInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.USER_INITIAL_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserToken getUserToken() {
		if (userToken != null && userToken.eIsProxy()) {
			InternalEObject oldUserToken = (InternalEObject)userToken;
			userToken = (UserToken)eResolveProxy(oldUserToken);
			if (userToken != oldUserToken) {
				InternalEObject newUserToken = (InternalEObject)userToken;
				NotificationChain msgs = oldUserToken.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN, null, null);
				if (newUserToken.eInternalContainer() == null) {
					msgs = newUserToken.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN, oldUserToken, userToken));
			}
		}
		return userToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserToken basicGetUserToken() {
		return userToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserToken(UserToken newUserToken, NotificationChain msgs) {
		UserToken oldUserToken = userToken;
		userToken = newUserToken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN, oldUserToken, newUserToken);
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
	public void setUserToken(UserToken newUserToken) {
		if (newUserToken != userToken) {
			NotificationChain msgs = null;
			if (userToken != null)
				msgs = ((InternalEObject)userToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN, null, msgs);
			if (newUserToken != null)
				msgs = ((InternalEObject)newUserToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN, null, msgs);
			msgs = basicSetUserToken(newUserToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN, newUserToken, newUserToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLocation(String newCurrentLocation) {
		String oldCurrentLocation = currentLocation;
		currentLocation = newCurrentLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_INITIAL_INFORMATION__CURRENT_LOCATION, oldCurrentLocation, currentLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN:
				return basicSetUserToken(null, msgs);
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
			case CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN:
				if (resolve) return getUserToken();
				return basicGetUserToken();
			case CommunicationPackage.USER_INITIAL_INFORMATION__CURRENT_LOCATION:
				return getCurrentLocation();
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
			case CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN:
				setUserToken((UserToken)newValue);
				return;
			case CommunicationPackage.USER_INITIAL_INFORMATION__CURRENT_LOCATION:
				setCurrentLocation((String)newValue);
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
			case CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN:
				setUserToken((UserToken)null);
				return;
			case CommunicationPackage.USER_INITIAL_INFORMATION__CURRENT_LOCATION:
				setCurrentLocation(CURRENT_LOCATION_EDEFAULT);
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
			case CommunicationPackage.USER_INITIAL_INFORMATION__USER_TOKEN:
				return userToken != null;
			case CommunicationPackage.USER_INITIAL_INFORMATION__CURRENT_LOCATION:
				return CURRENT_LOCATION_EDEFAULT == null ? currentLocation != null : !CURRENT_LOCATION_EDEFAULT.equals(currentLocation);
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
		result.append(" (currentLocation: ");
		result.append(currentLocation);
		result.append(')');
		return result.toString();
	}

} //UserInitialInformationImpl
