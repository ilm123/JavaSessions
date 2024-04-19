package MapConcept;

/* Day 29 - 5th Feb
*  Java_28_HashMapConcept_KeyValue_Internal_Implementation.mp4
*  part 1*/

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		// k,v - used when we want to store some mapping data. Product- Price
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Tom", 100);
		empMap.put("Tom", 200);

		System.out.println(empMap.size());// = 1. Value for Tom got updated
		System.out.println(empMap.get("Tom"));

		empMap.put("Lisa", 300);
		empMap.put("Harry", 400);
		System.out.println(empMap.size());
		System.out.println(empMap);

		// non order based collection
		HashMap<String, String> empData = new HashMap<String, String>();

		empData.put("Tom", "SDET1");// k-v pair --> entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");
		empData.put(null, "SDET Director");
		empData.put(null, null);
//		empData.put("Prateek", null);
//		empData.put("Usha", null);		
		empData.put(" ", " ");

//		System.out.println(empData.get(null));
		System.out.println(empData.get("Test"));
		
		System.out.println(empData); //Directly prints the entire hashmap
		System.out.println();

		// null keys = 1
		// null values = multiple
		
		
		//Hashmap of Array List
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> arr = new ArrayList<String>();		
		arr.add("Colombo");
		arr.add("Sri Lanka");
		arr.add("New York");
		
		map.put("Tom", arr);
		System.out.println(map);
		System.out.println(map.get("Tom"));

	}

}
