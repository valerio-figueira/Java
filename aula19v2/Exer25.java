package com.valerio.cursojava.aula19v2;

public class Exer25 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			b[i] = (a[i] % 2 == 0) ? 1 : 0;
		}
		System.out.print("Vetor A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+".");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]+".");
		}
	}
}
