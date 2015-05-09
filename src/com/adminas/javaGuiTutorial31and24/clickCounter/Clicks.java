package com.adminas.javaGuiTutorial31and24.clickCounter;

// ????
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Clicks extends JFrame {

	Timer timer;
	int timerCounter;
	int clickCounter;
	JLabel directions, enterTime, clickLabel, timeLeft;
	JButton startButton, clickButton;
	JTextField tf;
	JMenuBar menubar;
	JMenu file;
	JMenuItem reset, exit;

	public Clicks() {
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(3, 1, 2, 2));

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		file = new JMenu("File");
		menubar.add(file);

		reset = new JMenuItem("Reset");
		file.add(reset);

		exit = new JMenuItem("Quit");
		file.add(exit);

		ResetClass rc = new ResetClass();
		reset.addActionListener(rc);

		ExitClass ec = new ExitClass();
		exit.addActionListener(ec);

		JPanel top = new JPanel();
		top.setLayout(new GridLayout(1, 1));

		directions = new JLabel(
				"Enter time, press start, press CLICKER repeatedly !",
				SwingConstants.CENTER);
		top.add(directions);
		pane.add(top);

		JPanel middle = new JPanel();
		middle.setLayout(new GridLayout(1, 3));

		enterTime = new JLabel("Enter time (sec):", SwingConstants.CENTER);
		middle.add(enterTime);

		tf = new JTextField();
		middle.add(tf);

		startButton = new JButton("Start");
		middle.add(startButton);
		pane.add(middle);

		JPanel bottom = new JPanel();
		bottom.setLayout(new GridLayout(1, 3));

		clickButton = new JButton("CLICKED");
		clickButton.setEnabled(false);
		bottom.add(clickButton);

		clickLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
		bottom.add(clickLabel);

		timeLeft = new JLabel("TIme left: ?", SwingConstants.CENTER);
		bottom.add(timeLeft);
		pane.add(bottom);

		StartButtonClass sbc = new StartButtonClass();
		startButton.addActionListener(sbc);

		ClickButtonClass cbc = new ClickButtonClass();
		clickButton.addActionListener(cbc);
	}

	public class StartButtonClass implements ActionListener {
		public void actionPerformed(ActionEvent sbc) {
			try {
				int timeCount = (int) (Double.parseDouble(tf.getText()));
				if (timeCount <= 0) {
					tf.setText("Positive numbers!");
				} else {
					timeLeft.setText("Time left: " + timeCount);
					TimeClass tc = new TimeClass(timeCount);
					timer = new Timer(1000, tc);
					timer.start();
					startButton.setEnabled(false);
					clickButton.setEnabled(true);

				}
			} catch (Exception e) {
				tf.setText("Number only: ");
			}
		}
	}

	public class ClickButtonClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			clickCounter++;
			clickLabel.setText("Clicks: " + clickCounter);
			// TODO Auto-generated method stub

		}
	}

	public class TimeClass implements ActionListener {
		int timerCounter;

		public TimeClass(int timerCounter) {
			this.timerCounter = timerCounter;
		}

		public void actionPerformed(ActionEvent tc) {
			timerCounter--;
			if (timerCounter >= 1) {
				timeLeft.setText("Timer left: " + timerCounter);
			} else {
				timer.stop();
				timeLeft.setText("Done!");
				clickButton.setEnabled(false);
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}

	public class ResetClass implements ActionListener {
		public void actionPerformed(ActionEvent rc) {
			clickButton.setEnabled(false);
			startButton.setEnabled(true);
			clickCounter = 0;
			clickLabel.setText("Clicks: 0");
			tf.setText("");
			timeLeft.setText("Time left: ?");

		}
	}

	public class ExitClass implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Clicks gui = new Clicks();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(375, 135);
		gui.setTitle("Clicky Game");
		gui.setVisible(true);
	}
}
