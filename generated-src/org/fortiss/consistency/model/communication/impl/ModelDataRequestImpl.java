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
import org.fortiss.consistency.model.communication.ModelDataRequest;
import org.fortiss.consistency.model.communication.UserDetailedInformation;

import org.fortiss.consistency.model.views.ConsistencyViewtype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Data Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl#getTargetedAdapter <em>Targeted Adapter</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl#getViewtype <em>Viewtype</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl#getNeededElementsInfo <em>Needed Elements Info</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelDataRequestImpl extends EObjectImpl implements ModelDataRequest {
	/**
	 * The default value of the '{@link #getRequestIdentifier() <em>Request Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestIdentifier() <em>Request Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String requestIdentifier = REQUEST_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetedAdapter() <em>Targeted Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETED_ADAPTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetedAdapter() <em>Targeted Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedAdapter()
	 * @generated
	 * @ordered
	 */
	protected String targetedAdapter = TARGETED_ADAPTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewtype() <em>Viewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewtype()
	 * @generated
	 * @ordered
	 */
	protected ConsistencyViewtype viewtype;

	/**
	 * The cached value of the '{@link #getNeededElementsInfo() <em>Needed Elements Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededElementsInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicElementInformation> neededElementsInfo;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected UserDetailedInformation user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelDataRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.MODEL_DATA_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestIdentifier(String newRequestIdentifier) {
		String oldRequestIdentifier = requestIdentifier;
		requestIdentifier = newRequestIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_REQUEST__REQUEST_IDENTIFIER, oldRequestIdentifier, requestIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetedAdapter() {
		return targetedAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetedAdapter(String newTargetedAdapter) {
		String oldTargetedAdapter = targetedAdapter;
		targetedAdapter = newTargetedAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_REQUEST__TARGETED_ADAPTER, oldTargetedAdapter, targetedAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyViewtype getViewtype() {
		if (viewtype != null && viewtype.eIsProxy()) {
			InternalEObject oldViewtype = (InternalEObject)viewtype;
			viewtype = (ConsistencyViewtype)eResolveProxy(oldViewtype);
			if (viewtype != oldViewtype) {
				InternalEObject newViewtype = (InternalEObject)viewtype;
				NotificationChain msgs = oldViewtype.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE, null, null);
				if (newViewtype.eInternalContainer() == null) {
					msgs = newViewtype.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE, oldViewtype, viewtype));
			}
		}
		return viewtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyViewtype basicGetViewtype() {
		return viewtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewtype(ConsistencyViewtype newViewtype, NotificationChain msgs) {
		ConsistencyViewtype oldViewtype = viewtype;
		viewtype = newViewtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE, oldViewtype, newViewtype);
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
	public void setViewtype(ConsistencyViewtype newViewtype) {
		if (newViewtype != viewtype) {
			NotificationChain msgs = null;
			if (viewtype != null)
				msgs = ((InternalEObject)viewtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE, null, msgs);
			if (newViewtype != null)
				msgs = ((InternalEObject)newViewtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE, null, msgs);
			msgs = basicSetViewtype(newViewtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE, newViewtype, newViewtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicElementInformation> getNeededElementsInfo() {
		if (neededElementsInfo == null) {
			neededElementsInfo = new EObjectContainmentEList.Resolving<BasicElementInformation>(BasicElementInformation.class, this, CommunicationPackage.MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO);
		}
		return neededElementsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDetailedInformation getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (UserDetailedInformation)eResolveProxy(oldUser);
			if (user != oldUser) {
				InternalEObject newUser = (InternalEObject)user;
				NotificationChain msgs = oldUser.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__USER, null, null);
				if (newUser.eInternalContainer() == null) {
					msgs = newUser.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__USER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.MODEL_DATA_REQUEST__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDetailedInformation basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(UserDetailedInformation newUser, NotificationChain msgs) {
		UserDetailedInformation oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_REQUEST__USER, oldUser, newUser);
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
	public void setUser(UserDetailedInformation newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.MODEL_DATA_REQUEST__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.MODEL_DATA_REQUEST__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE:
				return basicSetViewtype(null, msgs);
			case CommunicationPackage.MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO:
				return ((InternalEList<?>)getNeededElementsInfo()).basicRemove(otherEnd, msgs);
			case CommunicationPackage.MODEL_DATA_REQUEST__USER:
				return basicSetUser(null, msgs);
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
			case CommunicationPackage.MODEL_DATA_REQUEST__REQUEST_IDENTIFIER:
				return getRequestIdentifier();
			case CommunicationPackage.MODEL_DATA_REQUEST__TARGETED_ADAPTER:
				return getTargetedAdapter();
			case CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE:
				if (resolve) return getViewtype();
				return basicGetViewtype();
			case CommunicationPackage.MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO:
				return getNeededElementsInfo();
			case CommunicationPackage.MODEL_DATA_REQUEST__USER:
				if (resolve) return getUser();
				return basicGetUser();
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
			case CommunicationPackage.MODEL_DATA_REQUEST__REQUEST_IDENTIFIER:
				setRequestIdentifier((String)newValue);
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__TARGETED_ADAPTER:
				setTargetedAdapter((String)newValue);
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE:
				setViewtype((ConsistencyViewtype)newValue);
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO:
				getNeededElementsInfo().clear();
				getNeededElementsInfo().addAll((Collection<? extends BasicElementInformation>)newValue);
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__USER:
				setUser((UserDetailedInformation)newValue);
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
			case CommunicationPackage.MODEL_DATA_REQUEST__REQUEST_IDENTIFIER:
				setRequestIdentifier(REQUEST_IDENTIFIER_EDEFAULT);
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__TARGETED_ADAPTER:
				setTargetedAdapter(TARGETED_ADAPTER_EDEFAULT);
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE:
				setViewtype((ConsistencyViewtype)null);
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO:
				getNeededElementsInfo().clear();
				return;
			case CommunicationPackage.MODEL_DATA_REQUEST__USER:
				setUser((UserDetailedInformation)null);
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
			case CommunicationPackage.MODEL_DATA_REQUEST__REQUEST_IDENTIFIER:
				return REQUEST_IDENTIFIER_EDEFAULT == null ? requestIdentifier != null : !REQUEST_IDENTIFIER_EDEFAULT.equals(requestIdentifier);
			case CommunicationPackage.MODEL_DATA_REQUEST__TARGETED_ADAPTER:
				return TARGETED_ADAPTER_EDEFAULT == null ? targetedAdapter != null : !TARGETED_ADAPTER_EDEFAULT.equals(targetedAdapter);
			case CommunicationPackage.MODEL_DATA_REQUEST__VIEWTYPE:
				return viewtype != null;
			case CommunicationPackage.MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO:
				return neededElementsInfo != null && !neededElementsInfo.isEmpty();
			case CommunicationPackage.MODEL_DATA_REQUEST__USER:
				return user != null;
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
		result.append(" (requestIdentifier: ");
		result.append(requestIdentifier);
		result.append(", targetedAdapter: ");
		result.append(targetedAdapter);
		result.append(')');
		return result.toString();
	}

} //ModelDataRequestImpl
