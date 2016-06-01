package esb.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import esb.EsbPackage;
import esb.diagram.edit.parts.ElementEditPart;
import esb.diagram.edit.parts.LifelineEditPart;
import esb.diagram.edit.parts.MessageEditPart;
import esb.diagram.part.NextGenESBDiagramEditorPlugin;

/**
 * @generated
 */
public class NextGenESBElementTypes {

	/**
	* @generated
	*/
	private NextGenESBElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			NextGenESBDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ESBRoot_1000 = getElementType(
			"org.wso2.developerstudio.eclipse.nextgen.esb.diagram.ESBRoot_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Lifeline_2001 = getElementType(
			"org.wso2.developerstudio.eclipse.nextgen.esb.diagram.Lifeline_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Message_4001 = getElementType(
			"org.wso2.developerstudio.eclipse.nextgen.esb.diagram.Message_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ESBRoot_1000, EsbPackage.eINSTANCE.getESBRoot());

			elements.put(Lifeline_2001, EsbPackage.eINSTANCE.getLifeline());

			elements.put(Message_4001, EsbPackage.eINSTANCE.getmessage());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ESBRoot_1000);
			KNOWN_ELEMENT_TYPES.add(Lifeline_2001);
			KNOWN_ELEMENT_TYPES.add(Message_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ElementEditPart.VISUAL_ID:
			return ESBRoot_1000;
		case LifelineEditPart.VISUAL_ID:
			return Lifeline_2001;
		case MessageEditPart.VISUAL_ID:
			return Message_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return esb.diagram.providers.NextGenESBElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return esb.diagram.providers.NextGenESBElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return esb.diagram.providers.NextGenESBElementTypes.getElement(elementTypeAdapter);
		}
	};

}
