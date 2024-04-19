package javasessions;

/* Day 17 - 10th Jan
 * Java_16_CallByReference_Constructor_ThisKeyword.mp4
 * part 1*/

public class MethodOverloading {
	
	//MethodOverloading
	//Poly(many)+morphism(forms): compile time polymorphism (static binding)
	// who is taking the decision that which method to use? the compiler

	public void search(int a) {
		System.out.println(a);
	}

	public void search(int price, String color) {

	}

	public void search(int price, String color, String name) {

	}


	public static void main(String[] args) {		
		MethodOverloading obj = new MethodOverloading();
		obj.search(10);//call by value/argument
	}

}
