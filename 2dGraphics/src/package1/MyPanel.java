package package1;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel{
	
	MyPanel() {
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));
		g2d.setPaint(Color.CYAN);
		g2d.drawLine(0, 0, 500, 500);
		//g2d.drawRect(0, 0, 200, 200);
		g2d.setPaint(Color.red);
		g2d.fillRect(0,0,200,200);
		
		g2d.setPaint(Color.magenta);
		g2d.fillOval(200, 0, 100, 100);
		
		
	}
}
