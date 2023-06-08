package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class HighListener implements ActionListener {
	WindowFrame frame;
	
	public HighListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		HighschoolGui grade = new HighschoolGui(frame);
		frame.setupPanel(grade);
		
	}

}