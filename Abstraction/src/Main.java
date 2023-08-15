
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// abstract = abstract classes cannot be instantiated, but they can have a subclass
		// abstract methods are declared without an implementation
		
		
		// think of it as prevent someone from creating an instance of a class that is too vague
		// you would never go to a dealership and just ask for a vehicle
		// you ask for a car, suv, truck, etc
		
		Car car = new Car(); // must pick a subclass of vehicle
		// Vehicle vehicle = new Vehicle(); cannot instantiate this now
		car.go();
	}

}
