package assignments_strings;

//5.Write a function/ method to reverse your own name.

public class ReverseName {
	
	public static void nameInReverse(String name) {		
		
		for (int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));		}
	}

	public static void main(String[] args) {
		nameInReverse("ilma");

	}

}
