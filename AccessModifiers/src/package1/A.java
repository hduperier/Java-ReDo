package package1;
import package2.*;

public class A {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		
		System.out.println(c.publicMessage);  // public is visible to anything in the project folder
		// System.out.println(c.defaultMessage); Not visible because anything with the default access modifier is only visible to the same package
		
		B b = new B();
		// System.out.println(b.privateMessage); // cannot do because it is private and only usable in that class
	}
	
}
