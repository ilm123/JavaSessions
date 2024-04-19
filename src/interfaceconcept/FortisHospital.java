package interfaceconcept;

/* Day 22 - 22nd Jan
*  Java_21_Interface_Abstraction_MultipleInheritance.mp4
*  part 1*/

//child -- parent class (1) --- parent interfaces(n)
public class FortisHospital extends Hospital implements USMedical, UKMedical, IndiaMedical {

	// India
	@Override
	public void gynecServices() {
		System.out.println("FH -- gynecServices");

	}

	@Override
	public void radiologyService() {
		System.out.println("FH -- radiologyService");

	}

	// UK
	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	// FH - Individual
	public void optServices() {
		System.out.println("FH -- optServices");
	}

	// FH - Individual
	public void pathologyServices() {
		System.out.println("FH -- pathologyServices");
	}

	//common method
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");

	}
	
	//static method - cannot be overridden - method hiding
	public static void billing() {
		System.out.println("FH -- billing");
	}
	
	@Override
	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");
	}
	
	// WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");
		
	}

}
