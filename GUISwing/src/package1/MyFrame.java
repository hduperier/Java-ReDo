package package1;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame() {

		
		this.setTitle("JFrame Title Goes Here"); // Sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when hit X buttton, it closes out of application
		this.setResizable(false); // prevents our this from being resized
		
		this.setSize(420,420); // setting size of JFrame x by y
		this.setVisible(true); // makes this visible
		
		ImageIcon image = new ImageIcon("logo.png"); // create imageicon for new icon on GUI
		this.setIconImage(image.getImage()); // change icon of this from base Java to new logo
		this.getContentPane().setBackground(new Color(233, 100, 95)); // change color of background
	}
}
