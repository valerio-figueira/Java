package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = key.nextInt();
		System.out.println("Digite o primeiro número: ");
		int num2 = key.nextInt();
		System.out.println("Digite o primeiro número: ");
		int num3 = key.nextInt();

		if (num1 < num2 && num1 < num3) {
			System.out.println("Menor número é " + num1);
		} else if (num2 < num3 && num2 < num1) {
			System.out.println("Menor número é " + num2);
		} else if (num3 < num2 && num3 < num1) {
			System.out.println("Menor número é " + num3);
		} else {System.out.println("Você digitou números iguais.");}

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior é " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior é " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior é " + num3);
		} else {System.out.println("Você digitou números iguais.");}

	}

}
