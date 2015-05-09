package com.adminas.javaGuiTutorial18.JCheckBox;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class cbTutorial extends JFrame {

	JCheckBox show1, show2;
	JLabel label1, label2;

	public cbTutorial() {
		setLayout(new GridLayout(2, 2));

		label1 = new JLabel("nothing");
		add(label1);

		label2 = new JLabel("mroe nothign");
		add(label2);

		show1 = new JCheckBox("Show first label");
		add(show1);

		show2 = new JCheckBox("Show second label");
		add(show2);

		event e = new event();
		show1.addItemListener(e);
		show2.addItemListener(e);
	}

	public class event implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (show1.isSelected()) {
				label1.setText("You've pushed first checkbox");
			} else {
				label1.setText("");
			}

			if (show2.isSelected()) {
				label2.setText("You've pushed second checkbox");
			} else {
				label2.setText("");
			}
		}
	}

	public static void main(String[] args) {
		cbTutorial gui = new cbTutorial();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(300, 200);
		gui.setTitle("You name it");

	}
}
