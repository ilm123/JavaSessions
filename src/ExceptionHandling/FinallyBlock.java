package ExceptionHandling;

/* Day 28 - 31st Jan
*  Java_27_StringBuffer_StringBuilder_FinallyBlock_Examples.mp4
*  part 2*/

public class FinallyBlock {

	public static void main(String[] args) {
		// Doesn't matter if the exception comes or not, the finally block will always
		// be executed
		// try block can be written without the catch block but the finally block must
		// exist

		try {
			int i = 9 / 0;
			System.out.println("Hello Selenium");
//		} catch (ArithmeticException e) {
//			System.out.println("exception is coming");
//			e.printStackTrace();
		} finally {
			System.out.println("I am in the finally block!");
		}

		// when to use finally block?

		// make the connection with DB(SQL): username/pwd
		// hit the SQL: select * from Employee;

		// try-catch
		// String result = get the results from DB/table

		// finally{}
		// close the db connection

		// use the results in script

		// continue code
		// logout

		// file system:

		// final finally{} finalize()
	}

}
