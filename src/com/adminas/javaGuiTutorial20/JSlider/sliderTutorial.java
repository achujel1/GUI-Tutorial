package com.adminas.javaGuiTutorial20.JSlider;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class sliderTutorial extends JFrame {

	JSlider slider;
	JLabel label;

	public sliderTutorial() {
		setLayout(new FlowLayout());
		slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
		slider.setMajorTickSpacing(5);
		slider.setPaintTicks(true);
		add(slider);

		label = new JLabel("Current value: 0");
		add(label);

		event e = new event();
		slider.addChangeListener(e);

	}

	public class event implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int value = slider.getValue();
			label.setText("Current value: " + value);

		}
	}

	public static void main(String[] args) {
		sliderTutorial gui = new sliderTutorial();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300, 100);
		gui.setVisible(true);
		gui.setTitle("Slider program");
	}

}
