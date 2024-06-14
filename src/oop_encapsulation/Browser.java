package oop_encapsulation;

/* Day 19 - 12th Jan
 * Java_18_OOP_Encapsulation_Public_Private_Modifiers_Getter_Setter_PrivateConstructor.mp4
 * part 2_1*/

public class Browser {

	public void launchBrowser() { //public layer
		System.out.println("Launch Browser");
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdatesAvailable();
	}
	
	private void checkOSCompatibility() {
		System.out.println("Check OS compatibility");
	}
	
	private void checkRAMSpace() {
		System.out.println("check RAM space");
	}
	
	private void checkUpdatesAvailable() {
		System.out.println("Check Updates Available");
	}
}

// all the methods that are used internally are made private.