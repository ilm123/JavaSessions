package oop_encapsulation;

/* Day 19 - 12th Jan
 * Java_18_OOP_Encapsulation_Public_Private_Modifiers_Getter_Setter_PrivateConstructor.mp4
 * part 1_2*/

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		//POST - reg form
		emp.setName("Nim");
		emp.setAge(22);
		emp.setSalary(3000.15);
		emp.setIsActive(true);
		
		emp.dob = "01-01-1990";		
		System.out.println("----");
		//GET - get the user info/retrieving
		System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getSalary() + " " + emp.getIsActive() + " "  + emp.dob);
		
		//PUT - update the info
		emp.setAge(32);
		emp.setSalary(5000.45);

		System.out.println("----");
		//GET - get the user info/retriving
		System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getSalary() + " " + emp.getIsActive() + " "  + emp.dob);

	}

}

// We are not able to access the variables directly. 
// Via getter and setter we can access as they are public.
// API calls - GET, POST, PUT, DELETE
