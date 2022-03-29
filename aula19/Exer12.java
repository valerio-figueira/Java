package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer12 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = new int[5];
		int soma = 0;
		String output = "";

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro:");
			a[i] = key.nextInt();
			soma += a[i];
			output += (i + 1) + "º número é: " + a[i] + " | ";
		}
		System.out.print(output);
		System.out.println("\nA soma dos números: " + soma);
	}
}
