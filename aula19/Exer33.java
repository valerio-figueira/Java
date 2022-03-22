package com.valerio.cursojava.aula19;
public class Exer33 {
	public static void main(String[] args) {
		int a[] = new int[10];
		boolean primo = true;
		String output = "";

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 20);
			if (primo == true) {
				System.out.print("Entrada de números: ");
				primo = false;
			}
			System.out.print(a[i] + ".");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (primo(a[i]) && a[i] != 1 && a[i] != 0) {
				output = a[i] + " é um número primo.";
			} else {
				if (a[i] != 1 && a[i] != 0) {
					output = a[i] + " é um número composto.";
				}
			} System.out.println(output);
		}
	}
	public static boolean primo(int num) {
		boolean primo = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			} else {
			}
		}
		return true;
	}
}