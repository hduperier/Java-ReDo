package package1;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are Red \n");
			writer.write("Violets are Blue \n");
			writer.write("Who knows \n");
			writer.write("Rocking everywhere \n");
			writer.append("\n (a poem by Bro)");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
