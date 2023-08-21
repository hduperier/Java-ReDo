package package1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	JButton button;
	
	MyFrame() {
		
		button = new JButton();
		button.setBounds(150, 100, 200, 75);
		button.addActionListener(e -> System.out.println("You have pressed the button!"));
		button.setText("I'm a button. Click me!");
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Comic Sans", Font.BOLD, 15));
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		
		
	}
	
}
