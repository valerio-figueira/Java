package com.valerio.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num = key.nextInt();
		System.out.println("Entre com um limite:");
		int limite = key.nextInt();

		for (int i = num; i <= limite; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println(i+" é divisível por 7.");
				break;
			}
		}
	}

}
