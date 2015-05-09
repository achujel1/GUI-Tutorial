package com.adminas.javaGuiTutorial8.menus;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTutorial extends JFrame {
	JMenuBar menubar;
	JMenu file;
	JMenuItem exit;

	public MenuTutorial() {
		setLayout(new FlowLayout());
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		file = new JMenu("File");
		menubar.add(file);

		exit = new JMenuItem("Exit");
		file.add(exit);

		Event e = new Event();
		exit.addActionListener(e);
	}

	public class Event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		MenuTutorial gui = new MenuTutorial();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setSize(200, 200);
		gui.setVisible(true);
	}
}
