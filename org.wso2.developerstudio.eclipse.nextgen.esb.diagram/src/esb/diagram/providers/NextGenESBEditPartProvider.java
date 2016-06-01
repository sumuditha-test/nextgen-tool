package esb.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import esb.diagram.edit.parts.ElementEditPart;
import esb.diagram.edit.parts.NextGenESBEditPartFactory;
import esb.diagram.part.NextGenESBVisualIDRegistry;

/**
 * @generated
 */
public class NextGenESBEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public NextGenESBEditPartProvider() {
		super(new NextGenESBEditPartFactory(), NextGenESBVisualIDRegistry.TYPED_INSTANCE, ElementEditPart.MODEL_ID);
	}

}
