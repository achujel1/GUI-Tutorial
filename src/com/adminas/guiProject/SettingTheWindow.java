package com.adminas.guiProject;

import javax.swing.JFrame;
public class SettingTheWindow extends JFrame{

	public static void main(String[] args) {
		SettingTheWindow gui = new SettingTheWindow();
		// Setting default close operation to close the program
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Setting the size
		gui.setSize(200, 200);
		// Setting resizable
		gui.setVisible(true);
		// Setting title
		gui.setTitle("First GUI");
	}

}
