package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[10];
		char[] b = new char[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 20);
			if (a[i] < 7) {
				b[i] = 'a';
			} else if (a[i] == 7) {
				b[i] = 'b';
			} else if (a[i] > 7) {
				b[i] = 'c';
			} else if (a[i] == 10) {
				b[i] = 'd';
			} else if (a[i] > 10) {
				b[i] = 'e';
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("Vetor A: " + a[i] + " | Vetor B: " + b[i]);
		}
	}

}
