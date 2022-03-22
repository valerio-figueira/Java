package com.valerio.cursojava.aula20;
import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {
		String[][] a = new String[3][3];
		System.out.println("::::::: Jogo da Velha :::::::");
		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = " - ";
			}
		}
		home(a);
	}

	public static void home(String[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				if (winner(a) == true) {
					break;
				} else {
					tabuleiro(a);
					partidas(a, 0, 0);
				}
			}
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

	public static void partidas(String[][] a, int line, int column) {
		firstPlayer(a, line, column);
		secondPlayer(a, line, column);
	}

	public static String firstPlayer(String[][] a, int line, int column) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("::::::: 1st Player - X :::::::");
			System.out.print("Selecione a linha: ");
			line = input.nextInt();
			System.out.print("Selecione a coluna: ");
			column = input.nextInt();
		} while (a[line][column] == " O ");
		a[line][column] = " X ";
		return a[line][column];
	}

	public static String secondPlayer(String[][] a, int line, int column) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("::::::: 2nd Player - O :::::::");
			System.out.print("Selecione a linha: ");
			line = input.nextInt();
			System.out.print("Selecione a coluna: ");
			column = input.nextInt();
		} while (a[line][column] == " X ");
		a[line][column] = " O ";
		return a[line][column];
	}

	public static boolean winner(String[][] a) {
		for (int i = 0; i < a.length; i++) {
		}
		for (int p = 0; p < 3; p++) {
			if (a[p][p] == " X ") {
				if (a[0][p] == a[1][p] && a[0][p] == a[2][p]) {
					endGame(a);
					return true;
				}
			}
		}
		return false;
	}

	public static void loser(String[][] a) {
	}

	public static void endGame(String[][] a) {
		tabuleiro(a);
		System.out.println("Fim de Jogo");
	}
}
