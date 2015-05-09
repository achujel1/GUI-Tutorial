package com.adminas.javaGuiTutorial5.multipleEventHandlers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Events extends JFrame {
	private JLabel label1;
	private JButton button1;
	private JLabel label2;
	private JButton button2;
	private int x = 0, y = 0;

	public Events() {
		setLayout(new FlowLayout());

		button1 = new JButton("Click for next");
		add(button1);

		label1 = new JLabel("");
		add(label1);

		button2 = new JButton("Click for more text");
		add(button2);

		label2 = new JLabel("");
		add(label2);

		Event e = new Event();
		button1.addActionListener(e);

		Event2 ev = new Event2();
		button2.addActionListener(ev);

	}

	public class Event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (x == 0) {
				label1.setText("Now you can see words here");
				x = 1;
			} else if (x == 1) {
				label1.setText("");
				x = 0;
			}
		}
	}

	public class Event2 implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			if (y == 0) {
				label2.setText("This is label2's text");
				y = 1;
			} else if (y == 1) {
				label2.setText("");
				y = 0;
			}
		}
	}

	public static void main(String[] args) {
		Events gui = new Events();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setTitle("Event handling");
		gui.setSize(200, 100);
		gui.setVisible(true);

	}
}
