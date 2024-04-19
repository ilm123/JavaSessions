package javasessions;

/* Day 5 - 13th Dec
 * Java_04_TypeCasting_Widening_Narrowing_Increment_Decrement_Operators.mp4
 * Part 2*/

public class IncrementDecrementalOperators {

	public static void main(String[] args) {
		
		// 1. Post Increment
		int a = 1;
		int b = a++;
		System.out.println(" --- Post Increment---");
		System.out.println(a);
		System.out.println(b);
		System.out.println(b);
		
		
		int g = -98;
		int h = g++;
		System.out.println(g);
		System.out.println(h);
					
		int k = 10;
		System.out.println("K value post increment " + k++);
		System.out.println(k);
		
		//2. Pre Increment
		int x = 1;
		int y = ++x;
		System.out.println(" --- Pre Increment---");
		System.out.println(x);
		System.out.println(y);
		
		int p = -99;
		int q = ++p;
		System.out.println(p);
		System.out.println(q);
		
		int total = 10;
		System.out.println("total pre increment " + ++total);
		System.out.println(total);
		
		//3. Post Decrement
		int u = 2;
		int r = u--;
		System.out.println(" --- Post Decrement---");
		System.out.println(u);
		System.out.println(r);
		
		int s1 = 10;
		System.out.println(s1--);
		System.out.println(s1);
		
		//4. Pre Decrement
		int m = 2;
		int n = --m;
		System.out.println(" --- Pre Decrement --- ");
		System.out.println(m);
		System.out.println(n);
		
		int t1 = -999;
		int t2 = --t1;
		System.out.println(t1);
		System.out.println(t2);
		
		
		System.out.println(" --- Other examples --- ");
		int m1 = 5;
		int k1 = m1++ + ++m1;
		System.out.println(m1);
		System.out.println(k1);
	}

}
