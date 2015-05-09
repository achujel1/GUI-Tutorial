package com.adminas.javaGuiTutorial29.timerProgram;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Screen extends JFrame {

	private JPanel panel1;
	private Timer timer;

	public Screen() {

		setLayout(new GridLayout(1, 1));

		panel1 = new JPanel();
		panel1.setBackground(Color.black);
		add(panel1);
		int count = 1;
		TimerClass tc = new TimerClass(count);
		timer = new Timer(100, tc);
		timer.start();

	}

	public class TimerClass implements ActionListener {
		int counter;

		TimerClass(int counter) {

			this.counter = counter;
		}

		public void actionPerformed(ActionEvent tc) {
			counter++;
			if (counter <= 5) {

				panel1.setBackground(Color.black);
			} else if (counter > 5 && counter <= 10) {
				panel1.setBackground(Color.blue);

			} else {
				panel1.setBackground(Color.green);
				timer.stop();
				counter = 1;
				timer.start();
			}

		}

	}

	public static void main(String args[]) {

		Screen GUI = new Screen();
		GUI.setResizable(false);
		GUI.setSize(300, 300);
		GUI.setLocation(300, 300);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setTitle("Color change");
		GUI.setVisible(true);

	}

}