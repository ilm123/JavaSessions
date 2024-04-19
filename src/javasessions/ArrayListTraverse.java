package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

/* Day 11 - 27th Dec
 * Java_10_ArrayList_DynamicArray_ArrayListImplementation.mp4
 * part 2*/

public class ArrayListTraverse {

	public static void main(String[] args) {

		ArrayList<String> links = new ArrayList<String>();
		links.add("Login");
		links.add("Register");
		links.add("Forgot Pwd");
		links.add("Wish List");

		System.out.println(links);
		System.out.println(links.size());
		System.out.println(links.get(0));
		System.out.println(links.get(3));
		// System.out.println(links.get(4));// IOB - Index Out of Bound Exception
		// System.out.println(links.get(-1)); // IOB - Index Out of Bound Exception

		// Print all the values in an array list using the for loop
		System.out.println("------------");
		// Index Loop
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i));
			// System.out.println(links);
		}

		System.out.println("------------");
		// for each loop

		for (String e : links) { // e will go to the list one by one and picks the values one by one
			System.out.println(e); // no need to write the .get method
		}
		System.out.println("------------");

		// print index and value with the for each loop

		int i = 0;
		for (String e : links) {
			System.out.println(i + "-" + e);
			i++;
		}

		System.out.println("------------");
		ArrayList<String> pageLinks = new ArrayList<String>();
		pageLinks.add("Login");
		pageLinks.add("Register");
		pageLinks.add("Forgot Pwd");
		pageLinks.add("Wish List");

		System.out.println(pageLinks.size());

		// pageLinks.add(5, "test"); //IOB - adding values happens sequentially
		System.out.println(pageLinks);
		// pageLinks.add(0, "Ilma"); //Login gets pushed to the 1st index
		System.out.println(pageLinks);

		pageLinks.remove(2); // shrinks the array
		System.out.println(pageLinks);
		System.out.println(pageLinks.size());
		pageLinks.set(1, "Ilma"); // updates the element in the 3rd index
		System.out.println(pageLinks);
		System.out.println(pageLinks.size());

	}

}
