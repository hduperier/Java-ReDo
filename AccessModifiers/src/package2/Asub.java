package package2;
import package1.*;

public class Asub extends A{
	// can use protected access modifier in different packages as long as it is a subclass
	// If main method is here and protected variable in A
	// Asub, despite being in a different package, can use protectedMessage bc it is a subclass of A
}
