package ExceptionHandling;

/* Day 26 - 29th Jan
*  Java_25_ThrowKeyword_CustomException_String_ManipulationMethods.mp4
*  part 1*/

public class ThrowKeyword {

	public static void main(String[] args) {

		String data = null; // assume that this comes from an excel sheet

		try {
			if (data == null) { // This line is not handling the exception. It is throwing it and will be
								// handled by the try catch block
				throw new Exception("DATANOTFOUND"); // create an object of the Exception class. This will call the
														// constructor
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
