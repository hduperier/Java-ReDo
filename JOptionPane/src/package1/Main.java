package package1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something
		
		/*
		JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Your Computer Has A Virus", "Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.ERROR_MESSAGE);
		*/
		
		//int answer = JOptionPane.showConfirmDialog(null, "Do you even code?", "This is my title.", JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("What is your name?");
	}

}
