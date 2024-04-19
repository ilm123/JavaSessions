package StringManipulation;

/* Day 27 - 30th Jan
*  Java_26_StringImmutable_StringConstantPool_EqualsAndDoubleEqualTo_String_RegularExpressions.mp4
*  part 2*/

public class StringLiteralsConstantPool {

	public static void main(String[] args) {

		String str = "Hello";
		str.concat("Selenium");
		System.out.println(str); // Hello ->Strings are immutable.i.e cannot be changed/manipulated/updated. it
									// doesn't append the same value
		System.out.println("---");
		str = str.concat("Selenium");
		System.out.println(str); // HelloSelenium

		int i = 10;
		i = i + 20; // mutable
		System.out.println(i);

		String s1 = "Hello"; // 1-scp
		String s2 = "Hello"; // 0

		String s3 = new String("World"); // 1-heap, 1-scp

		String s4 = "World"; // It will point to "World" that already exists in SCP

		String s5 = "Hello"; // Points to Hello which is already in SCP

		String s6 = new String("Selenium"); // 1-heap, 1-scp

		String s7 = "Selemium"; // s7 reference is created in the stack and it will point to the selenium that
								// is already is there in SCP

		String s8 = new String("Selenium"); // 1-heap, in the heap it is already there

		// *******************************

		System.out.println(s1 == s2); // true - scp==scp. Both values are Hello and inside the SCP
		System.out.println(s4 == s3); // false - scp==heap object -> compares the references/addresses and not the
										// value
		System.out.println(s6 == s8); // false - heap==heap -> you cannot compare heap references. It will always
										// return false

		System.out.println(s6.equals(s8)); // .equals method compares the respective values. Hence the recommended way
											// for strings
		System.out.println(s4.equals(s3));

		System.out.println();

		String obj = new String("testing"); // 1-heap, 1-scp -->2 objects will be created in the memory. unnecessary
		String ob = new String("testing"); // 1-heap, scp=0
		System.out.println(obj == ob); // false
		System.out.println(obj.equals(ob)); // true

		String o = "Testing";
		String p = "testing";
		String q = "testing";
		System.out.println(obj == o); // false
		System.out.println(o == p); // false
		System.out.println(p == q); // true
		System.out.println(obj.equals(p)); // true
		System.out.println(obj.equals(o)); // false
		System.out.println(obj.equalsIgnoreCase(o)); //true

	}

}
