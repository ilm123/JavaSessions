package javasessions;

import java.util.Arrays;

/* Day 9 - 20th Dec
 * Java_08_StaticArray_ObjectArray_ArrayLiterals_LimitationsOfArray.mp4
 * */

public class ArraysConcept {

	public static void main(String[] args) {

		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4] = 50;

		System.out.println(i); // prints the address of the array
		// System.out.println(i[4]);
		System.out.println(Arrays.toString(i));

		for (int k = 0; k <= 3; k++) {
			System.out.println(i[k]);
			if (i[k] == 20) {
				System.out.println("Hi");
				break;
			}
			System.out.println("Bye");
		}

		System.out.println("-------------");
		short sh[] = new short[3];

		System.out.println("LI(Lowest Index) = 0");
		System.out.println("HI (Highest Index) = " + (sh.length - 1));
		System.out.println("Length(size of the array) " + sh.length);
		System.out.println(Arrays.toString(sh));

		sh[0] = 10;
		System.out.println(Arrays.toString(sh));
		sh[2] = 20;
		System.out.println(Arrays.toString(sh));
		sh[1] = 40;
		System.out.println(Arrays.toString(sh));

		for (int k = 0; k < 3; k++) {
			System.out.println(sh[k]);
		}

		// char array - default value is a space
		char ch[] = new char[5];

		ch[0] = 'a';
		ch[1] = 'I';
		ch[2] = '@';
		ch[3] = 98;
		System.out.println(Arrays.toString(ch));

		// float array
		float fh[] = new float[3];

		fh[0] = 1;
		fh[1] = 3.2f;
		System.out.println(Arrays.toString(fh));

		// double data type array
		double d[] = new double[3];

		d[0] = 500;
		d[1] = 1000.002;
		System.out.println(Arrays.toString(d));

		// Object Array
		// employee data - name, age, salary, gender, isPermanent
		Object empData[] = new Object[5];

		empData[0] = "Linda";
		empData[1] = 30;
		empData[2] = 100.35;
		empData[3] = 'f';
		// empData[4] = true;

		System.out.println(Arrays.toString(empData));
		System.out.println(empData.length);

		Object empData2[] = new Object[5];

		empData2[0] = "George";
		empData2[1] = 31;
		empData2[2] = 200.22;
		empData2[3] = 'm';
		empData2[4] = false;

		for (int p = 0; p <= empData2.length-1; p++) {
			System.out.println(empData2[p]);
		}
		
		System.out.println("------------");
		//String Array
		String products[] = new String[3];
		
		products[0] = "Mac Book Air";
		products[1] = "Mac Book Pro";
		products[2] = "Ipad";
		
		for (int n=0; n<products.length; n++) {
			System.out.println(products[n]);
			if (products[n].equals("Ipad")) {
				System.out.println("out of stock");
			}
		}

	}

}
