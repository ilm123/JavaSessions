package builderpattern;

/* Day 18 - 12th Jan
 * Java_17_BuilderPattern_ThisKeyword_UseCases_This_WithMethods.mp4
 * part 2_1*/

public class EcommApplication {

	// no default const...is written ---> java will add one default hidden const....

	public EcommApplication login(String un, String pwd) {
		System.out.println("logged in with: " + un + " " + pwd);
		//return new EcommApplication(); // returns the current class object. The object is created using 'new'
		return this; // returns the current class object/same object. will not create another object
	}

	public EcommApplication login(String un, String pwd, String role) {
		System.out.println("logged in with: " + un + " " + pwd + " " + role);
		return this;
	}

	public EcommApplication search(String productName) {
		System.out.println("search: " + productName);
		return this;
	}

	public EcommApplication search(String productName, String color) {
		System.out.println("search: " + productName + " " + color);
		return this;
	}

	public EcommApplication search(String productName, String color, int price) {
		System.out.println("search: "  + productName + " " + color + " " + price);
		return this;
	}

	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart: " + productName);
		return this;
	}

	public EcommApplication payment(String upi) {
		System.out.println("making payment via upi: " + upi);
		return this;
	}

	public EcommApplication payment(String cc, int cvv) {
		System.out.println("making payment via credit card " + cc + " " + cvv);
		return this;
	}

	public EcommApplication getOriderId() {
		System.out.println("order is done. The orider id is: " + 12345);
		return this;
	}

	public EcommApplication logout() {
		System.out.println("logged out");
		return this;
	}

}

//advantage of the 'this' keyword - only 1 object is created whereas
// new EcommApplication() will create another object. It is an anti pattern. 10 methods, 10 objects
