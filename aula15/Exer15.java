package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double lado1, lado2, lado3, perimetro;
		perimetro = 0;

		System.out.println("Digite o valor do primeiro lado do triângulo: ");
		lado1 = key.nextDouble();
		System.out.println("Digite o valor do segundo lado do triângulo: ");
		lado2 = key.nextDouble();
		System.out.println("Digite o valor do terceiro lado do triângulo: ");
		lado3 = key.nextDouble();

		if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
			perimetro = lado1 + lado2 + lado3;
			System.out.println("Os três lados formam um triângulo.");
			System.out.println("O perímetro do triângulo é: " + perimetro);
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Os lados formam um triângulo Equilátero.");
			} else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2
					|| lado2 == lado3 && lado2 != lado1) {
				System.out.println("Os lados formam um triângulo Isósceles.");
			} else if (lado1 != lado2 && lado1 != lado3) {
				System.out.println("Os lados formam um triângulo Escaleno.");
			}

		} else {
			System.out.println("Não é um triângulo");
		}

	}

}
