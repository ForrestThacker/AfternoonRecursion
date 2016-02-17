package math.view;
import javax.swing.JFrame;

import math.controller.RecursionController;
/**
 * 
 * @author ftha4681
 *
 */

public class RecursionFrame extends JFrame 
{
	private RecursionController baseController;
	private RecursionPanel basePanel;
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
	}
}
