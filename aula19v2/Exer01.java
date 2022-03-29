package com.valerio.cursojava.aula19v2;

public class Exer01 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 50);
			b[i] = (int) Math.round(Math.random() * 50);
		}
		System.out.print("Valor do vetor A: ");
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				System.out.print(a[i] + ", ");
			} else {
				System.out.println(a[i] + ".");
			}
		}
		System.out.print("Valor do vetor B: ");
		for (int i = 0; i < b.length; i++) {
			if (i < b.length - 1) {
				System.out.print(b[i] + ", ");
			} else {
				System.out.println(b[i] + ".");
			}
		}
	}
}
