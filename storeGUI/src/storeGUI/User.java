package storeGUI;

public class User {
	// admin and user account credentials
	private String[] admin = { "Admin", "Passw0rd" }; 
	private String[] user = { "User", "Password123" };
	
	public String[] getAdmin() {
		return admin;
	}
	
	public String[] getUser() {
		return user;
	}
	
}