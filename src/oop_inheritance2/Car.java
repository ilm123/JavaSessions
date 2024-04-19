package oop_inheritance2;

/* Day 21 - 18th Jan
*  Java_20_TopCasting_DownCasting_Inheritance_Rules_FinalKeyword.mp4
*  part 1_1*/

public class Car extends Vehicle {

	// final class -- can not be a parent -- can not be inherited
	// final methods -- can not be overridden but can be inherited
	// final var: constant var -- value can not be changed

	int maxSpeed = 100;

	static int price = 1000;

	final int minSpeed = 10;

	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}

	public void billing() {
		System.out.println("Car -- billing");
	}

	// The following methods cannot be overridden

	public static void carDisplay() {
		System.out.println("Car -- carDisplay");
	}

	private void show() {
		System.out.println("Car -- show");
	}

	public void showCar() {
		show();
	}

	public final void runFourWheels() {
		System.out.println("Car -- runFourWheels");
	}

	public static final void loadCar() {
		System.out.println("Car -- loadCar");
	}

}
