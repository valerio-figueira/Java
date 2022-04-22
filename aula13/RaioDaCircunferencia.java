package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class RaioDaCircunferencia {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Olá, seja Bem-vindo!\nEste é um programa para calcular a circunferência de um círculo a partir do raio.");
		System.out.println("Digite o valor do raio: ");
		double raio = key.nextDouble();
		double circunferencia = 2 * 3.14 * raio;
		System.out.println("A circunferência é: " + circunferencia);

	}

}
