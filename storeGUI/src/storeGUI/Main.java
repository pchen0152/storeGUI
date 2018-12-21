package storeGUI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		System.out.print("Welcome to the login Page: \n\n");
		
		// to be able to use the MenuType class(nonstatic)
		// is to declare new instance of the class shown below
		List<Product> productList = new ArrayList<>();
		MenuType menuType = new MenuType(productList);
		
		int accountAccess; // declared outside of loop for while condition
		do {
			accountAccess = Login.enterCredentials(); 
			if (accountAccess == 1) {
				// go into admin menu
				menuType.adminMenu();
			} else if (accountAccess == 2) {
				// go into user menu
				menuType.userMenu();
			} else {
				//no account
				System.out.println("\nUsername or password not recognized. Please try again.\n");
			}
		} while (accountAccess == 0);
	}
	
	
}
