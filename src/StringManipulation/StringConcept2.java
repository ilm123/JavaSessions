package StringManipulation;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Day 27 - 30th Jan
*  Java_26_StringImmutable_StringConstantPool_EqualsAndDoubleEqualTo_String_RegularExpressions.mp4
*  part 1*/

public class StringConcept2 {

	public static void main(String[] args) {

		String str = "Test Automation Labs";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		String domain = "      Hello     Selenium     ";
		String dom = domain.replaceAll("\\s+", ""); // Remove white spaces. plus sign means more than once space
		System.out.println(dom);

		String t1 = "Your order id is 12345";
		String orderId = t1.replaceAll("\\D+", ""); // D represents non digits. This method will work with only one
													// set of digits
		System.out.println(orderId);

		System.out.println("-----Two sets of digits-----");
		String t2 = "Your user id is 9090 and order id is 12345";

		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(t2);

		ArrayList<String> arr = new ArrayList<String>();

		while (matcher.find()) {
//			System.out.println(matcher.group());
			arr.add(matcher.group());			
		}
		System.out.println(arr);

//        String userId = null;
//        String oId = null;
//        
		// matcher.group has to be used twice with the if statement
//        if (matcher.find()) {
//        	userId = matcher.group();
//        	System.out.println("User ID: " + userId);
//        }
//        
//        if (matcher.find()) {
//        	oId = matcher.group();
//        	System.out.println("Order ID: " + oId);
//        }
//        
//        System.out.println("User ID: " + userId);
//        System.out.println("Order ID: " + oId);
		
		System.out.println();
		String tr = "Hello!! this is my value .$12333*";
		String finalValue = tr.replaceAll("[^a-zA-Z0-9\\s]", ""); //^ means not
		System.out.println(finalValue);
	
		
				

	}

}
