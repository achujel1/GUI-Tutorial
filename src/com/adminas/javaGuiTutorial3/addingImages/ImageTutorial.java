package com.adminas.javaGuiTutorial3.addingImages;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageTutorial extends JFrame {

	private ImageIcon image1;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;

	ImageTutorial() {
		setLayout(new FlowLayout());

		image1 = new ImageIcon(getClass().getResource("plane.png"));

		label1 = new JLabel(image1);
		add(label1);

		image2 = new ImageIcon(getClass().getResource("earth.png"));

		label2 = new JLabel(image2);
		add(label2);
	}

	public static void main(String[] args) {
		ImageTutorial gui = new ImageTutorial();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		gui.setTitle("This is the title");
	}

}
