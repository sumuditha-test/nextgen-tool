package esb.diagram.providers;

import esb.diagram.part.NextGenESBDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = NextGenESBDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			NextGenESBDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
