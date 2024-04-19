package javasessions;

/* Day 3 - 11th Dec
 * Java_02_DataTypes_Range_Size.mp4*/

public class DataTypes {

	public static void main(String[] args) {

		// primitive data types
		// Numeric
		 // Integral
		  //  ******************Integer ******************

		// ---1.byte---
		byte b = 25;
		byte b1 = -128;
		b1 = 0;
		b1 = 127;
		byte age = 20;
		System.out.println(b1);
		System.out.println(age);
		// e.g.age, days in a week, months

		// ---2.short---
		short s = 200;
		short s2 = 1;
		System.out.println(s);
		System.out.println(s + s2);

		// ---3.int---
		int i = 565656;
		// e.g. bill amount, pricing information
			
		// ---4.long---
		long l = 123456789123456789l;
		// e.g world population, distance between two planets, medical ranges,
		System.out.println(l);
		
		//long l1 = (long) 123456789123456789;
				
		// phone number, SSN use String because no calculation is done
		
		// primitive data types
		// Numeric
		 // Integral
		  //  ******************Floating Point ******************
				
		// ---1.float---
		float f = 100.1234567f;
		System.out.println(f);
		
		float f1 = (float) 200.1234567;		
		System.out.println("float data type 7 digits: " + f1);
		
		float f3 = 100f; // can store integers in float data type. but at run time it considered as a dot value
		System.out.println(f3); 
		
		//e.g. Build Number (calculation is done to increment it by 1)
		
		// ************ Machine works differently for floating numbers ****************
		
		float f4 = 54.987654f;
		System.out.println("changes the number " + f4); //source code > byte code > machine code (zeros and ones) > display on screen. 
		//it looses some bits. these problems are solved using wrapper class
		
		System.out.println(0.1 + 0.1);
		System.out.println(0.1 + 0.2); //same result in java script. might get some different digits
		
		// ---2.double---
		double d = 300.123456789123456;
		System.out.println("double data type 15 decimals: " + d);
		//e.g price, temperature, tax
		
		// primitive data types
				// Numeric		
				  // ---char---
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);
		System.out.println(c2);
		
		//ASCII number - Refer table online and check the Decimal number column
		System.out.println(c1+c2); // ASCII value 97+98		
		System.out.println(c1-c2); // ASCII value 97-98
		
		System.out.println('1' + '2');
		System.out.println('1');
		
		char n1 = 'A';
		System.out.println(n1);
		System.out.println((byte)n1);
		
		//you can store a value inside a variable before using it or you can directly use the value	
		System.out.println((byte)'@');		
		
		System.out.println(100 + 'a');
		System.out.println('a' + 'b');
		
		//To print ab, concatenate it with a string. will learn more in the next lesson
		System.out.println('a' + "" + 'b');
		
		//char p1 = "Ć";
		
		// primitive data types		
		// ---boolean---
		
		boolean flag = true;
		boolean pop = false;
		boolean isUserActive = true;
		
		int k; // bad practice to not initialize the value
		k = 10;
		System.out.println(k);
	}

}
