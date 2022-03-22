package com.valerio.cursojava.aula20;

import java.util.Scanner;

public class Exer06v3 {
	public static void main(String[] args) {
		String[][] a = new String[3][3];
		boolean sair = false, firstPlayer = false, secondPlayer = false;
		int empate = 1;
		startNull(a);
		while (!sair) {
			tabuleiro(a);
			if (!winner(a)) {
				firstPlayer(a, 0, 0);
				empate++;
			} else {
				endGame(a, firstPlayer, secondPlayer);
				sair = true;
			}
			if (!winner(a)) {
				secondPlayer(a, 0, 0);
				empate++;
			} else {
				endGame(a, secondPlayer, secondPlayer);
				sair = true;
			}
			if (empate == 9) {
				tied(a);
				sair = true;
			}
		}
	}

	public static void startNull(String[][] a) {
		System.out.println("::::::::::: Jogo da Velha :::::::::::");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = " - ";
			}
		}
	}

	public static void tabuleiro(String[][] a) {
		System.out.print(":::::::::::::::::::::::::::::::::::::\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print("::::::::::::|");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "|");
			}
			System.out.print("::::::::::::\n");
		}
		System.out.print(":::::::::::::::::::::::::::::::::::::\n");
	}

	public static String firstPlayer(String[][] a, int line, int column) {
		Scanner input = new Scanner(System.in);
		boolean sair = false;
		System.out.println("1st Player - X");
		while (!sair) {
			System.out.print("Escolha a linha: ");
			line = input.nextInt();
			line--;
			System.out.print("Escolha a coluna: ");
			column = input.nextInt();
			column--;
			if (a[line][column] == " X " || a[line][column] == " O ") {
				System.out.println("Inválido! Digite Novamente");
			} else {
				a[line][column] = " X ";
				sair = true;
			}
		}
		return a[line][column];
	}

	public static String secondPlayer(String[][] a, int line, int column) {
		Scanner input = new Scanner(System.in);
		boolean sair = false;
		System.out.println("2nd Player - O");
		while (!sair) {
			System.out.print("Escolha a linha: ");
			line = input.nextInt();
			line--;
			System.out.print("Escolha a coluna: ");
			column = input.nextInt();
			column--;
			if (a[line][column] == " X " || a[line][column] == " O ") {
				System.out.println("Inválido! Digite Novamente");
			} else {
				a[line][column] = " O ";
				sair = true;
			}
		}
		return a[line][column];
	}

	public static boolean winner(String[][] a) {
		for (int i = 0, j = a.length; i < a.length; i++, j--) {
			if (a[i][0] == " X ") {
				if (j == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static void tied(String[][] a) {
		tabuleiro(a);
		System.out.println("Empate!");
	}

	public static void endGame(String[][] a, boolean p1, boolean p2) {
		if (p1 == true) {
			tabuleiro(a);
			System.out.println("Parabéns! 1st Player é o vencedor");
		} else if (p2 == true) {
			tabuleiro(a);
			System.out.println("Parabéns! 2nd Player é o vencedor");
		}
	}
}