package assignments_inheritance_hospital;

public class TestHospital {

	public static void main(String[] args) {

		Hospital hosp = new Hospital();
		hosp.healthCheckup();
		hosp.bookAppointement();
		hosp.buyMedicine();

		System.out.println();
		Apollo apo = new Apollo();
		apo.healthCheckup(); // inherited
		apo.bookAppointement(); // overridden
		apo.buyMedicine(); // overridden
		apo.roboticSurgery(); // individual

		System.out.println();
		Fortis fort = new Fortis();
		fort.healthCheckup(); // inherited
		fort.bookAppointement(); // inherited
		fort.buyMedicine(); // inherited
		fort.internationalPatient(); // individual

		System.out.println();
		Max max = new Max();
		max.healthCheckup(); // inherited
		max.bookAppointement(); // inherited
		max.buyMedicine(); // inherited
		max.teleMedicine(); // inherited

		System.out.println();
		System.out.println("Top Casting");
		Hospital h1 = new Apollo();
		h1.healthCheckup();
		h1.bookAppointement();
		h1.buyMedicine();

		System.out.println();
		System.out.println("Down Casting");
		Apollo a1 = (Apollo) new Hospital();

	}

}
