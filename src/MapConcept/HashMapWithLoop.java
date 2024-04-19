package MapConcept;

import java.util.HashMap;
import java.util.Map;


/* Day 30 - 6th Feb
*  Java_29_HashMapIteration_Add_Remove_ForEachLoop_LinkedHashMap_TreeMap_HashMapUseCaseWithRBAC.mp4
*  part 1*/

public class HashMapWithLoop {

	public static void main(String[] args) {
		
		HashMap<String, String> empData = new HashMap<String, String>();
		
		empData.put("Tom", "SDET1");// k-v pair --> entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");
		empData.put(null, "SDET Director");
		
		System.out.println(empData); //Directly prints the entire hashmap
		
		System.out.println();
		
		for (Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println();
		
		//foreach method:
		//Lambda expression ->
		empData.forEach((k,v) -> System.out.println(k+":"+v));

	}

}
