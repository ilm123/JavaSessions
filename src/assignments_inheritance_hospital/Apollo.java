package assignments_inheritance_hospital;

public class Apollo extends Hospital{
	
	@Override
	public void bookAppointement() {
		System.out.println("Apollo -- bookAppointement");
	}
	
	@Override
	public void buyMedicine() {
		System.out.println("Apollo -- buyMedicine");
	}
	
	public void roboticSurgery() {
		System.out.println("Apollo -- roboticSurgery");
	}

}
