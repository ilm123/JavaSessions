package oop_encapsulation;

/* Day 19 - 12th Jan
 * Java_18_OOP_Encapsulation_Public_Private_Modifiers_Getter_Setter_PrivateConstructor.mp4
 * part 1_3*/

public class EmployeeWithConstructor {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	// ignoring the setters and introducing a constructor
	// behaves like a setter. Helps to initialize the values
	public EmployeeWithConstructor(String name, int age, double salary, boolean isActive) {		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}	

	public EmployeeWithConstructor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isActive() {
		return isActive;
	}

}



