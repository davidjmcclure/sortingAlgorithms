package gui;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUIControls extends JFrame implements IGUIControls {
	private JTextField textField;

	public GUIControls() {
		
		getContentPane().setLayout(new CardLayout(0, 0));
	
		JPanel panel = new JPanel();
		getContentPane().add(panel, "name_36737116256884");
		
		setTitle("Sorting Algorithm Visualiser");
		panel.setLayout(null);
		panel.setSize(600, 400);
		
		JButton InsertionSortButton = new JButton("Insertion Sort");
		InsertionSortButton.setBounds(20, 30, 129, 28);
		panel.add(InsertionSortButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                cardLayout.show(getContentPane(), "name_36737116256884");
			}
		});
		getContentPane().add(panel_1, "name_36737137352442");
		panel_1.setLayout(null);
		
		Color backgroundColor = panel.getBackground();
		
		textField = new JTextField();
		textField.setBounds(37, 66, 217, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnTypeNumbersSeperated = new JTextPane();
		txtpnTypeNumbersSeperated.setText("Type numbers seperated by commas");
		txtpnTypeNumbersSeperated.setBounds(37, 30, 217, 24);
		panel_1.add(txtpnTypeNumbersSeperated);
		txtpnTypeNumbersSeperated.setBackground(backgroundColor);
		
		InsertionSortButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                cardLayout.show(getContentPane(), "name_36737137352442");
			}
		});

	}

	public void runGUI(){
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	            GUIControls guiControls = new GUIControls();
	            guiControls.pack();
	            guiControls.setLocationRelativeTo(null);
	            guiControls.setSize(600, 400);
	            guiControls.setVisible(true);
	        }
	    });
	}
}