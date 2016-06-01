package esb.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import esb.diagram.part.NextGenESBVisualIDRegistry;

/**
 * @generated
 */
public class NextGenESBNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof NextGenESBNavigatorItem) {
			NextGenESBNavigatorItem item = (NextGenESBNavigatorItem) element;
			return NextGenESBVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
