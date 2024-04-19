package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

/* Day 14 - 5th Jan
 * Java_13_Methods_DifferentTypesOfMethods_CallByValue_ReturnType_Void.mp4
 * part 2*/

public class FunctionsInJava {

	// can not create a function/method inside a function
	// functions are parallel to each other
	// but can call a function from another function
	// Non Static functions -- data members of the class (variables and functions
	// are called data members)

	// 1st: function: no input and no return
	// input: no input - 0 parameter
	// return: void -- can not return anything
	public void test() {
		System.out.println("Test Method");
	}

	// 2nd: function: some input and no return
	// input: 1 input - 1 parameter
	// return type: void
	public void getBill(int days) { // 1 parameter
		System.out.println(("Getting Billing Info"));
		int finalAmount = days * 100;
		System.out.println(finalAmount);
	}

	// 3rd: function with some input and return
	// input: 2 inputs - 2 parameter
	// return type: int
	public int sum(int a, int b) { // 2 params functions
		System.out.println("adding two numbers");
		int s = a + b;
		return s;
	}

	// 4th: function: no input and some return:
	// input: no input - 0 parameter
	// return type: String
	public String getInfo() {
		System.out.println("getting information");
		String s = "Hello App";
		return s;
	}

	// return type: boolean
	public boolean isAppExist() {
		return true;
	}

	public int calculateMarks(int marks, int extraMarks, int discMarks) {
		int finalMarks = marks + extraMarks - discMarks;
		return finalMarks;
	}

	// Mix of data types
	public Object[] calculateTermMarks(int marks, float extraMarks, int discMarks) {
		float finalMarks = marks + extraMarks - discMarks;
		String s = "IBM";
		boolean flag = true;
		Object finalInfo[] = { s, finalMarks, flag };
		return finalInfo;
	}

	// Multiple return keywords are not allowed
	// cannot have any statement after the return keyword. return should be the last
	// statement in the function
	public int testing() {
		System.out.println("testing is done");
		return 100;
		// return 200;
		// System.out.println("bye");
	}

	// Blank Return - void; generally not a preferred way to write like this
	public void printName() {
		System.out.println("Ilma");
		return;
	}

	// It is not mandatory to return something
	public void launchURL(String url) {
		System.out.println(url);
	}

	// Return an array - non primitive
	public String[] devices() {
		String prod[] = { "Macbook pro", "ipad", "iphone" };
		return prod;
	}

	// Return an array list
	public ArrayList<String> getUserList() {
		ArrayList<String> users = new ArrayList<String>();
		users.add("Shiva");
		users.add("Ravi");
		users.add("Leena");
		return users;
	}

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		obj.getBill(10); // Calling a function by passing a value. 'Call by value' - 10; value/argument
		obj.getBill(20);

		// System.out.println(obj.sum(10, 20)); - bad practice to print it directly.
		// need to store it in a variable of same type

		int m = obj.sum(10, 20);
		System.out.println(m - 9);

		int m1 = obj.sum(-10, 4);
		System.out.println(m1 + 9);

		String msg = obj.getInfo();
		System.out.println(msg);

		if (obj.isAppExist()) {
			System.out.println("login to the app");
		}

		int f1 = obj.calculateMarks(70, 10, 5);
		System.out.println(f1);

		obj.launchURL("https://www.google.com/");

		String myDevice[] = obj.devices();
		System.out.println(Arrays.toString(myDevice));
		System.out.println(myDevice.length);

		ArrayList<String> myList = obj.getUserList();
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add("Ilma");
		System.out.println(myList);
		System.out.println(myList.size());

		Object marks[] = obj.calculateTermMarks(100, 10.5f, 6);
		System.out.println(Arrays.toString(marks));
	}

}
