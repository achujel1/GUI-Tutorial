package com.adminas.javaGuiTutorial35.basicInputOutput;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputOutput extends JFrame {

	JLabel label;
	JTextField tf;
	JButton button;

	public InputOutput() {
		setLayout(new FlowLayout());

		label = new JLabel("Enter text to write to file");
		add(label);

		tf = new JTextField(10);
		add(tf);

		button = new JButton("Write to file!");
		add(button);

		event e = new event();
		button.addActionListener(e);
	}

	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				String word = tf.getText();
				FileWriter stream = new FileWriter(
						"C:\\Users\\Adminas\\Documents\\file.txt");
				BufferedWriter out = new BufferedWriter(stream);
				out.write(word);
				out.close();
			} catch (Exception ex) {

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputOutput gui = new InputOutput();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300, 150);
		gui.setTitle("Writer");
		gui.setVisible(true);

	}

}
