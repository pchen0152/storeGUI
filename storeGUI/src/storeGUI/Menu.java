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
			display(); // display choices
			System.out.print("Choice: "); // awaiting input
			String lineEntered = _keyboard.nextLine(); // take in user input

			try {
				numericChoice = Integer.parseInt(lineEntered); //parse input
				valid = (numericChoice >= 1) && (numericChoice <= (_choices.size())); //validated if choice exist
			} catch (Exception e) {
				valid = false; // choice does not exist
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
	
	
}
