package package1;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// J-frame = a GUI window to add components to
		
		/*
		JFrame frame = new JFrame(); // creates a frame
		
		frame.setTitle("JFrame Title Goes Here"); // Sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when hit X buttton, it closes out of application
		frame.setResizable(false); // prevents our frame from being resized
		
		frame.setSize(420,420); // setting size of JFrame x by y
		frame.setVisible(true); // makes frame visible
		
		ImageIcon image = new ImageIcon("logo.png"); // create imageicon for new icon on GUI
		frame.setIconImage(image.getImage()); // change icon of frame from base Java to new logo
		frame.getContentPane().setBackground(new Color(233, 100, 95)); // change color of background
		*/
	
		new MyFrame();
	}

}
