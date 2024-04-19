package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {

		String browser = "ie";

		if (browser.equals("chrome")) {
			System.out.println("open chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("open firefox");
		} else if (browser.equals("safari")) {
			System.out.println("open safari");
		} else {
			System.out.println("please pass the right browser");
			throw new MyException("WRONGBROWSEREXCEPTION"); // Deliberately throws the exception. When throwing the
															// exception give a message. If try catch is used, after
															// handling the exception it will launch the browser which
															// we don't want happening.
			}

			System.out.println("browser is launched");
		}
}
