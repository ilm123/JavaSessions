package javasessions;

/* Day 17 - 10th Jan
 * Java_16_CallByReference_Constructor_ThisKeyword.mp4
 * part 2*/

public class CallByRefConcept {
	
	String name;
	int age; 
	
	public static void getInfo (CallByRefConcept t1) {// what is the type of t1? CallByRefConcept - class name
//		CallByRefConcept t1 = new CallByRefConcept();
		System.out.println(t1.name);
		System.out.println(t1.age);
		
		t1.name = "Tom";
		t1.age = 35;
		System.out.println(t1.name);
		System.out.println(t1.age);
		
	}
	

	public static void main(String[] args) {
		CallByRefConcept obj = new CallByRefConcept(); 
		obj.name = "Pratheek";
		obj.age = 18;
		
		getInfo(obj);//call by reference
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
//		CallByRefConcept app = new CallByRefConcept(); 
//		getInfo(app); // t1 connection to the first object is broken and now t1 starts pointing to app

	}

}

// CallByRefConcept obj = new CallByRefConcept(); -> One object with 2 copies name and age 
// Deliberately make getInfo() static so that it goes into the common memory and not the heap
// CallByRefConcept t1 = new CallByRefConcept(); -> one more object is created in the memory