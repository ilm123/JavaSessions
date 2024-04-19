package javasessions;

/* Day 16 - 9th Jan
 * Java_15_StaticMethod_StackMemory_StackOverFlowError_MethodCalling.mp4
 * part 4*/

public class Browser {
	String name;//class var

	public void m1() {
		int i = 10;//local var
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
		System.out.println("Hello m2");
	}

	public void m3() {
		System.out.println("m3 method");
		 m1();
	}
	
//	public static void t1() {
//		System.out.println("t1 method");
//		t2();
//	}
//
//	public static void t2() {
//		System.out.println("t2 method");
//		t3();
//	}
//
//	public static void t3() {
//		System.out.println("t3 method");
//		t1();
//	}

	public static void main(String[] args) {
		Browser obj = new Browser();
		 obj.m1(); // Stack overflow
		
//		Browser.t1();

	}

}
