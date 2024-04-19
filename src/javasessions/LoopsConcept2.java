package javasessions;

/* Day 8 - 19th Dec
 * Java_07_LoopsConcepts_For_While_DoWhile_.mp4
 * */

public class LoopsConcept2 {

	public static void main(String[] args) {

		// for Loop
		// -------------
		// 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int j = 1; j <= 10;) {
			System.out.println(j);
			j++;
		}

		for (;;) {
			System.out.println("Bye");
			break;
		}

		for (float k = 1.0f; k <= 5.5;) {
			System.out.println(k);
			k = k + 0.1f; // Generates some additional decimals because that is the behavior of decimal
							// numbers
			// in the programming world. source code>byte code>machine code. Solved using
			// wrapper class
		}

		char ch = 'a';
		for (; ch <= 'z'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}

		char ch2 = 'A';
		for (; ch2 <= 'Z'; ch2++) {
			System.out.println(ch2 + "=" + (byte) ch2);
		}

		System.out.println("----------------------");

		for (char cg = 97; cg <= 122; cg++) {
			System.out.println(cg + "=" + (byte) cg);
		}
		System.out.println("----------------------");

		int x = 0;
		for (int k = 0; k <= 9; k++) {
			System.out.println("Ascii value of " + k + "is:" + (x + 48));
			x++;
		}

		// For loop reverse order
		for (byte num = 10; num > 0; num--) {
			System.out.println(num);
		}

		// While Loop - reverse order

		int p = 10;
		while (p > 0) {
			System.out.println(p);
			p--;
		}

		System.out.println("----------------------");
		// do while loop
		// -----------------

		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);
		System.out.println("----------------------");
		
		// print odd and even numbers using the for loop
		
		for (int g=1; g<=10; g+=2) {
			System.out.println(g);
		}
		System.out.println("----------------------");
		
		for (int g=2; g<=10; g+=2) { //0 is not considered as an even or odd number)
			System.out.println(g);
		}
		
		System.out.println("----------------------");
		for (int g=1; g<=10; g++) {
			if (g%2!=0) {
				System.out.println(g + " is and odd number");
			}
			else {
				System.out.println(g + " is an even number");
			}
		}

	}

}
