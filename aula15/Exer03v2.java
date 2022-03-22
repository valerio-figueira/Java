package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer03v2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o sexo, se 'F' ou 'M': ");
		String sexo = key.nextLine();

		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino.");
		} else {
			System.out.println("Inválido.");
		}
	}

}