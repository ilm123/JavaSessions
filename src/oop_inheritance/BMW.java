package oop_inheritance;

/* Day 20 - 17th Jan
* Java_19_OOP_Inheritance_MethodOverriding_DiamondProblem_Multiple_MultiLevel_Inheritance.mp4
* part 1_2*/

public class BMW extends Car {
	
	// This is not Variable Overriding. BMW has it's own max speed/variable
	int maxSpeed = 200;

	// method overriding: Poly + morphism (Run time - dynamic binding)
	// When you have a method in the Parent class and the same method in the child class also
	// with the same name
	// With the same number of parameters
	// Same type of parameters	
	// Same sequence of parameters
	// Same return type
	
	@Override //not compulsory to write but a good practice
	public void start() {
		System.out.println("BMW -- Start");
	}

	public void autoParking() {
		System.out.println("BMW -- Auto Parking");
	}
	
	@Override
	public void billing () {
		System.out.println("BMW -- billing");
	}
	
	@Override
	public void linearMotion() {
		System.out.println("BMW -- linearMotion");
	}
}

// Polymorphism - Many forms of the same method
// method overloading - Compile time polymorphism