package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int)Math.round(Math.random()*10);
			b[i] = a[i];
			System.out.println("Vetor A: " + a[i]);
		}
		for (int i = 4; i > -1; i--) {
			System.out.println("Vetor B: " + b[i]);
		}
	}
}