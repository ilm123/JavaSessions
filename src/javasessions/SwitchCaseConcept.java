package javasessions;

/* Day 6 - 14th Dec
 * Java_05_ConditionalStatements_IfElse_SwitchCase.mp4
 * Part 2*/

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "CHROME ";

		// In switch-case it jumps to the matching case. Notice the importance of break.
		// Default break is not mandatory. If there is case after default it will
		// execute the next case.
		// But case after default is not a nice code
		// "CHR OME" - these kind of checks no need to handle. It is a user mistake

		switch (browser.toLowerCase().trim()) { // trim means to remove the corner space. before and after chrome
		case "chrome":
			System.out.println("Launch chrome browser");
			break; // break means breaks the entire switch/come out of the Switch case
		case "firefox":
			System.out.println("Launch firefox browser");
			// break;
		case "edge":
			System.out.println("Launch edge browser");
			// break;
		case "safari":
			System.out.println("Launch safari browser");
			// break;
		default:
			System.out.println("Please pass the right browser");
			// break;
		}

		byte b = 100;
		switch (b) {
		case 100:

			break;

		default:
			break;
		}

		short s = 20000;
		switch (s) {
		case 20000:

			break;

		default:
			break;
		}

//		double d = 12.33;
//		switch (d) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

//		boolean flag = true;
//		switch (flag) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		char ch = 'A'; // cannot use methods like .lowercase() with character. used only with the strings
		switch (ch) {//so add 5 more cases for the capital letter vowels
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonant");
			break;
		}
		//use cases:
		//cross browser testing
		//multi env setup: dev, QA, UAT, stage,
		//RBAC (different user roles): admin, customer, manager, vendor (on ecommerce)
		//Element Locater: id, name, xpath, css, linktext
		//OS : Windows, Mac, Linux, 
	}

}
