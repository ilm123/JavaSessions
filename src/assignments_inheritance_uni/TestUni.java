package assignments_inheritance_uni;

public class TestUni {

	public static void main(String[] args) {
		
		System.out.println("University class");
		
		University uni = new University();
		uni.careerPath(); //inherited
		uni.bscComputerScience(); //individual
		uni.mscSoftwareEngineering(); //individual
		
		System.out.println();		
		System.out.println("Cornell class");
		
		Cornell corn = new Cornell();
		corn.careerPath(); //overridden
		corn.bscComputerScience(); //inherited	
		corn.mscSoftwareEngineering(); //inherited
		
		System.out.println();		
		System.out.println("IIT class");
		
		IIT iit = new IIT();
		iit.careerPath(); //inherited
		iit.bscComputerScience(); //inherited
		iit.mscSoftwareEngineering(); //inherited
		iit.CerficationInFinance(); //individual
		
		
		System.out.println();
		System.out.println("Xavior class");
		
		Xavior xav = new Xavior();
		xav.careerPath(); //inherited
		xav.bscComputerScience(); //inherited
		xav.mscSoftwareEngineering(); //overridden
		

	}

}
