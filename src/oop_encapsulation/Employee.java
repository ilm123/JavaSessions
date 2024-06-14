package oop_encapsulation;

/* Day 19 - 12th Jan
 * Java_18_OOP_Encapsulation_Public_Private_Modifiers_Getter_Setter_PrivateConstructor.mp4
 * part 1_1*/

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	public String dob;
	
	//public getter/setter:
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
		
//	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.name = "Nim";
//		emp.age = 55;
//
//	}

}


// Making it private is just restricting the data. It is not Enacapsulaiton
// If nothing is written is is called Default Access Modifier
// 'this' to access class variables