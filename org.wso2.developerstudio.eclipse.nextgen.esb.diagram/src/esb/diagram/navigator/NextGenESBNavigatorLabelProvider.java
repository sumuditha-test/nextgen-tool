package esb.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import esb.diagram.edit.parts.ElementEditPart;
import esb.diagram.edit.parts.LifelineEditPart;
import esb.diagram.edit.parts.LifelineNameEditPart;
import esb.diagram.edit.parts.MessageEditPart;
import esb.diagram.edit.parts.MessageNameEditPart;
import esb.diagram.part.NextGenESBDiagramEditorPlugin;
import esb.diagram.part.NextGenESBVisualIDRegistry;
import esb.diagram.providers.NextGenESBElementTypes;
import esb.diagram.providers.NextGenESBParserProvider;

/**
 * @generated
 */
public class NextGenESBNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		NextGenESBDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		NextGenESBDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof NextGenESBNavigatorItem && !isOwnView(((NextGenESBNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof NextGenESBNavigatorGroup) {
			NextGenESBNavigatorGroup group = (NextGenESBNavigatorGroup) element;
			return NextGenESBDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof NextGenESBNavigatorItem) {
			NextGenESBNavigatorItem navigatorItem = (NextGenESBNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (NextGenESBVisualIDRegistry.getVisualID(view)) {
		case ElementEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.wso2.com/nextgen/esb?ESBRoot", //$NON-NLS-1$
					NextGenESBElementTypes.ESBRoot_1000);
		case LifelineEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.wso2.com/nextgen/esb?Lifeline", //$NON-NLS-1$
					NextGenESBElementTypes.Lifeline_2001);
		case MessageEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.wso2.com/nextgen/esb?message", //$NON-NLS-1$
					NextGenESBElementTypes.Message_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = NextGenESBDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && NextGenESBElementTypes.isKnownElementType(elementType)) {
			image = NextGenESBElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof NextGenESBNavigatorGroup) {
			NextGenESBNavigatorGroup group = (NextGenESBNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof NextGenESBNavigatorItem) {
			NextGenESBNavigatorItem navigatorItem = (NextGenESBNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (NextGenESBVisualIDRegistry.getVisualID(view)) {
		case ElementEditPart.VISUAL_ID:
			return getESBRoot_1000Text(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_2001Text(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getESBRoot_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getLifeline_2001Text(View view) {
		IParser parser = NextGenESBParserProvider.getParser(NextGenESBElementTypes.Lifeline_2001,
				view.getElement() != null ? view.getElement() : view,
				NextGenESBVisualIDRegistry.getType(LifelineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NextGenESBDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMessage_4001Text(View view) {
		IParser parser = NextGenESBParserProvider.getParser(NextGenESBElementTypes.Message_4001,
				view.getElement() != null ? view.getElement() : view,
				NextGenESBVisualIDRegistry.getType(MessageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			NextGenESBDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ElementEditPart.MODEL_ID.equals(NextGenESBVisualIDRegistry.getModelID(view));
	}

}
