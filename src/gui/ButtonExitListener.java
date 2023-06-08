package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExitListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonExitListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		String command = e.getActionCommand();
	    System.exit(0);
	    frame.dispose();
		
	    }
		
}



