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
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;

public class GUIControls extends JFrame implements IGUIControls {
	private JTextField textField;
	
	private int posX=0,posY=0;

	public GUIControls() {
		getContentPane().setBackground(Color.WHITE);
		
		getContentPane().setLayout(new CardLayout(0, 0));
		
		setTitle("Sorting Algorithm Visualiser");
		
		getContentPane().setPreferredSize(new Dimension(600, 400));
		JPanel rootPanel = new JPanel();
		rootPanel.setBorder(new LineBorder(new Color(0, 0, 255), 1, true));
		rootPanel.setBackground(Color.WHITE);
		getContentPane().add(rootPanel, "name_25253210045969");
		rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.X_AXIS));
		rootPanel.setPreferredSize(new Dimension(600, 400));
		
		JPanel menuLeft = new JPanel();
		rootPanel.add(menuLeft);
		menuLeft.setBackground(Color.WHITE);
		menuLeft.setLayout(null);
		int menuWidth = (600/3);
		menuLeft.setPreferredSize(new Dimension(menuWidth, rootPanel.getHeight()));
		
		JButton button = new JButton("Insertion Sort");
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(0, 36, 149, 40);
		menuLeft.add(button);
		
		JPanel contentRight = new JPanel();
		rootPanel.add(contentRight);
		contentRight.setBackground(Color.WHITE);
		int contentWidth = 2*(600/3);
		contentRight.setPreferredSize(new Dimension(contentWidth, rootPanel.getHeight()));
		contentRight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
                cardLayout.show(getContentPane(), "name_36737116256884");
			}
		});
		contentRight.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 66, 217, 28);
		contentRight.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnTypeNumbersSeperated = new JTextPane();
		txtpnTypeNumbersSeperated.setText("Type numbers seperated by commas");
		txtpnTypeNumbersSeperated.setBounds(37, 30, 217, 24);
		contentRight.add(txtpnTypeNumbersSeperated);
		
		setUndecorated(true);
		addMouseListener(new MouseAdapter()
		{
		   public void mousePressed(MouseEvent e)
		   {
		      posX=e.getX();
		      posY=e.getY();
		   }
		});
		
		addMouseMotionListener(new MouseAdapter()
		{
		     public void mouseDragged(MouseEvent evt)
		     {
				//sets frame position when mouse dragged			
				setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
							
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