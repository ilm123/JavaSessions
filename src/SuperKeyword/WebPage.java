package SuperKeyword;

/* Day 24 - 24th Jan
* Java_23_WebDriverVsAbstractClass_SuperKeyword_UseCases.mp4
* part 1*/

public class WebPage extends Page{

	//public int speed = 10;

	public WebPage() {
		super(); // There is a class in java that is the Super class of all the classes. Object
					// Class. Calls the object class default constructor
		System.out.println("WebPage -- Default constructor");
	}

	public WebPage(int i) {
		System.out.println("WebPage -- constructor " + i);
	}

	public void calculateTimeOut() {
		System.out.println("WebPage -- calculateTimeOut 20");
	}

	public final void logo() {
		System.out.println("WebPage -- logo");
	}
	
	public static void billing() {
		System.out.println("WebPage -- billing");
	}
	
	@Override
	public void pagePanel() {
		super.pagePanel();
		System.out.println("WebPage -- pagePanel");
	}

}
