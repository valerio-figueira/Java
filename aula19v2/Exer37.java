package com.valerio.cursojava.aula19v2;
public class Exer37 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[a.length];
		boolean entrada = true, fatoracao = true;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			if (entrada == true) {
				System.out.print("Entrada de números: ");
				entrada = false;
			}
			System.out.print(a[i] + ".");
		}
		for (int i = 0; i < a.length; i++) {
			fatoracao = true;
			System.out.print("\n");
			b[i] = 1;
			for (int p = a[i]; p > 1; p--) {
				b[i] *= p;
				if (fatoracao == true) {
					System.out.print("Todos os divisores de " + a[i] + ": ");
					fatoracao = false;
				}
				System.out.print(b[i] + ".");
				if (p == 1) {
					System.out.print(b[i] + ".");
				}
			}
		}
	}
}