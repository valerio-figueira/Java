package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int num = 0;
		int pares = 0;
		int impares = 0;
		int soma = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um número:");
			num = key.nextInt();

			if (num % 2 == 0) {
				pares++;
				soma = soma + num;
			} else {
				impares++;
				soma = soma + num;
			}

		}
		System.out.println("Soma: " + soma);
		System.out.println("Pares: " + pares);
		System.out.println("Ímpares: " + impares);
	}

}
