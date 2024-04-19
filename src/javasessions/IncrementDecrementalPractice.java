package javasessions;

/* Day 5 - 13th Dec
 * Java_04_TypeCasting_Widening_Narrowing_Increment_Decrement_Operators.mp4
 * Part 3*/

public class IncrementDecrementalPractice {

	public static void main(String[] args) {

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		int i = 0;
		int j = i++ - --i + ++i - i--;
		System.out.println(i);
		System.out.println(j);
		

		int d = 19, e = 29, k = 0;
		int m = d-- - e-- - k--;
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		System.out.println("k=" + k);
		System.out.println("m=" + m);
		
		
		// --- operators can be applied on float values
		
		float f1 = 1.1f;
		float f2 = f1++;
		
		System.out.println(f1);
		System.out.println(f2);
		
		// --- operators can be applied on chars
		
		char ch = 'a';
		System.out.println(++ch);
		
		char ch2 = 'i';
		System.out.println((byte)++ch2);
		
		int u = 2;
		int r = u--;
		System.out.println("u: " + u++);
		System.out.println("r: " + r);
		System.out.println("u: " + u);
	}

}
