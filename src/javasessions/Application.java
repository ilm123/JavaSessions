package javasessions;

/* Day 15 - 8th Jan
 * Java_14_MethodExamplesWith_SwitchCase_IfElse_Return_MethodOverloading_Examples.mp4
 * part 2*/

public class Application {
	// duplicate methods are not allowed

	// method overloading:
	// when you have different methods:
	// 1. with the same name
	// 2. with different parameters (diff number of params) and diff type of params
	// 3. with the different sequence of the parameters in case of same number of
	// params
	// 4. return type doesn't matter

	public void test(String n) { // 1 param

	}

	public void test(String n, int p, int a) { // 1 param

	}

	public int test(int i) { // 1 param
		return 100;
	}

	public String test(double i) { // 1 param
		return "testing";
	}

//		public void test(int i) { //1 param
	//
//		}
	//
//		public void test(int i, int j) { //2 params
	//
//		}
	//
	public void test(int l, String k) { // 2 params

	}

	public void test(String k, int l) { // 2 params

	}

	// ecomm app:
	public void login(String un) {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String role) {

	}

	//
	// search
	public void doSearch(String name) {

	}

	public void doSearch(String name, String color) {

	}

	public void doSearch(String name, String color, int price) {

	}

	// payment:
	public void makePayment(String paymentMethod) {

		switch (paymentMethod) {
		case "upi":

			break;

		case "paypal":

			break;

		default:
			break;
		}
	}

	public void makePayment(String cc, int cvv, int otp) {

	}

	// uber:
	public void booking(String st, String end) {

	}

	public void booking(String st, String end, String carType) {

	}

	public void booking(String st, String end, String carType, String paymentMethod) {

	}

	public void get(String name, int age) {
		System.out.println("hello");
	}

	public void get(int age, String name) {
		System.out.println("hello");
	}

	public void set(byte i) {
		System.out.println("hey byte!");
		System.out.println(i);
	}	
//	public void set(int i) {
//		System.out.println("hi int");
//		System.out.println(i);
//	}

	public void set(short i) {
		System.out.println("hello short");
		System.out.println(i);
	}

	
	

	// caller / user method:
	public static void main(String[] args) {
		Application obj = new Application();
		obj.test(10);

		obj.login("admin", "admin");

		obj.get(35, "devika");// bye
		obj.get("devika", 35);
		System.out.println();
		
		obj.set((byte) 10); // Preference is given to int. Explicitly convert to short or byte
		
		System.out.println();
		char c = 'a';
		String s = "Hello";

		System.out.println(c + s); // adding one character to the string
		System.out.println(s + c); // adding one character to the string
		// if you return characters first it will do the calculation
		System.out.println('0' + 'a' + 'A' + "Hello" + '0' + 'a'); 		

	}

}
