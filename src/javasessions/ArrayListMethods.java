package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Day 12 - 28th Dec
 * Java_11_ArrayListMethods_CollectionsClass_ClassAndObject_NoReferenceObjects.mp4
 * part 1*/

public class ArrayListMethods {

	public static void main(String[] args) {

		// Declaring and initializing the ArrayList in one statement:
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
		// Default VC=10. Cannot override the VC since it is already filled with three
		// values.

		System.out.println(browserList);
		System.out.println("size: " + browserList.size());

		browserList.add("IE");
		System.out.println(browserList);
		System.out.println("size: " + browserList.size());

		System.out.println("What is at index 1? " + browserList.get(1));// returns the value in Index 1
		// System.out.println(browserList.get(5)); // IOB
		System.out.println("What is the index of firefox? " + browserList.indexOf("firefox"));
		System.out.println("What is the index of ilma? " + browserList.indexOf("ilma")); // returns -1 if non existent.
																							// it's pre-defined

		if (browserList.indexOf("ilma") == -1) {
			System.out.println("Please pass the right browser name ...");
		}

		//browserList.removeAll(browserList);
		System.out.println(browserList); // empty list
		System.out.println(browserList.size());

		// System.out.println(browserList.removeAll(browserList));

		System.out.println("------------");

		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("windows", "mac", "linux"));

		browserList.addAll(osList); // combines multiple array lists
		System.out.println("browser list: " + browserList);
		System.out.println("os list: " + osList);

		// remove the os list from the browser list
		browserList.removeAll(osList);
		System.out.println("browser list after removing os list: "+browserList);

		osList.add(1, "unix");
		System.out.println(osList);

		osList.set(1, "Ilma"); // replaces
		System.out.println(osList);

		osList.add("Test"); // add it at the end of the list
		System.out.println(osList);

		if (osList.contains("mac")) {
			System.out.println("Test PASSED");
		} else {
			System.out.println("Test Failed");
		}

		ArrayList<String> subList = new ArrayList<String>(Arrays.asList("mac", "windows"));

		System.out.println("contains all? "+osList.containsAll(subList));

		System.out.println("------------");
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10, 20, 11, 45, 60, 89));
		System.out.println(numList);

		Collections.sort(numList);
		System.out.println(numList);

		Collections.swap(numList, 4, 5);
		System.out.println(numList);

		Collections.sort(osList); // preference is given to the capital letters and then the simple letter
		System.out.println(osList);

		List<Object> testList = Collections.emptyList();// immutable list. Completely restricted No use case
		System.out.println(testList);
		System.out.println(testList.size());
		// testList.add("Cypress");//UnsupportedOperationException

		ArrayList<String> links = new ArrayList<String>(); // mutable list. use case - search a product and gather the
															// results
		links.add("Login");
		links.add("Register");
		links.add("Forgot Pwd");
		links.add("Wish List");
	}

}
