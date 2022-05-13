package com.valerio.cursojava.aula53.labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static Scanner getScanner(Scanner scanner) {
		return scanner;
	}

	public static int getInt(String description) {
		System.out.print(description);
		return getScanner(new Scanner(System.in)).nextInt();
	}

	public static void printText(String description) {
		System.out.println(description);
	}

	public static void printError(String description) {
		System.err.println(description);
	}

	public static void main(String[] args) {
		Agenda a = new Agenda();
		Controller controller = new Controller();
		ArrayList<Contact> c = new ArrayList<Contact>();

		while (true) {
			boolean exit = false;
			switch (home()) {
			case 1: {
				try {
					controller.addContact(c);
				} catch (Exception e) {
					printError(e.getMessage());
				}
				a.setContact(c);
				break;
			}
			case 2: {
				try {
					controller.contactQuery(a);
				} catch (Exception e) {
					printError(e.getMessage());
				}
				break;
			}
			case 3: {
				try {
					controller.contactList(a);
				} catch (Exception e) {
					printError("You must add at least one contact on agenda.");
					printError(e.getMessage());
				}
				break;
			}
			case 4: {
				exit = true;
				break;
			}
			}
			if (exit) {
				break;
			}
		}
	}

	public static int home() {
		int option = 0;
		printText(":::::::::HOME::::::::::");
		printText("1 - Write Contact on Agenda");
		printText("2 - Search Contact");
		printText("3 - Show Contact List");
		printText("4 - Exit");
		printText(":::::::::::::::::::::::");
		while (true) {
			try {
				option = getInt("Insert an option: ");
				if (option != 1 && option != 2 && option != 3 && option != 4) {
					printError("Invalid option");
				}
			} catch (Exception e) {
				printError("Incorrect data information. Only Numbers are permitted");
				printError(e.getMessage());
			}
			break;
		}
		return option;
	}
}
