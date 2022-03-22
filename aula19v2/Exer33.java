package com.valerio.cursojava.aula19v2;
public class Exer33 {

	public static void main(String[] args) {
		int[] a = new int[10];
		boolean primo = true, entrada = true;

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
			if (primo(a[i])) {
				System.out.println(a[i] + " é um número primo.");
			} else {
				System.out.println(a[i] + " é um número composto.");
			}
		}
	}
	public static boolean primo(int num) {
		for (int p = 2; p < num; p++) {
			if (num % p == 0) {
				return false;
			}
		}
		return true;
	}
}