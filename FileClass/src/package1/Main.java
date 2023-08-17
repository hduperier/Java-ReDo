package package1;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// file - abstract representation of file and directory pathnames
		
		File file = new File("secret_message.rtf");
		
		if(file.exists()) {
			System.out.println("That file exists.");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
		} else {
			System.out.println("That file doesn't exist");
		}
	}

}
