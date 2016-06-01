package esb.diagram.edit.parts;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.linklf.labels.LinkLFResizableLabelLocator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.LineAttributes;

import esb.diagram.edit.policies.MessageItemSemanticEditPolicy;

/**
 * @generated
 */
public class MessageEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4001;

	/**
	* @generated
	*/
	public MessageEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MessageItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MessageNameEditPart) {
			((MessageNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureMessageNameFigure());
			
			Rectangle lableBounds = new Rectangle(getPrimaryShape().getBounds().x/2, getPrimaryShape().getBounds().y/2, getPrimaryShape().getFigureMessageNameFigure().getBounds().width, getPrimaryShape().getFigureMessageNameFigure().getBounds().height);
			
			
			
			((MessageNameEditPart) childEditPart).setLayoutConstraint(childEditPart, getPrimaryShape().getFigureMessageNameFigure(), new LinkLFResizableLabelLocator(getPrimaryShape(), lableBounds, ConnectionLocator.MIDDLE));
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MessageNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated NOT
	*/
	protected Connection createConnectionFigure() {
		MessageFigure figure = new MessageFigure();
		PolygonDecoration decoration = new PolygonDecoration();
		decoration.setScale(12, 4);
		decoration.setAlpha(250);
		decoration.setBackgroundColor(new Color(null, 50, 50, 50));
		decoration.setOutline(false);
		figure.setTargetDecoration(decoration);
		figure.setAlpha(150);
		figure.setLineWidthFloat(1.0f);
		figure.setBackgroundColor(new Color(null, 200, 0, 0));
		
		figure.getLayoutManager();

		// Need to execute this operation as a command.
		AbstractEMFOperation command = new AbstractEMFOperation(getEditingDomain(), "change-esb-link-routing-style") {
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				RoutingStyle style = (RoutingStyle) ((View) getModel())
						.getStyle(NotationPackage.Literals.ROUTING_STYLE);
				style.setRouting(Routing.RECTILINEAR_LITERAL);
				style.setRoundedBendpointsRadius(5);
				return Status.OK_STATUS;
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command, null, null);
		} catch (ExecutionException ex) {
			// Ignore.
		}
		return figure;
		// return new MessageFigure();
	}

	/**
	* @generated
	*/
	public MessageFigure getPrimaryShape() {
		return (MessageFigure) getFigure();
	}

	/**
	* @generated
	*/
	public class MessageFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageNameFigure;

		/**
		 * @generated
		 */
		public MessageFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMessageNameFigure = new WrappingLabel();

			fFigureMessageNameFigure.setText("");

			
			//Rectangle lableBounds = new Rectangle(this.getBounds().x/2, getParent().getBounds().y/2, fFigureMessageNameFigure.getBounds().width, fFigureMessageNameFigure.getBounds().height);
			
			//this.add(fFigureMessageNameFigure, new LinkLFResizableLabelLocator(getParent(), lableBounds, ConnectionLocator.MIDDLE));
			
			this.add(fFigureMessageNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageNameFigure() {
			return fFigureMessageNameFigure;
		}

	}

	@Override
	protected void refreshForegroundColor() {
		LineStyle style = (LineStyle) getPrimaryView().getStyle(NotationPackage.Literals.LINE_STYLE);
		if (style != null)
			setForegroundColor(new Color(null, 200, 0, 0));
	}

}
