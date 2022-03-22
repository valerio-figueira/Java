package com.valerio.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 1; // variável i para contador.
		int max = 10;

		System.out.println("Contando até " + max);

		while (i < max) {
			System.out.println("O valor de i " + i);
			i++; // i = i + 1
		}
		System.out.println("O valor de i é " + i);
	}
}
