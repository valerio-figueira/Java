package com.valerio.cursojava.aula17;

public class Exer16 {

	public static void main(String[] args) {
		
		int primeiro = 1, segundo = 1, proximo = 0;
		System.out.print(primeiro + "." + segundo + ".");

		while (proximo < 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.print(proximo + ".");
		}

	}

}