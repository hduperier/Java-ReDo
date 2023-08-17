package package1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// polymorphism = the ability to identify as more than one type.
		
		Car car = new Car();
		Boat boat = new Boat();
		Bicycle bicycle = new Bicycle();
		
		Vehicle[] racers = {car, bicycle, boat};
		
		car.go();
		bicycle.go();
		boat.go();
		
		for(Vehicle x : racers) {
			x.go();
		}
	}

}
