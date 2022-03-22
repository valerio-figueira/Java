package com.valerio.cursojava.aula19;

public class Exer31v2 {

	public static void main(String[] args) {
		int a[] = new int[20];
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		boolean entrada = true;
		int posPar = 0, posImpar = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			if (entrada == true) {
				System.out.print("A: ");
				entrada = false;
			}
			System.out.print(a[i] + ".");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[posPar] = a[i];
				posPar++;
			} else {
				c[a.length / 2 + posImpar] = a[i];
				posImpar++;
			}
		}
		for (int i = 0; i < a.length / 2; i++) {
			if (entrada != true) {
				System.out.print("B: ");
				entrada = true;
			}
			System.out.print(b[i] + ".");
		}
		System.out.print("\n");
		for (int i = a.length / 2; i < a.length; i++) {
			if (entrada == true) {
				System.out.print("C: ");
				entrada = false;
			}
			System.out.print(c[i] + ".");
		}
	}
}