package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = key.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = key.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = key.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Primeiro: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Primeiro: " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("Primeiro: " + num3);
		}

		if (num1 <= num2 && num1 >= num3 || num1 >= num2 && num1 <= num3) {
			System.out.println("Segundo: " + num1);
		} else if (num2 <= num1 && num2 >= num3 || num2 >= num1 && num2 <= num3) {
			System.out.println("Segundo: " + num2);
		} else if (num3 <= num1 && num3 >= num2 || num3 >= num1 && num3 <= num2) {
			System.out.println("Segundo: " + num3);
		}

		if (num1 <= num2 && num1 <= num3) {
			System.out.println("Terceiro: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Terceiro: " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Terceiro: " + num3);
		}

	}

}
