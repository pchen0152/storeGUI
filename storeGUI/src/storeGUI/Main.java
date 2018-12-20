package storeGUI;

public class Main {
	public static void main(String[] args) {
		int accountAccess;
		do {
			accountAccess = Login.enterCredentials();
			if (accountAccess == 1) {
				// go into admin menu
				
			} else if (accountAccess == 2) {
				// go into user menu
			
			} else {
				//no account
				System.out.println("Username or password not recognized. Please try again.");
			}
		} while (accountAccess == 0);
	}
}
