package StringManipulation;

/* Day 28 - 31st Jan
*  Java_27_StringBuffer_StringBuilder_FinallyBlock_Examples.mp4
*  part 1*/

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		//Immutable
		String str = "Hello";		
		str.concat("Selenium");
		str.concat("Testing"); // 3 strings are created in the SCP
		System.out.println(str); // Hello
		
		
		String s1 = new String("Hi");
		System.out.println(s1.concat("Monday!"));//HiMonday!
		
		//mutable
		StringBuilder msg = new StringBuilder("Java");
		msg.append("Lessons");
		msg.append("testing");
		System.out.println(msg);//JavaLessonstesting
		

	}

}
