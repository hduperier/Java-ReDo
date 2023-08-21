package package1;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("dude.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?!?!"); // sets text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, or right of icon
		label.setVerticalTextPosition(JLabel.TOP); // set text top center or bottom of image icon
		label.setForeground(Color.BLUE); // sets color of text
		label.setFont(new Font("MV Boli", Font.BOLD, 20)); // set font style
		label.setIconTextGap(-45); // gap between image and text
		label.setBackground(Color.black);
		label.setOpaque(true); // needed to change background color with method above
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // setting vertical alignment of label
		label.setHorizontalAlignment(JLabel.CENTER); // setting horizontal alignment of label
		// label.setBounds(100, 100, 600, 600); // set x,y position within frame as well as dimensions of label
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,750);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		
		
	}

}
