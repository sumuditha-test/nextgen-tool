/**
 */
package esb.impl;

import esb.EsbPackage;
import esb.Lifeline;
import esb.message;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esb.impl.LifelineImpl#getInMessage <em>In Message</em>}</li>
 *   <li>{@link esb.impl.LifelineImpl#getOutMessage <em>Out Message</em>}</li>
 *   <li>{@link esb.impl.LifelineImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifelineImpl extends ElementImpl implements Lifeline {
	/**
	 * The cached value of the '{@link #getInMessage() <em>In Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<message> inMessage;

	/**
	 * The cached value of the '{@link #getOutMessage() <em>Out Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<message> outMessage;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<message> getInMessage() {
		if (inMessage == null) {
			inMessage = new EObjectWithInverseResolvingEList<message>(message.class, this, EsbPackage.LIFELINE__IN_MESSAGE, EsbPackage.MESSAGE__IN_LIFE_LINE);
		}
		return inMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<message> getOutMessage() {
		if (outMessage == null) {
			outMessage = new EObjectContainmentWithInverseEList<message>(message.class, this, EsbPackage.LIFELINE__OUT_MESSAGE, EsbPackage.MESSAGE__OUT_LIFE_LINE);
		}
		return outMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.LIFELINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.LIFELINE__IN_MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInMessage()).basicAdd(otherEnd, msgs);
			case EsbPackage.LIFELINE__OUT_MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutMessage()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.LIFELINE__IN_MESSAGE:
				return ((InternalEList<?>)getInMessage()).basicRemove(otherEnd, msgs);
			case EsbPackage.LIFELINE__OUT_MESSAGE:
				return ((InternalEList<?>)getOutMessage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.LIFELINE__IN_MESSAGE:
				return getInMessage();
			case EsbPackage.LIFELINE__OUT_MESSAGE:
				return getOutMessage();
			case EsbPackage.LIFELINE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.LIFELINE__IN_MESSAGE:
				getInMessage().clear();
				getInMessage().addAll((Collection<? extends message>)newValue);
				return;
			case EsbPackage.LIFELINE__OUT_MESSAGE:
				getOutMessage().clear();
				getOutMessage().addAll((Collection<? extends message>)newValue);
				return;
			case EsbPackage.LIFELINE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.LIFELINE__IN_MESSAGE:
				getInMessage().clear();
				return;
			case EsbPackage.LIFELINE__OUT_MESSAGE:
				getOutMessage().clear();
				return;
			case EsbPackage.LIFELINE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.LIFELINE__IN_MESSAGE:
				return inMessage != null && !inMessage.isEmpty();
			case EsbPackage.LIFELINE__OUT_MESSAGE:
				return outMessage != null && !outMessage.isEmpty();
			case EsbPackage.LIFELINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LifelineImpl
