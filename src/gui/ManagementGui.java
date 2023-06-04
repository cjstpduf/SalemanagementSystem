package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManagementGui extends JFrame{
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	JPanel p3= new JPanel();
		public ManagementGui() {
			super("SaleManagementSystem");
			p2.add(new JLabel("Welcome to java hamburger store"));
			p1.add(new JButton("1.add burger"));
			p1.add(new JButton("2.delete order history"));
			p1.add(new JButton("3.edit order history"));
			p1.add(new JButton("4.view order history"));
			p1.add(new JButton("5.exit"));
			p3.add(new JLabel("select one number 1-5"));
			
			
			
			Container cp= getContentPane();
			cp.add(p2, BorderLayout.NORTH);
			cp.add(p1, BorderLayout.CENTER);
			cp.add(p3, BorderLayout.SOUTH);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(700, 200);
			setVisible(true);
		}
	}
