/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.views;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.fortiss.consistency.model.ConsistencyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/model/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.model.views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = org.fortiss.consistency.model.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.views.impl.ConsistencyViewImpl <em>Consistency View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.views.impl.ConsistencyViewImpl
	 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getConsistencyView()
	 * @generated
	 */
	int CONSISTENCY_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEW__UUID = ConsistencyPackage.IHAS_ID_AND_NAME__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEW__NAME = ConsistencyPackage.IHAS_ID_AND_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEW__CONTENT = ConsistencyPackage.IHAS_ID_AND_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consistency View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEW_FEATURE_COUNT = ConsistencyPackage.IHAS_ID_AND_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.views.impl.ConsistencyViewtypeImpl <em>Consistency Viewtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.views.impl.ConsistencyViewtypeImpl
	 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getConsistencyViewtype()
	 * @generated
	 */
	int CONSISTENCY_VIEWTYPE = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEWTYPE__UUID = ConsistencyPackage.IHAS_ID_AND_NAME__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEWTYPE__NAME = ConsistencyPackage.IHAS_ID_AND_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Contained Classes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES = ConsistencyPackage.IHAS_ID_AND_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consistency Viewtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIEWTYPE_FEATURE_COUNT = ConsistencyPackage.IHAS_ID_AND_NAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.views.impl.ClassFeatureImpl <em>Class Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.views.impl.ClassFeatureImpl
	 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getClassFeature()
	 * @generated
	 */
	int CLASS_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Owning Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE__OWNING_CLASS_STRING = 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE__FEATURE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Feature Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE__FEATURE_CLASS_STRING = 2;

	/**
	 * The feature id for the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE__IS_REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>Class Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.views.impl.ClassStringToClassFeaturesMapEntryImpl <em>Class String To Class Features Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.views.impl.ClassStringToClassFeaturesMapEntryImpl
	 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getClassStringToClassFeaturesMapEntry()
	 * @generated
	 */
	int CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Class String To Class Features Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.views.ConsistencyView <em>Consistency View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consistency View</em>'.
	 * @see org.fortiss.consistency.model.views.ConsistencyView
	 * @generated
	 */
	EClass getConsistencyView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.views.ConsistencyView#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.fortiss.consistency.model.views.ConsistencyView#getContent()
	 * @see #getConsistencyView()
	 * @generated
	 */
	EReference getConsistencyView_Content();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.views.ConsistencyViewtype <em>Consistency Viewtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consistency Viewtype</em>'.
	 * @see org.fortiss.consistency.model.views.ConsistencyViewtype
	 * @generated
	 */
	EClass getConsistencyViewtype();

	/**
	 * Returns the meta object for the map '{@link org.fortiss.consistency.model.views.ConsistencyViewtype#getContainedClasses <em>Contained Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Contained Classes</em>'.
	 * @see org.fortiss.consistency.model.views.ConsistencyViewtype#getContainedClasses()
	 * @see #getConsistencyViewtype()
	 * @generated
	 */
	EReference getConsistencyViewtype_ContainedClasses();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.views.ClassFeature <em>Class Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Feature</em>'.
	 * @see org.fortiss.consistency.model.views.ClassFeature
	 * @generated
	 */
	EClass getClassFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.views.ClassFeature#getOwningClassString <em>Owning Class String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class String</em>'.
	 * @see org.fortiss.consistency.model.views.ClassFeature#getOwningClassString()
	 * @see #getClassFeature()
	 * @generated
	 */
	EAttribute getClassFeature_OwningClassString();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.views.ClassFeature#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.fortiss.consistency.model.views.ClassFeature#getFeatureName()
	 * @see #getClassFeature()
	 * @generated
	 */
	EAttribute getClassFeature_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.views.ClassFeature#getFeatureClassString <em>Feature Class String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Class String</em>'.
	 * @see org.fortiss.consistency.model.views.ClassFeature#getFeatureClassString()
	 * @see #getClassFeature()
	 * @generated
	 */
	EAttribute getClassFeature_FeatureClassString();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.views.ClassFeature#isIsReference <em>Is Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference</em>'.
	 * @see org.fortiss.consistency.model.views.ClassFeature#isIsReference()
	 * @see #getClassFeature()
	 * @generated
	 */
	EAttribute getClassFeature_IsReference();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Class String To Class Features Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class String To Class Features Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.fortiss.consistency.model.views.ClassFeature" valueContainment="true" valueResolveProxies="true" valueMany="true"
	 * @generated
	 */
	EClass getClassStringToClassFeaturesMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getClassStringToClassFeaturesMapEntry()
	 * @generated
	 */
	EAttribute getClassStringToClassFeaturesMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getClassStringToClassFeaturesMapEntry()
	 * @generated
	 */
	EReference getClassStringToClassFeaturesMapEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.views.impl.ConsistencyViewImpl <em>Consistency View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.views.impl.ConsistencyViewImpl
		 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getConsistencyView()
		 * @generated
		 */
		EClass CONSISTENCY_VIEW = eINSTANCE.getConsistencyView();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSISTENCY_VIEW__CONTENT = eINSTANCE.getConsistencyView_Content();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.views.impl.ConsistencyViewtypeImpl <em>Consistency Viewtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.views.impl.ConsistencyViewtypeImpl
		 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getConsistencyViewtype()
		 * @generated
		 */
		EClass CONSISTENCY_VIEWTYPE = eINSTANCE.getConsistencyViewtype();

		/**
		 * The meta object literal for the '<em><b>Contained Classes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES = eINSTANCE.getConsistencyViewtype_ContainedClasses();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.views.impl.ClassFeatureImpl <em>Class Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.views.impl.ClassFeatureImpl
		 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getClassFeature()
		 * @generated
		 */
		EClass CLASS_FEATURE = eINSTANCE.getClassFeature();

		/**
		 * The meta object literal for the '<em><b>Owning Class String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_FEATURE__OWNING_CLASS_STRING = eINSTANCE.getClassFeature_OwningClassString();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_FEATURE__FEATURE_NAME = eINSTANCE.getClassFeature_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Feature Class String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_FEATURE__FEATURE_CLASS_STRING = eINSTANCE.getClassFeature_FeatureClassString();

		/**
		 * The meta object literal for the '<em><b>Is Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_FEATURE__IS_REFERENCE = eINSTANCE.getClassFeature_IsReference();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.views.impl.ClassStringToClassFeaturesMapEntryImpl <em>Class String To Class Features Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.views.impl.ClassStringToClassFeaturesMapEntryImpl
		 * @see org.fortiss.consistency.model.views.impl.ViewsPackageImpl#getClassStringToClassFeaturesMapEntry()
		 * @generated
		 */
		EClass CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY = eINSTANCE.getClassStringToClassFeaturesMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY__KEY = eINSTANCE.getClassStringToClassFeaturesMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY__VALUE = eINSTANCE.getClassStringToClassFeaturesMapEntry_Value();

	}

} //ViewsPackage
