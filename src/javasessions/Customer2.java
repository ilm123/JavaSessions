package javasessions;

/* 5 objects*/

public class Customer2 {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		Customer2 c1 = new Customer2();
		c1.name = "Taruna";
		c1.age = 20;
		c1.city = "Colombo";

		Customer2 c2 = new Customer2();
		c2.name = "Neha";
		c2.age = 30;
		c2.city = "Kandy";

		Customer2 c3 = new Customer2();
		c3.name = "Victor";
		c3.age = 25;
		c3.city = "LA";
		
		Customer2 c4 = new Customer2();
		c4.name = "Shiva";
		c4.age = 31;
		c4.city = "NY";		

		Customer2 c5 = new Customer2();
		c5.name = "Robby";
		c5.age = 23;
		c5.city = "London";

		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);	
		System.out.println(c5.name + " " + c5.age + " " + c5.city);
		System.out.println("");
		
		c1=c2;
		System.out.println("c1=c2");
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println(c5.name + " " + c5.age + " " + c5.city);
		System.out.println("");
		
		c2=c3;
		System.out.println("c2=c3;");		
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);		
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println(c5.name + " " + c5.age + " " + c5.city);
		System.out.println("");
		
		c3=c4;
		System.out.println("c3=c4;");
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println(c5.name + " " + c5.age + " " + c5.city);
		System.out.println("");
		
		c4=c5;
		System.out.println("c4=c5;");
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println(c5.name + " " + c5.age + " " + c5.city);
		System.out.println("");
		
		c5=c1;
		System.out.println("c5=c1;");
		System.out.println(c1.name + " " + c1.age + " " + c1.city);
		System.out.println(c2.name + " " + c2.age + " " + c2.city);
		System.out.println(c3.name + " " + c3.age + " " + c3.city);
		System.out.println(c4.name + " " + c4.age + " " + c4.city);
		System.out.println(c5.name + " " + c5.age + " " + c5.city);//NVSRN

	}

}
