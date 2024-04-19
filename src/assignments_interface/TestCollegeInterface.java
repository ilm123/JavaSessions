package assignments_interface;

public class TestCollegeInterface {

	public static void main(String[] args) {
		Cornell cor = new Cornell();
		Xavior xav = new Xavior();
		
		cor.Biology();
		cor.English();
		cor.computerScience();
		cor.courseProcedure();
		cor.collegeList();
		
		System.out.println();
		xav.Biology();
		xav.English();
		xav.computerScience();
		xav.courseProcedure();
		xav.collegeList();
		
		System.out.println();
		USEduSystem us = new Cornell();
		us.Biology();
		us.courseProcedure();


	}

}
