package storeGUI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		int accountAccess;
		
		System.out.print("Welcome to the login Page: \n\n");
		List<Product> productList = new ArrayList<>();
		MenuType menuType = new MenuType(productList);
		
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
