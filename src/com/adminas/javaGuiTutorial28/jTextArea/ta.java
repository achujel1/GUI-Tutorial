package com.adminas.javaGuiTutorial28.jTextArea;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ta extends JFrame {
	JTextArea textarea;
	JButton button;
	JLabel label;

	public ta() {
		setLayout(new FlowLayout());
		textarea = new JTextArea("This is something in the text area", 5, 30);
		add(textarea);

		button = new JButton("Click here to put text into label");
		add(button);

		label = new JLabel("");
		add(label);

		event e = new event();
		button.addActionListener(e);
	}

	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String text = textarea.getText();
			if (text == null ? "" == null : text.equals("")) {
				label.setText("Please enter some text");
			} else {
				label.setText(text);
			}
		}
	}

	public static void main(String[] args) {
		ta gui = new ta();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(400, 200);
		gui.setVisible(true);
	}

}
