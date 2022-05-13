package com.valerio.cursojava.aula53.labs;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	Scanner scanner;

	Controller(Scanner scanner) {
		this.scanner = scanner;
	}

	Controller() {
		this(new Scanner(System.in));
	}

	String typeText(String description) {
		System.out.print(description);
		String text = scanner.nextLine();
		return text;
	}

	int typeInt(String description) {
		System.out.print(description);
		int number = scanner.nextInt();
		return number;
	}

	void printText(String description) {
		System.out.println(description);
	}

	void printError(String description) {
		System.err.println(description);
	}

	ArrayList<Contact> addContact(ArrayList<Contact> contact) throws Exception {
		int id = contact.size();
		while (true) {
			Contact c = new Contact();
			while (true) {
				c.setName(typeText("Type a name: "));
				if (c.getName().matches("[A-z]*")) {
					break;
				} else {
					printError("You must type a right name first, without signs. DDD comes first.");
				}
			}
			while (true) {
				c.setPhone(typeText("Insert the phone number: "));
				if (c.getPhone().matches("[0-9]*")) {
					if (c.getPhone().length() >= 10) {
						break;
					} else {
						printError("The number must have 10 characters at least");
					}
				} else {
					printError("Insert a right phone number, without signs.");
				}
			}
			c.setId(id);
			contact.add(c);
			boolean exit;
			id++;
			while (true) {
				Integer option = typeInt("Want to Continue? 1 - Yes | 2 - Not: ");
				if (!option.equals(1) && !option.equals(2)) {
					printText("You must select a right option.");
				} else {
					exit = option.equals(2);
					break;
				}
			}
			if (exit) {
				break;
			}
		}
		return contact;
	}

	Agenda contactList(Agenda a) {
		for (Contact c : a.getContact()) {
			printText(c.toString());
		}
		return a;
	}

	Agenda contactQuery(Agenda a) throws Exception {
		while (true) {
			Integer id = typeInt("Insert ID number to search for contact: ");
			printText(a.getContact().get(id).toString());
			break;
		}
		return a;
	}

}
