package javasessions;

import java.util.ArrayList;

/* Day 11 - 27th Dec
 * Java_10_ArrayList_DynamicArray_ArrayListImplementation.mp4
 * part 1*/

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		System.out.println(ar);

		ar.add(100);
		ar.add(200);
		System.out.println(ar);
		System.out.println(ar.size());

		ar.add(300);
		ar.add(400);
		System.out.println(ar);
		System.out.println(ar.size());

		ar.add(500);
		ar.add(600);
		System.out.println(ar);
		System.out.println(ar.size());

		ar.add(500);// Duplicates are allowed
		ar.add(700);
		System.out.println(ar);
		System.out.println(ar.size());

		ar.remove(0);
		ar.size();
		System.out.println(ar);
		System.out.println(ar.size());

		System.out.println("-----------");
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		ArrayList<String> empNameList = new ArrayList<String>();
		empNameList.add("Dave");
		empNameList.add("Mary");
		empNameList.add("Gillian");
		System.out.println(empNameList);
		System.out.println(empNameList.size());

		System.out.println("-----------");
		// employee name, age, salary, isActive, Gender
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Anne");
		empData.add(30);
		empData.add(25.43);
		empData.add(true);
		empData.add('F');
		empData.add(null);
		empData.add(null);

		System.out.println(empData);
		System.out.println(empData.size());
		
		

	}

}
