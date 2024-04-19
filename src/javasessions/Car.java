package javasessions;

/* Day 13 - 4th Jan
 * Java_12_CLass_Objects_NoReference_NullReferenceObjects_GarbageCollector_Heap_Stack_StaticVariables_PermGen_MetaSpace.mp4
 * part 2*/

public class Car {

	String name;
	String licenseNumber;
	double price;
	String color;
	static final int wheels = 4; //AKA class static variable
	//final static int wheels = 4;

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.licenseNumber = "12121";
		c1.price = 80.11;
		c1.color = "Red";

		Car c2 = new Car();
		c2.name = "Audi";
		c2.licenseNumber = "3232";
		c2.price = 82.11;
		c2.color = "Black";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.licenseNumber = "4343";
		c3.price = 22.11;
		c3.color = "White";

		//Car.wheels = 5;

		//How. to access Static Variables?
		// 1. With the class name
		System.out.println(Car.wheels);

		System.out.println(c1.name + " " + c1.licenseNumber + " " + c1.price + " " + c1.color + " " + Car.wheels);
		
		System.out.println(c2.name + " " + c2.licenseNumber + " " + c2.price + " " + c2.color + " " + Car.wheels);
		
		System.out.println(c3.name + " " + c3.licenseNumber + " " + c3.price + " " + c3.color + " " + Car.wheels);
		
		//2. Directly - but not a good practice. If there other classes with wheels property then cannot differentiate
		System.out.println(wheels);
		
		//3. Object Reference
		System.out.println(c1.wheels);

	}

}
