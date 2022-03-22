package com.valerio.cursojava.aula19v2;
public class Exer18 {
	public static void main(String[] args) {
		int[] a = new int[10];
		int indexMaior = 0, indexMenor = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 10);
			if (a[i] == numMaior(a)) {
				indexMaior = i;
			}
			if (a[i] == numMenor(a)) {
				indexMenor = i;
			}
		}
		System.out.println("O maior valor é: " + numMaior(a) + ". No index: " + indexMaior);
		System.out.println("O menor valor é: " + numMenor(a) + ". No index: " + indexMenor);
	}

	public static int numMaior(int a[]) {
		int maior = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maior) {
				maior = a[i];
			}
		}
		return maior;
	}

	public static int numMenor(int a[]) {
		int menor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < menor) {
				menor = a[i];
			}
		}
		return menor;
	}
}