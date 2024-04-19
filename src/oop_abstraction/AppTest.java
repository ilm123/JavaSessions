package oop_abstraction;

/* Day 23 - 23rd Jan
* Java_22_AbstractClass_Vs_Interface_TopCasting_Examples.mp4
* part 2*/

public class AppTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.doLogin("ilma", "ilma123");
		
		Page.displayLogo(); // preferred way of calling the static method
		LoginPage.displayLogo(); // using the child class to call the parent static method is not preferred
		lp.footers(); // inherited
		
		System.out.println("--------");
		
		//top casting:
		//child class object can be referred by parent abs.. class ref variable
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.pageLoadingTime();
		pg.displayLogo();
		pg.footers();
		//cannot access doLogin method because the reference type check will fail
		
		//down casting: Not Available because you cannot create an object of the abstract class

	}

}
