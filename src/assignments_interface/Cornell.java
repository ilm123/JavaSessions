package assignments_interface;

public class Cornell extends CollegeOfEducation implements USEduSystem, UKEduSystem, IndiaEduSystem {

	@Override
	public void computerScience() {
		System.out.println("Cornell -- computerScience");
		
	}

	@Override
	public void English() {
		System.out.println("Cornell -- English");
		
	}

	@Override
	public void Biology() {
		System.out.println("Cornell -- Biology");
		
	}

	@Override
	public void courseProcedure() {
		System.out.println("Cornell -- courseProcedure");
		
	}

}
