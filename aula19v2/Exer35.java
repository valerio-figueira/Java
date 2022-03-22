package com.valerio.cursojava.aula19v2;

public class Exer35 {

	public static void main(String[] args) {
		int[] a = new int[10];
		boolean entrada = true, divisores = true;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			if (entrada == true) {
				System.out.print("Entrada de números: ");
				entrada = false;
			}
			System.out.print(a[i] + ".");
		}
		System.out.print("\n");
		for (int i = 0; i < a.length; i++) {
			divisores = true;
			System.out.print("\n");
			for (int p = 1; p <= a[i]; p++) {
				if (a[i] % p == 0) {
					if (divisores == true) {
						System.out.print("Todos os divisores de " + a[i] + ": ");
						divisores = false;
					}
					System.out.print(p + ".");
				}
			}
		}
	}
}