/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.model.BasicElementInformation;

import org.fortiss.consistency.model.communication.CommunicationPackage;
import org.fortiss.consistency.model.communication.TriggerRequest;
import org.fortiss.consistency.model.communication.UserInitialInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.TriggerRequestImpl#getAdapterIdentifier <em>Adapter Identifier</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.TriggerRequestImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.TriggerRequestImpl#getElementsToBeCheckedInfo <em>Elements To Be Checked Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerRequestImpl extends EObjectImpl implements TriggerRequest {
	/**
	 * The default value of the '{@link #getAdapterIdentifier() <em>Adapter Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdapterIdentifier() <em>Adapter Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String adapterIdentifier = ADAPTER_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected UserInitialInformation user;

	/**
	 * The cached value of the '{@link #getElementsToBeCheckedInfo() <em>Elements To Be Checked Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsToBeCheckedInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicElementInformation> elementsToBeCheckedInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.TRIGGER_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdapterIdentifier() {
		return adapterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdapterIdentifier(String newAdapterIdentifier) {
		String oldAdapterIdentifier = adapterIdentifier;
		adapterIdentifier = newAdapterIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TRIGGER_REQUEST__ADAPTER_IDENTIFIER, oldAdapterIdentifier, adapterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserInitialInformation getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (UserInitialInformation)eResolveProxy(oldUser);
			if (user != oldUser) {
				InternalEObject newUser = (InternalEObject)user;
				NotificationChain msgs = oldUser.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.TRIGGER_REQUEST__USER, null, null);
				if (newUser.eInternalContainer() == null) {
					msgs = newUser.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.TRIGGER_REQUEST__USER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.TRIGGER_REQUEST__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInitialInformation basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(UserInitialInformation newUser, NotificationChain msgs) {
		UserInitialInformation oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.TRIGGER_REQUEST__USER, oldUser, newUser);
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
	public void setUser(UserInitialInformation newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.TRIGGER_REQUEST__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.TRIGGER_REQUEST__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TRIGGER_REQUEST__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicElementInformation> getElementsToBeCheckedInfo() {
		if (elementsToBeCheckedInfo == null) {
			elementsToBeCheckedInfo = new EObjectContainmentEList.Resolving<BasicElementInformation>(BasicElementInformation.class, this, CommunicationPackage.TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO);
		}
		return elementsToBeCheckedInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.TRIGGER_REQUEST__USER:
				return basicSetUser(null, msgs);
			case CommunicationPackage.TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO:
				return ((InternalEList<?>)getElementsToBeCheckedInfo()).basicRemove(otherEnd, msgs);
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
			case CommunicationPackage.TRIGGER_REQUEST__ADAPTER_IDENTIFIER:
				return getAdapterIdentifier();
			case CommunicationPackage.TRIGGER_REQUEST__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case CommunicationPackage.TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO:
				return getElementsToBeCheckedInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommunicationPackage.TRIGGER_REQUEST__ADAPTER_IDENTIFIER:
				setAdapterIdentifier((String)newValue);
				return;
			case CommunicationPackage.TRIGGER_REQUEST__USER:
				setUser((UserInitialInformation)newValue);
				return;
			case CommunicationPackage.TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO:
				getElementsToBeCheckedInfo().clear();
				getElementsToBeCheckedInfo().addAll((Collection<? extends BasicElementInformation>)newValue);
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
			case CommunicationPackage.TRIGGER_REQUEST__ADAPTER_IDENTIFIER:
				setAdapterIdentifier(ADAPTER_IDENTIFIER_EDEFAULT);
				return;
			case CommunicationPackage.TRIGGER_REQUEST__USER:
				setUser((UserInitialInformation)null);
				return;
			case CommunicationPackage.TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO:
				getElementsToBeCheckedInfo().clear();
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
			case CommunicationPackage.TRIGGER_REQUEST__ADAPTER_IDENTIFIER:
				return ADAPTER_IDENTIFIER_EDEFAULT == null ? adapterIdentifier != null : !ADAPTER_IDENTIFIER_EDEFAULT.equals(adapterIdentifier);
			case CommunicationPackage.TRIGGER_REQUEST__USER:
				return user != null;
			case CommunicationPackage.TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO:
				return elementsToBeCheckedInfo != null && !elementsToBeCheckedInfo.isEmpty();
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
		result.append(" (adapterIdentifier: ");
		result.append(adapterIdentifier);
		result.append(')');
		return result.toString();
	}

} //TriggerRequestImpl
