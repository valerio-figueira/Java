package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int n1, n2, i;

		System.out.println("Digite o 1º número: ");
		n1 = key.nextInt();
		System.out.println("Digite o 2º número: ");
		n2 = key.nextInt();

		for (i = n1; i <= n2; i++) {
			System.out.print(i+".");
		}

	}

}
