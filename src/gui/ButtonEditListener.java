package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonEditListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		EditGui edit = frame.getEdit();
		frame.setupPanel(edit);
		
	}

}