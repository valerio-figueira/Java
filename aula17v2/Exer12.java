package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num, tab;
		System.out.println("Digite um número entre 1 e 10:");
		num = key.nextInt();

		System.out.println("Tabuada de " + num + " é:");
		for (int i = 1; i <= 10; i++) {
			tab = num * i;
			System.out.println(num + " x " + i + " = " + tab);
		}

	}
}
