package com.valerio.cursojava.aula27;

import java.util.Scanner;

public class JogoDaVelhaController {
	Scanner input;

	JogoDaVelhaController(Scanner scanner) {
		input = scanner;
	}

	public int input(String text) {
		System.out.print(text);
		return input.nextInt();
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

	char[][] rollPlay(char[][] a, JogoDaVelha jogo) {

		while (true) {
			firstPlayer(jogo, 0, 0);
			printTab(jogo.a);
			jogo.empate++;
			if (getWinner(jogo.a, 'X')) {
				System.out.println("Fim de Jogo!\n1st Player é o vencedor");
				break;
			}
			secondPlayer(jogo);
			printTab(jogo.a);
			jogo.empate++;
			if (getWinner(jogo.a, 'O')) {
				System.out.println("Fim de Jogo!\n2nd Player é o vencedor");
				break;
			}
			if (jogo.empate == 9) {
				System.out.println("Empate!");
				printTab(jogo.a);
				break;
			}
		}
		return a;
	}

	void firstPlayer(JogoDaVelha jogo, int line, int column) {
		jogo.checkGame = false;
		System.out.println("1st Player - X");
		while (!jogo.checkGame) {
			line = input("Marque a linha: ");
			line--;
			column = input("Marque a coluna: ");
			column--;
			if (jogo.a[line][column] != 'X' && jogo.a[line][column] != 'O') {
				jogo.checkGame = true;
			} else {
				System.out.println("Opção inválida");
			}
		}
		jogo.a[line][column] = 'X';
	}

	void secondPlayer(JogoDaVelha jogo) {
		jogo.checkGame = false;
		System.out.println("1st Player - O");
		while (!jogo.checkGame) {
			jogo.line = input("Marque a linha: ");
			jogo.line--;
			jogo.column = input("Marque a coluna: ");
			jogo.column--;
			if (jogo.a[jogo.line][jogo.column] != 'X' && jogo.a[jogo.line][jogo.column] != 'O') {
				jogo.checkGame = true;
			} else {
				System.out.println("Opção inválida");
			}
		}
		jogo.a[jogo.line][jogo.column] = 'O';
	}

	boolean getWinner(char[][] a, char player) {
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