package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer03v3 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite F ou M para Feminino ou Masculino: ");
		String sexo = key.nextLine();

		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Inválido!");
		}
	}

}
