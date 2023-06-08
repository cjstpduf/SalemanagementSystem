package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HighschoolGui 	extends JPanel{
	WindowFrame frame;
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	JPanel p3= new JPanel();
		public HighschoolGui(WindowFrame frame) {
			this.frame = frame;

			p2.add(new JLabel("Welcome to java hamburger store"));
			p1.add(new JButton("password : "));
			p1.add(new JTextArea("            "));
			p1.add(new JButton("grade and classroom number: "));
			p1.add(new JTextArea("            "));
			p1.add(new JButton("do you have email? (y/n)"));
			p1.add(new JTextArea("            "));
			p1.add(new JButton("your name: "));
			p1.add(new JTextArea("            "));
			p1.add(new JButton("your phonenumber: "));
			p1.add(new JTextArea("            "));
			p1.add(new JButton("select hamburger: "));
			p1.add(new JTextArea("            "));
			p1.add(new JButton("select juice: "));
			p1.add(new JTextArea("            "));

			
			
			

			this.add(p2, BorderLayout.NORTH);
			this.add(p1, BorderLayout.CENTER);
			this.add(p3, BorderLayout.SOUTH);

		}
	}
