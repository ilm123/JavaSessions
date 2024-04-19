package javasessions;

/* Day 7 - 18th Dec
 * Java_06_ShortCircuitOperator_AND_OR_Operators_Loops_While_Loop.mp4
 * Part 1*/

public class MaxNumber {

	public static void main(String[] args) {
		// find out the max number. four different numbers
		int a = 100;
		int b = 200;
		int c = 3000;
		int d = 400;

		// can be solved with the single And but that will cause a performance issue
		if (a > b && a > c && a > d) {
			System.out.println("a is the greatest number");
		} else if (b > c && b > d) {
			System.out.println("b is the greatest number");
		} else if (c > d) {
			System.out.println("c is the greatest number");
		} else {
			System.out.println("d is the greatest number");
		}

		// find out the same numbers

		int e = 100;
		int f = 100;
		int g = 200;
		int h = 300;

//		if (e == f && e == g && e == h) {
//			System.out.println("All numbers are equal");
//		} 
//		else if (e == f || e == g || e == h)) {
//			System.out.println("e is ");
//		}
//		
//		else {
//			System.out.println("None of the numbers are equal");
//		}

		System.out.println("--------Nested If-----------");
		// This cannot be solved with Switch Case
		int marks = 25;

		if (marks >= 0 && marks <= 100) {
			if (marks >= 80 && marks <= 90) {
				System.out.println("Grade A");
			} else {
				if (marks > 90) {
					System.out.println("Grade A++");
					if (marks == 100) {
						System.out.println("You are eligable for a scholarship");
					}
				} else {
					if (marks >= 0 && marks <= 10) {
						System.out.println("FAILed");
					} else if (marks >= 11 && marks <= 30) { // Why else if? bcz if there are more ranges in future we
																// can add it here
						System.out.println("Grade C");
					}
				}
			}
		} else {
			System.out.println("Please pass the right marks");
		}
		
		boolean c1 = true;
		boolean c2 = true;
		boolean c3 = true;
		
		if (c1==c2 && c1==c3) {
			System.out.println("Selenium");
		}
		
		
		int d1 = 10;
		int d2 = 40;
		int d3 = 20;
		
		if (d1==d2 || d1==d3) {
			System.out.println("Welcome");
		}

	}

}
