package com.valerio.cursojava.aula20;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] a = new int[10][10];
		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = random.nextInt(9);
				System.out.print(a[i][p] + "  ");
			}
			System.out.print("\n");
		}
		/*
		 * maiorMenorLine5(a); maiorMenorColumn7(a);
		 */
		System.out.println("Maior número da linha 5: " + getGreaterOnLine(a, 5) + " | Menor número da linha 5: "
				+ getMinorOnLine(a, 5));
		System.out.println("Maior número da coluna 7: " + getGreaterOnColumn(a, 7) + " | Menor número da coluna 7: "
				+ getMinorOnColumn(a, 7));

		for (int[] outputA : a) {
			for (int print : outputA) {
				System.out.print(print + "  ");
			}
			System.out.println();
		}
	}

	public static int getGreaterOnLine(int[][] a, int line) {
		int maior = 0;
		for (int i = 0; i < a[line].length; i++) {
			if (a[line][i] > maior) {
				maior = a[line][i];
			}
		}
		return maior;
	}

	public static int getMinorOnLine(int[][] a, int line) {
		int menor = 11;
		for (int i = 0; i < a[line].length; i++) {
			if (a[line][i] < menor) {
				menor = a[line][i];
			}
		}
		return menor;
	}

	public static int getGreaterOnColumn(int[][] a, int column) {
		int maior = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i][column] > maior) {
				maior = a[i][column];
			}
		}
		return maior;
	}

	public static int getMinorOnColumn(int[][] a, int column) {
		int menor = 11;
		for (int i = 0; i < 10; i++) {
			if (a[i][column] < menor) {
				menor = a[i][column];
			}
		}
		return menor;
	}
	/*
	 * public static void maiorMenorLine5(int[][] a) { int maior = a[0][0], menor =
	 * 99; for (int i = 0; i < 10; i++) { if (a[5][i] > maior) { maior = a[5][i]; }
	 * if (a[5][i] < menor) { menor = a[5][i]; } }
	 * System.out.print("O maior número da linha 5 é " + maior);
	 * System.out.println("\nO menor número da linha 5 é " + menor); }
	 * 
	 * public static void maiorMenorColumn7(int[][] a) { int maior = a[0][0], menor
	 * = 99; for (int i = 0; i < 10; i++) { if (a[i][7] > maior) { maior = a[i][7];
	 * } if (a[i][7] < menor) { menor = a[i][7]; } }
	 * System.out.print("O maior número da coluna 7 é " + maior);
	 * System.out.println("\nO menor número da coluna 7 é " + menor); }
	 */
}