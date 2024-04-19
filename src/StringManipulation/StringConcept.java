package StringManipulation;

import java.util.Arrays;

/* Day 26 - 29th Jan
*  Java_25_ThrowKeyword_CustomException_String_ManipulationMethods.mp4
*  part 3*/

public class StringConcept {

	public static void main(String[] args) {

		String str = "hello This is my java code and i am so happy i am an expert i am also sad";

		System.out.println(str.length());
		// li =0
		// hi = 37
		// len = hi+1
		// hi=len-1

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
		System.out.println(str.charAt(4));
		// System.out.println(str.charAt(38)); //StringIndexOutOfBoundsException - SIOB
		// System.out.println(str.charAt(-1)); //SIOB
		
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("i")); // 1st occurrence of i

		// Find out the second occurrence of i
		System.out.println(str.indexOf("i", 2)); // this will give a wrong output if a new word is added before i
		System.out.println(str.indexOf("i", str.indexOf("i") + 1)); // "give me the index of the first i; plus 1

		// Third occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i") + 1) + 1));

		// Fourth occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i") + 1) + 1) + 1));
		
		// Fifth occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i") + 1) + 1) + 1)+1));

		System.out.println();

		// Finding out the position of a specific keyword

		String mesg = "this is my java code";

		System.out.println(mesg.indexOf("java")); // 11 -> j starts from the 11th position
		System.out.println(mesg.indexOf("python")); // -1
		System.out.println(mesg.indexOf("Java")); // -1 Java is case sensitive.

		System.out.println();

		String m = "Welcome admin";

		if (m.indexOf("admin") == 8) {
			System.out.println("Correct msg");
		} else {
			System.out.println("Incorrect msg");
		}

		// another way to write...
		if (m.indexOf("admin") == -1) {
			System.out.println("incorrect msg -- FAIL");
		} else {
			System.out.println("Correct msg -- PASSED");
		}

		System.out.println();

		String test = " Hello   World  ";
		System.out.println(test.trim());

		String dob = "01/01/1990";
		System.out.println(dob.replace("/", "-"));

		System.out.println(test.replace(" ", "")); // HelloWorld - replaces one space at a time
		System.out.println(test.replaceAll(" ", "")); // HelloWorld // better in performance bcz it collects all the
														// spaces together and replace with nothing

		String lang = "Java Python Ruby";
		System.out.println(lang.replace(" ", "||"));
		System.out.println(lang.replace("Java", "JS"));

		System.out.println();
		// Split function - split on the basis of a character and forms it into an array

		String pop = "JavaScript;Java;Python;Ruby";
		String p[] = pop.split(";");// Remove the ; JavaScript will move to the 0th position in the array
		System.out.println(p[0]);
		System.out.println(p.length);

		System.out.println("----");
		String rest = "xXHelloSeleniumxxXPythonXxXAutomationXxXLabs";
		String rs[] = rest.split("xX");
		System.out.println(rs.length);
		System.out.println(rs[0]); // split on xX. There is nothing before xX. That is why there is no output
		System.out.println(rs[0].length());// length=0 means there is not even a space in the 0th index
		System.out.println(rs[1]);
		System.out.println(Arrays.toString(rs));

		System.out.println("----");
		String testStr = " xXHelloSeleniumxxXPythonXxXAutomationXxXLabs";
		String arr[] = testStr.split("xX"); // on arrays cannot use trim().after that on indexes we can use it
		System.out.println(arr[0]);
		System.out.println(arr[0].length());
		arr[0] = arr[0].trim();
		System.out.println(arr[0]);
		System.out.println(arr[0].length());

		System.out.println("----");
		String empData = "pallavi;sharma;30;pune;India;908767687587";
		String empData1 = empData.replace(";", "||");
		System.out.println(empData1);
		String ed[] = empData1.split("\\|\\|");
		System.out.println(ed[0]);
		System.out.println(Arrays.toString(ed));
	}

}
