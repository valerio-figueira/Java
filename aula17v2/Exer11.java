package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a, b, i = 0, soma;

		System.out.println("Digite o 1º número inteiro:");
		a = key.nextInt();
		System.out.println("Digite o 2º número inteiro:");
		b = key.nextInt();

		if (a < b) {
			i = a;
			i++;
			while (i < b) {
				System.out.println(i);
				i++;
			}
		} else if (b < a) {
			i = b;
			i++;
			while (i < a) {
				System.out.println(i);
				i++;
			}
		}
		i = a + b;
		System.out.println("Soma: " + i);
	}
}
