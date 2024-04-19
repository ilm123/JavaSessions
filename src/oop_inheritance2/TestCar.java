package oop_inheritance2;

/* Day 21 - 18th Jan
* Java_20_TopCasting_DownCasting_Inheritance_Rules_FinalKeyword.mp4
* part 1_3*/

// Caller class
public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		Car c = new Car();

		Car.carDisplay(); //calling the static method
		BMW.carDisplay(); //calling the static method
		b.carDisplay();//calling the static method

		System.out.println(c.price);
		System.out.println(b.price);

		c.showCar();
		b.showCar();

		System.out.println();
		// final method and variable
		c.runFourWheels();
		b.runFourWheels();

		System.out.println(c.minSpeed);
		System.out.println(b.minSpeed);

		System.out.println();
		Car.loadCar();
		BMW.loadCar();
		c.loadCar();
		b.loadCar();

		System.out.println();
		Honda h = new Honda();
		h.start();
		h.stop();
		h.fuelEff();
		h.refuel();
		h.parking(); // Composition

		System.out.println();

		// child class object can be referred by parent class ref variable
		// Top/Up Casting
		Car cr = new Honda(); // Read as "Every Honda is a car". IS-A relationship
		cr.start(); // parent can access the overridden method
		cr.stop(); // inherited
		cr.refuel(); // inherited
		// top casting cannot access the individual methods

		System.out.println();
		// child class object can be referred by grand parent class ref variable
		Vehicle v1 = new Honda();
//		v1.start(); // reference check fails. start method is overridden from the car class and not the vehicle class
		v1.billing();
		v1.engine();

		System.out.println();
		// parent class object can be referred by child class ref variable?
		// down casting : ClassCastException
		Honda h1 = (Honda) new Car(); // Read as "Every car is a Honda"

		System.out.println();
		// Casting between siblings is not allowed. i.e Cannot inherit

//		Honda h3 = new BMW();

	}

}
