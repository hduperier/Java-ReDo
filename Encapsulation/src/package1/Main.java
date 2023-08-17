package package1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Encapsulation = attributes of a class will be hidden or private,
		// Can be accessed only through methods (getters & setters)
		// You should make attributes private if you dont have a reason to make them public/protected
		
		Car car1 = new Car("Chevy", "Camaro", 2021);
		//System.out.println(car1.make); // variables are private so they are hidden  must use getters
		System.out.println(car1.getMake() + " " + car1.getModel() + " " + car1.getYear() + "\n");
		
		// to change the variables, you must use a setter
		car1.setMake("GMC");
		car1.setModel("Terrain");
		car1.setYear(2023);
		System.out.println(car1.getMake() + " " + car1.getModel() + " " + car1.getYear() + "\n");
	}

}
