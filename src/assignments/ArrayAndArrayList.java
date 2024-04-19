package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayAndArrayList {

	public static void main(String[] args) {
//		Q1: WAP to delete a specific number from the given array.
//		int p[] = {1,4,5,2,3,22,31, 2}; 
//--Need to remove 22 from the p[] array.
//--output should be: [1, 4, 5, 2, 3, 31, 2]

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int[] a = new int[p.length - 1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(a));

		System.out.println("-------------------------");
//		Q2: Write a program to create a static Array, having following cricket data:
//		 --name, age, team name, DOB, gender, Strike Rate
//		 --Try to create multiple Object Arrays for different players
//		 --Try to print all the values of each player on the console

		Object cricketData1[] = new Object[6];

		cricketData1[0] = "Andrew";
		cricketData1[1] = 23;
		cricketData1[2] = "England";
		cricketData1[3] = "25th March 2000";
		cricketData1[4] = 'M';
		cricketData1[5] = "45.32";

		System.out.println(Arrays.toString(cricketData1));

		Object cricketData2[] = new Object[6];

		cricketData2[0] = "Lahiru";
		cricketData2[1] = 19;
		cricketData2[2] = "England";
		cricketData2[3] = "18th April 2005";
		cricketData2[4] = 'M';
		cricketData2[5] = "65.12";

		System.out.println(Arrays.toString(cricketData2));

		for (int i = 0; i < cricketData1.length; i++) {
			System.out.println(cricketData1[i]);
			System.out.println(cricketData2[i]);
		}

		System.out.println("");
		System.out.println("--------Colours Array List-----------------");
//		 1. Write a Java program to create a new array list, which contains all color names.
//		 --add some colors (string)
//		 ---and print out the colorslist using loops.

		ArrayList<String> colours = new ArrayList<String>(
				Arrays.asList("white", "black", "orange", "pink", "blue", "red", "yellow"));
		colours.add("green");
		colours.add("gray");
		colours.add("brown");

		for (String colour : colours) {
			System.out.println(colour);
		}

		System.out.println("");
		System.out.println("-------Retreive element from Colours Array List------------------");
//		  2. Write a Java program to retrieve an element at a specified index from a given array list.

		String colour = colours.get(3);
		System.out.println(colour);

		System.out.println("");
		System.out.println("-----------Update the Colours Array List--------------");
//		3. Write a Java program to update specific array element by given element.
		colours.set(9, "purple");
		System.out.println(colours);

		System.out.println("");
		System.out.println("----------Remove the third element from the Colours Array List---------------");
//		4. Write a Java program to remove the third element from an array list. 
		colours.remove(2);
		System.out.println(colours);//[white, black, pink, blue, red, yellow, green, gray, purple]
		System.out.println(colours.size());

		System.out.println("");
		System.out.println("----------Search an elmenent in the Colours Array List and break the loop---------------");
//		5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.

		String searchColor = "blue";

		for (String colourList : colours) {
			if (colourList.equals(searchColor)) {
				System.out.println("Found " + searchColor);
				break;
			}
		}
		
		System.out.println("");
		System.out.println("----------Reverse the Array List ---------------");
//		6. Reverse this array List:
			ArrayList<String> studentNames = new ArrayList<String>();
			studentNames.add("Varun");
			studentNames.add("Reena");
			studentNames.add("Naveen");
			studentNames.add("Robin");
			studentNames.add("Peter");
			
			Collections.reverse(studentNames);
	        System.out.println(studentNames);
	        
	        
			System.out.println("");
			System.out.println("----------Extract a portion of an Array List ---------------");
//	        7. Write a Java program to extract a portion of an array list.
			
			ArrayList<String> potion = new ArrayList<>(colours.subList(5, 8)); //returns index-1
			System.out.println(potion);					
			
			System.out.println("");
			System.out.println("----------Empty the Student Array List ---------------");
//			8. Write a Java program to empty an array list.
			studentNames.clear();
			System.out.println(studentNames);
			
			System.out.println("");
			System.out.println("----------Trim the virtual capacity in an Array List ---------------");
//			9. Write a Java program to trim the virtual capacity of an array list to the current list size.
			colours.trimToSize();
	        System.out.println(colours.size());
	        
	        System.out.println("");
			System.out.println("----------Print all the elements of an ArrayList using the position of the elements ---------------");
//	        10. Write a Java program to print all the elements of an ArrayList using the position of the elements.
			
			for (int i = 0; i < colours.size(); i++) {
	            System.out.println("Element at index " + i + " is " + colours.get(i));
	        }			
	
	}
	

}
