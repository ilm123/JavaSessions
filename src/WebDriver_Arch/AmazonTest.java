package WebDriver_Arch;

import ExceptionHandling.MyException;

public class AmazonTest {

	static WebDriver driver; // Global variable. Can also create the object and use it. If you don't want to
								// create the object then use static. Then it can be called with the class name.

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browser = "opera"; // user input/xml/excel
		// WebDriver driver = null; // This is a local variable. Local variables have to
		// be initialized with their
		// default values. object references are always initialized with their default
		// values which is 'null'

		// cross browser logic -- with top casting -- switch case/if else
		// init the driver only once
		// parallel run - top casting helps to run in parallel mode

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser");
			throw new MyException("no browser found");
			//break; cannot have break statement with throw. Both terminate the program
		}

		driver.get("httpe://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title: " + title);

		if (title.equals("amazon")) {
			System.out.println("Title is PASSED");
		} else {
			System.out.println("Title is FAILED");
		}

		String url = driver.getURL();
		System.out.println(url);

		driver.findElement("logo");

		driver.sendKeys("User Name ", "Ilma");
		driver.sendKeys("Password ", "ilma123");
		driver.click("loginbutton");

		driver.close();

		driver.findElements();
	}

}
