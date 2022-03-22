package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int dia = key.nextInt();

		if (dia == 1) {
			System.out.println("Segunda");
		} else if (dia == 2) {
			System.out.println("Terça");
		} else if (dia == 3) {
			System.out.println("Quarta");
		} else if (dia == 4) {
			System.out.println("Quinta");
		} else if (dia == 5) {
			System.out.println("Sexta");
		} else if (dia == 6) {
			System.out.println("Sábado");
		} else if (dia == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("inválido");
		}
	}
}