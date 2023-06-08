package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EditGui extends JPanel{
	WindowFrame frame;
   JPanel p1= new JPanel();
   JPanel p2= new JPanel();
   JPanel p3= new JPanel();
      public EditGui(WindowFrame frame) {
    	  this.frame = frame;
    	 this.setLayout(new BorderLayout());
         p2.add(new JLabel("** menu edit ** "));
         p1.add(new JButton("1. edit name"));
         p1.add(new JTextField(15));
         p1.add(new JButton("2. edit phonenumber"));
         p1.add(new JTextField(15));
         p1.add(new JButton("3. edit hamburger"));
         p1.add(new JTextField(15));
         p1.add(new JButton("4. edit juice"));
         p1.add(new JTextField(15));


         this.add(p2, BorderLayout.NORTH);
         this.add(p1, BorderLayout.CENTER);
         this.add(p3, BorderLayout.SOUTH);

      }
   }