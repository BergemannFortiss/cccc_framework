/**
 */
package org.fortiss.consistency.viewtypes.types;

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
 * @see org.fortiss.consistency.viewtypes.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/viewtypes/types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.viewtypes.types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.ITypeImpl <em>IType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.ITypeImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getIType()
	 * @generated
	 */
	int ITYPE = 0;

	/**
	 * The number of structural features of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeBooleanImpl <em>Type Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypeBooleanImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeBoolean()
	 * @generated
	 */
	int TYPE_BOOLEAN = 1;

	/**
	 * The number of structural features of the '<em>Type Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BOOLEAN_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_BOOLEAN_OPERATION_COUNT = ITYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeIntegerImpl <em>Type Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypeIntegerImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeInteger()
	 * @generated
	 */
	int TYPE_INTEGER = 2;

	/**
	 * The number of structural features of the '<em>Type Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INTEGER_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INTEGER_OPERATION_COUNT = ITYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeDoubleImpl <em>Type Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypeDoubleImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeDouble()
	 * @generated
	 */
	int TYPE_DOUBLE = 3;

	/**
	 * The number of structural features of the '<em>Type Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DOUBLE_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DOUBLE_OPERATION_COUNT = ITYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeStringImpl <em>Type String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypeStringImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeString()
	 * @generated
	 */
	int TYPE_STRING = 4;

	/**
	 * The number of structural features of the '<em>Type String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STRING_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STRING_OPERATION_COUNT = ITYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.IValueImpl <em>IValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.IValueImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getIValue()
	 * @generated
	 */
	int IVALUE = 5;

	/**
	 * The number of structural features of the '<em>IValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueBooleanImpl <em>Value Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.ValueBooleanImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueBoolean()
	 * @generated
	 */
	int VALUE_BOOLEAN = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BOOLEAN__VALUE = IVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BOOLEAN_FEATURE_COUNT = IVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_BOOLEAN_OPERATION_COUNT = IVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueIntegerImpl <em>Value Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.ValueIntegerImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueInteger()
	 * @generated
	 */
	int VALUE_INTEGER = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTEGER__VALUE = IVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTEGER_FEATURE_COUNT = IVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTEGER_OPERATION_COUNT = IVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueDoubleImpl <em>Value Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.ValueDoubleImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueDouble()
	 * @generated
	 */
	int VALUE_DOUBLE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE__VALUE = IVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE_FEATURE_COUNT = IVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOUBLE_OPERATION_COUNT = IVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueStringImpl <em>Value String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.ValueStringImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueString()
	 * @generated
	 */
	int VALUE_STRING = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRING__VALUE = IVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRING_FEATURE_COUNT = IVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRING_OPERATION_COUNT = IVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.types.impl.NoValueImpl <em>No Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.types.impl.NoValueImpl
	 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getNoValue()
	 * @generated
	 */
	int NO_VALUE = 10;

	/**
	 * The number of structural features of the '<em>No Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_VALUE_FEATURE_COUNT = IVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_VALUE_OPERATION_COUNT = IVALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.IType <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IType</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.IType
	 * @generated
	 */
	EClass getIType();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.TypeBoolean <em>Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Boolean</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.TypeBoolean
	 * @generated
	 */
	EClass getTypeBoolean();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.TypeInteger <em>Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Integer</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.TypeInteger
	 * @generated
	 */
	EClass getTypeInteger();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.TypeDouble <em>Type Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Double</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.TypeDouble
	 * @generated
	 */
	EClass getTypeDouble();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.TypeString <em>Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type String</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.TypeString
	 * @generated
	 */
	EClass getTypeString();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.IValue <em>IValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IValue</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.IValue
	 * @generated
	 */
	EClass getIValue();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.ValueBoolean <em>Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Boolean</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueBoolean
	 * @generated
	 */
	EClass getValueBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.types.ValueBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueBoolean#isValue()
	 * @see #getValueBoolean()
	 * @generated
	 */
	EAttribute getValueBoolean_Value();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.ValueInteger <em>Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Integer</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueInteger
	 * @generated
	 */
	EClass getValueInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.types.ValueInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueInteger#getValue()
	 * @see #getValueInteger()
	 * @generated
	 */
	EAttribute getValueInteger_Value();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.ValueDouble <em>Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Double</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueDouble
	 * @generated
	 */
	EClass getValueDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.types.ValueDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueDouble#getValue()
	 * @see #getValueDouble()
	 * @generated
	 */
	EAttribute getValueDouble_Value();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.ValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value String</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueString
	 * @generated
	 */
	EClass getValueString();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.types.ValueString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.ValueString#getValue()
	 * @see #getValueString()
	 * @generated
	 */
	EAttribute getValueString_Value();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.types.NoValue <em>No Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Value</em>'.
	 * @see org.fortiss.consistency.viewtypes.types.NoValue
	 * @generated
	 */
	EClass getNoValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.ITypeImpl <em>IType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.ITypeImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getIType()
		 * @generated
		 */
		EClass ITYPE = eINSTANCE.getIType();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeBooleanImpl <em>Type Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypeBooleanImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeBoolean()
		 * @generated
		 */
		EClass TYPE_BOOLEAN = eINSTANCE.getTypeBoolean();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeIntegerImpl <em>Type Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypeIntegerImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeInteger()
		 * @generated
		 */
		EClass TYPE_INTEGER = eINSTANCE.getTypeInteger();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeDoubleImpl <em>Type Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypeDoubleImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeDouble()
		 * @generated
		 */
		EClass TYPE_DOUBLE = eINSTANCE.getTypeDouble();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.TypeStringImpl <em>Type String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypeStringImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getTypeString()
		 * @generated
		 */
		EClass TYPE_STRING = eINSTANCE.getTypeString();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.IValueImpl <em>IValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.IValueImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getIValue()
		 * @generated
		 */
		EClass IVALUE = eINSTANCE.getIValue();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueBooleanImpl <em>Value Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.ValueBooleanImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueBoolean()
		 * @generated
		 */
		EClass VALUE_BOOLEAN = eINSTANCE.getValueBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_BOOLEAN__VALUE = eINSTANCE.getValueBoolean_Value();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueIntegerImpl <em>Value Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.ValueIntegerImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueInteger()
		 * @generated
		 */
		EClass VALUE_INTEGER = eINSTANCE.getValueInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_INTEGER__VALUE = eINSTANCE.getValueInteger_Value();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueDoubleImpl <em>Value Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.ValueDoubleImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueDouble()
		 * @generated
		 */
		EClass VALUE_DOUBLE = eINSTANCE.getValueDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_DOUBLE__VALUE = eINSTANCE.getValueDouble_Value();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.ValueStringImpl <em>Value String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.ValueStringImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getValueString()
		 * @generated
		 */
		EClass VALUE_STRING = eINSTANCE.getValueString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_STRING__VALUE = eINSTANCE.getValueString_Value();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.types.impl.NoValueImpl <em>No Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.types.impl.NoValueImpl
		 * @see org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl#getNoValue()
		 * @generated
		 */
		EClass NO_VALUE = eINSTANCE.getNoValue();

	}

} //TypesPackage
