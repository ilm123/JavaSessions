package MapConcept;

import java.util.HashMap;

/* Day 30 - 6th Feb
*  Java_29_HashMapIteration_Add_Remove_ForEachLoop_LinkedHashMap_TreeMap_HashMapUseCaseWithRBAC.mp4
*  part 4_1*/

public class UserRole {

	public void doLogin(String un, String pw) {
		System.out.println("User login with : " + un +" - "+ pw);
		
	}

	public String getUserCreds(String role) {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller@123");
		userMap.put("buyer", "buyer:buyer@123");
		userMap.put("partner", "partner:partner@123");
		userMap.put("user", "ilma:ilma@123");

		return userMap.get(role);
	}

	public static void main(String[] args) {

		// Amazon - RBAC - Role based access control
		// UM - IAM (User Management - Identity Access Management)

		String role = "admin";
		UserRole obj = new UserRole();
		String creds = obj.getUserCreds(role);// "Take this role and give me the user credentials / value" ->admin:admin123
		System.out.println(creds);

		String arr[] = creds.split(":");
		String un = arr[0].trim();
		String pw = arr[1].trim();
		obj.doLogin(un, pw);
	}

}
