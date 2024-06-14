package builderpattern;

/* Day 18 - 12th Jan
 * Java_17_BuilderPattern_ThisKeyword_UseCases_This_WithMethods.mp4
 * part 2_2*/

// caller class
public class AppTest {

	// caller method/user
	public static void main(String[] args) {
		EcommApplication app = new EcommApplication(); // Methods are not static. So create the object to call the methods
		app.login("Ilma", "ilma123")
			.search("Apple Macbook")
			.addToCart("Apple Macbook")
			.payment("4432 4343 3423 676767", 345)
			.getOriderId()
			.logout();
		
		System.out.println("---------");
		
		app.login("Ilma", "ilma123")
			.search("tshirt", "blue")
			.logout();
				
		System.out.println("---------");
		
		app.login("vendor", "vendor123")
		.search("samsung phone", "white", 1000)
		.addToCart("samsung phone")
		.payment("1231232@hdfc")
		.getOriderId()		
		.logout();
		
		System.out.println("---------");
		
		app.login("Ilma", "ilma123")		
		.logout();
		
		System.out.println("---------");
		
		app.login("Ilma", "ilma123");
		
		System.out.println("---------");
		
		app.logout();
		
		System.out.println("---------");
		
		app.login("Ilma", "ilma123")
		   .search("Apple Macbook Pro")
		   .search("Samsung")
		   .search("hp laptop", "white")
		   .logout();		  		
		
	}

}

//EcommApplication app = new EcommApplication(); -> 
// Java is creating the object and calling the default constructor internally
// But if the user has defined parameterized constructors then java will not internally call a default constructor
// That is why employee.java - we count not create the object without parameters in it

// Method chaining - builder pattern
// Another style of calling the method
// Every method returns the current class object so that you can create a builder pattern

// When designing the framework will see why we avoid builder patterns with the page object model
// It is popular pattern in Rest Assured


