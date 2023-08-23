package package1;
import javax.swing.*;

public class MyFrame extends JFrame{
	
	DragPanel dragPanel = new DragPanel();
	
	MyFrame() {
		
		this.add(dragPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Drag & Drop Demo");
		this.setSize(600, 600);
		this.setLayout(null);
		
		
		this.setVisible(true);
	}
}
