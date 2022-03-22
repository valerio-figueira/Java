package com.valerio.cursojava.aula20;

import java.util.Random;

public class Exer02v2 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] a = new int[10][10];

		System.out.println("Matriz M:");

		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = random.nextInt(9);
				System.out.print(a[i][p] + " ");
			}
			System.out.print("\n");
		}
		System.out.println("Maior número da quinta linha: " + GreaterNumberOnLine(a, 5)
				+ " | Maior menor da quinta linha: " + SmallerNumberOnLine(a, 5));
		System.out.println("Maior número da sétima coluna: " + GreaterNumberOnColumn(a, 7)
				+ " | Menor número da sétima coluna: " + SmallerNumberOnColumn(a, 7));
	}

	public static int GreaterNumberOnLine(int[][] a, int line) {
		int maior = 0;
		for (int i = 0; i < a[line].length; i++) {
			if (a[line][i] > maior) {
				maior = a[line][i];
			}
		}
		return maior;
	}

	public static int SmallerNumberOnLine(int[][] a, int line) {
		int menor = 99;
		for (int i = 0; i < a[line].length; i++) {
			if (a[line][i] < menor) {
				menor = a[line][i];
			}
		}
		return menor;
	}

	public static int GreaterNumberOnColumn(int[][] a, int column) {
		int maior = 0;
		for (int i = 0; i < a[column].length; i++) {
			if (a[column][i] > maior) {
				maior = a[i][column];
			}
		}
		return maior;
	}

	public static int SmallerNumberOnColumn(int[][] a, int column) {
		int menor = 99;
		for (int i = 0; i < a[column].length; i++) {
			if (a[i][column] < menor) {
				menor = a[i][column];
			}
		}
		return menor;
	}
}