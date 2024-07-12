/**
 */
package org.fortiss.consistency.viewtypes.basics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.fortiss.consistency.viewtypes.basics.BasicsFactory
 * @model kind="package"
 * @generated
 */
public interface BasicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/viewtypes/basics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.viewtypes.basics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicsPackage eINSTANCE = org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.basics.impl.IIdElementImpl <em>IId Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.basics.impl.IIdElementImpl
	 * @see org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl#getIIdElement()
	 * @generated
	 */
	int IID_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IID_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>IId Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IID_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IId Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IID_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.basics.impl.INamedElementImpl <em>INamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.basics.impl.INamedElementImpl
	 * @see org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl#getINamedElement()
	 * @generated
	 */
	int INAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl <em>INamed Commented Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl
	 * @see org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl#getINamedCommentedElement()
	 * @generated
	 */
	int INAMED_COMMENTED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_COMMENTED_ELEMENT__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_COMMENTED_ELEMENT__COMMENT = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>INamed Commented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_COMMENTED_ELEMENT_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>INamed Commented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_COMMENTED_ELEMENT_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.basics.IIdElement <em>IId Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IId Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.basics.IIdElement
	 * @generated
	 */
	EClass getIIdElement();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.basics.IIdElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.fortiss.consistency.viewtypes.basics.IIdElement#getId()
	 * @see #getIIdElement()
	 * @generated
	 */
	EAttribute getIIdElement_Id();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.basics.INamedElement <em>INamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamed Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.basics.INamedElement
	 * @generated
	 */
	EClass getINamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.basics.INamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.consistency.viewtypes.basics.INamedElement#getName()
	 * @see #getINamedElement()
	 * @generated
	 */
	EAttribute getINamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.basics.INamedCommentedElement <em>INamed Commented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamed Commented Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.basics.INamedCommentedElement
	 * @generated
	 */
	EClass getINamedCommentedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.basics.INamedCommentedElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.fortiss.consistency.viewtypes.basics.INamedCommentedElement#getComment()
	 * @see #getINamedCommentedElement()
	 * @generated
	 */
	EAttribute getINamedCommentedElement_Comment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicsFactory getBasicsFactory();

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
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.basics.impl.IIdElementImpl <em>IId Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.basics.impl.IIdElementImpl
		 * @see org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl#getIIdElement()
		 * @generated
		 */
		EClass IID_ELEMENT = eINSTANCE.getIIdElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IID_ELEMENT__ID = eINSTANCE.getIIdElement_Id();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.basics.impl.INamedElementImpl <em>INamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.basics.impl.INamedElementImpl
		 * @see org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl#getINamedElement()
		 * @generated
		 */
		EClass INAMED_ELEMENT = eINSTANCE.getINamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INAMED_ELEMENT__NAME = eINSTANCE.getINamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl <em>INamed Commented Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl
		 * @see org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl#getINamedCommentedElement()
		 * @generated
		 */
		EClass INAMED_COMMENTED_ELEMENT = eINSTANCE.getINamedCommentedElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INAMED_COMMENTED_ELEMENT__COMMENT = eINSTANCE.getINamedCommentedElement_Comment();

	}

} //BasicsPackage
