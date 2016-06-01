/**
 */
package esb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esb.message#getInLifeLine <em>In Life Line</em>}</li>
 *   <li>{@link esb.message#getOutLifeLine <em>Out Life Line</em>}</li>
 *   <li>{@link esb.message#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see esb.EsbPackage#getmessage()
 * @model
 * @generated
 */
public interface message extends Element {
	/**
	 * Returns the value of the '<em><b>In Life Line</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link esb.Lifeline#getInMessage <em>In Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Life Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Life Line</em>' reference.
	 * @see #setInLifeLine(Lifeline)
	 * @see esb.EsbPackage#getmessage_InLifeLine()
	 * @see esb.Lifeline#getInMessage
	 * @model opposite="inMessage"
	 * @generated
	 */
	Lifeline getInLifeLine();

	/**
	 * Sets the value of the '{@link esb.message#getInLifeLine <em>In Life Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Life Line</em>' reference.
	 * @see #getInLifeLine()
	 * @generated
	 */
	void setInLifeLine(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Out Life Line</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link esb.Lifeline#getOutMessage <em>Out Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Life Line</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Life Line</em>' container reference.
	 * @see #setOutLifeLine(Lifeline)
	 * @see esb.EsbPackage#getmessage_OutLifeLine()
	 * @see esb.Lifeline#getOutMessage
	 * @model opposite="outMessage" transient="false"
	 * @generated
	 */
	Lifeline getOutLifeLine();

	/**
	 * Sets the value of the '{@link esb.message#getOutLifeLine <em>Out Life Line</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Life Line</em>' container reference.
	 * @see #getOutLifeLine()
	 * @generated
	 */
	void setOutLifeLine(Lifeline value);

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
	 * @see esb.EsbPackage#getmessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esb.message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // message
