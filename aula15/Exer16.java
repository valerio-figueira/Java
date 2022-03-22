package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double a, b, c;
		double r1, r2;

		System.out.println(
				"Programa para calcular as raízes de uma equação de segundo grau, cuja fórmula é ax2 + bx + c.");
		System.out.println("A fórmula Delta Δ = b2 – 4ac");
		System.out.println("\nDigite o valor da variável a: ");
		a = key.nextDouble();
		System.out.println("Digite o valor da variável b: ");
		b = key.nextDouble();
		System.out.println("Digite o valor da variável c: ");
		c = key.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);

		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau.");
		} else if (delta < 0) {
			System.out.println("O delta é negativo, a equação não possui raízes reais.");
		} else if (delta == 0) {
			System.out.println("O delta é igual a zero, a equação possui apenas uma raiz real.");
		} else if (delta > 0) {
			System.out.println("O delta é positivo, a equação possui duas raízes.");
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("Valor de Δ: " + delta);
			System.out.println("Raiz positiva de Δ: " + r2);
			System.out.println("Raiz negativa de Δ: " + r1);
		}

	}
}
