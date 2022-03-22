package com.valerio.cursojava.aula19v2;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[a.length];
		System.out.print("Valor de A: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)Math.round(Math.random()*100);
			System.out.print(a[i]+", ");
			if(i == a.length - 1) {
			System.out.println(a[i]+". ");
			}
		}
		System.out.print("Valor de B: ");
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i] % 2; //b[i] é o valor de A[i] dividido por 2.
			System.out.print(b[i]+", ");
			if(i == a.length - 1) {
			System.out.print(b[i]+". ");
			}
		}
	}
}
