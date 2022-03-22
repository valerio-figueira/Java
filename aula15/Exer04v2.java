package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer04v2 {

	public static void main(String[] args) {

		String regex = "\\b\\d+\\b";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma letra, vogal ou consoante: ");

		String letra = entrada.nextLine();

		
		if (letra.matches(regex)) {
			System.out.println("Número.");
		}
		else if (letra.length() > 1) {
			System.out.println("Digitou mais de um caractere.");
		} else {

			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
				System.out.println("Vogal");
			} else {
				System.out.println("Consoante");
			}
		}

	}

}
