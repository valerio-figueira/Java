package com.valerio.cursojava.aula33.labs;

import java.util.Scanner;

public class JogoVelhaController {
	Scanner scanner;
	JogoVelha g;

	JogoVelhaController(Scanner scanner, JogoVelha g) {
		this.scanner = scanner;
		this.g = g;
	}

	JogoVelhaController() {
		this(new Scanner(System.in), new JogoVelha());
	}

	char[][] printTab(char[][] a) {
		System.out.println(":::::::::::::::::::::::::::::");
		for (int i = 0; i < a.length; i++) {
			System.out.print(":::::::::::|");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "|");
			}
			System.out.print(":::::::::::\n");
		}
		System.out.println(":::::::::::::::::::::::::::::");
		return a;
	}

	char[][] rollPlay() {

		int tie = 1;
		g.setGame(new char[3][3]);

		while (true) {
			firstPlayer(0, 0);
			printTab(g.getGame());
			tie++;
			if (getWinner('X')) {
				System.out.println("Fim de Jogo!\n1st Player é o vencedor");
				break;
			}
			secondPlayer(0, 0);
			printTab(g.getGame());
			tie++;
			if (getWinner('O')) {
				System.out.println("Fim de Jogo!\n2nd Player é o vencedor");
				break;
			}
			if (tie == 9) {
				System.out.println("Empate!");
				printTab(g.getGame());
				break;
			}
		}
		return g.getGame();
	}

	int typeNum(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	void firstPlayer(int line, int column) {
		System.out.println("1st Player - X");
		while (true) {
			line = typeNum("Marque a linha: ");
			line--;
			column = typeNum("Marque a coluna: ");
			column--;
			if (g.getGame()[line][column] != 'X' && g.getGame()[line][column] != 'O') {
				break;
			} else {
				System.out.println("Opção inválida");
			}
		}
		g.setGame(line, column, 'X');
	}

	void secondPlayer(int line, int column) {
		System.out.println("1st Player - O");
		while (true) {
			line = typeNum("Marque a linha: ");
			line--;
			column = typeNum("Marque a coluna: ");
			column--;
			if (g.getGame()[line][column] != 'X' && g.getGame()[line][column] != 'O') {
				break;
			} else {
				System.out.println("Opção inválida");
			}
		}
		g.setGame(line, column, 'O');
	}

	boolean getWinner(char player) {
		if (checkLine(g.getGame(), player)) {
			return true;
		} else if (checkColumn(g.getGame(), player)) {
			return true;
		} else if (checkDiagonal(g.getGame(), player)) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkLine(char[][] a, char player) {
		if (a[0][0] == player && a[0][1] == player && a[0][2] == player) { // LINHA
			return true;
		} else if (a[1][0] == player && a[1][1] == player && a[1][2] == player) { // LINHA
			return true;
		} else if (a[2][0] == player && a[2][1] == player && a[2][2] == player) { // LINHA
			return true;
		}
		return false;
	}

	boolean checkColumn(char[][] a, char player) {
		if (a[0][0] == player && a[1][0] == player && a[2][0] == player) { // COLUNA
			return true;
		} else if (a[0][1] == player && a[1][1] == player && a[2][1] == player) { // COLUNA
			return true;
		} else if (a[0][2] == player && a[1][2] == player && a[2][2] == player) { // COLUNA
			return true;
		}
		return false;
	}

	boolean checkDiagonal(char[][] a, char player) {
		if (a[0][0] == player && a[1][1] == player && a[2][2] == player) { // DIAGONAL
			return true;
		} else if (a[2][0] == player && a[1][1] == player && a[0][2] == player) { // DIAGONAL
			return true;
		}
		return false;
	}
}
