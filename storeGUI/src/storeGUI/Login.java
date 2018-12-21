package storeGUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import storeGUI.User;

class Login {
	private static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * Ask user to input credentials and compare it to the set accounts
	 * 
	 * @return int value indicating authorization of account
	 */
	public static int enterCredentials() {
		User user = new User();
		System.out.print("Username: ");
		String username = keyboard.nextLine();

		System.out.print("Password: ");
		String password = keyboard.nextLine();

		return validateCredentials(username, password, user.getAdmin(), user.getUser());
	}

	/**
	 * Comparing user inputs to set accounts
	 * 
	 * @param username User input username
	 * @param password User input password
	 * @param adminAccount Existing Admin account
	 * @param userAccount Existing User account
	 * @return int value indicating authorization of account
	 */
	public static int validateCredentials(String username, String password, String[] adminAccount, String[] userAccount) {
		if (username.equals(adminAccount[0]) && password.equals(adminAccount[1])) {
			return 1;
		}

		if (username.equals(userAccount[0]) && password.equals(userAccount[1])) {
			return 2;
		}

		return 0;
	}
}