package SuperKeyword;

public class HomePage extends WebPage {

	public int speed = 50;

	public HomePage() {
		super(10);// calls the parent class constructor. should be the 1st statement of the child class cons
		System.out.println("HomePage -- Default Constructor");
		super.calculateTimeOut();
		System.out.println(super.speed);
	}

	public HomePage(int i) {
		super(i + 10);
		System.out.println("HomePage -- constructor " + i);
	}

	@Override
	public void pagePanel() {
		System.out.println("HomePage -- pagePanel");
	}

	// Method Hiding
	public static void billing() {
		System.out.println("HomePage -- billing");
	}

	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();
		System.out.println("HomePage -- calculateTimeOut 5");
		super.logo();
		System.out.println(super.speed); // direct parent/grandparent
		System.out.println(this.speed); // class. 'this' means current child class. can not use 'this' keyword also
		super.speed = 20; // possible to change the value because it doen't have the final keyword
		System.out.println(super.speed); // direct parent

		super.pagePanel(); // no need to use super keyword to access family property. not mandatory unless
							// it has been overridden

		HomePage.billing();
		this.billing(); // Not recommended. this keyword is pointing to the current class object
		billing();
		
		WebPage.billing(); // calling parent class static method
		super.billing(); // calling parent class static method - it doesn't give the warning that it
							// should be accessed in a static way because the object is not being created
							// but better to avoid this way because you cannot recognize if it is a static
							// method
		
	}

	// super:
	// is used to call parent class const...it should be the first statement
	// super & this can not be together in the const...
	// is used to access parent class methods and vars
}
