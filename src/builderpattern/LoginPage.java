package builderpattern;

/* Day 18 - 12th Jan
 * Java_17_BuilderPattern_ThisKeyword_UseCases_This_WithMethods.mp4
 * part 4_1*/

public class LoginPage {

	// Class variables - They are Non static AKA Class template var., Class Instantance Var., Global Var.
	String userName;
	String password;

	// default values
	public LoginPage() {
		userName = "admin";
		password = "admin@123";
	}

	public LoginPage(String userName, String passowrd) {
		this.userName = userName;
		this.password = passowrd;
	}	

	// Non Static -> Non Static
	public void doLogin() {
		System.out.println("Enter username: " + this.userName); //accessing the class variable. not mandatory to use this keyword
		System.out.println("Enter password: " + password);
		System.out.println("Click on login button");
		System.out.println("User is logged in");
	}
}

// constructor is to initialize the variables and the business login is written in the method
// NS -> NS - no need to create the object. can talk to them directly

// Initializing the non static variables at the start is not a good practice. Let it have the default values
// Use the default constructor for this