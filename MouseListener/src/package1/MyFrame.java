package package1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class MyFrame extends JFrame implements MouseListener {
	
	JLabel label;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		this.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released on a component
		System.out.println("You Clicked the Mouse.");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component		
		System.out.println("You Pressed the Mouse.");
		label.setBackground(Color.BLUE);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// invoked when a mouse button has been released on a component
		System.out.println("You Released the Mouse");
		label.setBackground(Color.BLACK);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when a mouse enters a component
		System.out.println("You Entered the Component.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when a mouse exits a component
		System.out.println("You Exited the Component.");
		
	}
}
