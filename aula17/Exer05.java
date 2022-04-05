package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer05 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		double pA, pB;
		double crescA, crescB;
		int ano = 0;
		boolean valida = false;

		while (!valida) {
			System.out.println("Informe a taxa de população inicial do país A: ");
			pA = key.nextDouble();
			while (!valida) {
				if (pA > 0) {
					valida = true;
				} else {
					System.out.println("Informe a taxa de população inicial do país A: ");
					pA = key.nextDouble();
				}
			}
			System.out.println("Informe a taxa de população inicial do país B: ");
			pB = key.nextDouble();
			while (valida) {
				if (pB > 0 && pB > pA) {
					valida = false;
				} else {
					System.out.println("Informe a taxa de população inicial do país B: ");
					pB = key.nextDouble();
				}
			}

			while (pA <= pB) {
				crescA = (pA / 100) * 3;
				crescB = (pB / 100) * 1.5;
				pB = crescB + pB;
				pA = crescA + pA;
				System.out.println("População A: " + pA);
				System.out.println("População B: " + pB);
				System.out.println("Ano: " + ano);
				ano++;
			}
			valida = true;
		}
	}
}
