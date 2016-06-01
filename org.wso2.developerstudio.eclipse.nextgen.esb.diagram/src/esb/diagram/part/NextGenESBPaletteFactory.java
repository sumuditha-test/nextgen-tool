
package esb.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import esb.diagram.providers.NextGenESBElementTypes;

/**
 * @generated
 */
public class NextGenESBPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEsb1Group());
	}

	/**
	* Creates "esb" palette tool group
	* @generated
	*/
	private PaletteContainer createEsb1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Esb1Group_title);
		paletteContainer.setId("createEsb1Group"); //$NON-NLS-1$
		paletteContainer.add(createLifeline1CreationTool());
		paletteContainer.add(createMessage2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createLifeline1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Lifeline1CreationTool_title,
				Messages.Lifeline1CreationTool_desc, Collections.singletonList(NextGenESBElementTypes.Lifeline_2001));
		entry.setId("createLifeline1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NextGenESBElementTypes.getImageDescriptor(NextGenESBElementTypes.Lifeline_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMessage2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Message2CreationTool_title,
				Messages.Message2CreationTool_desc, Collections.singletonList(NextGenESBElementTypes.Message_4001));
		entry.setId("createMessage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NextGenESBElementTypes.getImageDescriptor(NextGenESBElementTypes.Message_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
