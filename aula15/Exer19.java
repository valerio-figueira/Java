package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double num1, num2, resultado;
		String operacao;
		resultado = 0;

		System.out.println("Digite o primeiro número:");
		num1 = key.nextDouble();
		System.out.println("Digite o segundo número:");
		num2 = key.nextDouble();
		System.out.println("Qual operação deseja realizar?");
		operacao = key.next();

		if (operacao.equalsIgnoreCase("divisão") || operacao.equalsIgnoreCase("/")) {
			resultado = num1 / num2;
			System.out.println("O resultado da divisão é: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado é um número positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado é um número negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado é um número par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado é um número ímpar.");
			} else {
				System.out.println("Inválido.");
			}
		}
		if (operacao.equalsIgnoreCase("multiplicação") || operacao.equalsIgnoreCase("*")) {
			resultado = num1 * num2;
			System.out.println("O resultado da divisão é: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado é um número positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado é um número negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado é um número par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado é um número ímpar.");
			} else {
				System.out.println("Inválido.");
			}
		}
		if (operacao.equalsIgnoreCase("adição") || operacao.equalsIgnoreCase("+")) {
			resultado = num1 + num2;
			System.out.println("O resultado da divisão é: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado é um número positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado é um número negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado é um número par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado é um número ímpar.");
			} else {
				System.out.println("Inválido.");
			}
		}
		if (operacao.equalsIgnoreCase("subtração") || operacao.equalsIgnoreCase("-")) {
			resultado = num1 - num2;
			System.out.println("O resultado da divisão é: " + resultado);
			if (resultado > 0) {
				System.out.println("O resultado é um número positivo.");
			} else if (resultado < 0) {
				System.out.println("O resultado é um número negativo.");
			}
			if (resultado % 2 == 0) {
				System.out.println("O resultado é um número par.");
			} else if (resultado % 2 != 0) {
				System.out.println("O resultado é um número ímpar.");
			} else {
				System.out.println("Inválido.");
			}
		}
	}

}
