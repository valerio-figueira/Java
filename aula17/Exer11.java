package com.valerio.cursojava.aula17;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int n1, n2, i, soma = 0;

		System.out.println("Digite o 1º número: ");
		n1 = key.nextInt();
		System.out.println("Digite o 2º número: ");
		n2 = key.nextInt();

		for (i = n1; i <= n2; i++) {
			System.out.print(i + ".");
			soma += i;
			if (i == n2) {
				System.out.println(" E a soma é: "+soma + ".");
			}
		}

	}

}
