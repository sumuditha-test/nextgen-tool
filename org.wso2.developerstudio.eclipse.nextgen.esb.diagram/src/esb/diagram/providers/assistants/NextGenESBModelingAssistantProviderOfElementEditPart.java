package esb.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import esb.diagram.providers.NextGenESBElementTypes;
import esb.diagram.providers.NextGenESBModelingAssistantProvider;

/**
 * @generated
 */
public class NextGenESBModelingAssistantProviderOfElementEditPart extends NextGenESBModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(NextGenESBElementTypes.Lifeline_2001);
		return types;
	}

}
