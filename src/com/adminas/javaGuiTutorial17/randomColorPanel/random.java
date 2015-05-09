package com.adminas.javaGuiTutorial17.randomColorPanel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class random extends JFrame {

	JPanel panel;

	public random() {
		panel = new JPanel();
		panel.setBackground(randomColor());
		add(panel);

		event e = new event();
		panel.addMouseListener(e);

	}

	public Color randomColor() {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return (new Color(r, g, b));
	}

	public class event implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			panel.setBackground(randomColor());
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random gui = new random();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300, 300);
		gui.setTitle("Random color panel");
		gui.setVisible(true);
	}

}
