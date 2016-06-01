package esb.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import esb.EsbPackage;
import esb.diagram.edit.parts.LifelineNameEditPart;
import esb.diagram.edit.parts.MessageNameEditPart;
import esb.diagram.parsers.MessageFormatParser;
import esb.diagram.part.NextGenESBVisualIDRegistry;

/**
 * @generated
 */
public class NextGenESBParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser lifelineName_5001Parser;

	/**
	* @generated
	*/
	private IParser getLifelineName_5001Parser() {
		if (lifelineName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE.getLifeline_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lifelineName_5001Parser = parser;
		}
		return lifelineName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser messageName_6001Parser;

	/**
	* @generated
	*/
	private IParser getMessageName_6001Parser() {
		if (messageName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE.getmessage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_6001Parser = parser;
		}
		return messageName_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LifelineNameEditPart.VISUAL_ID:
			return getLifelineName_5001Parser();
		case MessageNameEditPart.VISUAL_ID:
			return getMessageName_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(NextGenESBVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(NextGenESBVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (NextGenESBElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
