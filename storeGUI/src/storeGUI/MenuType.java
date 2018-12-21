package storeGUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuType {
	private List<Product> productList;
	
	/**
	 * Constructor accepting any initial values
	 * 
	 * @param productList
	 */
	public MenuType(List<Product> productList) {
		this.productList = productList;
	}
	
	/**
	 * Handles admin menu choices and interactions
	 */
	public void adminMenu() {
		
		System.out.println("You have now logged in as an Administrator\n"); // Administrator

		Menu adminMenu = new Menu("Administrator Menu");
		
		/*
		 * 1.) Create product list 
		 * 2.) View product list 
		 * 3.) Edit product list 
		 * 4.) Logout
		 */
		
		
		// Setting up menu
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
			choice = adminMenu.displayAndChoose(); // display choices
			
			if (choice == createProductChoice) {
				// creating a new instance of a product to insert into array
				Product product = new Product();
				setProductInfo(product);
				this.productList.add(product);
				
			} else if (choice == viewProductChoice) {
				// iterate through array and display all contents
				for (int i = 0; i < productList.size(); i++) {
					System.out.println(productList.get(i).toString()); // display array.index.(display method in class)
				}	
			} else if (choice == editProductChoice) {
				editMenu();
				
			} else {
				System.out.println("Goodbye\n");
				Login.enterCredentials();
			}
		} while (choice != logoutChoice);

	}

	/**
	 * Allows admin to edit contents in product list
	 */
	public void editMenu() {
		Scanner keyboard = new Scanner(System.in);

		Menu editMenu = new Menu("Edit Menu"); // menu title
		
		/*
		 * 1.) Create product list 2.) View product list 3.) Edit product list 4.)
		 * Logout
		 */
		
		// creating menu
		MenuChoice updateChoice = new MenuChoice("Update");
		MenuChoice deleteChoice = new MenuChoice("Delete"); 
		MenuChoice backChoice = new MenuChoice("Back");
		
		MenuChoice choice;
		
		editMenu.addMenuChoice(updateChoice);
		editMenu.addMenuChoice(deleteChoice);
		editMenu.addMenuChoice(backChoice);
		Product product = new Product();
		
		do {
			// Provide entire product list with numbers
			for (int j = 0; j < productList.size(); j++) {
				System.out.println("\nItem Number: " + (j + 1) + productList.get(j).toString());
			}
			
			// asking user which product they want to enter
			System.out.println("Which item do you want to edit? (Select number)");
			String pEdit = keyboard.nextLine();
			int productPosition = Integer.parseInt(pEdit); // Need to catch errors here
			
			// display the product in the array that is going to be edited
			System.out.println("\nItem Number: " + (productPosition) + productList.get((productPosition - 1)).toString());
			
			System.out.println("What would you like to do? \n");
			
			choice = editMenu.displayAndChoose(); // display edit menu
			
			if (choice == updateChoice) {
				// rewriting product from index
				setProductInfo(product);
				productList.set((productPosition - 1), product); // list.set(index, element)
			} else if (choice == deleteChoice) {
				 productList.remove((productPosition - 1));
			} else {
				adminMenu();
			}
		} while (choice != backChoice);
	}
	
	/**
	 * Ask for product information and store them into variables waiting to push into array
	 * 
	 * @param product
	 */
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
	
	//unfinished
	public void userMenu() {
		System.out.println("You have now logged in as a store user\n");
		
		/*
		 * search, view and buy product from product list		
		*/
	}
}
