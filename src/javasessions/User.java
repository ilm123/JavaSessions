package javasessions;

/* Day 12 - 28th Dec
 * Java_11_ArrayListMethods_CollectionsClass_ClassAndObject_NoReferenceObjects.mp4
 * part 2*/

public class User {

	// class variables - Data Members
	String name;
	int age;
	String city;
	String telephone;
	double salary;
	boolean isActive;

	public static void main(String[] args) {

		// Object

		User u1 = new User();
		// User - class name
		// u1 - Object reference name. What is the type of u1? it is the class name
		// new User () - Object/RHS-Right Hand Side

		u1.name = "David";
		u1.age = 30;
		u1.city = "Colombo";
		u1.telephone = "123456789";
		u1.salary = 12.33;
		u1.isActive = true;

		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);
		System.out.println(u1.telephone);
		System.out.println(u1.salary);
		System.out.println(u1.isActive);

		System.out.println("------------");

		User u2 = new User();
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.city);
		System.out.println(u2.telephone);
		System.out.println(u2.salary);
		System.out.println(u2.isActive);

		System.out.println("------------");

		User u3 = new User();
		u3.name = "Shafina";
		u3.salary = 55.34;
		u3.isActive = false;

		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.city);
		System.out.println(u3.telephone);
		System.out.println(u3.salary);
		System.out.println(u3.isActive);
		
		// No reference object
		new User ().name = "Tom"; // No reference object. This is an Anti Pattern. Object No.5
		new User ().age = 30; // Object No.6 Java will destroy it at run time. "Garbage collector"
		
		
		/* Day 13 - 1st Jan
		 * Java_12_CLass_Objects_NoReference_NullReferenceObjects_GarbageCollector_Heap_Stack_StaticVariables_PermGen_MetaSpace.mp4
		 * part 1*/
		
		//Null reference object
		User u4 = new User();
		u4 =  null;
		//u4.name="Amy"; // null.name - NPE Null Pointer Exception		
		System.gc();
		
		u4 = new User(); // A new object get created. So from line 73 on wards 2 objects are created
		u4.name = "Ilma";
		System.out.println(u4.name);

	}

}
