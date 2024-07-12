/**
 */
package org.fortiss.consistency.viewtypes.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl;

import org.fortiss.consistency.viewtypes.requirements.Requirement;
import org.fortiss.consistency.viewtypes.requirements.RequirementList;
import org.fortiss.consistency.viewtypes.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.impl.RequirementListImpl#getContainedRequirements <em>Contained Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementListImpl extends INamedCommentedElementImpl implements RequirementList {
	/**
	 * The cached value of the '{@link #getContainedRequirements() <em>Contained Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> containedRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getContainedRequirements() {
		if (containedRequirements == null) {
			containedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENT_LIST__CONTAINED_REQUIREMENTS);
		}
		return containedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT_LIST__CONTAINED_REQUIREMENTS:
				return getContainedRequirements();
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
			case RequirementsPackage.REQUIREMENT_LIST__CONTAINED_REQUIREMENTS:
				getContainedRequirements().clear();
				getContainedRequirements().addAll((Collection<? extends Requirement>)newValue);
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
			case RequirementsPackage.REQUIREMENT_LIST__CONTAINED_REQUIREMENTS:
				getContainedRequirements().clear();
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
			case RequirementsPackage.REQUIREMENT_LIST__CONTAINED_REQUIREMENTS:
				return containedRequirements != null && !containedRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementListImpl
