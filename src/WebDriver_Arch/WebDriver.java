package WebDriver_Arch;

/* Day 23 - 23rd Jan
* Java_22_AbstractClass_Vs_Interface_TopCasting_Examples.mp4
* part 3*/

public interface WebDriver extends SearchContext {

	public void get(String url);

	public String getTitle();

	public String getURL();

	public void click(String eleName);

	public void sendKeys(String eleName, String value);

	public void close();

	// Can override parent interface methods but doesn't sever a purpose as you
	// cannot give a method body

	@Override
	public void findElement(String ele);

	@Override
	public void findElements();

}
