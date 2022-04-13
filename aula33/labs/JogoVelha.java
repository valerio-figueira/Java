package com.valerio.cursojava.aula33.labs;

import java.util.Scanner;

public class JogoVelha {
	private Scanner scanner;
	private char[][] game;
	private int tie;

	public Scanner getScanner() {
		return this.scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public char[][] getGame() {
		return this.game;
	}

	public void setGame(char[][] game) {
		this.game = game;
	}

	public void setGame(int line, int column, char player) {
		this.game[line][column] = player;
	}

	public int getTie() {
		return this.tie;
	}

	public void setTie(int tie) {
		this.tie = tie;
	}
}
