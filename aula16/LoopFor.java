package com.valerio.cursojava.aula16;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i " + i);
		}
		// System.out.println(i); só vale dentro do bloco for. Porque a variável foi
		// definida dentro daquele bloco.

		for (int i = 5; i >= 0; i--) {
			System.out.println("Valor de i " + i);
		}

		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}

		int i = 0;
		for (; i < 10;) {
			System.out.println("Valor de i = " + i);
			i += 2;
		}

		for (i = 0; i < 10; i += 2) {
			System.out.println("i = " + i);
		}

		int soma = 0;
		for (int a = 1; a < 5; soma += a++) {
			System.out.println("soma = "+soma);
			System.out.println("valor de a = "+a);
	}
		int num = 0;
		int c = 1;
		c++; num+=c; num+=5;
		System.out.println("num = "+num);
		
	}

}
