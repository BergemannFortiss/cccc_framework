/**
 */
package org.fortiss.consistency.viewtypes.basics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INamed Commented Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.basics.INamedCommentedElement#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.basics.BasicsPackage#getINamedCommentedElement()
 * @model abstract="true"
 * @generated
 */
public interface INamedCommentedElement extends INamedElement {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.fortiss.consistency.viewtypes.basics.BasicsPackage#getINamedCommentedElement_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.basics.INamedCommentedElement#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // INamedCommentedElement
