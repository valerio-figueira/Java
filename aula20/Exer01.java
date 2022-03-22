package com.valerio.cursojava.aula20;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] a = new int[4][4];
		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = random.nextInt(9);
				System.out.print(a[i][p] + " ");

			}
			System.out.print("\n");
		}
		maior(a);
	}
	public static void maior(int[][] a) {
		int maior = a[0][0];
		int column = 0, line = 0;
		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				if (a[i][p] > maior) {
					maior = a[i][p];
					line = i;
					column = p;
				}
			}
		}
		System.out.print("Maior número é " + maior);
		System.out.print(" | Linha: " + line);
		System.out.print(" | Coluna: " + column);
	}
}