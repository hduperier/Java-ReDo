package package1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exception = an event that occurs during the execution of a program that,
		// 		disrupts the normal flow of instructions
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a whole number to divide.");
			int x = scanner.nextInt();
			
			System.out.println("Enter a number to divide by.");
			int y = scanner.nextInt();
		
		
			int z = x/y;
		
			System.out.println("Result: " + z);
		} catch(ArithmeticException e) {
			System.out.println("You can't divide by zero.");
		} catch(InputMismatchException e) {
			System.out.println("Make sure you are inputting a number please.");
		} catch(Exception e) {
			System.out.println("Last resort exception"); // better to handle specific exceptions
		} finally {
			scanner.close();
		}
	}

}
