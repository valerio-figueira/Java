package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean notafalsa = false;
		double nota;
		
		System.out.println("Entre com sua nota, que seja entre zero e dez:");
		nota = key.nextDouble();

		while (!notafalsa) {
			if (nota >= 0 && nota <= 10) {
				notafalsa = true;
				System.out.println("Sua nota: " + nota);
			} else {
				System.out.println("Nota inválida, digite-a novamente:");
				nota = key.nextDouble();
			}
		}

	}

}
