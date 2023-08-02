
public class Human {
	// define attributes
	String name;
	int age;
	double weight;
	
	// now this constructor in the human class can create different humans when called upon in the main method
	Human(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name + " is eating some food right now.");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking some water right now.");
	}
}
