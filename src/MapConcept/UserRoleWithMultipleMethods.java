package MapConcept;

import java.util.HashMap;

import ExceptionHandling.MyException;

/* Day 30 - 6th Feb
*  Java_29_HashMapIteration_Add_Remove_ForEachLoop_LinkedHashMap_TreeMap_HashMapUseCaseWithRBAC.mp4
*  part 4_2*/

public class UserRoleWithMultipleMethods {
	// Writing multiple methods helps in debugging the code

	public void doLogin(String un, String pw) {
		System.out.println("User login with : " + un + " - " + pw);
	}

	public void doLogin(String role) {
		String creds = getUserCreds(role);
		String un = creds.split(":")[0].trim();
		String pw = creds.split(":")[1].trim();
		doLogin(un, pw);
	}

	private String getUserCreds(String role) {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller@123");
		userMap.put("buyer", "buyer:buyer@123");
		userMap.put("partner", "partner:partner@123");
		userMap.put("user", "ilma:ilma@123");

		if (userMap.containsKey(role)) {// Handle the null pointer in the core method
			return userMap.get(role);
		} else {
			throw new MyException("ROLE NOT FOUND");
		}
	}

	public static void main(String[] args) {

		// Amazon - RBAC - Role based access control
		// UM - IAM (User Management - Identity Access Management)

		String role = "manager";
		UserRoleWithMultipleMethods obj = new UserRoleWithMultipleMethods();

		obj.doLogin(role);

		// There is one external user - SSO login has not been given-so 1st method is
		// called
		obj.doLogin("shekar@gmail.com", "shekar@123");
	}

}
