package javasessions;

/* Day 4 - 12th Dec
 * Java_03_StringDataType_StringConcatenation_ArithmaticOperators.mp4
 * part 2*/

public class MathematicalOperators {

	public static void main(String[] args) {
		System.out.println(10 / 2);

		// .5 will be removed when both the numbers are pure integer
		System.out.println(9 / 2);
		
		System.out.println(9 / 2.0);
		System.out.println(9.0 / 2);
		System.out.println(9 / 2f);
		System.out.println(12.36 / 4);

		// System.out.println(9/0); //AE-any number divided by 0 is infinity. There is
		// no infinity defined for the integers in java

		System.out.println(0 / 9);
		System.out.println(0 / 12.33);
		// System.out.println(0/0); //AE

		System.out.println(9.0f / 0); //Infinity
		System.out.println(9.0 / 0); //Infinity
		System.out.println(9 / 0.0); //Infinity
		System.out.println(9.0 / 0.0); //Infinity
		
		System.out.println(0.0 / 0.0); //Nan
		System.out.println(0 / 0.0); //Nan
		System.out.println(0.0 / 0); //Nan
		
		System.out.println('a' / 'a');
		//System.out.println('a' / 0); //AE
		System.out.println(0 / 'a');
		
		System.out.println("----Modulus--- ");
		// usage - if number is totally divisible by 2, it is an even number. otherwise it is an odd number
		System.out.println(10 % 2);
		System.out.println(9 % 2);
		System.out.println(100 % 5);
		System.out.println(100 % 3);
		System.out.println(17 % 3);
		
		System.out.println(9.2 % 2);
		
		System.out.println(0 % 10);
		//System.out.println(10 % 0); //AE
		System.out.println(2 % 10); //2 - gives the same number. so make sure the first number is larger than the second number.
		System.out.println(5 % 10); // otherwise it will give you the same number	
		System.out.println(7 % 10);
		
		//-----Escape the character
		System.out.println("Hi I love Java coding");
		System.out.println("Hi I love \"Java\" coding"); // need to use an xpath that has double quotes. in JSON it automatically adds the escape
		System.out.println("Hi I love 'Java' coding");
		
		// byte range = -127 to 128 --> 128+127+1-256
		byte b1 = 10;
		byte b2 = 30;
		int b3 = b1+b2; // when ever you add two bytes, store it in an integer or long. but right data type int
		System.out.println(b3);
		
		short v1 = 1000;
		short v2 = 2000;
		int v3 = v1+v2;
		System.out.println(v3);
		
		byte b4 = (byte) 300; // 44. bad practice to write like this (300 - 256 (256 is the number of bytes range)
		System.out.println(b4); //can change to int but it is unnecessary to write it like this
		
		int b5 = (byte) 400; // -112. bad practice to write like this. 
		System.out.println(b5);
		

		

	}

}
