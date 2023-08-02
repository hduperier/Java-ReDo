package relearn1;

public class Main {
	
	static int age = 19;
	
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		 // declaring a variable
		 // int agel;
		 // defining a variable
			//int age = 10;
		
		// can do this int age = 18;
		// but you cant again declare the age variable you update by age = 18;
		
		//age = 18;
		//System.out.println("I am " + age + " years old this time next month.");
		
		
		/*String logLine = "[INFO]: Operation completed";
		
		String[] arrOfStr = logLine.split(":", 0);
		String temp1 = arrOfStr[0].trim();
		String temp3 = temp1.substring(1, temp1.length() - 1).toLowerCase();
		String temp2 = arrOfStr[1].trim();
		String tempLast = temp2 + " (" + temp3 + ")";
		// return tempLast; */
		
		String input = "Cool";
		String nStr = "";
		char character;
		
		for (int i=0; i<input.length(); i++) {
			character = input.charAt(i);
			nStr = character + nStr;
		}
		System.out.println(nStr);
		
		
		
	}
	
	
	
	
}

