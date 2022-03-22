package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer26v2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num, i;

		System.out.println("Digite um número inteiro:");
		num = key.nextInt();
		System.out.println("Fatorial de: " + num);
		System.out.print(num + "! = ");

		for (i = num; i > 1; i--, num *= i) {
			System.out.print(i + ", ");

			if (i == 2) {
				i--;
				System.out.print(i + " = " + num);
			}
		}
	}
}
