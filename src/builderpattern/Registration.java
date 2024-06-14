package builderpattern;

/* Day 18 - 12th Jan
 * Java_17_BuilderPattern_ThisKeyword_UseCases_This_WithMethods.mp4
 * part 3*/

public class Registration {

	// class variables
	String name;
	String tel;
	String pwd;

	public void userReg(String name, String tel, String pwd) { // local variable
		System.out.println("Name " + name);
		System.out.println("Phone " + tel);
		System.out.println("Password " + pwd);
		
		this.name = name;
		this.tel = tel;
		this.pwd = pwd;
	}

	public void getUserInfo() {
		System.out.println(name + " " + tel + " " + pwd);
	}

	public static void main(String[] args) {

		Registration reg = new Registration();
		reg.userReg("ilma", "345123", "ilma@123");
		reg.getUserInfo();

	}

}

//this keyword:
//1. const + this
//2. const.. calling
//3. method + this
//4. builder pattern ---> return this