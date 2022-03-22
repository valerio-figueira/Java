package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num;

		System.out.print("Digite um número para fatoração:");
		num = key.nextInt();
		
		for (int i = num, fat = 1; i > 1; i--) {
			fat *= i;
			System.out.print(fat + ".");
		}
	}
}