package storeGUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Login {

	private static Scanner keyboard = new Scanner(System.in);
	private String storePass = "Password123";
	private String adminPass = "Passw0rd";
	private String adminUser = "Admin";
	private String storeUser = "Manager";

	private String[] admin = { "Admin", "Passw0rd" };
	private String[] user = { "Manager", "Password123" };

	public void enterCredentials() {
		String Username;
		String Password;

		String userInput;
		List<Product> productList = new ArrayList<Product>(); // Initialize empty linkedList

		System.out.print("Welcome to the login Page: \n\n");

		/*
		 * if ((Username == "Admin") && (Password == "Passw0rd")) {
		 * System.out.println("You have now login as an Administrator"); //Administrator
		 * Add Method
		 * 
		 * do { System.out.println("Please enter Product name: \n"); String prodName =
		 * keyboard.nextLine(); System.out.println("Please enter Product code: \n");
		 * String prodCode = keyboard.nextLine();
		 * System.out.println("Please enter Product Description: \n"); String
		 * prodDescription = keyboard.nextLine();
		 * System.out.println("Please enter Product Price: \n"); String prodPrice =
		 * keyboard.nextLine();
		 * System.out.println("Please enter Product Availability: \n"); String
		 * prodAvailability = keyboard.nextLine();
		 * System.out.println("Please enter the number of Products: \n"); String
		 * numOfProducts = keyboard.nextLine(); Product p = new Product(prodCode,
		 * prodName, prodDescription, prodPrice, prodAvailability, numOfProducts);
		 * productList.add(p);
		 * System.out.println("Would you like to add more products? Please enter y/n");
		 * userInput = keyboard.next(); } while (userInput.toLowerCase().equals("y"));
		 * 
		 * //Edit Method System.out.println("Please enter the product code to edit: ");
		 * for (Product p: productList) { System.out.println(p.toString()); } userInput
		 * = keyboard.next(); for (Product p : productList) { if
		 * (p.getProdCode().equals(userInput)) { System.out.println(); } } } else if
		 * ((Username == "Manager" && Password == "Password123")) {
		 * System.out.println("You are now login as a Manager"); } else {
		 * System.out.println("Invalid User"); }
		 */
	}

	public void enterUserAndPass(String username, String password) {
		System.out.println("Username: ");
		username = keyboard.nextLine();
			
		System.out.print("Password: ");
		password = keyboard.nextLine();
		validateCredentials(username, password, admin, user);
	}

	public int validateCredentials(String username, String password, String[] compare1, String[] compare2) {
		if (username == compare1[0] && password == compare1[1]) {
			return 1; 
		}
		
		if (username == compare2[0] && password == compare2[1]) {
			return 2;
		}

		return 0;
	}
}

// TODO Auto-generated method stub
//		do {
//			System.out.println("Welcome to the login Page: \n"
//					+ "Username: \n");
//			Username = keyboard.nextLine();
//			if (!Username.equals(adminUser) && !Username.equals(storeUser)) {
//				System.out.println("Invalid User");
//			}
//		} while (!Username.equals(adminUser) && !Username.equals(storeUser));
//		do {
//			System.out.println("Password: ");
//			Password = keyboard.nextLine();
//		} while (!Username.equals(adminPass) && !Username.equals(storePass));

// .equals() - compares the values inside the variable
//		while(!Username.equals(adminUser) && !Username.equals(storeUser)) {
// System.out.println("Invalid User");
//		}

//			System.out.println("Password: ");
//			Password = keyboard.nextLine();