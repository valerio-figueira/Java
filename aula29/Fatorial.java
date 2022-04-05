package com.valerio.cursojava.aula29;

import java.util.Random;

public class Fatorial {
	static int fat = 1;
	static int num = 5;
	static int a[] = new int[4];

	static Random random = new Random();

	public static void main(String[] args) {

		for (int i = num; i > 0; i--) {
			fat *= i;
			System.out.print(fat + ".");
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(9);
			fat = a[i];
			System.out.print(a[i] + ": ");
			for (int j = 1; j < a[i]; j++) {
				fat *= j;
				System.out.print(fat + ".");
			}
			System.out.println();
		}
	}
}
