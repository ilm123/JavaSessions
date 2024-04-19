package oop_inheritance2;

/* Day 21 - 18th Jan
* Java_20_TopCasting_DownCasting_Inheritance_Rules_FinalKeyword.mp4
* part 1_2*/

public class BMW extends Car {

	// There is no concept of 'variable overriding'
	int maxSpeed = 200;

	static int price = 5000;
	
	final int minSpeed = 50;

	// method overriding: Poly + morphism (Run time - dynamic binding)
	// When you have a method in the Parent class and the same method in the child
	// class also
	// with the same name
	// With the same number of parameters
	// Same type of parameters
	// Same sequence of parameters
	// Same return type

	@Override // not compulsory to write but a good practice
	public void start() {
		System.out.println("BMW -- Start");
	}

	public void autoParking() {
		System.out.println("BMW -- Auto Parking");
	}

	@Override
	public void billing() {
		System.out.println("BMW -- billing");
	}

	@Override
	public void linearMotion() {
		System.out.println("BMW -- linearMotion");
	}

	// Static methods can be inherited
	// Static methods cannot be overridden
	// The following method is considered as an individual method
	// This concept is called 'Method Hiding' (although nothing is being hidden)
	// Method Hiding - Parent class static method with same name in child class

	public static void carDisplay() {
		System.out.println("BMW -- carDisplay");
	}

	// Private methods can be inherited
	// Private methods cannot be overridden
	// The following method is considered as an individual method
	// To access it use a public method - Encapsulation

	private void show() {
		System.out.println("BMW -- show");
	}
	
	public void showCar() {
		show();
	}
	
	// Final methods can be inherited
	// Final methods cannot be overridden
	// Use Case - Logo on a page should not be changed in any page
//	public final void runFourWheels() {
//		System.out.println("BMW -- runFourWheels");
//	}
}
