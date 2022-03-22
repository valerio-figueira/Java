package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		double base, exp, i = 1, produto;

		System.out.println("Digite o número base: ");
		base = key.nextDouble();
		System.out.println("Digite o expoente deste número: ");
		exp = key.nextDouble();
		
		for (produto = base; i < exp; i++) {
			produto *= base;
			System.out.println("O produto é " + produto);
		}

	}

}
