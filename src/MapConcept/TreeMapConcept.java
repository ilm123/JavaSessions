package MapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Day 30 - 6th Feb
*  Java_29_HashMapIteration_Add_Remove_ForEachLoop_LinkedHashMap_TreeMap_HashMapUseCaseWithRBAC.mp4
*  part 3*/

public class TreeMapConcept {

	public static void main(String[] args) {

		//it maintains the sorted order
		TreeMap<String, String> empData = new TreeMap<String, String>(Collections.reverseOrder());

		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put("Amith", "SDET5");
		empData.put("arpit", "SDET6");
		empData.put("ravi", "SDET6");
		empData.put("1", "SDET7");
		empData.put("2", "SDET8");
		empData.put("$", "SDET9");
		// empData.put(null, "SDET Manager"); // NullPointerException
		empData.put("Selenium", null); //value can be anything but the key cannot be null in the Tree Map
		
		System.out.println(empData); 
		
		System.out.println();
		System.out.println ("For loop");
		for (Map.Entry<String, String> entrySet : empData.entrySet()) {	// .Entry is a child interface of Map interface
			System.out.println(entrySet.getKey() + ":" + entrySet.getValue());
		}
		
		System.out.println();
		System.out.println ("For each loop");
		empData.forEach((k,v) -> System.out.println(k + ":" + v));
		
		System.out.println();
		System.out.println("Remove Method");
		String p = empData.remove("Naveen");
		System.out.println(p); // returns the value
		System.out.println(empData);
		System.out.println("Remove Method - key and value");
		boolean f = empData.remove("Lisa", "SDET4"); // returns a boolean
		System.out.println(f);
		System.out.println(empData);
		
		System.out.println();
		System.out.println("Contains Method");
		boolean flag = empData.containsKey("Naveen");
		System.out.println(flag);
		
		System.out.println();
		empData.replace("Peter", "Peter Verma");
		System.out.println(empData);
		
		System.out.println();
		
		HashMap<String, String> custData = new HashMap<String, String>();
		custData.put("Jimin", "SDET1");
		custData.put("JK", "SDET2");
		custData.put("Suga", "SDET3");
		System.out.println(custData);
//		custData.put("Namjoon", custData.remove("Suga"));)
		System.out.println(custData);
		
	}

}
