package javasessions;

/* Day 10 - 21st Dec
 * Java_09_ArrayLiterals_ForEachLoop_TimeComplexity.mp4
 * part 2*/

public class ForEachLoop {

	public static void main(String[] args) {

		int i[] = { 10, 20, 100, 40, 8 };

		for (int e : i) {
			System.out.println(e);
		}

		System.out.println("--------");

		double d[] = { 100.5, 300.054, 200.1, 7 };

		for (double e : d) {
			System.out.println(e);
		}

		System.out.println("--------");

		String product[] = { "MacBook", "ipad", "Canon" };

		for (String s : product) {
			System.out.println(s);
			if (s.equals("ipad")) {
				break;
			}
		}

		System.out.println("--------");
		Object empData[] = { "Tracy", 30, 200.2345, 'f', true };

		for (Object e : empData) {
			System.out.println(e);
		}

		System.out.println("--------");

		// print the index with the value
		int num[] = { 10, 20, 100, 40, 8 };

		int count = 0;
		for (int t : num) {
			System.out.println(count + "-" + t);
			count++;
		}

		System.out.println("--------");

		// print in the reverse order
		int p[] = { 10, 20, 100, 40, 8 };

		int x = p.length - 1;
		for (int element : p) {
			element = x;
			System.out.println(p[element]);
			x--;
		}

		System.out.println("--------");
		short sh[] = { 200, 300, 400 };

		for (short e : sh) {
			System.out.println(e);
		}

		System.out.println("--------");

		// a-z;
		// A-Z;
		// 0-9;

		char simple[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
		char capital[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		byte number[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (char e : simple) {
			System.out.println(e + " - " + (byte) e);
		}

		for (char e : capital) {
			System.out.println(e + " - " + (byte) e);
		}

		byte asciiNumber = 48;
		for (byte e : number) {
			System.out.println(e + " - " + asciiNumber);
			asciiNumber++;
		}

	}

}
