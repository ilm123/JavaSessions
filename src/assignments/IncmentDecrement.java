package assignments;

public class IncmentDecrement {

	public static void main(String[] args) {

		// 1.

		int i = 11;

		i = i++ + ++i;
		System.out.println(i);

		// 2.

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		// 3.

		int z = 0;
		z = z++ - --z + ++z - z--;
		System.out.println(z);

		// 4) Is the below program written correctly? No. Cannot apply operators on
		// boolean values
//		boolean g = true;
//		g++;
//		System.out.println(g);

		// 5.

		int y = 1, j = 2, k = 3;
		int m = y-- - j-- - k--;

		System.out.println("y=" + y);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("m=" + m);

		// 6.

		int d = 1, e = 2;

		System.out.println(--e - ++d + ++e - --d);

		// 7.
		int f = 19, g = 29, h = 0;
		int n = f-- - g-- - h--;

		System.out.println("f=" + f);
		System.out.println("g=" + g);
		System.out.println("h=" + h);

		System.out.println("total=" + n);

		// 8.What is wrong with the below program? Why it is showing compilation error?
		// A. You cannot have increment operators on both sides of the variable. It should be either --i2 or i2++ in this case..
//		int i2 = 11;
//		int j2 = --(i2++);

		// 9.Guess the value of p in the below program?

		int m2 = 0, n2 = 0;
		int p = --m2 * --n2 * n2-- * m2--;
		System.out.println("value of p:" + p);
		System.out.println("value of m2:" + m2);
		System.out.println("value of n2:" + n2);

		// 10. What will be the output of the following program?

		int a2 = 1;
		a2 = a2++ + ++a2 * --a2 - a2--;
		System.out.println(a2);

		// 11) What will be the outcome of the below program? A. syntax error. cannot
		// perform operation directly on a number
//		int a3 = 11++;
//		System.out.println(a3);

		// 12) What will be the outcome of the below program?
		int ch = 'A';
		System.out.println(ch++);

		// 13) What will be the outcome of the below program?
		char chr = 'A';
		System.out.println(++chr);

		// 14) What will be the outcome of the below program?
		double d2 = 1.5, D = 2.5;
		System.out.println(d2++ + ++D);
		System.out.println(d2);
		System.out.println(D);

	}

}
