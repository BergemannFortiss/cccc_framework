/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a feature of a class, e.g., a class attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.views.ClassFeature#getOwningClassString <em>Owning Class String</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.ClassFeature#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.ClassFeature#getFeatureClassString <em>Feature Class String</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.ClassFeature#isIsReference <em>Is Reference</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.views.ViewsPackage#getClassFeature()
 * @model
 * @generated
 */
public interface ClassFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class String</em>' attribute.
	 * @see #setOwningClassString(String)
	 * @see org.fortiss.consistency.model.views.ViewsPackage#getClassFeature_OwningClassString()
	 * @model
	 * @generated
	 */
	String getOwningClassString();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.views.ClassFeature#getOwningClassString <em>Owning Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class String</em>' attribute.
	 * @see #getOwningClassString()
	 * @generated
	 */
	void setOwningClassString(String value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.fortiss.consistency.model.views.ViewsPackage#getClassFeature_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.views.ClassFeature#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Feature Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Class String</em>' attribute.
	 * @see #setFeatureClassString(String)
	 * @see org.fortiss.consistency.model.views.ViewsPackage#getClassFeature_FeatureClassString()
	 * @model
	 * @generated
	 */
	String getFeatureClassString();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.views.ClassFeature#getFeatureClassString <em>Feature Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Class String</em>' attribute.
	 * @see #getFeatureClassString()
	 * @generated
	 */
	void setFeatureClassString(String value);

	/**
	 * Returns the value of the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reference</em>' attribute.
	 * @see #setIsReference(boolean)
	 * @see org.fortiss.consistency.model.views.ViewsPackage#getClassFeature_IsReference()
	 * @model
	 * @generated
	 */
	boolean isIsReference();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.views.ClassFeature#isIsReference <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference</em>' attribute.
	 * @see #isIsReference()
	 * @generated
	 */
	void setIsReference(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean equals(ClassFeature obj);

} // ClassFeature
