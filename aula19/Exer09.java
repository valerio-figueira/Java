package com.valerio.cursojava.aula19;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[5];
		float [] b = new float[5];
		float[] c = new float[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Vetor A | Digite o " + (i + 1) + "º vetor: ");
			a[i] = key.nextInt();
			System.out.print("Vetor B | Digite o " + (i + 1) + "º vetor: ");
			b[i] = key.nextInt();
			c[i] = a[i] / (b[i]);
			System.out.println("Vetor C | Divisão do " + (i + 1) + "º vetor: " + c[i]);
		}
	}
}