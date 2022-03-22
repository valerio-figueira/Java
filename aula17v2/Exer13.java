package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a, a2, b, i;
		System.out.println("Digite a base de um número:");
		a = key.nextInt();
		System.out.println("Digite o expoente deste número:");
		b = key.nextInt();

		for (i = 1, a2 = a; i < b; i++) {
			a *= a2;
			System.out.println(a);
		}
	}
}
