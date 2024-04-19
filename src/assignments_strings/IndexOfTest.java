package assignments_strings;

//8. Write a method which gives an index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.

public class IndexOfTest {

	public static void m1(String ab) {
		String str = "Greetings from the real universe";

		System.out.println(str.indexOf(ab));

	}

	public static void main(String[] args) {

		IndexOfTest.m1("from");

	}

}
