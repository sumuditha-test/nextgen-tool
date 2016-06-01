package esb.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import esb.ESBRoot;
import esb.EsbPackage;
import esb.diagram.edit.parts.ElementEditPart;
import esb.diagram.edit.parts.LifelineEditPart;
import esb.diagram.edit.parts.LifelineNameEditPart;
import esb.diagram.edit.parts.MessageEditPart;
import esb.diagram.edit.parts.MessageNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class NextGenESBVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.wso2.developerstudio.eclipse.nextgen.esb.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ElementEditPart.MODEL_ID.equals(view.getType())) {
				return ElementEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return esb.diagram.part.NextGenESBVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				NextGenESBDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EsbPackage.eINSTANCE.getESBRoot().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ESBRoot) domainElement)) {
			return ElementEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = esb.diagram.part.NextGenESBVisualIDRegistry.getModelID(containerView);
		if (!ElementEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ElementEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = esb.diagram.part.NextGenESBVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ElementEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ElementEditPart.VISUAL_ID:
			if (EsbPackage.eINSTANCE.getLifeline().isSuperTypeOf(domainElement.eClass())) {
				return LifelineEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = esb.diagram.part.NextGenESBVisualIDRegistry.getModelID(containerView);
		if (!ElementEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ElementEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = esb.diagram.part.NextGenESBVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ElementEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ElementEditPart.VISUAL_ID:
			if (LifelineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LifelineEditPart.VISUAL_ID:
			if (LifelineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageEditPart.VISUAL_ID:
			if (MessageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EsbPackage.eINSTANCE.getmessage().isSuperTypeOf(domainElement.eClass())) {
			return MessageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ESBRoot element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ElementEditPart.VISUAL_ID:
			return false;
		case LifelineEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return esb.diagram.part.NextGenESBVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return esb.diagram.part.NextGenESBVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return esb.diagram.part.NextGenESBVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return esb.diagram.part.NextGenESBVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return esb.diagram.part.NextGenESBVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return esb.diagram.part.NextGenESBVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
