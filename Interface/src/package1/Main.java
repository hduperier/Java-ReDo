package package1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Interface = a template that can be applied to a class
		// similar to inheritance, but specifies what a class has/must do
		// classes can apply to more than one interface, inheritance is limited to 1 super
		
		
		Rabbit rabbit1 = new Rabbit();
		rabbit1.flee();
		
		Hawk hawk1 = new Hawk();
		hawk1.hunt();
		
		Fish fish1 = new Fish();
		fish1.hunt();
		fish1.flee();
		
	}

}
