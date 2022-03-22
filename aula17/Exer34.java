package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int i = 1, denom, soma = 0;

		System.out.println("Digite o denominador:");
		denom = key.nextInt();
		System.out.print("H = 1 + ");

		for (; i < denom; i++) {
			System.out.print("1/" + i + " + ");
			soma += 1/i;
		}
		if (i == denom) {
			System.out.print("1/" + i + ". ");
			System.out.println("Soma: "+soma);
		}
	}
}