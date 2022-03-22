package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, denom1, denom2, s;

		System.out.println("Digite o denominador:");
		denom1 = input.nextInt();
		while (denom1 % 2 == 0) {
			System.out.println("O denominador deve ser ímpar! Digite o denominador:");
			denom1 = input.nextInt();
		}
		System.out.print("S = ");
		for (num = 1, denom2 = 1; denom2 < denom1; num++, denom2 += 2) {
			System.out.print(num + "/" + denom2 + " + ");
		}
		if (denom2 == denom1) {
			System.out.print(num + "/" + denom2 + ".");
		}
	}
}
