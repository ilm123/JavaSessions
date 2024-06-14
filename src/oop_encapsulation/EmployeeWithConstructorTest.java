package oop_encapsulation;

/* Day 19 - 12th Jan
 * Java_18_OOP_Encapsulation_Public_Private_Modifiers_Getter_Setter_PrivateConstructor.mp4
 * part 1_4*/

public class EmployeeWithConstructorTest {

	public static void main(String[] args) {
		EmployeeWithConstructor emp = new EmployeeWithConstructor("Patrick", 20, 300.13, true);		

		System.out.println("----");
		System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getSalary() + " " + emp.isActive());
		
		EmployeeWithConstructor emp2 = new EmployeeWithConstructor("Kim", 50);		

		System.out.println("----");
		System.out.println(emp2.getName() + " " + emp2.getAge() + " " + emp2.getSalary() + " " + emp2.isActive());
	}
}

//The setters are an advantage as opposed to consturctors bcz the values can be updated
//E.g Cannot update the age bcz the setter is not there