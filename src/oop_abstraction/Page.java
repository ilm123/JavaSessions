package oop_abstraction;

/* Day 23 - 23rd Jan
* Java_22_AbstractClass_Vs_Interface_TopCasting_Examples.mp4
* part 2*/

public abstract class Page {

	// Constructor - gets called when an object is created. But we cannot create an
	// object of the abstract class. It will be called when the object of the child 
	// class is created. The child class doesn't have the default constructor.
	// Abstract class const.. will be called when you create the object of child class.

	public Page() {
		this(20);
		System.out.println("Page -- constructor");
	}
	
	public Page(int i) {
		System.out.println("Page -- constructor" + i);
	}

	// we can not create the object of abstract class
	// we can have abs.. methods and non abs.. methods
	// no default methods allowed in abs.. class
	// abs class can have only non abs methods also
	// can we create the constructor of the abs.. class?? - yes

	// no abs.. methods -- 0% abstraction
	// only abs... methods -- 100% abstraction
	// abs + non abs methods -- partial abstraction
	// 0 to 100% abstraction

	public abstract void title();

	public abstract void url();

	public void pageLoadingTime() {
		System.out.println("Page -- pageLoadingTime - 20 seconds");
	}

	// static means its in the CMA - metaspace
	public static void displayLogo() {
		System.out.println("Page -- displayLogo");
	}

	// final because I don't want to create a common copy of this method. Every page
	// should have their own copy but cannot override
	public final void footers() {
		System.out.println("Page -- footers");
	}

}
