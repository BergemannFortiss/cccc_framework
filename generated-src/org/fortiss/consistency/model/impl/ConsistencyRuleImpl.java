/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.model.AbstractElementRelation;
import org.fortiss.consistency.model.ConfidentialityStatus;
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.IHasComment;
import org.fortiss.consistency.model.IHasName;
import org.fortiss.consistency.model.RuleCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl#getRuleScope <em>Rule Scope</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl#getRuleContext <em>Rule Context</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl#getRuleCondition <em>Rule Condition</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl#getConfidentialityStatus <em>Confidentiality Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsistencyRuleImpl extends EObjectImpl implements ConsistencyRule {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleScope() <em>Rule Scope</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleScope()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ruleScope;

	/**
	 * The cached value of the '{@link #getRuleContext() <em>Rule Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleContext()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElementRelation> ruleContext;

	/**
	 * The cached value of the '{@link #getRuleCondition() <em>Rule Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleCondition()
	 * @generated
	 * @ordered
	 */
	protected RuleCondition ruleCondition;

	/**
	 * The cached value of the '{@link #getConfidentialityStatus() <em>Confidentiality Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityStatus()
	 * @generated
	 * @ordered
	 */
	protected ConfidentialityStatus confidentialityStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsistencyRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.CONSISTENCY_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_RULE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_RULE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRuleScope() {
		if (ruleScope == null) {
			ruleScope = new EDataTypeUniqueEList<String>(String.class, this, ConsistencyPackage.CONSISTENCY_RULE__RULE_SCOPE);
		}
		return ruleScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractElementRelation> getRuleContext() {
		if (ruleContext == null) {
			ruleContext = new EObjectContainmentEList.Resolving<AbstractElementRelation>(AbstractElementRelation.class, this, ConsistencyPackage.CONSISTENCY_RULE__RULE_CONTEXT);
		}
		return ruleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleCondition getRuleCondition() {
		if (ruleCondition != null && ruleCondition.eIsProxy()) {
			InternalEObject oldRuleCondition = (InternalEObject)ruleCondition;
			ruleCondition = (RuleCondition)eResolveProxy(oldRuleCondition);
			if (ruleCondition != oldRuleCondition) {
				InternalEObject newRuleCondition = (InternalEObject)ruleCondition;
				NotificationChain msgs = oldRuleCondition.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION, null, null);
				if (newRuleCondition.eInternalContainer() == null) {
					msgs = newRuleCondition.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION, oldRuleCondition, ruleCondition));
			}
		}
		return ruleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleCondition basicGetRuleCondition() {
		return ruleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleCondition(RuleCondition newRuleCondition, NotificationChain msgs) {
		RuleCondition oldRuleCondition = ruleCondition;
		ruleCondition = newRuleCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION, oldRuleCondition, newRuleCondition);
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
	public void setRuleCondition(RuleCondition newRuleCondition) {
		if (newRuleCondition != ruleCondition) {
			NotificationChain msgs = null;
			if (ruleCondition != null)
				msgs = ((InternalEObject)ruleCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION, null, msgs);
			if (newRuleCondition != null)
				msgs = ((InternalEObject)newRuleCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION, null, msgs);
			msgs = basicSetRuleCondition(newRuleCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION, newRuleCondition, newRuleCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialityStatus getConfidentialityStatus() {
		if (confidentialityStatus != null && confidentialityStatus.eIsProxy()) {
			InternalEObject oldConfidentialityStatus = (InternalEObject)confidentialityStatus;
			confidentialityStatus = (ConfidentialityStatus)eResolveProxy(oldConfidentialityStatus);
			if (confidentialityStatus != oldConfidentialityStatus) {
				InternalEObject newConfidentialityStatus = (InternalEObject)confidentialityStatus;
				NotificationChain msgs = oldConfidentialityStatus.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS, null, null);
				if (newConfidentialityStatus.eInternalContainer() == null) {
					msgs = newConfidentialityStatus.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS, oldConfidentialityStatus, confidentialityStatus));
			}
		}
		return confidentialityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityStatus basicGetConfidentialityStatus() {
		return confidentialityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentialityStatus(ConfidentialityStatus newConfidentialityStatus, NotificationChain msgs) {
		ConfidentialityStatus oldConfidentialityStatus = confidentialityStatus;
		confidentialityStatus = newConfidentialityStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS, oldConfidentialityStatus, newConfidentialityStatus);
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
	public void setConfidentialityStatus(ConfidentialityStatus newConfidentialityStatus) {
		if (newConfidentialityStatus != confidentialityStatus) {
			NotificationChain msgs = null;
			if (confidentialityStatus != null)
				msgs = ((InternalEObject)confidentialityStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS, null, msgs);
			if (newConfidentialityStatus != null)
				msgs = ((InternalEObject)newConfidentialityStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS, null, msgs);
			msgs = basicSetConfidentialityStatus(newConfidentialityStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS, newConfidentialityStatus, newConfidentialityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONTEXT:
				return ((InternalEList<?>)getRuleContext()).basicRemove(otherEnd, msgs);
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION:
				return basicSetRuleCondition(null, msgs);
			case ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS:
				return basicSetConfidentialityStatus(null, msgs);
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
			case ConsistencyPackage.CONSISTENCY_RULE__UUID:
				return getUuid();
			case ConsistencyPackage.CONSISTENCY_RULE__NAME:
				return getName();
			case ConsistencyPackage.CONSISTENCY_RULE__COMMENT:
				return getComment();
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_SCOPE:
				return getRuleScope();
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONTEXT:
				return getRuleContext();
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION:
				if (resolve) return getRuleCondition();
				return basicGetRuleCondition();
			case ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS:
				if (resolve) return getConfidentialityStatus();
				return basicGetConfidentialityStatus();
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
			case ConsistencyPackage.CONSISTENCY_RULE__UUID:
				setUuid((String)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__NAME:
				setName((String)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__COMMENT:
				setComment((String)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_SCOPE:
				getRuleScope().clear();
				getRuleScope().addAll((Collection<? extends String>)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONTEXT:
				getRuleContext().clear();
				getRuleContext().addAll((Collection<? extends AbstractElementRelation>)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION:
				setRuleCondition((RuleCondition)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS:
				setConfidentialityStatus((ConfidentialityStatus)newValue);
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
			case ConsistencyPackage.CONSISTENCY_RULE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_SCOPE:
				getRuleScope().clear();
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONTEXT:
				getRuleContext().clear();
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION:
				setRuleCondition((RuleCondition)null);
				return;
			case ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS:
				setConfidentialityStatus((ConfidentialityStatus)null);
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
			case ConsistencyPackage.CONSISTENCY_RULE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case ConsistencyPackage.CONSISTENCY_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConsistencyPackage.CONSISTENCY_RULE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_SCOPE:
				return ruleScope != null && !ruleScope.isEmpty();
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONTEXT:
				return ruleContext != null && !ruleContext.isEmpty();
			case ConsistencyPackage.CONSISTENCY_RULE__RULE_CONDITION:
				return ruleCondition != null;
			case ConsistencyPackage.CONSISTENCY_RULE__CONFIDENTIALITY_STATUS:
				return confidentialityStatus != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IHasName.class) {
			switch (derivedFeatureID) {
				case ConsistencyPackage.CONSISTENCY_RULE__NAME: return ConsistencyPackage.IHAS_NAME__NAME;
				default: return -1;
			}
		}
		if (baseClass == IHasComment.class) {
			switch (derivedFeatureID) {
				case ConsistencyPackage.CONSISTENCY_RULE__COMMENT: return ConsistencyPackage.IHAS_COMMENT__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IHasName.class) {
			switch (baseFeatureID) {
				case ConsistencyPackage.IHAS_NAME__NAME: return ConsistencyPackage.CONSISTENCY_RULE__NAME;
				default: return -1;
			}
		}
		if (baseClass == IHasComment.class) {
			switch (baseFeatureID) {
				case ConsistencyPackage.IHAS_COMMENT__COMMENT: return ConsistencyPackage.CONSISTENCY_RULE__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(", ruleScope: ");
		result.append(ruleScope);
		result.append(')');
		return result.toString();
	}

} //ConsistencyRuleImpl
