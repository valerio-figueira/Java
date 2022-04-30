package com.valerio.cursojava.aula43.labs;

import java.util.Random;
import java.util.Scanner;

public class Controller {
	Scanner scanner;
	Random random;

	Controller(Scanner scanner, Random random) {
		this.scanner = scanner;
		this.random = random;
	}

	Controller() {
		this(new Scanner(System.in), new Random());
	}

	String typeText(String text) {
		System.out.print(text);
		return scanner.nextLine();
	}

	void printDescription(String text) {
		System.out.println(text);
	}

	String setName() {
		// return typeText("Defina o nome da pessoa: ");
		return "Mary";
	}

	int setAccount() {
		// return random.nextInt(9999);
		return 3805;
	}

}
