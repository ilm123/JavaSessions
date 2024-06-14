package oop_inheritance;

/* Day 20 - 17th Jan
* Java_19_OOP_Inheritance_MethodOverriding_DiamondProblem_Multiple_MultiLevel_Inheritance.mp4
* part 1_3*/

// Caller class
public class TestCar {

	public static void main(String[] args) {
		
		System.out.println("***BMW Reference***");
		BMW b = new BMW();
		b.start(); //overridden
		b.stop(); //inherited
		b.refuel(); //inherited
		b.autoParking(); //individual
		b.engine(); //inherited
		b.billing(); //overridden
		b.provideTransport(); //inherited
		b.examinBrakes(); //inherited		
		b.electricalEngineering(); //inherited
		b.torque();
		b.linearMotion(); //overridden
		
		System.out.println(b.maxSpeed);
				
		System.out.println("-----------");
		System.out.println("***Car Reference***");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine(); //inherited
		
		System.out.println("-------------");
		System.out.println("***Audi Reference***");
		Audi au = new Audi();
		au.start(); //inherited
		au.stop(); //inherited
		au.refuel(); //inherited
		au.theftSafety(); //individual
		au.engine(); //overridden
		au.billing(); //inherited
		
		System.out.println(au.maxSpeed);
		
		System.out.println("------------");
		System.out.println("***Truck Reference***");
		Truck tr = new Truck();
		tr.engine(); //inherited
		tr.heavyLoading(); //individual

	}

}

//7 levels
//1 Physics
//2 Science
//3 Mechanical
//4 Automobile
//5 Vehicle
//6 Car , Truck - Siblings
//7 BMW, Audi - Siblings