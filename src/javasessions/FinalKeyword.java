package javasessions;

/* Day 14 - 5th Jan
 * Java_13_Methods_DifferentTypesOfMethods_CallByValue_ReturnType_Void.mp4
 * part 1*/

public class FinalKeyword {

	static final int i = 20;
	static int j = 30;
	int k = 40;

	public static void main(String[] args) {

		final int i = 10;//local var

		System.out.println(i);// Precedence given to the local var
		System.out.println(FinalKeyword.i); // access the class var with class name because it has the 'static' keyword
		System.out.println(j);// another way to access a static var; directly.

		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.k);

		// Constant vars
		final int DAYS_IN_WEEK = 7;
		int salary = 500 * DAYS_IN_WEEK;
		System.out.println(salary);
	}

}
