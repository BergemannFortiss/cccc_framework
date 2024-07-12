/**
 */
package org.fortiss.consistency.viewtypes.dictionary;

import org.eclipse.emf.common.util.EList;

import org.fortiss.consistency.viewtypes.basics.IIdElement;
import org.fortiss.consistency.viewtypes.basics.INamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.dictionary.Dictionary#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends IIdElement, INamedElement {
	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.dictionary.DictionaryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage#getDictionary_ContainedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DictionaryElement> getContainedElements();

} // Dictionary
