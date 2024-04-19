package javasessions;
/* Day 16 - 9th Jan
 * Java_15_StaticMethod_StackMemory_StackOverFlowError_MethodCalling.mp4
 * part 3_2*/

public class B {

	public static void main(String[] args) {
		System.out.println("B-main");
		A.main(args);
	}

}
