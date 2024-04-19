package ExceptionHandling;

/* Day 28 - 31st Jan
*  Java_27_StringBuffer_StringBuilder_FinallyBlock_Examples.mp4
*  part 3*/

//******Interview Q

public class FinallyBlockQuestion {
	
	// try - finally -- yes
	// try -- catch -- yes
	// try --- no
	// catch -- finally -- no
	// try--catch -- finally -- yes
	// try -- try - catch - finally -- no
	// try -catch --finally --finally -- no
	// try catch catch catch catch --finally -- yes

	public static int getMarks(String studentName) {
		System.out.println("Getting the marks for: " + studentName);

		if (studentName.equals("rahul")) {
			try {
				int i = 9 / 3;
//				System.exit(1); // shuts down the JVM. not used in automation
				return 80;
			} catch (ArithmeticException e) {
				System.out.println("AE is comming...");
				return 70;
			} finally {
				System.out.println("Finally block");
				return 60; // generally we don't right a return in the finally block. Preference is always
							// given to the finally block. Finally block return will be the latest return.
			}

		} else if (studentName.equals("frank")) {
			return 50;
		} else if (studentName.equals("naveen")) {
			return 40;
		} else {
			System.out.println("Please pass the right student name...");
			return -1;
		}
	}

	public static void main(String[] args) {
		int m = getMarks("rahul");
		System.out.println(m);
	}

}
