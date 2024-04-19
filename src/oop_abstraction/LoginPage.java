package oop_abstraction;

/* Day 23 - 23rd Jan
* Java_22_AbstractClass_Vs_Interface_TopCasting_Examples.mp4
* part 2*/

public class LoginPage extends Page {

	public LoginPage() {		
		System.out.println("LoginPage -- constructor");
	}

	public LoginPage(int i) {
		System.out.println("LoginPage -- constructor" + i);
	}

	@Override
	public void title() {
		System.out.println("LoginPage -- title");

	}

	@Override
	public void url() {
		System.out.println("LoginPage -- url");

	}

	@Override
	public void pageLoadingTime() {
		System.out.println("LoginPage -- pageLoadingTime - 5 seconds");
	}

	// individual method
	public void doLogin(String un, String pw) {
		System.out.println("Login with " + un + " " + pw);
	}

}
