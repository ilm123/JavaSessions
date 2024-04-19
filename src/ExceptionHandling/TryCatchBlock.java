package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* Day 25 - 26th Jan
*  Java_24_ExceptionHandling_TryCatch_Throws_Keywords.mp4
*  part 1*/

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			Thread.sleep(5000); // Compile Time Exception / Checked Exception
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			FileInputStream file = new FileInputStream("user/test.xml"); // Compile Time Exception / Checked Exception
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		/*----------------------------------*/
		
		try { //Run Time Exceptions/Unchecked Exception
			TryCatchBlock obj = new TryCatchBlock();
			// obj = null;
			obj.name = "Ilma"; // NPE

			int i = 9 / 0; // AE
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception is comming...");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Null Pointer exception is comming...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception is comming...");
			e.printStackTrace();
		}

		System.out.println("Bye!");

	}

}
