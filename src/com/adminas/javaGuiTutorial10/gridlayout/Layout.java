package com.adminas.javaGuiTutorial10.gridlayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Layout extends JFrame {
	JButton button1, button2, button3;
	JLabel label1, label2, label3;

	public Layout() {
		setLayout(new GridLayout(1, 6));

		button1 = new JButton("Button 1");
		add(button1);

		label1 = new JLabel("Label 1");
		add(label1);
		button2 = new JButton("Button 2");
		add(button2);

		label2 = new JLabel("Label 2");
		add(label2);
		button3 = new JButton("Button 3");
		add(button3);

		label3 = new JLabel("Label 3");
		add(label3);

	}

	public static void main(String[] args) {
		Layout asdf = new  Layout();
		asdf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		asdf.setSize(300,300);
		asdf.setTitle("Layout program");
		asdf.setVisible(true);
	}
}
