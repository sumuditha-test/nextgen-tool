package esb.diagram.part;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.MultiPageEditorPart;

public class NextGenEsbMultiPageEditor extends MultiPageEditorPart implements
IGotoMarker,IDiagramWorkbenchPart{

	@Override
	public IDiagramGraphicalViewer getDiagramGraphicalViewer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDiagramEditDomain getDiagramEditDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Diagram getDiagram() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagramEditPart getDiagramEditPart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void gotoMarker(IMarker arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createPages() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSave(IProgressMonitor arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
