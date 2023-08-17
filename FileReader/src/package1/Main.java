package package1;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File reader = reads the contents of a file as a strea of characters
		// One by one read() returns an int value which contains the byte value 
		// when read() returns -1, there is no more data to be read
		try {
			FileWriter writer = new FileWriter("art.txt");
			writer.write("Rose are REd");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
