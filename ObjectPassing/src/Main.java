
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		Car myCar = new Car("BMW");
		Car yourCar = new Car("Tesla");
		
		garage.park(myCar);
		garage.park(yourCar);
	}

}
