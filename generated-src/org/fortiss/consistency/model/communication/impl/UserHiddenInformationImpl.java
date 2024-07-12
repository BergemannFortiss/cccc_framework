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
import org.fortiss.consistency.model.communication.UserBaseAttributes;
import org.fortiss.consistency.model.communication.UserHiddenInformation;
import org.fortiss.consistency.model.communication.UserToken;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Hidden Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserHiddenInformationImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserHiddenInformationImpl#getUserToken <em>User Token</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserHiddenInformationImpl#getBaseAttributes <em>Base Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserHiddenInformationImpl extends EObjectImpl implements UserHiddenInformation {
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getBaseAttributes() <em>Base Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAttributes()
	 * @generated
	 * @ordered
	 */
	protected UserBaseAttributes baseAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserHiddenInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.USER_HIDDEN_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_HIDDEN_INFORMATION__USER_NAME, oldUserName, userName));
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
				NotificationChain msgs = oldUserToken.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN, null, null);
				if (newUserToken.eInternalContainer() == null) {
					msgs = newUserToken.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN, oldUserToken, userToken));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN, oldUserToken, newUserToken);
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
				msgs = ((InternalEObject)userToken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN, null, msgs);
			if (newUserToken != null)
				msgs = ((InternalEObject)newUserToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN, null, msgs);
			msgs = basicSetUserToken(newUserToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN, newUserToken, newUserToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserBaseAttributes getBaseAttributes() {
		if (baseAttributes != null && baseAttributes.eIsProxy()) {
			InternalEObject oldBaseAttributes = (InternalEObject)baseAttributes;
			baseAttributes = (UserBaseAttributes)eResolveProxy(oldBaseAttributes);
			if (baseAttributes != oldBaseAttributes) {
				InternalEObject newBaseAttributes = (InternalEObject)baseAttributes;
				NotificationChain msgs = oldBaseAttributes.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES, null, null);
				if (newBaseAttributes.eInternalContainer() == null) {
					msgs = newBaseAttributes.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES, oldBaseAttributes, baseAttributes));
			}
		}
		return baseAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserBaseAttributes basicGetBaseAttributes() {
		return baseAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseAttributes(UserBaseAttributes newBaseAttributes, NotificationChain msgs) {
		UserBaseAttributes oldBaseAttributes = baseAttributes;
		baseAttributes = newBaseAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES, oldBaseAttributes, newBaseAttributes);
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
	public void setBaseAttributes(UserBaseAttributes newBaseAttributes) {
		if (newBaseAttributes != baseAttributes) {
			NotificationChain msgs = null;
			if (baseAttributes != null)
				msgs = ((InternalEObject)baseAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES, null, msgs);
			if (newBaseAttributes != null)
				msgs = ((InternalEObject)newBaseAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES, null, msgs);
			msgs = basicSetBaseAttributes(newBaseAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES, newBaseAttributes, newBaseAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN:
				return basicSetUserToken(null, msgs);
			case CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES:
				return basicSetBaseAttributes(null, msgs);
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
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_NAME:
				return getUserName();
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN:
				if (resolve) return getUserToken();
				return basicGetUserToken();
			case CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES:
				if (resolve) return getBaseAttributes();
				return basicGetBaseAttributes();
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
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_NAME:
				setUserName((String)newValue);
				return;
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN:
				setUserToken((UserToken)newValue);
				return;
			case CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES:
				setBaseAttributes((UserBaseAttributes)newValue);
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
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN:
				setUserToken((UserToken)null);
				return;
			case CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES:
				setBaseAttributes((UserBaseAttributes)null);
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
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case CommunicationPackage.USER_HIDDEN_INFORMATION__USER_TOKEN:
				return userToken != null;
			case CommunicationPackage.USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES:
				return baseAttributes != null;
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
		result.append(" (userName: ");
		result.append(userName);
		result.append(')');
		return result.toString();
	}

} //UserHiddenInformationImpl
