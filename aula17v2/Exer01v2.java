package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer01v2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite um valor: ");
		num = key.nextInt();
		while (num < 0 || num > 10) {
			System.out.println("Ops, valor incorreto. Digite-o novamente: ");
			num = key.nextInt();
		}
		if (num >= 0 && num <= 10) {
			System.out.println("Valor digitado é válido.");
		}
	}

}
