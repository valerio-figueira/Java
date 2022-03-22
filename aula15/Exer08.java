package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o preço do primeiro produto: ");
		double prod1 = key.nextDouble();
		System.out.println("Digite o preço do segundo produto: ");
		double prod2 = key.nextDouble();
		System.out.println("Digite o preço do terceiro produto: ");
		double prod3 = key.nextDouble();

		if (prod1 < prod2 && prod1 < prod3 || prod1 == prod2 && prod1 < prod3 || prod1 == prod3 && prod1 < prod2) {
			System.out.println("Compre o produto de R$" + prod1);
		} else if (prod2 < prod1 && prod2 < prod3) {
			System.out.println("Compre o produto de R$" + prod2);
		} else if (prod3 < prod1 && prod3 < prod2) {
			System.out.println("Compre o produto de R$" + prod3);
		}
	}

}
