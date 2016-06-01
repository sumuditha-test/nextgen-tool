/**
 */
package esb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esb.Lifeline#getInMessage <em>In Message</em>}</li>
 *   <li>{@link esb.Lifeline#getOutMessage <em>Out Message</em>}</li>
 *   <li>{@link esb.Lifeline#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see esb.EsbPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends Element {
	/**
	 * Returns the value of the '<em><b>In Message</b></em>' reference list.
	 * The list contents are of type {@link esb.message}.
	 * It is bidirectional and its opposite is '{@link esb.message#getInLifeLine <em>In Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Message</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Message</em>' reference list.
	 * @see esb.EsbPackage#getLifeline_InMessage()
	 * @see esb.message#getInLifeLine
	 * @model opposite="inLifeLine"
	 * @generated
	 */
	EList<message> getInMessage();

	/**
	 * Returns the value of the '<em><b>Out Message</b></em>' containment reference list.
	 * The list contents are of type {@link esb.message}.
	 * It is bidirectional and its opposite is '{@link esb.message#getOutLifeLine <em>Out Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Message</em>' containment reference list.
	 * @see esb.EsbPackage#getLifeline_OutMessage()
	 * @see esb.message#getOutLifeLine
	 * @model opposite="outLifeLine" containment="true"
	 * @generated
	 */
	EList<message> getOutMessage();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see esb.EsbPackage#getLifeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esb.Lifeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Lifeline
