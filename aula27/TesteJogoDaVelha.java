package com.valerio.cursojava.aula27;

import java.util.Random;
import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {
		JogoDaVelhaController c = new JogoDaVelhaController(new Scanner(System.in), new Random());
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.empate = 0;
		jogo.endGame = false;
		jogo.a = c.printTab(new char[3][3]);
		jogo.a = c.rollPlay(jogo.a, jogo);		
	}
}