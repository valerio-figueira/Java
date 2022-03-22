package com.valerio.cursojava.aula19;

public class Exer30 {

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
			if (entrada != true) {
				System.out.print("B: ");
				entrada = true;
			}
			if (a[i] % 2 == 0) {
				b[posPar] = a[i];
				System.out.print(b[posPar] + ".");
				posPar++;
			}
		} System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (entrada == true) {
				System.out.print("C: ");
				entrada = false;
			}
			if (a[i] % 2 != 0) {
				c[posImpar] = a[i];
				System.out.print(c[posImpar] + ".");
				posImpar++;
			}
		}
	}
}