
public class Pizza {
	
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
	Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread, String cheese) {
		this.bread = bread;
		this.cheese = cheese;
	}
	
	void describe() {
		System.out.println("This is your pizza:" + this.bread + this.cheese + this.sauce + this.topping);
	}
}
