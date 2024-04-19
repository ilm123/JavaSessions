package interfaceconcept;

/* Day 22 - 22nd Jan
*  Java_21_Interface_Abstraction_MultipleInheritance.mp4
*  part 1*/

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.oncologyServices();
		fh.pediaServices();

		fh.cardioServices();
		fh.dentalServices();

		fh.gynecServices();
		fh.radiologyService();

		fh.optServices();
		fh.pathologyServices();

		System.out.println();

		// can not create the object of Interface
//		USMedical us = new USMedical();

		// Top Casting
		// child class object can be referred by parent interface ref variable
		// cannot access the individual methods
		// cannot access methods from the other interface - Reference type check will
		// fail

		USMedical us = new FortisHospital(); // only methods from USMedical can be accessed
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();

		// Down Casting - strictly not allowed

//		FortisHospital fh1 = new USMedical(); // cannot create an object of the interface

		System.out.println();

		// common methods can be accessed with fh, us, uk, india
		fh.emergencyServices();
		us.emergencyServices();

		System.out.println();
		// interface variable
		System.out.println(USMedical.min_fee);

		// Static method
		FortisHospital.billing();
		USMedical.billing();

		/*
		 * Day 23 - 23rd Jan Java_22_AbstractClass_Vs_Interface_TopCasting_Examples.mp4
		 * part 1
		 */

		System.out.println();
		System.out.println("----Interface to Interface - explicit casting-----");

		// we have two interfaces. we can convert us to uk or uk to us
		UKMedical uk1 = (UKMedical) us; // us medical reference is converted to uk medical
		uk1.cardioServices();
		uk1.dentalServices();
		uk1.emergencyServices();
		
		// This concept is used in selenium - javascript executor
	}

}
