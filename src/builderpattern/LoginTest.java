package builderpattern;

/* Day 18 - 12th Jan
 * Java_17_BuilderPattern_ThisKeyword_UseCases_This_WithMethods.mp4
 * part 4_2*/

// Caller class
public class LoginTest {

	public static void main(String[] args) {
		LoginPage user1 = new LoginPage("ilma", "ilma@123");
		user1.doLogin();
		
		LoginPage user2 = new LoginPage();
		user2.doLogin();

	}

}
