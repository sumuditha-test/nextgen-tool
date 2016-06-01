package esb.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import esb.ESBRoot;
import esb.EsbPackage;
import esb.Lifeline;
import esb.diagram.edit.parts.ElementEditPart;
import esb.diagram.edit.parts.LifelineEditPart;
import esb.diagram.edit.parts.MessageEditPart;
import esb.diagram.providers.NextGenESBElementTypes;

/**
 * @generated
 */
public class NextGenESBDiagramUpdater {

	/**
	* @generated
	*/
	public static List<NextGenESBNodeDescriptor> getSemanticChildren(View view) {
		switch (NextGenESBVisualIDRegistry.getVisualID(view)) {
		case ElementEditPart.VISUAL_ID:
			return getESBRoot_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<NextGenESBNodeDescriptor> getESBRoot_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ESBRoot modelElement = (ESBRoot) view.getElement();
		LinkedList<NextGenESBNodeDescriptor> result = new LinkedList<NextGenESBNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLifeLine().iterator(); it.hasNext();) {
			Lifeline childElement = (Lifeline) it.next();
			int visualID = NextGenESBVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LifelineEditPart.VISUAL_ID) {
				result.add(new NextGenESBNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<NextGenESBLinkDescriptor> getContainedLinks(View view) {
		switch (NextGenESBVisualIDRegistry.getVisualID(view)) {
		case ElementEditPart.VISUAL_ID:
			return getESBRoot_1000ContainedLinks(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_2001ContainedLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<NextGenESBLinkDescriptor> getIncomingLinks(View view) {
		switch (NextGenESBVisualIDRegistry.getVisualID(view)) {
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_2001IncomingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<NextGenESBLinkDescriptor> getOutgoingLinks(View view) {
		switch (NextGenESBVisualIDRegistry.getVisualID(view)) {
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_2001OutgoingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NextGenESBLinkDescriptor> getESBRoot_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NextGenESBLinkDescriptor> getLifeline_2001ContainedLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		LinkedList<NextGenESBLinkDescriptor> result = new LinkedList<NextGenESBLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NextGenESBLinkDescriptor> getMessage_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NextGenESBLinkDescriptor> getLifeline_2001IncomingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NextGenESBLinkDescriptor> result = new LinkedList<NextGenESBLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NextGenESBLinkDescriptor> getMessage_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NextGenESBLinkDescriptor> getLifeline_2001OutgoingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		LinkedList<NextGenESBLinkDescriptor> result = new LinkedList<NextGenESBLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NextGenESBLinkDescriptor> getMessage_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<NextGenESBLinkDescriptor> getContainedTypeModelFacetLinks_message_4001(
			Lifeline container) {
		LinkedList<NextGenESBLinkDescriptor> result = new LinkedList<NextGenESBLinkDescriptor>();
		for (Iterator<?> links = container.getOutMessage().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof esb.message) {
				continue;
			}
			esb.message link = (esb.message) linkObject;
			if (MessageEditPart.VISUAL_ID != NextGenESBVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Lifeline dst = link.getInLifeLine();
			Lifeline src = link.getOutLifeLine();
			result.add(new NextGenESBLinkDescriptor(src, dst, link, NextGenESBElementTypes.Message_4001,
					MessageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NextGenESBLinkDescriptor> getIncomingTypeModelFacetLinks_message_4001(Lifeline target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NextGenESBLinkDescriptor> result = new LinkedList<NextGenESBLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EsbPackage.eINSTANCE.getmessage_InLifeLine()
					|| false == setting.getEObject() instanceof esb.message) {
				continue;
			}
			esb.message link = (esb.message) setting.getEObject();
			if (MessageEditPart.VISUAL_ID != NextGenESBVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Lifeline src = link.getOutLifeLine();
			result.add(new NextGenESBLinkDescriptor(src, target, link, NextGenESBElementTypes.Message_4001,
					MessageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<NextGenESBLinkDescriptor> getOutgoingTypeModelFacetLinks_message_4001(Lifeline source) {
		Lifeline container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Lifeline) {
				container = (Lifeline) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<NextGenESBLinkDescriptor> result = new LinkedList<NextGenESBLinkDescriptor>();
		for (Iterator<?> links = container.getOutMessage().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof esb.message) {
				continue;
			}
			esb.message link = (esb.message) linkObject;
			if (MessageEditPart.VISUAL_ID != NextGenESBVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Lifeline dst = link.getInLifeLine();
			Lifeline src = link.getOutLifeLine();
			if (src != source) {
				continue;
			}
			result.add(new NextGenESBLinkDescriptor(src, dst, link, NextGenESBElementTypes.Message_4001,
					MessageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<NextGenESBNodeDescriptor> getSemanticChildren(View view) {
			return NextGenESBDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<NextGenESBLinkDescriptor> getContainedLinks(View view) {
			return NextGenESBDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<NextGenESBLinkDescriptor> getIncomingLinks(View view) {
			return NextGenESBDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<NextGenESBLinkDescriptor> getOutgoingLinks(View view) {
			return NextGenESBDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
