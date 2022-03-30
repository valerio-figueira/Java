package com.valerio.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * System.out.println("Digite sua idade: "); int idade = key.nextInt();
		 * 
		 * if (idade >= 18) {
		 * 
		 * System.out.println("É maior de idade.");
		 * 
		 * }
		 * 
		 * else { System.out.println("Não é maior de idade."); }
		 */

		System.out.println("Digite um valor: ");
		double valor = key.nextDouble();
		if (valor <= 10) {
			System.out.println("Está barato.");
		} else if (valor > 10 && valor < 15) {

			System.out.println("Você pode pedir um desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais.");
		} else { // valor >= 17
			System.out.println("Está caro!");
		}

	}

}
