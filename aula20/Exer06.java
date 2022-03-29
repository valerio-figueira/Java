package com.valerio.cursojava.aula20;

import java.util.Scanner;

public class Exer06 {
	private static Scanner input = new Scanner(System.in);
	private static String[][] a = new String[3][3];
	private static boolean endGame = false;
	private static int line = 0;
	private static int column = 0;
	private static int tie = 0;

	public static void main(String[] args) {
		startNull();
		home(a);
	}

	public static void home(String[][] a) {
		while (!endGame) {
			tabuleiro(a);
			firstPlayer(a);
			tie++;
			if (getWinner(a, " X ")) {
				System.out.println("First Player é o vencedor!");
				endGame = true;
			}
			tabuleiro(a);
			secondPlayer(a);
			tie++;
			if (getWinner(a, " O ")) {
				System.out.println("Second Player é o vencedor!");
				endGame = true;
			}
			if (tie == 9) {
				System.out.println("Empate!");
				endGame = true;
			}
		}
	}

	public static boolean getWinner(String a[][], String player) {
		if (checkLine(a, player)) {
			return true;
		} else if (checkColumn(a, player)) {
			return true;
		} else if (checkDiagonal(a, player)) {
			return true;
		} else {
			return false;
		}
	}

	public static void tabuleiro(String[][] a) {
		System.out.print("\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print("|");
			for (int p = 0; p < a[i].length; p++) {
				System.out.print(a[i][p]);
				System.out.print("|");
			}
			System.out.println();
		}
		System.out.print("\n");
	}

	public static void startNull() {
		System.out.println("::::::: Jogo da Velha :::::::");
		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = " - ";
			}
		}
	}

	public static String firstPlayer(String[][] a) {
		do {
			System.out.println("::::::: 1st Player - X :::::::");
			System.out.print("Selecione a linha: ");
			line = input.nextInt();
			line--;
			System.out.print("Selecione a coluna: ");
			column = input.nextInt();
			column--;
		} while (a[line][column] == " O ");
		a[line][column] = " X ";
		return a[line][column];
	}

	public static String secondPlayer(String[][] a) {
		do {
			System.out.println("::::::: 2nd Player - O :::::::");
			System.out.print("Selecione a linha: ");
			line = input.nextInt();
			line--;
			System.out.print("Selecione a coluna: ");
			column = input.nextInt();
			column--;
		} while (a[line][column] == " X ");
		a[line][column] = " O ";
		return a[line][column];
	}

	public static boolean checkLine(String[][] a, String player) {
		if (a[0][0] == a[0][1] && a[0][0] == a[0][2] && a[0][0] == player) {
			return true;
		} else if (a[1][0] == a[1][1] && a[1][0] == a[1][2] && a[1][0] == player) {
			return true;
		} else if (a[2][0] == a[2][1] && a[2][0] == a[2][2] && a[2][0] == player) {
			return true;
		}
		return false;
	}

	public static boolean checkColumn(String[][] a, String player) {
		if (a[0][0] == a[1][0] && a[0][0] == a[2][0] && a[0][0] == player) {
			return true;
		} else if (a[0][1] == a[1][1] && a[0][1] == a[2][1] && a[0][1] == player) {
			return true;
		} else if (a[0][2] == a[1][2] && a[0][2] == a[2][2] && a[0][2] == player) {
			return true;
		}
		return false;
	}

	public static boolean checkDiagonal(String[][] a, String player) {
		if (a[0][0] == a[1][1] && a[0][0] == a[2][2] && a[0][0] == player) {
			return true;
		} else if (a[2][0] == a[1][1] && a[2][0] == a[2][2] && a[2][0] == player) {
			return true;
		}
		return false;
	}
}