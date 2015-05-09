package com.adminas.javaGuiTutorial23.openNewWindow;

import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelpWindow extends JDialog{
	
	JLabel label;

	public HelpWindow(JFrame frame){
		super(frame, "Help window", true);
		setLayout(new FlowLayout());

		label = new JLabel("I am tired, this is a help men.");
		add(label);
		
	}

	public static void main(String[] args) {
		
	}

}
