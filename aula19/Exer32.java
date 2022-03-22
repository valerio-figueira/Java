package com.valerio.cursojava.aula19;

public class Exer32 {

	public static void main(String[] args) {
		int a[] = new int[5];
		boolean tabuada = true;

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			tabuada = true;
				for (int p = 0; p < 10; p++) {
					if (tabuada == true) {
						System.out.println("Tabuada de " + a[i] + ": ");
						tabuada = false;
					}
					System.out.println(a[i] + " x " + (p + 1) + " = " + a[i] * (p+1));
				}
			}
		}
	}
