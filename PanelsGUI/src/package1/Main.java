package package1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPanels = a GUI component that functions as a container to hold other components
		
		JLabel label = new JLabel();
		label.setText("Hello, World!");
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.add(label);
		greenPanel.setLayout(new BorderLayout());
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}

}
