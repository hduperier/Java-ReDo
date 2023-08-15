
public class Car extends Vehicle {

	@Override
	void go() {
		// Must inherit unimplemented methods of abstract vehicle
		System.out.println("The driver is driving the car now!");
		
	}

}
