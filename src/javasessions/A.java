package javasessions;

/* Day 16 - 9th Jan
 * Java_15_StaticMethod_StackMemory_StackOverFlowError_MethodCalling.mp4
 * part 3_1*/

public class A {

	public static void main(String[] args) {
		System.out.println("A-main"); // Calling loop - stack overflow error
		B.main(args);
	}

}
