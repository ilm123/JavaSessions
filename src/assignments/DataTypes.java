package assignments;

public class DataTypes {

	public static void main(String[] args) {
//		1. Write a Java program to add two strings:
//			String a = “Hello”;
//			String b = “Naveen K”
//			Expected Output :
//			Hello Naveen K

		String a = "Hello";
		String b = " Naveen K";
		System.out.println(a + b);

//		2. Write a Java program to print the sum of two numbers.
//		Test Data:
//		 74 + 36 
//		Expected Output:
//		110

		byte b1 = 74;
		byte b2 = 36;
		System.out.println(b1 + b2);

//		Write a Java program to print the division of two numbers.
//		k = 50/3
//		Expected Output : 
//		43 
//		16 — correct one
//		19
//		13

		int k = 50 / 3;
		System.out.println(k);

//		4. Write a Java program to compute the specified expressions and print the output. Go to the editor.
//		Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//		Expected Output
//		2.138888888888889

		double d = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(d);

//		5. Try to concat "Hello Selenium" with a character 't'.

		String st = "Hello Selenium";
		char ch = 't';

		System.out.println(st + ch);

//		6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//		"Your Total  amount is: 3700".
		
		int c = 100;
		int e = 200;
		int f = 3400;
		
		System.out.println("\"Your Total  amount is: " + (c+e+f));
		
//		Print the ASCII value of the character 'h'.
		
		char ch2 = 'h';
		System.out.println((byte)'h');
		
//		Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		
		char ch3 = 'd';
		System.out.println(3+(byte)ch3);
		
//		Write a program to find the square of the number 3.9.
		
		double d2 = 3.9;
		System.out.println(d2*d2);
		
//		Or using Math class with pow() method.
		System.out.println(Math.pow(d2, 2));

	}

}
