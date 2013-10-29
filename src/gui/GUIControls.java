package gui;

import javax.swing.JFrame;

public class GUIControls implements IGUIControls{

	@Override
	public void createGUI() {
		JFrame frame = new JFrame("Sorting Algorithm Visualiser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		
		
	}
}
