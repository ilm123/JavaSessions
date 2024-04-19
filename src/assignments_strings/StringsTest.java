package assignments_strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsTest {

	public static void main(String[] args) {
		
		//1.  Write a program to check two different strings equality.
		
		String str1 = "Hello";
		String str2 = "Hellooo";
		
		if (str1.equals(str2)) {
			System.out.println("Both words are the same");
		}
		else {
			System.out.println("The two words are different");
		}
		
//		2. Remove all  spaces in a String . 
//		  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		
//		String mesg = "         Hello      Everyone       ";
		String mesg = "         Hello      Everyone       ";
		
		System.out.println(mesg.replaceAll(" ", ""));
		
//		3. Write a program that will  print out the last character and first character of a word.
		
		String st = "assignment";
		System.out.println(st.length());
		System.out.println("Last character:" + st.charAt(st.length()-1));
		System.out.println("First character:" + st.charAt(0));
		
//		4. Write a program to verify a word or a character contained in the sentence.
		
		String a = "Let's all just take a moment to breathe, please!";
		System.out.println(a.indexOf("ake"));
		
//		 6. Write a program that gives you the last half of the string.
		System.out.println("Length="+a.length());
		
		for (int i=a.length()/2; i<=a.length()-1; i++) {
			System.out.print(a.charAt(i));			
		}
		
		System.out.println();
//		7. Write a program to get the 3rd  “ e “ of the string .
//		 For example: “Welcome to Naveen Automation Labs ! “.
		
		String msg = "Welcome to Naveen Automation Labs ! ";
		
		System.out.println(msg.indexOf('e'));
		System.out.println(msg.indexOf('e', msg.indexOf('e')+1));
		System.out.println(msg.indexOf('e', msg.indexOf('e', msg.indexOf('e')+1)+1));
		
		
//		9. Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .

		 

//		10. Assume that a string consists of 3 words, print out the middle one.
		String colours = "Blue, Purple, Indigo";
		String c1 [] = colours.split(", ");
		System.out.println(c1[1]);
		
		
		System.out.println();
//		11. get only numeric part from this String:
		
			String s = "your transaction id is: 12345 and reference id is 34567";
			
			Pattern pt = Pattern.compile("\\d+");
			Matcher mt = pt.matcher(s);
			
			while (mt.find()) {
				System.out.println(mt.group());
			}
			
		
		

	}

}
