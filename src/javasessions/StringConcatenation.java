package javasessions;

/* Day 4 - 12th Dec
 * Java_03_StringDataType_StringConcatenation_ArithmaticOperators.mp4
 * part 1*/

public class StringConcatenation {

	public static void main(String[] args) {
		String s1 = "100";
		String s2 = "a";
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		
		//Execution starts from left to right. Because of the bracket you say first handle what is in the brackets
		// So inside the bracket it behaves as an arithmetic operator
		System.out.println(x+y+(a+b));
		
		System.out.println(s1+s2);
		
		double d1 = 21.33;
		double d2 = 30.04;
		
		System.out.println(x+y+d1+d2);
		System.out.println(x+y+(d1+d2));
		
		char c = 'a';
		String t = "Hello";
		
		System.out.println(t+c);
		System.out.println(t+c+'b');
		System.out.println(c+'b'+t);
		
		int p = 100;
		int q = 200;
		
		System.out.println("The value of p is: " + p);
		System.out.println("The value of q is: " + q);
		System.out.println("The sum of p and q is " + (p+q));
		
		System.out.println('0' + 'a' + 'A');
		System.out.println('0' + 'a' + 'A' + "Hello");
		System.out.println("Hello" + '0' + 'a' + 'A');
		
		System.out.println(1*1*10/2 + "Hello");

	}

}
