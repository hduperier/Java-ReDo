package package1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Chevy", "Camaro", 2021);
		//Car car2 = new Car("Ford", "Mustang", 2022);
		// now overloaded constructor using copy methods
		Car car2 = new Car(car1);
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println();
		
		// do not copy with car2 = car1;
		// just assigns memory address over so you're accessing the same car rather than two different car memory addresses
		/*
		car2 = car1;
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println();
		*/
		
		// lets make a copy method
		//car2.copy(car1);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println();
	}

}
