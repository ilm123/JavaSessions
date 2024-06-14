package constructorconcept;

/* Day 18 - 12th Jan
 * Java_17_BuilderPattern_ThisKeyword_UseCases_This_WithMethods.mp4
 * part 1*/

public class ConsInsideCons {

	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;

	// a constructor can be called from inside another constructor. But it has to be the first line
	
	public ConsInsideCons(String name, int age) {
		this("Mary", 40, 500);
		this.name = name;
		this.age = age;		
	}

	public ConsInsideCons(String name, int age, double salary) {	
		System.out.println("hi");
		this.name = name;
		this.age = age;
		this.salary = salary;		
	}	

	public ConsInsideCons(String name, int age, char gender) {		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public ConsInsideCons(String name, int age, double salary, boolean isActive, char gender) {		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;
		
		getInfo();
		ConsInsideCons.setInfo();
	}	
	
	// Non Static
	public void getInfo() {
		System.out.println("Getting Info");
		setInfo();
		printInfo();
	}
	
	// Non Static
		public void printInfo() {
			System.out.println("Printing Info");
		}
	
	// Static
		public static void setInfo() {
			System.out.println("Setting Info");
			ConsInsideCons c1 = new ConsInsideCons("", 0);
			c1.getInfo();
		}
	

	public static void main(String[] args) {

		ConsInsideCons e1 = new ConsInsideCons("Tom", 35);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
	}

}

// When calling the second constructor, it doesn't impact the name and age
// only the missing part is updated which in this case is the salary

// calling getInfo(); no need to create the object bcz the getInfo method is not static and it is not being 
// called inside a static method. It is constructor. for constructors there is no concept of static.

// setInfo() can be called directly but the right way is to use the class name

// When ever we call a non static method from a non static method, we have to create the object
// calling a NS method from inside NS, no need to create the object