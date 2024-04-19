package javasessions;

/* Day 7 - 18th Dec
 * Java_06_ShortCircuitOperator_AND_OR_Operators_Loops_While_Loop.mp4
 * Part 2*/

public class LoopsConcept {

	public static void main(String[] args) {
		
		//while Loop
		//------------
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			//i++;
			//i=i+1;
			//i+=1;
			++i;
			break; // entire loop is broken
		}
		
		while (true) {
			System.out.println("Welcome to the Taj Hotel");
			break;
		}
		
		int k=1;
		while (k<=50) {
			System.out.println(k);
			if (k%5 == 0) {
				System.out.println("Hi");
				break; // breaks the loop. not the if condition
			}
			k++;
		}
		
		boolean flag = true;
		
		while (!flag) {
			System.out.println("Welcome");
		}
		
		int p=60;
		while (p>=50 && p<=70) {
			System.out.println(p + " Testing");
			p--;
		}

	}

}
