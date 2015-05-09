package com.adminas.javaGuiTutorial6and7.randomNumberGame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RandomGame extends JFrame {
	int randomNum, guess;
	private JButton button;
	private JTextField textfield;
	private JLabel promptlabel;
	private JLabel resultlabel;
	private JLabel randomlabel;

	public RandomGame() {
		setLayout(new FlowLayout());

		promptlabel = new JLabel("Enter a random number 1- 10");
		add(promptlabel);

		textfield = new JTextField(5);
		add(textfield);

		button = new JButton("Guess");
		add(button);

		resultlabel = new JLabel("");
		add(resultlabel);

		randomlabel = new JLabel("");
		add(randomlabel);

		Event e = new Event();
		button.addActionListener(e);
	}

	public class Event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			randomNum = (int) (Math.random() * 10);
			try {
				guess = (int) (Double.parseDouble(textfield.getText()));

				if (guess == randomNum) {
					resultlabel.setText("You won the game!");
				} else if (guess != randomNum) {
					resultlabel.setText("You lost the game!");
				}
				randomlabel.setText("The random number generated was: "
						+ randomNum);
			} catch (Exception e2) {
				randomlabel.setText("Please enter numbers only!");
			}
		}
	}

	public static void main(String[] args) {
		RandomGame gui = new RandomGame();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setTitle("Random number guessing game");
		gui.setSize(400, 400);
	}
}
