package com.valerio.cursojava.aula19v2;

public class Exer06 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)Math.round(Math.random()*10);
			b[i] = (int)Math.round(Math.random()*10);
			c[i] = a[i] + b[i];
			System.out.println("A soma de a[i] + b[i] é igual a: "+c[i]);
		}
	}
}
