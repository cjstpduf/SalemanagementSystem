package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EditGui extends JFrame{
   JPanel p1= new JPanel();
   JPanel p2= new JPanel();
   JPanel p3= new JPanel();
      public EditGui() {
         super("SaleManagementSystem");
         p2.add(new JLabel("** menu edit ** "));
         p1.add(new JButton("1. edit name"));
         p1.add(new JTextField(15));
         p1.add(new JButton("2. edit phonenumber"));
         p1.add(new JTextField(15));
         p1.add(new JButton("3. edit hamburger"));
         p1.add(new JTextField(15));
         p1.add(new JButton("4. edit juice"));
         p1.add(new JTextField(15));

         
         Container cp= getContentPane();
         cp.add(p2, BorderLayout.NORTH);
         cp.add(p1, BorderLayout.CENTER);
         cp.add(p3, BorderLayout.SOUTH);

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(300, 700);
         setVisible(true);
      }
   }