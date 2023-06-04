package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewGui extends JFrame{
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	JPanel p3= new JPanel();
		public ViewGui() {
			super("SaleManagementSystem");
			p2.add(new JLabel("Welcome to java hamburger store"));
			p1.add(new JLabel("name: "));
			p1.add(new JLabel("phonenumber: "));
			p1.add(new JLabel("hamburger: "));
			p1.add(new JLabel("juice: "));
			p1.add(new JLabel("total cost: "));

			
			
			Container cp= getContentPane();
			cp.add(p2, BorderLayout.NORTH);
			cp.add(p1, BorderLayout.CENTER);
			cp.add(p3, BorderLayout.SOUTH);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(300, 700);
			setVisible(true);
		}
	}