package javasessions;

/* Day 15 - 8th Jan
 * Java_14_MethodExamplesWith_SwitchCase_IfElse_Return_MethodOverloading_Examples.mp4
 * part 3*/

public class MainMethodOverloading {

	// Interview Q only. will not actually overload the main method
	// psvm - jvm will look for this method with this exact string array param
	public static void main(String[] args) {
		System.out.println("hi");		
		
		// Static methods are given to the CMA. 
		// Static methods are called using the class name. They are not part of the object.
		MainMethodOverloading.main(10); 
		MainMethodOverloading.main(20, "Selenium");
		MainMethodOverloading.main("Cypress", "Selenium");
	}

	public static void main(int i) {
		System.out.println("hello" + i);

	}
	
	public static void main(int i, String s) {
		System.out.println("ilma" + i + s);

	}
	
	public static void main(String s, String t) {
		System.out.println("ilma" + s + t);

	}
}
