package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[5];
		boolean palindromo = false;

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite um número:");
			a[i] = key.nextInt();
			if (a[0] == a[4] && a[1] == a[3] && a[2] == a[2]) {
				palindromo = true;
			} else {
				palindromo = false;
			}
			if (i == 4 && palindromo == false) {
				System.out.println("Não é uma sequência palíndroma.");
				break;
			}
		}
		if (palindromo == true) {
			System.out.print("O vetor é um palíndromo. A sequência é: ");
			for (int i = 0; i < a.length; i++) {
				if (palindromo == true) {
					System.out.print(a[i] + ".");
				}
			}
		}
	}
}
