package javasessions;

import java.util.ArrayList;

/* Day 15 - 8th Jan
 * Java_14_MethodExamplesWith_SwitchCase_IfElse_Return_MethodOverloading_Examples.mp4
 * part 1*/

public class FunctionTest2 {

	// WAF: function Name: getStudentMarks
	// input Param: studenName (String)
	// return: marks (int)
	// student not found --> return something

	public int getStudentMarks(String studentName) {
		System.out.println("Student Marks for " + studentName);

		int marks = -1;

		if (studentName.trim().equalsIgnoreCase("devika")) {
			// return 90; // Acts like a break. will not go to the else if
			marks = 90; // Even if condition is satisfied it will to the next else if. so having
						// multiple returns is slightly better in performance
		}

		else if (studentName.equalsIgnoreCase("ravi")) {
			// return 50;
			marks = 50;
		}

		else if (studentName.equalsIgnoreCase("naveen")) {
			// return 10;
			marks = 10;
		}

		else {
			System.out.println("Student name not found. Please pass the right name " + studentName);
			// return -1;
		}
		return marks; // Single Return
	}

	public int getMarks(String studentName) {
		System.out.println("Marks for " + studentName);
		int marks = -1;

		switch (studentName.trim().toLowerCase()) {
		case "devika": {
			// return 90;
			marks = 90;
			break;
		}
		case "ravi": {
			// return 50;
			marks = 50;
			break;
		}
		case "naveen": {
			// return 10;
			marks = 10;
			break;
		}
		default:
			System.out.println("Student name not found. Please pass the right name " + studentName);
			// return -1;
		}
		return marks;
	}
	
	// WAF: launchBrowser (name)
	// input param: String browserName
	// return: true/false (boolean)
	
	public boolean launchBrowser (String browserName) {
		System.out.println("Browser Name:" + browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("chrome is launched");
			return true;
		case "ie":
			System.out.println("ie is launched");
			return true;
		case "firefox":
			System.out.println("firefox is launched");
			return true;
		default:
			System.out.println("Please pass the right browser name:" + browserName);
			return false;
		}
	}

	// WAF:
	// function name: getDevicesList
	// input param: empName
	// return: ArrayList<String> devicesList
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("Getting the devices list for:" + empName);
		ArrayList<String> devices = new ArrayList<String>(); // vc=10, pc=10

		switch (empName.trim().toLowerCase()) {
		case "michelle":
			devices.add("Macbook Pro");
			devices.add("Ipad");
			devices.add("iphone");
			//break;
			return devices;
		case "andrew":
			devices.add("Windows Lenovo");
			devices.add("Samsung Galaxy S10");
			//break;
			return devices;
		case "beth":
			devices.add("Apple ipod");
			//break;
			return devices;
		default:
			System.out.println("Employee name not found: " + empName);
			return devices;
		}
		//return devices;
	}

	public static void main(String[] args) {
		FunctionTest2 obj = new FunctionTest2();
		int marks = obj.getMarks("tom");
		System.out.println(marks);

		if (marks == -1) {
			System.out.println("No need to print the marks sheet");
		} else {
			System.out.println("Print the marks sheet");
		}
		System.out.println();
		
		boolean isLaunched = obj.launchBrowser(" test ");
		
		if (isLaunched) {
			System.out.println("enter the URL");
		}
		
		
		System.out.println();
		ArrayList<String> actualDeviceList = obj.getDevicesList(" andrew ");
		System.out.println(actualDeviceList);
		System.out.println(actualDeviceList.size());
	}

}
