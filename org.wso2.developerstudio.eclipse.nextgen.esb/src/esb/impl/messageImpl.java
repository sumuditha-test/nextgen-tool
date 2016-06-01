/**
 */
package esb.impl;

import esb.EsbPackage;
import esb.Lifeline;
import esb.message;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esb.impl.messageImpl#getInLifeLine <em>In Life Line</em>}</li>
 *   <li>{@link esb.impl.messageImpl#getOutLifeLine <em>Out Life Line</em>}</li>
 *   <li>{@link esb.impl.messageImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class messageImpl extends ElementImpl implements message {
	/**
	 * The cached value of the '{@link #getInLifeLine() <em>In Life Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInLifeLine()
	 * @generated
	 * @ordered
	 */
	protected Lifeline inLifeLine;

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
	protected messageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getInLifeLine() {
		if (inLifeLine != null && inLifeLine.eIsProxy()) {
			InternalEObject oldInLifeLine = (InternalEObject)inLifeLine;
			inLifeLine = (Lifeline)eResolveProxy(oldInLifeLine);
			if (inLifeLine != oldInLifeLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.MESSAGE__IN_LIFE_LINE, oldInLifeLine, inLifeLine));
			}
		}
		return inLifeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetInLifeLine() {
		return inLifeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInLifeLine(Lifeline newInLifeLine, NotificationChain msgs) {
		Lifeline oldInLifeLine = inLifeLine;
		inLifeLine = newInLifeLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE__IN_LIFE_LINE, oldInLifeLine, newInLifeLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInLifeLine(Lifeline newInLifeLine) {
		if (newInLifeLine != inLifeLine) {
			NotificationChain msgs = null;
			if (inLifeLine != null)
				msgs = ((InternalEObject)inLifeLine).eInverseRemove(this, EsbPackage.LIFELINE__IN_MESSAGE, Lifeline.class, msgs);
			if (newInLifeLine != null)
				msgs = ((InternalEObject)newInLifeLine).eInverseAdd(this, EsbPackage.LIFELINE__IN_MESSAGE, Lifeline.class, msgs);
			msgs = basicSetInLifeLine(newInLifeLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE__IN_LIFE_LINE, newInLifeLine, newInLifeLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getOutLifeLine() {
		if (eContainerFeatureID() != EsbPackage.MESSAGE__OUT_LIFE_LINE) return null;
		return (Lifeline)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutLifeLine(Lifeline newOutLifeLine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOutLifeLine, EsbPackage.MESSAGE__OUT_LIFE_LINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutLifeLine(Lifeline newOutLifeLine) {
		if (newOutLifeLine != eInternalContainer() || (eContainerFeatureID() != EsbPackage.MESSAGE__OUT_LIFE_LINE && newOutLifeLine != null)) {
			if (EcoreUtil.isAncestor(this, newOutLifeLine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutLifeLine != null)
				msgs = ((InternalEObject)newOutLifeLine).eInverseAdd(this, EsbPackage.LIFELINE__OUT_MESSAGE, Lifeline.class, msgs);
			msgs = basicSetOutLifeLine(newOutLifeLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE__OUT_LIFE_LINE, newOutLifeLine, newOutLifeLine));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.MESSAGE__IN_LIFE_LINE:
				if (inLifeLine != null)
					msgs = ((InternalEObject)inLifeLine).eInverseRemove(this, EsbPackage.LIFELINE__IN_MESSAGE, Lifeline.class, msgs);
				return basicSetInLifeLine((Lifeline)otherEnd, msgs);
			case EsbPackage.MESSAGE__OUT_LIFE_LINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutLifeLine((Lifeline)otherEnd, msgs);
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
			case EsbPackage.MESSAGE__IN_LIFE_LINE:
				return basicSetInLifeLine(null, msgs);
			case EsbPackage.MESSAGE__OUT_LIFE_LINE:
				return basicSetOutLifeLine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EsbPackage.MESSAGE__OUT_LIFE_LINE:
				return eInternalContainer().eInverseRemove(this, EsbPackage.LIFELINE__OUT_MESSAGE, Lifeline.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.MESSAGE__IN_LIFE_LINE:
				if (resolve) return getInLifeLine();
				return basicGetInLifeLine();
			case EsbPackage.MESSAGE__OUT_LIFE_LINE:
				return getOutLifeLine();
			case EsbPackage.MESSAGE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.MESSAGE__IN_LIFE_LINE:
				setInLifeLine((Lifeline)newValue);
				return;
			case EsbPackage.MESSAGE__OUT_LIFE_LINE:
				setOutLifeLine((Lifeline)newValue);
				return;
			case EsbPackage.MESSAGE__NAME:
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
			case EsbPackage.MESSAGE__IN_LIFE_LINE:
				setInLifeLine((Lifeline)null);
				return;
			case EsbPackage.MESSAGE__OUT_LIFE_LINE:
				setOutLifeLine((Lifeline)null);
				return;
			case EsbPackage.MESSAGE__NAME:
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
			case EsbPackage.MESSAGE__IN_LIFE_LINE:
				return inLifeLine != null;
			case EsbPackage.MESSAGE__OUT_LIFE_LINE:
				return getOutLifeLine() != null;
			case EsbPackage.MESSAGE__NAME:
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

} //messageImpl
