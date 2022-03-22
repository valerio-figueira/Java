package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num, i, fat = 1;

		System.out.println("Digite um número inteiro:");
		num = key.nextInt();
		System.out.println("Fatorial de: " + num);
		System.out.print(num + "! = ");
		for (; num > 1; num--) {

			fat *= num;
			System.out.print(num + ", ");

			if (num == 2) {
				num--;
				System.out.print(num + " = " + fat);
			}
		}
	}
}
