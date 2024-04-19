package javasessions;

/* Day 10 - 21st Dec
 * Java_09_ArrayLiterals_ForEachLoop_TimeComplexity.mp4
 * part 3*/

public class TimeComplexity {

	public static void main(String[] args) {

		// (1+n+n)(1+n+n+n)

		// (1+n+n)(1+n+n)(1+n+n+n)

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				for (int z = 1; z <= 5; z++) {
					System.out.println(x + "" + y + "" + z);
				}
			}
		}
	}

}
