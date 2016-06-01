/**
 */
package esb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESB Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esb.ESBRoot#getLifeLine <em>Life Line</em>}</li>
 * </ul>
 *
 * @see esb.EsbPackage#getESBRoot()
 * @model
 * @generated
 */
public interface ESBRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Life Line</b></em>' containment reference list.
	 * The list contents are of type {@link esb.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Life Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Line</em>' containment reference list.
	 * @see esb.EsbPackage#getESBRoot_LifeLine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lifeline> getLifeLine();

} // ESBRoot
