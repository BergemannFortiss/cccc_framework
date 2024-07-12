/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.RuleElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.RuleElementImpl#getNameInRule <em>Name In Rule</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.RuleElementImpl#getElementClassString <em>Element Class String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleElementImpl extends EObjectImpl implements RuleElement {
	/**
	 * The default value of the '{@link #getNameInRule() <em>Name In Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInRule()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_IN_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameInRule() <em>Name In Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInRule()
	 * @generated
	 * @ordered
	 */
	protected String nameInRule = NAME_IN_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementClassString() <em>Element Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClassString()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_CLASS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementClassString() <em>Element Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClassString()
	 * @generated
	 * @ordered
	 */
	protected String elementClassString = ELEMENT_CLASS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.RULE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameInRule() {
		return nameInRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameInRule(String newNameInRule) {
		String oldNameInRule = nameInRule;
		nameInRule = newNameInRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RULE_ELEMENT__NAME_IN_RULE, oldNameInRule, nameInRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementClassString() {
		return elementClassString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementClassString(String newElementClassString) {
		String oldElementClassString = elementClassString;
		elementClassString = newElementClassString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RULE_ELEMENT__ELEMENT_CLASS_STRING, oldElementClassString, elementClassString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConsistencyPackage.RULE_ELEMENT__NAME_IN_RULE:
				return getNameInRule();
			case ConsistencyPackage.RULE_ELEMENT__ELEMENT_CLASS_STRING:
				return getElementClassString();
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
			case ConsistencyPackage.RULE_ELEMENT__NAME_IN_RULE:
				setNameInRule((String)newValue);
				return;
			case ConsistencyPackage.RULE_ELEMENT__ELEMENT_CLASS_STRING:
				setElementClassString((String)newValue);
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
			case ConsistencyPackage.RULE_ELEMENT__NAME_IN_RULE:
				setNameInRule(NAME_IN_RULE_EDEFAULT);
				return;
			case ConsistencyPackage.RULE_ELEMENT__ELEMENT_CLASS_STRING:
				setElementClassString(ELEMENT_CLASS_STRING_EDEFAULT);
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
			case ConsistencyPackage.RULE_ELEMENT__NAME_IN_RULE:
				return NAME_IN_RULE_EDEFAULT == null ? nameInRule != null : !NAME_IN_RULE_EDEFAULT.equals(nameInRule);
			case ConsistencyPackage.RULE_ELEMENT__ELEMENT_CLASS_STRING:
				return ELEMENT_CLASS_STRING_EDEFAULT == null ? elementClassString != null : !ELEMENT_CLASS_STRING_EDEFAULT.equals(elementClassString);
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
		result.append(" (nameInRule: ");
		result.append(nameInRule);
		result.append(", elementClassString: ");
		result.append(elementClassString);
		result.append(')');
		return result.toString();
	}

} //RuleElementImpl
