package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0, cont = 1, res;

		for (res = num; cont <= 5; cont++) {
			System.out.println("Digite um número:");
			num = key.nextInt();
			if (num > res) {
				res = num;
			}
		}
		System.out.println(res);

		/*
		 * do { cont++; System.out.println("Digite um número: "); num = key.nextInt();
		 * res = num; if (res > num) { res = num; } } while (cont <= 5);
		 * System.out.println(res+" é maior.");
		 */
	}
}
