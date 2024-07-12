/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.RuleCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.RuleConditionImpl#getOriginalExpression <em>Original Expression</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.RuleConditionImpl#getModifiedExpression <em>Modified Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleConditionImpl extends EObjectImpl implements RuleCondition {
	/**
	 * The default value of the '{@link #getOriginalExpression() <em>Original Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalExpression() <em>Original Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalExpression()
	 * @generated
	 * @ordered
	 */
	protected String originalExpression = ORIGINAL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedExpression() <em>Modified Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedExpression() <em>Modified Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedExpression()
	 * @generated
	 * @ordered
	 */
	protected String modifiedExpression = MODIFIED_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.RULE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalExpression() {
		return originalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalExpression(String newOriginalExpression) {
		String oldOriginalExpression = originalExpression;
		originalExpression = newOriginalExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RULE_CONDITION__ORIGINAL_EXPRESSION, oldOriginalExpression, originalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModifiedExpression() {
		return modifiedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedExpression(String newModifiedExpression) {
		String oldModifiedExpression = modifiedExpression;
		modifiedExpression = newModifiedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RULE_CONDITION__MODIFIED_EXPRESSION, oldModifiedExpression, modifiedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConsistencyPackage.RULE_CONDITION__ORIGINAL_EXPRESSION:
				return getOriginalExpression();
			case ConsistencyPackage.RULE_CONDITION__MODIFIED_EXPRESSION:
				return getModifiedExpression();
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
			case ConsistencyPackage.RULE_CONDITION__ORIGINAL_EXPRESSION:
				setOriginalExpression((String)newValue);
				return;
			case ConsistencyPackage.RULE_CONDITION__MODIFIED_EXPRESSION:
				setModifiedExpression((String)newValue);
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
			case ConsistencyPackage.RULE_CONDITION__ORIGINAL_EXPRESSION:
				setOriginalExpression(ORIGINAL_EXPRESSION_EDEFAULT);
				return;
			case ConsistencyPackage.RULE_CONDITION__MODIFIED_EXPRESSION:
				setModifiedExpression(MODIFIED_EXPRESSION_EDEFAULT);
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
			case ConsistencyPackage.RULE_CONDITION__ORIGINAL_EXPRESSION:
				return ORIGINAL_EXPRESSION_EDEFAULT == null ? originalExpression != null : !ORIGINAL_EXPRESSION_EDEFAULT.equals(originalExpression);
			case ConsistencyPackage.RULE_CONDITION__MODIFIED_EXPRESSION:
				return MODIFIED_EXPRESSION_EDEFAULT == null ? modifiedExpression != null : !MODIFIED_EXPRESSION_EDEFAULT.equals(modifiedExpression);
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
		result.append(" (originalExpression: ");
		result.append(originalExpression);
		result.append(", modifiedExpression: ");
		result.append(modifiedExpression);
		result.append(')');
		return result.toString();
	}

} //RuleConditionImpl
