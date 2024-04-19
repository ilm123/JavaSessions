package javasessions;

import java.util.Arrays;

/* Day 10 - 21st Dec
 * Java_09_ArrayLiterals_ForEachLoop_TimeComplexity.mp4
 * part 1*/

public class ArrayLiterals {

	public static void main(String[] args) {

		int i[] = { 10, 20, 30, 40, 10, 1 };
		System.out.println(Arrays.toString(i));
		System.out.println("0th index value: "+i[0]);
		System.out.println("Length: " + i.length);
		System.out.println("5th index value: " + i[5]);
		System.out.println("Last index number: " + (i.length-1));
		System.out.println("Last number in the array: "+i[i.length-1]);
		System.out.println(i[0]=128); // can update but cannot remove a number in literal array
		System.out.println(Arrays.toString(i));

		System.out.println("--------");
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		System.out.println("--------");
		// For every primitive data type there is a non primitive data type
		// int - Integer (An existing class in java/wrapper class)
		// float - Float
		// boolean - Boolean
		Object empData[] = { "Tracy", 30, 200.2345, 'f', true };
		System.out.println(Arrays.toString(empData));

	}

}
