/**
 */
package org.fortiss.consistency.viewtypes.dictionary;

import org.fortiss.consistency.viewtypes.types.IValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Term Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry#getAbsoluteTerm <em>Absolute Term</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage#getAbsoluteTermEntry()
 * @model
 * @generated
 */
public interface AbsoluteTermEntry extends DictionaryElement {
	/**
	 * Returns the value of the '<em><b>Absolute Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Term</em>' containment reference.
	 * @see #setAbsoluteTerm(IValue)
	 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage#getAbsoluteTermEntry_AbsoluteTerm()
	 * @model containment="true"
	 * @generated
	 */
	IValue getAbsoluteTerm();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry#getAbsoluteTerm <em>Absolute Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Term</em>' containment reference.
	 * @see #getAbsoluteTerm()
	 * @generated
	 */
	void setAbsoluteTerm(IValue value);

} // AbsoluteTermEntry
