package com.valerio.cursojava.aula19v2;

public class Exer34 {

	public static void main(String[] args) {
		int[] a = new int[10];
		boolean entrada = true;
		boolean par = true;

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			if (entrada == true) {
				System.out.print("Entrada de números: ");
				entrada = false;
			}
			System.out.print(a[i] + ".");
		}
		for (int i = 0; i < a.length; i++) {
			par = true;
			System.out.print("\n");
			for (int p = 2; p < a[i]; p++) {
				if (p % 2 == 0) {
					if (par == true) {
						System.out.print("Números pares até " + a[i] + ": ");
						par = false;
					}
					System.out.print(p + ".");
				}
			}
		}
	}
}