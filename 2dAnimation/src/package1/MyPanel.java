package package1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 3;
	int yVelocity = 2;
	int x=0;
	int y=0;
	
	
	MyPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		//this.setOpaque(true);
		enemy = new ImageIcon("enemy.png").getImage();
		backgroundImage = new ImageIcon("space.jpeg").getImage();
		timer = new Timer(10, this);
		timer.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(backgroundImage, 0, 0, null);
		g2d.drawImage(enemy, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0) {
			xVelocity = (xVelocity*-1);
		}
		x+=xVelocity;
		repaint();
		
		if(y>=PANEL_HEIGHT-enemy.getWidth(null) || y<0) {
			yVelocity = (yVelocity*-1);
		}
		y+=yVelocity;
		repaint();
	}
}
