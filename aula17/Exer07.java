package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;

		for (int num = 0, i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + "º número:");
			num = key.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		System.out.println(maior + " é o maior deles.");
	}

}
