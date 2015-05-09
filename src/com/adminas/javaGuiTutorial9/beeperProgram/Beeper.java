package com.adminas.javaGuiTutorial9.beeperProgram;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This is main class
 * 
 * @author Adminas
 *
 */
public class Beeper extends JFrame {

	JButton button;
	JLabel label;
	int counter = 0, x = 0;
	String s;

	public Beeper() {
		setLayout(new FlowLayout());
		button = new JButton("CLICK FOR SOUND");
		add(button);

		label = new JLabel("");
		add(label);

		Event e = new Event();
		button.addActionListener(e);

	}

	public class Event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			counter++;
			if (x == 0) {
				s = "time";
			} else if (x == 1) {
				s = "times";
			}
			label.setText("You've clicked " + counter + " " + s);
			x = 1;
		}
	}

	/**
	 * random method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Beeper gui = new Beeper();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setSize(300, 200);
		gui.setVisible(true);
		gui.setTitle("Beeper");
	}
}
