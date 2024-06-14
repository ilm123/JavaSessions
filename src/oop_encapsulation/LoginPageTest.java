package oop_encapsulation;

/* Day 19 - 12th Jan
 * Java_18_OOP_Encapsulation_Public_Private_Modifiers_Getter_Setter_PrivateConstructor.mp4
 * part 3_2*/

public class LoginPageTest {

	public static void main(String[] args) {
		
		//reg page: first time
		LoginPage lp = new LoginPage("ilma", "ilma@321");		
		lp.doLogin(lp.getUserName());
		
		System.out.println("------------");
		//After registration we need a setter to update the value
		lp.setPassword("ilma@456");
		lp.getPassword();
		lp.doLogin(lp.getUserName());
	}

}

// If we use the constructor again to update the value then we have to create another object which 
// occupies unnecessary memory