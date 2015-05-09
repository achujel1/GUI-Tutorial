package com.adminas.javaGuiTutorial4.eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Events extends JFrame {
	private JLabel label;
	private JButton button;

	public Events() {
		setLayout(new FlowLayout());

		button = new JButton("Click for next");
		add(button);

		label = new JLabel("");
		add(label);

		Event e = new Event();
		button.addActionListener(e);

	}

	public class Event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			label.setText("Now you can see words here");
		}
	}

	public static void main(String[] args) {
		Events gui = new Events();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setTitle("Event handling");
		gui.setSize(200,100);
		gui.setVisible(true);

	}
}
