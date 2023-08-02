import java.util.Scanner; // taking in user input
import javax.swing.JOptionPane; // implementing GUI
import java.util.Random;
import java.util.ArrayList;
import java.util.*;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("\t\"Hello World\"\n");
		System.out.print("\\I like bananas\\\n");
		// This is a comment
		
		int x; // declaration
		x = 123; // assignment
		int y = 123; // initialization
		
		System.out.println("My number is: " + x);
		
		long xx = 1234567891234L; // work with extremely large #'s but must include capital L at the end
		byte yy = 100; // -128-127 more convienent to work with int's
		
		float flo = 3.1415f; // must follow with lowercase f at the end 6-7 digits
		double dub = 3.1415; // fractional numbers up to 15 digits
		
		boolean bool = true; // true or false
		
		char sym = '@'; // single quotes 1 character
		String name = "Harvey"; // reference types start with Capital letter as in 'S'tring
		
		System.out.println("Hello my name is: " + name);
		
		*/
		
		
		/*
		
		// Swapping 2 variables
		String w = "Water";
		String z = "Kool-Aid";
		String temp;
		
		System.out.println("w: " + w);
		System.out.println("z: " + z);
		
		temp = w;
		w=z;
		z=temp;
		
		
		System.out.println("w: " + w);
		System.out.println("z: " + z);
		
		// Taking in User Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name1 = scanner.nextLine();
		System.out.println("How old are you?");
		int age1 = scanner.nextInt();
		
		scanner.nextLine(); // clears \n from scanner after nextInt()
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name1 + "!");
		System.out.println("You are " + age1+ " years old");
		System.out.println("You like " + food+ "!");
		*/
		
		
		
		/*
		// Working with GUIs Intro
		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
		*/
		
		
		
		/*
		// Random Numbers Intro Helpful in some game design
		Random random = new Random();
		int x = random.nextInt(6) + 1; // +1 because its originally 0-5
		System.out.println(x);
		
		double y = random.nextDouble();
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		System.out.println(z);
		*/
		
		
		/*
		
		// switches relearn
		String day = "Friday";
		
		switch (day) {
		case "Sunday": System.out.println("It is Sunday!");
		break;
		case "Monday": System.out.println("It is Monday!");
		break;
		case "Tuesday": System.out.println("It is Tuesday!");
		break;
		case "Wednesday": System.out.println("It is Wednesday!");
		break;
		case "Thurday": System.out.println("It is Thursday!");
		break;
		case "Friday": System.out.println("It is Friday!");
		break;
		case "Saturday": System.out.println("It is Saturday!");
		break;
		default: System.out.println("That is not a day!");
		}
		*/
		
		/*
		// Nested loops relearn
		Scanner scanner = new Scanner(System.in);
		int rows; 
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.nextLine();
		
		for (int i=0; i<rows; i++) {
			System.out.println();
			for (int j=0; j<columns; j++) {
				System.out.print(symbol);
			}
		}
		*/
		
		
		/*
		// Array Relearn
		// used to stores multiple values in a single variable
		String[] cars = {"Camaro", "Corvette", "Tesla"}; // array of strings and therefore only strings can go in
		
		cars[0] = "Mustang"; // changes element but cannot change array size
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i] + "\n");
		}
		
		
		//can also create an array like this
		String[] cars2 = new String[3];
		
		for (int i=0; i<cars2.length; i++) {
			System.out.print(cars2[i] + "\n");
		}
		
		cars2[0] = "Tesla";
		cars2[1] = "Truck";
		cars2[2] = "Mina";
		
		for (int i=0; i<cars2.length; i++) {
			System.out.print(cars2[i] + "\n");
		}
		
		
		// now we learn about 2D arrays
		String[][] cars3 = new String[3][3];
		cars3[0][0] = "Camaro";
		cars3[0][1] = "Corvette";
		cars3[0][2] = "Silverado";
		
		cars3[1][0] = "Mustang";
		cars3[1][1] = "Ranger";
		cars3[1][2] = "F-150";
		
		cars3[2][0] = "Ferrari";
		cars3[2][1] = "Porsche";
		cars3[2][2] = "Lamborghini";
		
		for (int i=0; i<cars3.length; i++) {
			System.out.println();
			for (int j=0; j<cars3[i].length; j++) {
				System.out.print(cars3[i][j]);
			}
		}
		*/
		
		
		
		/*
		// String Methods
		String name = "Harvey";
		boolean result = name.equalsIgnoreCase("harvey");
		int result1 = name.length();
		char result2 = name.charAt(2);
		int result3 = name.indexOf("v");
		boolean result4 = name.isEmpty();	
		name = name.toUpperCase();
		name = name.trim(); // trims away all empty space
		String result5 = name.replace('a', 'o');
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(name);
		*/
		
		/*
		// Wrapper Classes
		// autobox to get to reference type
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		// Created 4 reference type variables
		String e = "Bro";
		
		// Boolean Wrapper Class Methods
		e = a.toString();
		// More Methods for each wrapper class
		
		// unboxing feature to get back to primitive values
		if(a==true) {
			System.out.println("This is true.")
		}
		*/
		
		
		/*
		// ArrayLists
		// a resizable array and elements can be added and removed after compilation phase.
		// Store reference data types NOT PRIMITIVES
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		food.add("Pizza");
		food.add("Pizza");
		food.add("Pizza");
		
		// ArrayList Methods
		food.set(4, "Sushi");
		food.remove(5);
		food.clear();
		
		
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		*/
		
		
		/*
		// 2D ArrayLists
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("donuts");
		bakeryList.add("garlic bread");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomato");
		produceList.add("garlic");
		produceList.add("zuchini");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(0).get(0));
		*/
		
		
		/*
		// For Each Loop
		String[] animals = {"cat", "dog", "rat", "bird"};
		ArrayList<String> animals1 = new ArrayList<String>();
		
		animals1.add("cat");
		animals1.add("cat");
		animals1.add("cat");
		animals1.add("cat");
		
		for (String i : animals1) {
			// Iterates once for each index of "animals"
			System.out.println(i);
		}
		*/
		
		
		/*
		// Methods in Java = a block of code that is executed whenever it is called upon
		// now we call this method from the main method
		String name = "Bro";
		hello(name);
		hello(name);
		hello(name);
		
		// Overloaded methods are methods that share the same name but have different parameters
		// method name + parameters = method signature
		// params can be different by # of them, the type of them, etc
		int x = 17;
		int y = 10;
		int z = 40;
		System.out.println(add( x, y, z));
		*/
		
		
		/*
		// Printf Method - controls, formats, and displays text to console
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 3.14;
		final double PI = 3.14159; // final keyword means you cannot update
		
		System.out.printf("%b\n", myBoolean);
		System.out.printf("%c\n", myChar);
		System.out.printf("%s\n", myString);
		System.out.printf("%d\n", myInt);
		System.out.printf("%f\n", myDouble);
		
		// set a width - minimum # of chars to be written as output from a string
		// so adds 7 spaces to bro
		System.out.printf("Hello %10s", myString);
		
		//precision of floating point #'s
		System.out.printf("You have this much money %.2f",myDouble);
		*/
		
		
		
		
	}
	
	// This is the hello method
	static void hello(String name) {
		System.out.println("Hello World and " + name + "!");
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	static int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	

}
