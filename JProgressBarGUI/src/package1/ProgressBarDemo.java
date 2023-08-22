package package1;
import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBarDemo() {
		
		
		
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Comic Sans", Font.BOLD, 25));
		bar.setForeground(Color.RED);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		
		
		
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int count=0;
		
		while(count<=100) {
			bar.setValue(count);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count+=1;
		}
		bar.setString("Complete");
	}
}
