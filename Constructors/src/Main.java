
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constructor = special method that is called when an object is instantiated
		
		// creates different objects with different attributes
		Human human1 = new Human("Bob", 17, 150.62);
		System.out.println(human1.name);
		System.out.println(human1.age);
		System.out.println(human1.weight);
		
		Human human2 = new Human("Billy", 20, 400.70);
		System.out.println(human2.name);
		System.out.println(human2.age);
		System.out.println(human2.weight);
		
		human1.eat();
		human2.drink();
		
		
	}

}
