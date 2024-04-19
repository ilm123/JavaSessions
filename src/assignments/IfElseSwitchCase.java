package assignments;

public class IfElseSwitchCase {

	public static void main(String[] args) {
//		Q1.a : Find out the greatest number out of three different given numbers:
//			Input the 1st number: 25 
//			Input the 2nd number: 78
//			Input the 3rd number: 87

		int a = 25, b = 78, c = 87;
		int greatestNumber;
		if (a >= b && a >= c) {
			greatestNumber = a;
		} else if (b > c) {
			greatestNumber = b;
		} else {
			greatestNumber = c;
		}

		System.out.println("The greatest number out of three different is " + greatestNumber);

		System.out.println("----------------------------------------");

		// 1.b : Find out the greatest number out of four different given numbers:
//			Input the 1st number: 25
//			Input the 2nd number: 78
//			Input the 3rd number: 87
//			Input the 4th number: 97

		int d = 25, e = 78, f = 87, g = 97;
		int largestNum;

		if (d >= e && d >= f && d >= g) {
			largestNum = d;
			System.out.println("The geatest number out of four different numbers is:" + largestNum);
		} else if (e >= f && e >= g) {
			largestNum = e;
			System.out.println("The geatest number out of four different numbers is:" + largestNum);
		} else if (f >= g) {
			largestNum = f;
			System.out.println("The geatest number out of four different numbers is:" + largestNum);
		} else {
			largestNum = g;
			System.out.println("The geatest number out of four different numbers is:" + largestNum);
		}

		System.out.println("----------------------------------------");

//		2. Write a Java program to test a number is positive or negative.
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number

		int num = -11;
		if (num > 0) {
			System.out.println(num + " is a positive number");
		} else if (num < 0) {
			System.out.println(num + " is a negative number");
		} else {
			System.out.println(num + " is neither positive or negative");
		}

		System.out.println("----------------------------------------");
//		WAP to check number is odd or even using If - Else

		int h = -8;

		if (h % 2 == 0) {
			System.out.println(h + " is an even number");
		} else {
			System.out.println(h + " is an odd number");
		}

		System.out.println("----------------------------------------");
//		WAP to check given alphabet character is Vowel or Consonant using Switch - Case

		char alphabet = '2';

		switch (alphabet) {
		case 'a':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'e':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'i':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'o':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'u':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'A':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'E':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'I':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'O':
			System.out.println(alphabet + " is a vowel");
			break;
		case 'U':
			System.out.println(alphabet + " is a vowel");
			break;

		default:
			System.out.println(alphabet + " is a consonant");
			break;
		}

		System.out.println("----------------------------------------");

//		WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case

		String env = "UAT";

		switch (env.trim().toLowerCase()) {
		case "qa":
			System.out.println("Running test cases in " + env);
			break;
		case "stage":
			System.out.println("Running test cases in " + env);
			break;
		case "dev":
			System.out.println("Running test cases in " + env);
			break;
		case "uat":
			System.out.println("Running test cases in " + env);
			break;
		case "prod":
			System.out.println("Running test cases in " + env);
			break;

		default:
			System.out.println("Please enter the right environment name");
			break;
		}

		System.out.println("----------------------------------------");

//		WAP to book the specific type of car from the Uber app using Switch - Case. 
//		Car Type: Mini, Sedan, SUV, Premium
//		If user passes wrong car type, print please select the right car type

		String booking = "suv  ";

		switch (booking.toLowerCase().trim()) {
		case "mini":
			System.out.println("Car Type: " + booking);
			break;
		case "sedan":
			System.out.println("Car Type: " + booking);
			break;
		case "suv":
			System.out.println("Car Type: " + booking);
			break;
		case "premium":
			System.out.println("Car Type: " + booking);
			break;

		default:
			System.out.println("please select the right car type");
			break;
		}

//		WAP to launch browsers using If-ElseIf and Switch Case.
//		Browser: Chrome/Firefox/IE/Safari
//		If user passes wrong browser, print please pass the right browser name

		System.out.println("--------------Launch Browsers using If-ElseIf--------------------------");

		String browser = "  IE ";
		browser = browser.toLowerCase().trim();
		
		if (browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		} 
		else if (browser.equals("firefox")) {
			System.out.println("Launch Firefox");
		} 
		else if (browser.equals("ie")) {
			System.out.println("Launch IE");
		} 
		else if (browser.equals("safari")) {
			System.out.println("Launch Safari");
		} 
		else {
			System.out.println("Please pass the right browser name");
		}

		System.out.println("--------------Launch Browsers using Switch Case--------------------------");

		String launchBrowser = "FireFox ";

		switch (launchBrowser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "ie":
			System.out.println("Launch IE");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;
		default:
			System.out.println("Please pass the right browser name");
			break;
		}
		
		System.out.println("--------------Interest Rate based on loan type--------------------------");
//		WAP to define the interest rate on the basis of Loan type using Switch Case
//		Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//		For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		String loanType = "Housing Loan";
		int salary=40000;
		
		switch (loanType) {
		case "Car Loan":			
			System.out.println("The interest rate for a Car Loan is 20%");
			break;
		case "Housing Loan":			
			System.out.println("The interest rate for a Housing Loan is 30%");
			if (salary < 35000 ) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
			}
			break;
		case "Personal Loan":			
			System.out.println("The interest rate for a Car Loan is 10%");
			break;
		case "Education Loan":			
			System.out.println("The interest rate for a Car Loan is 5%");
			break;
		default:
			System.out.println("Please enter the correct loan type");
			break;
		}
		

	}

}
