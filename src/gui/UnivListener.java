package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class UnivListener implements ActionListener {
	WindowFrame frame;
	
	public UnivListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		UniversityGui grade = new UniversityGui(frame);
		frame.setupPanel(grade);
		
	}

}