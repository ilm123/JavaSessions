package javasessions;

/* Day 13 - 4th Jan
 * Java_12_CLass_Objects_NoReference_NullReferenceObjects_GarbageCollector_Heap_Stack_StaticVariables_PermGen_MetaSpace.mp4
 * part 1*/

public class Customer {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.name = "Taruna";
		c1.age = 20;
		c1.city = "Colombo";

		Customer c2 = new Customer();
		c2.name = "Neha";
		c2.age = 30;
		c2.city = "Kandy";

		Customer c3 = new Customer();
		c3.name = "Victor";
		c3.age = 25;
		c3.city = "LA";
		
		Customer c4 = new Customer();
		c4.name = "Shiva";
		c4.age = 31;
		c4.city = "NY";

		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);	
		System.out.println("");
		
		c1=c2;
		System.out.println("c1=c2");
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println("");
		
		c2=c3;
		System.out.println("c2=c3;");		
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);		
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println("");
		
		c3=c4;
		System.out.println("c3=c4;");
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println("");
		
		c4=c1;
		System.out.println("c4=c1;");
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		

	}

}
