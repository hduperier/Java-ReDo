
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// normal array
		int[] numbers = new int[3];
		char[] characters = new char[3];
		String[] strings = new String[3];
		
		// object array
		Food[] fridge = new Food[3];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Hamburger");
		Food food3 = new Food("Hotdog");
		
		fridge[0] = food1;
		fridge[1] = food2;
		fridge[2] = food3;
		
		System.out.println(fridge[0].name);

		System.out.println(fridge[1].name);

		System.out.println(fridge[2].name);
		
		
	}

}
