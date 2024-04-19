package oop_inheritance;

/* Day 20 - 17th Jan
* Java_19_OOP_Inheritance_MethodOverriding_DiamondProblem_Multiple_MultiLevel_Inheritance.mp4
* part 1_1*/

public class Car extends Vehicle {

	int maxSpeed = 100;

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

}
