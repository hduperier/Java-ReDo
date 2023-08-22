package package2;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu sourceMenu;
	JMenu refactorMenu;
	JMenu navMenu;
	JMenu helpMenu;
	
	MyFrame() {
		// Setup JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		JMenuBar menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		sourceMenu = new JMenu("Source");
		refactorMenu = new JMenu("Refactor");
		navMenu = new JMenu("Navigate");
		helpMenu = new JMenu("Help");
		
		// File Menu Items
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		// Action listener when Items are pressed
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load 
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit (Keyboard shortcuts)

		//Adding items to fileMenu
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		// Adding Menus to MEnu Bar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(sourceMenu);
		menuBar.add(refactorMenu);
		menuBar.add(navMenu);
		menuBar.add(helpMenu);
		
		// Setting menuBar as JMenuBar for JFrame
		this.setJMenuBar(menuBar);
		
		
		// Sets JFrame Visible
		this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==loadItem) {
			System.out.println("Loading!");
		} else if (e.getSource()==saveItem) {
			System.out.println("You have saved your progress!");
		} else if (e.getSource()== exitItem) {
			System.exit(0);
		}
	}
}
