
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// super keyword -- keyword refers to the superclass (parent) of an object
		// very similar to the "this" keyword
		
		Hero hero1 = new Hero("Batman", 42, "Money");
		Hero hero2 = new Hero("Superman", 1000000, "everything");
		
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		System.out.println(hero2.name);
		System.out.println(hero2.age);
		System.out.println(hero2.power);
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
	}

}
