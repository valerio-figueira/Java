package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, a, b, cont;
		boolean primo = true;

		System.out.println("Digite um número inteiro:");
		num = input.nextInt();

		for (a = 2; a <= num; a++) {
			primo = true;
			for (b = 2; b < a; b++) {
				if (a % b == 0) {
					primo = false;
				}
			}
			if (primo && num > 1)
				System.out.println(a);
		}
	}
}
