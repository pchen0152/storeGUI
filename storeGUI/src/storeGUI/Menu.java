package storeGUI;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private Scanner _keyboard = new Scanner(System.in);
	private String _lineIn;
	private String _title;
	private ArrayList<MenuChoice> _choices = new ArrayList<>();

	
	public Menu(String title) {
		_title = title;
		_lineIn = _title.replaceAll(".", "-");
	}

	

	public MenuChoice displayAndChoose() {
		boolean valid;
		int numericChoice = 0;
		do {
			display();
			System.out.print("Choice: ");
			String lineEntered = _keyboard.nextLine();

			try {
				numericChoice = Integer.parseInt(lineEntered);
				valid = (numericChoice >= 1) && (numericChoice <= (_choices.size()));
			} catch (Exception e) {
				valid = false;
			}

			if (!valid) {
				System.out.println("Invalid choice");
			}
		} while (!valid);
		return _choices.get(numericChoice - 1);
	}

	
	private void display() {
		System.out.println();
		System.out.printf(".-%s-.%n", _lineIn);
		System.out.printf("| %s |%n", _title);
		System.out.printf("'-%s-'%n", _lineIn);

		int labeling = 0;
		for (MenuChoice choice : _choices) {
			labeling++;
			System.out.println(labeling + ") " + choice.getText());
		}
		System.out.println();
	}

	public void addMenuChoice(MenuChoice menuChoice) {
		_choices.add(menuChoice);
	}

	
	
	// kljlkj
	public static void adminMenu() {
		System.out.println("You have now login as an Administrator\n"); // Administrator

		/*
		 * 1.) Create product list 2.) View product list 3.) Edit product list 4.)
		 * Logout
		 */

		System.out.println("Please enter a number.\n\n" + "1.) Create product list\n" + "2.) View product list\n"
				+ "3.) Edit product list\n" + "4.) Logout\n");

	}

	public static void userMenu() {

	}
}
