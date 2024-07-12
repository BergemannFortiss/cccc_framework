/**
 */
package org.fortiss.consistency.viewtypes.geometryElements;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometryElements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/viewtypes/geometryElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.viewtypes.geometryElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometryElementsPackage eINSTANCE = org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__NAME = BasicsPackage.INAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__COMMENT = BasicsPackage.INAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__CONTAINED_ELEMENTS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl <em>Geometry Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getGeometryElement()
	 * @generated
	 */
	int GEOMETRY_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT__NAME = BasicsPackage.INAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT__COMMENT = BasicsPackage.INAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT__CONTAINED_ELEMENTS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT__WEIGHT = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT__ORIGIN = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT__MATERIALS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Geometry Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT_FEATURE_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Geometry Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_ELEMENT_OPERATION_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.PlaceholderElementImpl <em>Placeholder Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.PlaceholderElementImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getPlaceholderElement()
	 * @generated
	 */
	int PLACEHOLDER_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT__NAME = GEOMETRY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT__COMMENT = GEOMETRY_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT__CONTAINED_ELEMENTS = GEOMETRY_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT__WEIGHT = GEOMETRY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT__ORIGIN = GEOMETRY_ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT__MATERIALS = GEOMETRY_ELEMENT__MATERIALS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT__TYPE = GEOMETRY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Placeholder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT_FEATURE_COUNT = GEOMETRY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Placeholder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_ELEMENT_OPERATION_COUNT = GEOMETRY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.OriginImpl <em>Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.OriginImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getOrigin()
	 * @generated
	 */
	int ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__NAME = GEOMETRY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__COMMENT = GEOMETRY_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__CONTAINED_ELEMENTS = GEOMETRY_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__WEIGHT = GEOMETRY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__ORIGIN = GEOMETRY_ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__MATERIALS = GEOMETRY_ELEMENT__MATERIALS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__X = GEOMETRY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__Y = GEOMETRY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__Z = GEOMETRY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_FEATURE_COUNT = GEOMETRY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_OPERATION_COUNT = GEOMETRY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.SphereImpl <em>Sphere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.SphereImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getSphere()
	 * @generated
	 */
	int SPHERE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__NAME = GEOMETRY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__COMMENT = GEOMETRY_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__CONTAINED_ELEMENTS = GEOMETRY_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__WEIGHT = GEOMETRY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__ORIGIN = GEOMETRY_ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__MATERIALS = GEOMETRY_ELEMENT__MATERIALS;

	/**
	 * The feature id for the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__DIAMETER = GEOMETRY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FEATURE_COUNT = GEOMETRY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_OPERATION_COUNT = GEOMETRY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.CubeImpl <em>Cube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.CubeImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getCube()
	 * @generated
	 */
	int CUBE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__NAME = GEOMETRY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__COMMENT = GEOMETRY_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__CONTAINED_ELEMENTS = GEOMETRY_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__WEIGHT = GEOMETRY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__ORIGIN = GEOMETRY_ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__MATERIALS = GEOMETRY_ELEMENT__MATERIALS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE__LENGTH = GEOMETRY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_FEATURE_COUNT = GEOMETRY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_OPERATION_COUNT = GEOMETRY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.CuboidImpl <em>Cuboid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.CuboidImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getCuboid()
	 * @generated
	 */
	int CUBOID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__NAME = GEOMETRY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__COMMENT = GEOMETRY_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__CONTAINED_ELEMENTS = GEOMETRY_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__WEIGHT = GEOMETRY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__ORIGIN = GEOMETRY_ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__MATERIALS = GEOMETRY_ELEMENT__MATERIALS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__LENGTH = GEOMETRY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__WIDTH = GEOMETRY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID__HEIGHT = GEOMETRY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cuboid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID_FEATURE_COUNT = GEOMETRY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cuboid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBOID_OPERATION_COUNT = GEOMETRY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.PlaneImpl <em>Plane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.PlaneImpl
	 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getPlane()
	 * @generated
	 */
	int PLANE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__NAME = GEOMETRY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__COMMENT = GEOMETRY_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__CONTAINED_ELEMENTS = GEOMETRY_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__WEIGHT = GEOMETRY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__ORIGIN = GEOMETRY_ELEMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__MATERIALS = GEOMETRY_ELEMENT__MATERIALS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__LENGTH = GEOMETRY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__WIDTH = GEOMETRY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_FEATURE_COUNT = GEOMETRY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_OPERATION_COUNT = GEOMETRY_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.geometryElements.Geometry#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Geometry#getContainedElements()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_ContainedElements();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement <em>Geometry Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElement
	 * @generated
	 */
	EClass getGeometryElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getContainedElements()
	 * @see #getGeometryElement()
	 * @generated
	 */
	EReference getGeometryElement_ContainedElements();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getWeight()
	 * @see #getGeometryElement()
	 * @generated
	 */
	EAttribute getGeometryElement_Weight();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getOrigin()
	 * @see #getGeometryElement()
	 * @generated
	 */
	EReference getGeometryElement_Origin();

	/**
	 * Returns the meta object for the attribute list '{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Materials</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getMaterials()
	 * @see #getGeometryElement()
	 * @generated
	 */
	EAttribute getGeometryElement_Materials();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.PlaceholderElement <em>Placeholder Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.PlaceholderElement
	 * @generated
	 */
	EClass getPlaceholderElement();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.PlaceholderElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.PlaceholderElement#getType()
	 * @see #getPlaceholderElement()
	 * @generated
	 */
	EAttribute getPlaceholderElement_Type();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Origin
	 * @generated
	 */
	EClass getOrigin();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Origin#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Origin#getX()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_X();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Origin#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Origin#getY()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Origin#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Origin#getZ()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Z();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.Sphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Sphere
	 * @generated
	 */
	EClass getSphere();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Sphere#getDiameter <em>Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Sphere#getDiameter()
	 * @see #getSphere()
	 * @generated
	 */
	EAttribute getSphere_Diameter();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.Cube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Cube
	 * @generated
	 */
	EClass getCube();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Cube#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Cube#getLength()
	 * @see #getCube()
	 * @generated
	 */
	EAttribute getCube_Length();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.Cuboid <em>Cuboid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuboid</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Cuboid
	 * @generated
	 */
	EClass getCuboid();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Cuboid#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Cuboid#getLength()
	 * @see #getCuboid()
	 * @generated
	 */
	EAttribute getCuboid_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Cuboid#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Cuboid#getWidth()
	 * @see #getCuboid()
	 * @generated
	 */
	EAttribute getCuboid_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Cuboid#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Cuboid#getHeight()
	 * @see #getCuboid()
	 * @generated
	 */
	EAttribute getCuboid_Height();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.geometryElements.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Plane
	 * @generated
	 */
	EClass getPlane();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Plane#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Plane#getLength()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.geometryElements.Plane#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.Plane#getWidth()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Width();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometryElementsFactory getGeometryElementsFactory();

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
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__CONTAINED_ELEMENTS = eINSTANCE.getGeometry_ContainedElements();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl <em>Geometry Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getGeometryElement()
		 * @generated
		 */
		EClass GEOMETRY_ELEMENT = eINSTANCE.getGeometryElement();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_ELEMENT__CONTAINED_ELEMENTS = eINSTANCE.getGeometryElement_ContainedElements();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_ELEMENT__WEIGHT = eINSTANCE.getGeometryElement_Weight();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_ELEMENT__ORIGIN = eINSTANCE.getGeometryElement_Origin();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_ELEMENT__MATERIALS = eINSTANCE.getGeometryElement_Materials();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.PlaceholderElementImpl <em>Placeholder Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.PlaceholderElementImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getPlaceholderElement()
		 * @generated
		 */
		EClass PLACEHOLDER_ELEMENT = eINSTANCE.getPlaceholderElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEHOLDER_ELEMENT__TYPE = eINSTANCE.getPlaceholderElement_Type();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.OriginImpl <em>Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.OriginImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getOrigin()
		 * @generated
		 */
		EClass ORIGIN = eINSTANCE.getOrigin();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__X = eINSTANCE.getOrigin_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__Y = eINSTANCE.getOrigin_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__Z = eINSTANCE.getOrigin_Z();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.SphereImpl <em>Sphere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.SphereImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getSphere()
		 * @generated
		 */
		EClass SPHERE = eINSTANCE.getSphere();

		/**
		 * The meta object literal for the '<em><b>Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE__DIAMETER = eINSTANCE.getSphere_Diameter();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.CubeImpl <em>Cube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.CubeImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getCube()
		 * @generated
		 */
		EClass CUBE = eINSTANCE.getCube();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBE__LENGTH = eINSTANCE.getCube_Length();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.CuboidImpl <em>Cuboid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.CuboidImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getCuboid()
		 * @generated
		 */
		EClass CUBOID = eINSTANCE.getCuboid();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBOID__LENGTH = eINSTANCE.getCuboid_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBOID__WIDTH = eINSTANCE.getCuboid_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBOID__HEIGHT = eINSTANCE.getCuboid_Height();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.geometryElements.impl.PlaneImpl <em>Plane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.PlaneImpl
		 * @see org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementsPackageImpl#getPlane()
		 * @generated
		 */
		EClass PLANE = eINSTANCE.getPlane();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__LENGTH = eINSTANCE.getPlane_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__WIDTH = eINSTANCE.getPlane_Width();

	}

} //GeometryElementsPackage
