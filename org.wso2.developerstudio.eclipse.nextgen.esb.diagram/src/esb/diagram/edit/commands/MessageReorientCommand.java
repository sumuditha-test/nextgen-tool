package esb.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import esb.Lifeline;
import esb.diagram.edit.policies.NextGenESBBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class MessageReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public MessageReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof esb.message) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Lifeline && newEnd instanceof Lifeline)) {
			return false;
		}
		Lifeline target = getLink().getInLifeLine();
		if (!(getLink().eContainer() instanceof Lifeline)) {
			return false;
		}
		Lifeline container = (Lifeline) getLink().eContainer();
		return NextGenESBBaseItemSemanticEditPolicy.getLinkConstraints().canExistMessage_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Lifeline && newEnd instanceof Lifeline)) {
			return false;
		}
		Lifeline source = getLink().getOutLifeLine();
		if (!(getLink().eContainer() instanceof Lifeline)) {
			return false;
		}
		Lifeline container = (Lifeline) getLink().eContainer();
		return NextGenESBBaseItemSemanticEditPolicy.getLinkConstraints().canExistMessage_4001(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setOutLifeLine(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setInLifeLine(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected esb.message getLink() {
		return (esb.message) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Lifeline getOldSource() {
		return (Lifeline) oldEnd;
	}

	/**
	* @generated
	*/
	protected Lifeline getNewSource() {
		return (Lifeline) newEnd;
	}

	/**
	* @generated
	*/
	protected Lifeline getOldTarget() {
		return (Lifeline) oldEnd;
	}

	/**
	* @generated
	*/
	protected Lifeline getNewTarget() {
		return (Lifeline) newEnd;
	}
}
