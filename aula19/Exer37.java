package com.valerio.cursojava.aula19;
public class Exer37 {

	public static void main(String[] args) {
		int a[] = new int[15];
		int b[] = new int[a.length];
		boolean entrada = true;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 15);
			if (entrada == true) {
				System.out.print("Entrada: ");
				entrada = false;
			}
			System.out.print(a[i] + ".");
		}
		System.out.print("\n");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			System.out.print("Fatoração de " + a[i] + ": ");
			b[i] = 1;
			for (int p = 1; p <= a[i]; p++) {
				b[i] *= p;
				System.out.print(b[i] + ".");
			}
		}
	}
}