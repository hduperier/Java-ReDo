
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car yourCar = new Car();
		
		// Displaying myCar's attributes
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		
		// Using myCar's methods.
		myCar.drive();
		myCar.breaks();
		
		yourCar.color = "Blue";
		
		System.out.println(yourCar.color);
		
		yourCar.drive();
	}

}
