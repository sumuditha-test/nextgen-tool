package esb.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import esb.diagram.providers.NextGenESBElementTypes;

/**
 * @generated
 */
public class MessageItemSemanticEditPolicy extends NextGenESBBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MessageItemSemanticEditPolicy() {
		super(NextGenESBElementTypes.Message_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
