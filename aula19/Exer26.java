package com.valerio.cursojava.aula19;
import java.util.Scanner;
public class Exer26 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			b[i] = (int) Math.round(Math.random() * 10);
			if (a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else if (a[i] < b[i]) {
				c[i] = -1;
			}
			System.out.println("Valor de A: " + a[i]);
			System.out.println("Valor de B: " + b[i]);
			System.out.println("Valor de C: " + c[i]);
		}
	}

}
