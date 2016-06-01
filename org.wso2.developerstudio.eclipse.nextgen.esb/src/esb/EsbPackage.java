/**
 */
package esb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see esb.EsbFactory
 * @model kind="package"
 * @generated
 */
public interface EsbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.wso2.com/nextgen/esb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsbPackage eINSTANCE = esb.impl.EsbPackageImpl.init();

	/**
	 * The meta object id for the '{@link esb.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esb.impl.ElementImpl
	 * @see esb.impl.EsbPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esb.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esb.impl.LifelineImpl
	 * @see esb.impl.EsbPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 0;

	/**
	 * The feature id for the '<em><b>In Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__IN_MESSAGE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__OUT_MESSAGE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link esb.impl.messageImpl <em>message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esb.impl.messageImpl
	 * @see esb.impl.EsbPackageImpl#getmessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>In Life Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__IN_LIFE_LINE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Life Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OUT_LIFE_LINE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link esb.impl.ESBRootImpl <em>ESB Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esb.impl.ESBRootImpl
	 * @see esb.impl.EsbPackageImpl#getESBRoot()
	 * @generated
	 */
	int ESB_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Life Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_ROOT__LIFE_LINE = 0;

	/**
	 * The number of structural features of the '<em>ESB Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ESB Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link esb.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see esb.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the reference list '{@link esb.Lifeline#getInMessage <em>In Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Message</em>'.
	 * @see esb.Lifeline#getInMessage()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_InMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link esb.Lifeline#getOutMessage <em>Out Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Message</em>'.
	 * @see esb.Lifeline#getOutMessage()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_OutMessage();

	/**
	 * Returns the meta object for the attribute '{@link esb.Lifeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esb.Lifeline#getName()
	 * @see #getLifeline()
	 * @generated
	 */
	EAttribute getLifeline_Name();

	/**
	 * Returns the meta object for class '{@link esb.message <em>message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>message</em>'.
	 * @see esb.message
	 * @generated
	 */
	EClass getmessage();

	/**
	 * Returns the meta object for the reference '{@link esb.message#getInLifeLine <em>In Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Life Line</em>'.
	 * @see esb.message#getInLifeLine()
	 * @see #getmessage()
	 * @generated
	 */
	EReference getmessage_InLifeLine();

	/**
	 * Returns the meta object for the container reference '{@link esb.message#getOutLifeLine <em>Out Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Out Life Line</em>'.
	 * @see esb.message#getOutLifeLine()
	 * @see #getmessage()
	 * @generated
	 */
	EReference getmessage_OutLifeLine();

	/**
	 * Returns the meta object for the attribute '{@link esb.message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esb.message#getName()
	 * @see #getmessage()
	 * @generated
	 */
	EAttribute getmessage_Name();

	/**
	 * Returns the meta object for class '{@link esb.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see esb.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link esb.ESBRoot <em>ESB Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESB Root</em>'.
	 * @see esb.ESBRoot
	 * @generated
	 */
	EClass getESBRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link esb.ESBRoot#getLifeLine <em>Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Life Line</em>'.
	 * @see esb.ESBRoot#getLifeLine()
	 * @see #getESBRoot()
	 * @generated
	 */
	EReference getESBRoot_LifeLine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EsbFactory getEsbFactory();

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
		 * The meta object literal for the '{@link esb.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esb.impl.LifelineImpl
		 * @see esb.impl.EsbPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>In Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__IN_MESSAGE = eINSTANCE.getLifeline_InMessage();

		/**
		 * The meta object literal for the '<em><b>Out Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__OUT_MESSAGE = eINSTANCE.getLifeline_OutMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFELINE__NAME = eINSTANCE.getLifeline_Name();

		/**
		 * The meta object literal for the '{@link esb.impl.messageImpl <em>message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esb.impl.messageImpl
		 * @see esb.impl.EsbPackageImpl#getmessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getmessage();

		/**
		 * The meta object literal for the '<em><b>In Life Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__IN_LIFE_LINE = eINSTANCE.getmessage_InLifeLine();

		/**
		 * The meta object literal for the '<em><b>Out Life Line</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OUT_LIFE_LINE = eINSTANCE.getmessage_OutLifeLine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getmessage_Name();

		/**
		 * The meta object literal for the '{@link esb.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esb.impl.ElementImpl
		 * @see esb.impl.EsbPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link esb.impl.ESBRootImpl <em>ESB Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esb.impl.ESBRootImpl
		 * @see esb.impl.EsbPackageImpl#getESBRoot()
		 * @generated
		 */
		EClass ESB_ROOT = eINSTANCE.getESBRoot();

		/**
		 * The meta object literal for the '<em><b>Life Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESB_ROOT__LIFE_LINE = eINSTANCE.getESBRoot_LifeLine();

	}

} //EsbPackage
