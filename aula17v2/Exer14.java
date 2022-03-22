package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num, i = 0, par = 0, impar = 0;

		while (i < 5) {
			System.out.println("Digite o número:");
			num = key.nextInt();
			i++;
			if (num % 2 == 0) {
				System.out.println(num + " é par.");
				par++;
			} else {
				System.out.println(num + " é ímpar.");
				impar++;
			}
		}
		System.out.println("Número " + par);
		System.out.println("Número " + impar);
	}

}
