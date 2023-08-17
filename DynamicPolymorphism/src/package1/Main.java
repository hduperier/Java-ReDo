package package1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dynamic Polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)
		
		// ex: a corvette is a: corvette, and a car, and a vehicle, and as an object
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal would you like?");
		System.out.println("(1=dog) or (2=cat): ");
		int choice = scanner.nextInt();
		scanner.close();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			animal.speak();
		}
		
		
	}
}
