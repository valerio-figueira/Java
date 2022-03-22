package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double num1 = key.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = key.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double num3 = key.nextDouble();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro número digitado é o maior deles.");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O segundo número digitado é o maior deles.");
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O terceiro número digitado é o maior deles.");
		} else if (num1 == num2 && num1 > num3 || num1 == num3 && num1 > num2 || num3 == num1 && num3 > num2
				|| num2 == num3 && num2 > num1) {
			System.out.println("Dois são iguais e maiores que o outro.");
		} else if (num1 == num2 || num1 == num3 || num2 == num1 || num2 == num3 || num3 == num1 || num3 == num2) {
			System.out.println("Os números são iguais.");
		}
	}

}
