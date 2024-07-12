/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.views.util;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.fortiss.consistency.model.IHasId;
import org.fortiss.consistency.model.IHasIdAndName;
import org.fortiss.consistency.model.IHasName;

import org.fortiss.consistency.model.views.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.views.ViewsPackage
 * @generated
 */
public class ViewsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewsPackage.CONSISTENCY_VIEW: {
				ConsistencyView consistencyView = (ConsistencyView)theEObject;
				T result = caseConsistencyView(consistencyView);
				if (result == null) result = caseIHasIdAndName(consistencyView);
				if (result == null) result = caseIHasId(consistencyView);
				if (result == null) result = caseIHasName(consistencyView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONSISTENCY_VIEWTYPE: {
				ConsistencyViewtype consistencyViewtype = (ConsistencyViewtype)theEObject;
				T result = caseConsistencyViewtype(consistencyViewtype);
				if (result == null) result = caseIHasIdAndName(consistencyViewtype);
				if (result == null) result = caseIHasId(consistencyViewtype);
				if (result == null) result = caseIHasName(consistencyViewtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS_FEATURE: {
				ClassFeature classFeature = (ClassFeature)theEObject;
				T result = caseClassFeature(classFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<ClassFeature>> classStringToClassFeaturesMapEntry = (Map.Entry<String, EList<ClassFeature>>)theEObject;
				T result = caseClassStringToClassFeaturesMapEntry(classStringToClassFeaturesMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consistency View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consistency View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsistencyView(ConsistencyView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consistency Viewtype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consistency Viewtype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsistencyViewtype(ConsistencyViewtype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassFeature(ClassFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class String To Class Features Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class String To Class Features Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassStringToClassFeaturesMapEntry(Map.Entry<String, EList<ClassFeature>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHas Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHas Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHasId(IHasId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHas Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHas Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHasName(IHasName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHas Id And Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHas Id And Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHasIdAndName(IHasIdAndName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ViewsSwitch
