package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManagementGui extends JPanel{
	WindowFrame frame;
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	JPanel p3= new JPanel();
		public ManagementGui(WindowFrame frame) {
			this.frame = frame;
			this.setLayout(new BorderLayout());
			p2.add(new JLabel("Welcome to java hamburger store"));
			JButton button1 = new JButton("1.add burger");
			JButton button2 = new JButton("2.delete order history");
			JButton button3 = new JButton("3.edit order history");
			JButton button4= new JButton("4.view order history");
			JButton button5 = new JButton("5.exit");
			
			button5.addActionListener(new ButtonExitListener(frame));
			button1.addActionListener(new ButtonAddListener(frame));
	
			p3.add(new JLabel("select one number 1-5"));

			button3.addActionListener(new ButtonEditListener(frame));
			button4.addActionListener(new ButtonViewListener(frame));
			
			p1.add(button1);
			p1.add(button2);
			p1.add(button3);
			p1.add(button4);
			p1.add(button5);
			
			
			this.add(p1, BorderLayout.CENTER);
			this.add(p2, BorderLayout.NORTH);
			this.add(p3, BorderLayout.SOUTH);
			//cp.add(p2, BorderLayout.NORTH);
			//cp.add(p1, BorderLayout.CENTER);
			//cp.add(p3, BorderLayout.SOUTH);

		}
	}
