package storeGUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuType {
	private List<Product> productList;
	
	public MenuType(List<Product> productList) {
		this.productList = productList;
	}
	
	public void adminMenu() {
		
		System.out.println("You have now logged in as an Administrator\n"); // Administrator

		Menu adminMenu = new Menu("Administrator Menu");
		
		/*
		 * 1.) Create product list 
		 * 2.) View product list 
		 * 3.) Edit product list 
		 * 4.) Logout
		 */
		
		MenuChoice createProductChoice = new MenuChoice("Create product list");
		MenuChoice viewProductChoice = new MenuChoice("View product list"); 
		MenuChoice editProductChoice = new MenuChoice("Edit product list");
		MenuChoice logoutChoice = new MenuChoice("Logout");
		
		MenuChoice choice;
		
		adminMenu.addMenuChoice(createProductChoice);
		adminMenu.addMenuChoice(viewProductChoice);
		adminMenu.addMenuChoice(editProductChoice);
		adminMenu.addMenuChoice(logoutChoice);
		
		
		do {
			choice = adminMenu.displayAndChoose();
			
			// admin stuff
			if (choice == createProductChoice) {
				// name, number, price
				Product product = new Product();
				setProductInfo(product);
				this.productList.add(product);
				
			} else if (choice == viewProductChoice) {
				for (int i = 0; i < productList.size(); i++) {
					System.out.println(productList.get(i).toString());
				}	
			} else if (choice == editProductChoice) {
				editMenu();
				
				// Create edit menu
			} else {
				System.out.println("Goodbye\n");
				Login.enterCredentials();
			}
		} while (choice != logoutChoice);

	}

	public void editMenu() {
		Scanner keyboard = new Scanner(System.in);

		Menu editMenu = new Menu("Edit Menu");
		
		/*
		 * 1.) Create product list 2.) View product list 3.) Edit product list 4.)
		 * Logout
		 */
		
		MenuChoice updateChoice = new MenuChoice("Update");
		MenuChoice deleteChoice = new MenuChoice("Delete"); 
		MenuChoice backChoice = new MenuChoice("Back");
		
		MenuChoice choice;
		
		editMenu.addMenuChoice(updateChoice);
		editMenu.addMenuChoice(deleteChoice);
		editMenu.addMenuChoice(backChoice);
		Product product = new Product();
		
		do {
			for (int j = 0; j < productList.size(); j++) {
				System.out.println("Number " + (j + 1) + productList.get(j).toString());
			}
			System.out.println("Which item do you want to edit? (Select number)");
			String pEdit = keyboard.nextLine();
			int productPosition = Integer.parseInt(pEdit); // Need to catch errors here
			
			// Edit the product in the array with input
			System.out.println("\nNumber: " + (productPosition) + productList.get((productPosition - 1)).toString());
			
			System.out.println("What would you like to do? \n");
			
			choice = editMenu.displayAndChoose();
			
			if (choice == updateChoice) {
				setProductInfo(product);
				productList.set((productPosition - 1), product);
			} else if (choice == deleteChoice) {
				 productList.remove((productPosition - 1));
			} else {
				adminMenu();
			}
		} while (choice != backChoice);
	}
	
	public void setProductInfo(Product product) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter Product Name: ");
		String productName = keyboard.nextLine();
		product.setProdName(productName);
		
		System.out.print("Enter Product Price: ");
		String pPrice = keyboard.nextLine();
		double productPrice = Double.parseDouble(pPrice); // Need to catch errors here
		product.setProdPrice(productPrice);
		
		System.out.print("Enter number of items in warehouse: ");
		String pItem = keyboard.nextLine();
		int productItem = Integer.parseInt(pItem); // Need to catch errors here
		product.setNumOfItem(productItem);
		
	}
	
	public void userMenu() {
		System.out.println("You have now logged in as a store user\n");
		
		/*
		 * search, view and buy product from product list		
		*/
	}
}
