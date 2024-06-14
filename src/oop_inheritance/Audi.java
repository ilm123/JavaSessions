package oop_inheritance;

/* Day 20 - 17th Jan
* Java_19_OOP_Inheritance_MethodOverriding_DiamondProblem_Multiple_MultiLevel_Inheritance.mp4
* part 1_4*/

public class Audi extends Car {

	public void theftSafety() {
		System.out.println("Audi -- theftSafety");
	}
	
	@Override
	public void engine() { //overriding from the grand parent
		System.out.println("Audi -- engine");
	}

}
