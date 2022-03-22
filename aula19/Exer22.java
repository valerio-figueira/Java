package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[10];
		int zero = 0, um = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 1);
			if (a[i] == 0) {
				zero++;
			} else if (a[i] == 1) {
				um++;
			}
		}
		um = (um * 100) / 10;
		zero = (zero * 100) / 10;
		System.out.println("Porcentagem de 0 é " + zero + "%");
		System.out.println("Porcentagem de 1 é " + um + "%");
	}

}
