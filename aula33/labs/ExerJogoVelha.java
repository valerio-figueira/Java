package com.valerio.cursojava.aula33.labs;

import java.util.Scanner;

public class ExerJogoVelha {

	public static void main(String[] args) {
		JogoVelha g = new JogoVelha();
		JogoVelhaController gc = new JogoVelhaController();
		
		g.setScanner(new Scanner(System.in));
		g.setGame(new char[3][3]);
		
		gc.rollPlay();
	}
}
