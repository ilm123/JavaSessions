package constructorconcept;

/* Day 17 - 10th Jan
 * Java_16_CallByReference_Constructor_ThisKeyword.mp4
 * part 4*/

public class Testing {

	int age;
	int salary;
	int amount;

	public Testing(int age, int salary, int amount) {
		this.age = age;
		this.salary = salary;
		this.amount = amount;
	}

	public static void main(String[] args) {

		Testing t1 = new Testing(30, 0, 0);

	}

}
