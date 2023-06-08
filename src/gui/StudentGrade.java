package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StudentGrade extends JPanel{
	WindowFrame frame;
	   JPanel p1= new JPanel();
	   JPanel p2= new JPanel();
	   JPanel p3= new JPanel();
	      public StudentGrade(WindowFrame frame) {
	    	  this.frame = frame;
	         p2.add(new JLabel("Welcome to java hamburger store"));
	         JButton button1 = new JButton("University student?");
	         JButton button2 = new JButton("HighSchool student?");
	         JButton button3 = new JButton("middleSchool student?");
	         JButton button4 = new JButton("ElementarySchool student?");
	         


			p1.add(button1);
			p1.add(button2);
			p1.add(button3);
			p1.add(button4);
	         
			button1.addActionListener(new UnivListener(frame));
			button2.addActionListener(new ElementListener(frame));
			button3.addActionListener(new MiddleListener(frame));
			button4.addActionListener(new HighListener(frame));

	         this.add(p2, BorderLayout.NORTH);
	         this.add(p1, BorderLayout.CENTER);
	         this.add(p3, BorderLayout.SOUTH);

	      }
	   }
