package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[4];
		boolean par = false;

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 100);
			System.out.println(a[i]);
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				par = true;
			} else {
				System.out.println("Há pelo menos um número ímpar.");
				par = false;
				break;
			}
		}
		if (par == true) {
			System.out.println("São todos pares.");
		}
	}
}