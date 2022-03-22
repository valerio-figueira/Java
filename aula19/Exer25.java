package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite um número inteiro: ");
			a[i] = key.nextInt();
			if (a[i] % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
			System.out.println("Valor do vetor B: " + b[i]);
		}
	}
}