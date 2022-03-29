package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer13 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = new int[5];
		int soma = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro:");
			a[i] = key.nextInt();
			soma += a[i];
			if (a[i] % 5 == 0) {
				System.out.println("O " + (i + 1) + "º número: (" + a[i] + ") é múltiplo de 5.\n");
			}
			if (soma % 5 == 0 && i > 0) {
				System.out.println("A soma de " + (i + 1) + " números: (" + soma + ") é múltipla de 5.\n");
			}
		}
	}
}