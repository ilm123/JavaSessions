package ExceptionHandling;

/* Day 25 - 26th Jan
*  Java_24_ExceptionHandling_TryCatch_Throws_Keywords.mp4
*  part 2*/

public class Employee {

	// amazon - cart
	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	// amazon - payment
	public void m2() {
		System.out.println("m2 method");

		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE is comming");
		}
	}

	// HDFC bank server
	public void m3() throws NullPointerException { // we throw a null pointer but the try catch block handles it when it
													// shoudn't. Don't write the code like this. What ever the exception
													// that being thrown should be the same in the try catch block. Kind of a bug?
		System.out.println("m3 method");
		int i = 9 / 0;
		System.out.println("payment");
	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.m1();
		System.out.println("Bye!");

	}

}
