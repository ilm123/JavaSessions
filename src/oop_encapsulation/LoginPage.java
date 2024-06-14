package oop_encapsulation;

/* Day 19 - 12th Jan
 * Java_18_OOP_Encapsulation_Public_Private_Modifiers_Getter_Setter_PrivateConstructor.mp4
 * part 3_1*/

public class LoginPage {

	private String userName;
	private String password;

	//setter
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String userName) {
		if (isValidUserName(userName)) {
			System.out.println("User enters un: " + userName);
			System.out.println("User enters pw: " + password);
			System.out.println("User is logged in");
		}
	}

	private boolean isValidUserName(String userName) {
		System.out.println("Checking if the user is valid or not...");
		if (userName.length() >= 3) {
			System.out.println("User name is valid");
			return true;
		} else {
			System.out.println("User name is invalid");
			return false;
		}
	}

}

// do not update the value in the constructor. constructor is first time setup only
// Use the setup method to re-initialize values/update the values
// Can includes checks in the setup method such as, if (name!=null)
// Avoid business logic inside setup methods
// for business logic write a separate method e.g doLogin()
