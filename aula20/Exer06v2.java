package com.valerio.cursojava.aula20;
import java.util.Scanner;
public class Exer06v2 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String[][] a = new String[3][3];
		home(a);
	}

	public static void home(String[][] a) {
		boolean sair = false;
		int winner = 0;
		int jogada = 1;
		startNull(a);
		while (!sair) {
			tabuleiro(a);
			if (!winner(a)) {
				firstPlayer(a, 0, 0);
				jogada++;
				if (winner(a)) {
					winner = 1;
					endGame(a, winner);
					sair = true;
				}
			}
			if (!winner(a)) {
				secondPlayer(a, 0, 0);
				jogada++;
				if (winner(a)) {
					winner = 2;
					endGame(a, winner);
					sair = true;
				}
			}
			if (jogada == 9) {
				tied(a);
				sair = true;
			}
		}
	}

	public static void startNull(String[][] a) {
		System.out.println("::::::: Jogo da Velha :::::::");
		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = " - ";
			}
		}
	}

	public static void tabuleiro(String[][] a) {
		System.out.print(":::::::::::::::::::::::::::::\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print("::::::: |");
			for (int p = 0; p < a[i].length; p++) {
				System.out.print(a[i][p]);
				System.out.print("|");
			}
			System.out.println(" :::::::");
		}
		System.out.print(":::::::::::::::::::::::::::::\n");
	}

	public static String firstPlayer(String[][] a, int line, int column) {
		boolean sair = false;
		System.out.println("::::::: 1st Player - X ::::::");
		while (!sair) {
			System.out.print("Selecione a linha: ");
			line = input.nextInt();
			line--;
			System.out.print("Selecione a coluna: ");
			column = input.nextInt();
			column--;
			if (a[line][column] != " O " && a[line][column] != " X ") {
				sair = true;
			} else {
				System.out.println("Jogada inválida! Digite novamente");
			}
		}
		a[line][column] = " X ";
		return a[line][column];
	}

	public static String secondPlayer(String[][] a, int line, int column) {
		boolean sair = false;
		System.out.println("::::::: 2nd Player - O :::::::");
		while (!sair) {
			System.out.print("Selecione a linha: ");
			line = input.nextInt();
			line--;
			System.out.print("Selecione a coluna: ");
			column = input.nextInt();
			column--;
			if (a[line][column] != " X " && a[line][column] != " O ") {
				sair = true;
			} else {
				System.out.println("Jogada inválida! Digite novamente");
			}
		}
		a[line][column] = " O ";
		return a[line][column];
	}

	public static boolean winner(String[][] a) {
		if (a[0][0] == " X " && a[1][0] == " X " && a[2][0] == " X ") {
			return true;
		} else if (a[0][1] == " X " && a[1][1] == " X " && a[2][1] == " X ") {
			return true;
		} else if (a[0][2] == " X " && a[1][2] == " X " && a[2][2] == " X ") {
			return true;
		} else if (a[0][0] == " X " && a[0][1] == " X " && a[0][2] == " X ") {
			return true;
		} else if (a[1][0] == " X " && a[1][1] == " X " && a[1][2] == " X ") {
			return true;
		} else if (a[2][0] == " X " && a[2][1] == " X " && a[2][2] == " X ") {
			return true;
		} else if (a[0][0] == " X " && a[1][1] == " X " && a[2][2] == " X ") {
			return true;
		} else if (a[2][0] == " X " && a[1][1] == " X " && a[0][2] == " X ") {
			return true;
		}
		if (a[0][0] == " O " && a[1][0] == " O " && a[2][0] == " O ") {
			return true;
		} else if (a[0][1] == " O " && a[1][1] == " O " && a[2][1] == " O ") {
			return true;
		} else if (a[0][2] == " O " && a[1][2] == " O " && a[2][2] == " O ") {
			return true;
		} else if (a[0][0] == " O " && a[0][1] == " O " && a[0][2] == " O ") {
			return true;
		} else if (a[1][0] == " O " && a[1][1] == " O " && a[1][2] == " O ") {
			return true;
		} else if (a[2][0] == " O " && a[2][1] == " O " && a[2][2] == " O ") {
			return true;
		} else if (a[0][0] == " O " && a[1][1] == " O " && a[2][2] == " O ") {
			return true;
		} else if (a[2][0] == " O " && a[1][1] == " O " && a[0][2] == " O ") {
			return true;
		} else {
			return false;
		}
	}

	public static void tied(String[][] a) {
		tabuleiro(a);
		System.out.println("Empate!");
	}

	public static void endGame(String[][] a, int winner) {
		if (winner == 1) {
			tabuleiro(a);
			System.out.println("Parabéns! 1st Player é o vencedor");
		} else if (winner == 2) {
			tabuleiro(a);
			System.out.println("Parabéns! 2nd Player é o vencedor");
		}
	}
}

/*
 * if (a[0][0] == " X ") { if (a[1][0] == " X ") { if (a[2][0] == " X ") {
 * return true; } } } if (a[0][1] == " X ") { if (a[1][1] == " X ") { if
 * (a[2][1] == " X ") { return true; } } } if (a[0][2] == " X ") { if (a[1][2]
 * == " X ") { if (a[2][2] == " X ") { return true; } } } if (a[0][0] == " X ")
 * { if (a[0][1] == " X ") { if (a[0][2] == " X ") { return true; } } } if
 * (a[1][0] == " X ") { if (a[1][1] == " X ") { if (a[1][2] == " X ") { return
 * true; } } } if (a[2][0] == " X ") { if (a[2][1] == " X ") { if (a[2][2] ==
 * " X ") { return true; } } } if (a[0][0] == " X ") { if (a[1][1] == " X ") {
 * if (a[2][2] == " X ") { //diagonal return true; } } } if (a[2][0] == " X ") {
 * if (a[1][1] == " X ") { if (a[0][2] == " X ") { return true; //diagonal } } }
 */