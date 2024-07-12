/**
 */
package org.fortiss.consistency.viewtypes.dictionary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.fortiss.consistency.viewtypes.basics.BasicsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryFactory
 * @model kind="package"
 * @generated
 */
public interface DictionaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dictionary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/viewtypes/dictionary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.viewtypes.dictionary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DictionaryPackage eINSTANCE = org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryImpl
	 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryPackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__ID = BasicsPackage.IID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAME = BasicsPackage.IID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__CONTAINED_ELEMENTS = BasicsPackage.IID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = BasicsPackage.IID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_OPERATION_COUNT = BasicsPackage.IID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryElementImpl
	 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryPackageImpl#getDictionaryElement()
	 * @generated
	 */
	int DICTIONARY_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ELEMENT__ID = BasicsPackage.IID_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ELEMENT__NAME = BasicsPackage.IID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ELEMENT__COMMENT = BasicsPackage.IID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ELEMENT_FEATURE_COUNT = BasicsPackage.IID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ELEMENT_OPERATION_COUNT = BasicsPackage.IID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.dictionary.impl.AbsoluteTermEntryImpl <em>Absolute Term Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.dictionary.impl.AbsoluteTermEntryImpl
	 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryPackageImpl#getAbsoluteTermEntry()
	 * @generated
	 */
	int ABSOLUTE_TERM_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TERM_ENTRY__ID = DICTIONARY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TERM_ENTRY__NAME = DICTIONARY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TERM_ENTRY__COMMENT = DICTIONARY_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Absolute Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM = DICTIONARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Term Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TERM_ENTRY_FEATURE_COUNT = DICTIONARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Absolute Term Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TERM_ENTRY_OPERATION_COUNT = DICTIONARY_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.dictionary.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see org.fortiss.consistency.viewtypes.dictionary.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.dictionary.Dictionary#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see org.fortiss.consistency.viewtypes.dictionary.Dictionary#getContainedElements()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_ContainedElements();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.dictionary.DictionaryElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryElement
	 * @generated
	 */
	EClass getDictionaryElement();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry <em>Absolute Term Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Term Entry</em>'.
	 * @see org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry
	 * @generated
	 */
	EClass getAbsoluteTermEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry#getAbsoluteTerm <em>Absolute Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Absolute Term</em>'.
	 * @see org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry#getAbsoluteTerm()
	 * @see #getAbsoluteTermEntry()
	 * @generated
	 */
	EReference getAbsoluteTermEntry_AbsoluteTerm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DictionaryFactory getDictionaryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryImpl
		 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryPackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__CONTAINED_ELEMENTS = eINSTANCE.getDictionary_ContainedElements();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryElementImpl
		 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryPackageImpl#getDictionaryElement()
		 * @generated
		 */
		EClass DICTIONARY_ELEMENT = eINSTANCE.getDictionaryElement();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.dictionary.impl.AbsoluteTermEntryImpl <em>Absolute Term Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.dictionary.impl.AbsoluteTermEntryImpl
		 * @see org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryPackageImpl#getAbsoluteTermEntry()
		 * @generated
		 */
		EClass ABSOLUTE_TERM_ENTRY = eINSTANCE.getAbsoluteTermEntry();

		/**
		 * The meta object literal for the '<em><b>Absolute Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM = eINSTANCE.getAbsoluteTermEntry_AbsoluteTerm();

	}

} //DictionaryPackage
