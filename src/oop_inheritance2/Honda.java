package oop_inheritance2;

/* Day 21 - 18th Jan
* Java_20_TopCasting_DownCasting_Inheritance_Rules_FinalKeyword.mp4
* part 1_4*/

public class Honda extends Car {

	@Override
	public void start() {
		System.out.println("Honda -- start");
	}

	public void fuelEff() {
		System.out.println("Honda -- fuelEff");
	}

	public void parking() {
		BMW bmw = new BMW(); // composition - accessing a sibling feature. NOT inheritance
		bmw.autoParking();
	}

}
