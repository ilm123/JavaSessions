package WebDriver_Arch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("Chrome is launched");
	}

	@Override
	public void get(String url) {
		System.out.println("Launch URL: " + url);

	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public String getURL() {
		return "https://www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("click on element: " + eleName);

	}

	@Override
	public void sendKeys(String eleName, String value) {
		System.out.println("entering value in: " + eleName + "value " + value);

	}

	@Override
	public void close() {
		System.out.println("Browser is closed");

	}

	@Override
	public void findElement(String ele) {
		System.out.println("Find element: " + ele);

	}

	@Override
	public void findElements() {
		System.out.println("Find elements on the page");

	}

}
