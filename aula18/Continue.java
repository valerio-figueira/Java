package com.valerio.cursojava.aula18;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num = key.nextInt();
		System.out.println("Entre com um limite:");
		int limite = key.nextInt();

		for (int i = num; i <= limite; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}

	}

}
