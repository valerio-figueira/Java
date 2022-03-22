package com.valerio.cursojava.aula19v2;

public class Exer36 {

	public static void main(String[] args) {
		int[] a = new int[11];
		int i = 0;

		while (i < a.length) {
			a[i] = (int) Math.pow(2, i + 1);
				System.out.print("2 elevado a " + (i+1) + "ª potência: ");
			System.out.print(a[i] + ".");
			System.out.print("\n");
			i++;
		}
	}
}