package ExceptionHandling;

/* Day 26 - 29th Jan
*  Java_25_ThrowKeyword_CustomException_String_ManipulationMethods.mp4
*  part 2*/

// A custom exception class / template
public class MyException extends RuntimeException {

	public MyException(String msg) {
		super(msg); // Calls the constructor of the RuntimeException
		// supply the same message to RuntimeException class. RuntimeException has the
		// logic to handle the exception.
		// Otherwise we have to write our own logic to handle the exception. We are not
		// aware of how the exception is handled internally by java
	}
	// Throwable
	// Exception
	// RunTimeException
	// AE, NPE,
}
