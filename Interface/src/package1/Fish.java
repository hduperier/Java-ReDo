package package1;

public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("The fish is hunting smaller fish.");
	}

	@Override
	public void flee() {
		// TODO Auto-generated method stub
		System.out.println("The fish is fleeing from a predator.");
	}

}
