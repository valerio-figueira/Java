package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int n;

		System.out.println("Digite o enésimo termo da série de Fibonacci:");
		n = key.nextInt();

		int primeiro = 1, segundo = 1, proximo;
		System.out.print(primeiro + "." + segundo + ".");
		
		for (int i = 3; i <= n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.print(proximo + ".");
		}

		/*
		 * for (int a = 0, b = 1, i = 0; i < 30; b += a, a = b - a, i++) {
		 * System.out.println(a); }
		 */

	}

}
