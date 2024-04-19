package javasessions;

/* Day 5 - 13th Dec
 * Java_04_TypeCasting_Widening_Narrowing_Increment_Decrement_Operators.mp4
 * Part 1*/

public class DataTypeCasting {

	public static void main(String[] args) {
		
		// <byte - short - int - long - float - double>
		
		byte b = 10;
		int c = b;
		System.out.println(c);
		
		int p = 150;
		byte q = (byte) p;
		System.out.println(q); //loosing the data
		
		long l = p;
		System.out.println(l);
		
		long l1 = 1000;
		float f1 = l1;
		System.out.println(f1);
		
		float f = 12.33f;
		long l2 = (long) f;
		System.out.println(l2);
		
		int i1 = (int) f;
		System.out.println(i1);
		
		float f2 = 800.85f;
		byte b2 = (byte) f2;
		System.out.println(b2); //data loss occurs
		
		char ch = 'I';
		int i2 = ch; //character can be stored in an integer , byte
		System.out.println("Prints the ASCII value: " + i2);
		
		int i3 = 10;
		char ch2 = (char) i3; // Narrowing
		System.out.println("int to char:" + ch2); // nothing is printed bcz nothing is available in ASCII
		
		int i4 = 73;
		char ch3 = (char) i4;
		System.out.println("int to char:" + ch3);
	}

}
