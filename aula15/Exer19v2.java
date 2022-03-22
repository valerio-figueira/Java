package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer19v2 {
	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num1, num2;
		double resultado;
		boolean valido = true;
		String entrada;
		resultado = 0;

		System.out.println("Programa de Operações");

		System.out.println("Digite um número: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo número:");
		num2 = programa.nextInt();

		System.out.println("Tecla o tipo de operação: + - * /");
		entrada = programa.next();

		switch (entrada) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			valido = false;
			System.out.println("Não é uma operação válida.");
		}

		if (valido) {
			System.out.println("Resultado: " + resultado);
			if (resultado >= 0) {
				System.out.println("Resultado é positivo.");
			} else {
				System.out.println("Resultado é negativo.");
			}

			if (resultado % 2 == 0) {
				System.out.println("Resultado é um número par.");
			} else {
				System.out.println("Resultado é um número ímpar.");
			}
		}
	}
}