package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Vetor A | Digite o " + (i + 1) + "º vetor:");
			a[i] = key.nextInt();
			b[i] = a[i] * i;
			System.out.println("Vetor B | "+(i+1)+"º vetor: "+b[i]);
		}
	}
}