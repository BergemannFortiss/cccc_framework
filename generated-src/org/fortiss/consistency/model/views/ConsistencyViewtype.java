/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.fortiss.consistency.model.IHasIdAndName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consistency Viewtype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a consistency viewtype containing the plan of all the needed data of model elements for a consistency rule evaluation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.views.ConsistencyViewtype#getContainedClasses <em>Contained Classes</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.views.ViewsPackage#getConsistencyViewtype()
 * @model
 * @generated
 */
public interface ConsistencyViewtype extends IHasIdAndName {
	/**
	 * Returns the value of the '<em><b>Contained Classes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link org.fortiss.consistency.model.views.ClassFeature},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Classes</em>' map.
	 * @see org.fortiss.consistency.model.views.ViewsPackage#getConsistencyViewtype_ContainedClasses()
	 * @model mapType="org.fortiss.consistency.model.views.ClassStringToClassFeaturesMapEntry&lt;org.eclipse.emf.ecore.EString, org.fortiss.consistency.model.views.ClassFeature&gt;"
	 * @generated
	 */
	EMap<String, EList<ClassFeature>> getContainedClasses();

} // ConsistencyViewtype
