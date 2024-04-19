package javasessions;

/* Day 6 - 14th Dec
 * Java_05_ConditionalStatements_IfElse_SwitchCase.mp4
 * Part 1*/

public class ConditionalStatements {

	public static void main(String[] args) {

		// Comparison Operators: == >= > <= < !=

		int x = 10;
		int y = 20;

		System.out.println(x > y); // results in a boolean value

		if (x > y) {
			System.out.println("Pass");
		} // not mandatory to write the else part but it is a good practice
		else
			System.out.println("Fail");

		// Dead Code
		if (false) {
			System.out.println("Hi");
		} else
			System.out.println("Bye");
		
		boolean flag = false; //Right practice is to maintain a variable and on that basis you take a decision
		if (flag) {
			System.out.println("Hello");
		}
		else 
			System.out.println("World");
		
		int t1 = 100;
		int t2 = 100;
		
		if (t1>=t2) {
			System.out.println("t1 is greater than or equal to t2");
		}
		
		int p1 = 100;
		int p2 = 100;
		
		if (p1!=p2) {
			System.out.println("Selenium");
		}
		
		System.out.println("---if else------------");
		
//		String browser = "chrome";
//		
//		// This is an example of a badly written code. The else is always associated with the last if statement
//		// In addition to the if, it will also print what is in the else part. else will check 'on top of me how many ifs'?
//		// only one if so it will print the else part once
//		// Last if will create a pair with the else. Anti-pattern of if else code
//		// Works only with safari
//		// Disadvantage 2. - checks each and every if condition until the matching one is found; it has a performance issue
//		
//		if (browser.equals("chrome")) {
//			System.out.println("Launch chrome browser");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("Launch firefox browser");
//		}
//		if (browser.equals("edge")) {
//			System.out.println("Launch edge browser");
//		}
//		if (browser.equals("safari")) {
//			System.out.println("Launch safari browser");
//		}
//		else {
//			System.out.println("Please pass the right browser");
//		}
		
		System.out.println("---if else if------------");
		
		// When the first condition is satisfied it wont go to the next else-if. Because this is the behavior of the
		// if-else. So the performance is slightly better
		// But in-between a condition is satisfied, all the if-else lines above it will be checked
		// Not accurate code. Unnessary anti-pattern
		
		String browser = "chrome";
		
		if (browser.equals("chrome")) { // when comparing two strings use the .equals() method
			System.out.println("Launch chrome browser");
		}
		else if (browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
		}
		else if (browser.equals("edge")) {
			System.out.println("Launch edge browser");
		}
		else if (browser.equals("safari")) {
			System.out.println("Launch safari browser");
		}
		else {
			System.out.println("Please pass the right browser");
		}
	}

	
}