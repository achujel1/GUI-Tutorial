package com.adminas.javaGuiTutorial2.addingObjectsToTheWindow;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FirstGui extends JFrame {
	private JLabel label;
	private JButton button;
	private JTextField textfield;

	public FirstGui() {
		setLayout(new FlowLayout());

		label = new JLabel("Hi, I'm a label");
		add(label);

		textfield = new JTextField(15);
		add(textfield);

		button = new JButton("CLICK ME!!");
		add(button);
	}

	public static void main(String[] args) {
		FirstGui firstGui = new FirstGui();
		firstGui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		firstGui.setVisible(true);
		firstGui.setSize(400, 400);
		firstGui.setTitle("Title");
	}

}
