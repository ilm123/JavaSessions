package constructorconcept;

/* Day 17 - 10th Jan
 * Java_16_CallByReference_Constructor_ThisKeyword.mp4
 * part 3*/

public class Employee {

	// Class variables
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;

	// Constructor looks like a function but is NOT a function/method
	// const... name will be same as the class name
	// const.. cannot return anything/no void also/no return type
	// const.. can be overloaded
	// const ... will be called when you create the object of the class
	// const.. is used for initializing the class variables with the const.. local
	// variables using 'this' keyword
	// const... is used to restrict the object creation - depends on the use case
	// const... is used for initialization purpose only not for business logic
	// but function is used for buss logic, which may or may not return
	// function can be called multiple times but constructor will be called only
	// once when object created
	// a constructor can be called from inside another constructor. But it has to be
	// the first line

//	public Employee() { // 0 param
//		System.out.println("Default Constructor");
//	}
//
//	public Employee(int i) { // 1 param
//		System.out.println(i);
//	}
//
//	public Employee(int i, String name) { // 2 params
//		System.out.println(i + name);
//	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Employee(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee(String name, int age, boolean isActive, char gender) {
		this.name = name;
		this.age = age;
		this.isActive = isActive;
		this.gender = gender;
	}

	public Employee(String name, int age, double salary, boolean isActive, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Tom", 35);
		System.out.println(e1.name);
		System.out.println(e1.age);

		Employee e2 = new Employee("Preet", 25);
		System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " + e2.isActive + " " + e2.gender);

		Employee e3 = new Employee("shiv", 20, 12.33, false, 'm');
		System.out.println(e3.name + " " + e3.age + " " + e3.salary + " " + e3.isActive + " " + e3.gender);

	}

}
