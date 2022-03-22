package com.valerio.cursojava.aula19v3;

public class Exer28 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.print(a[i] + ", ");
			if (i == a.length - 1) {
				for (int j = a.length - 1; j > -j - 1; j--) {
					b[j] = a[j];
					System.out.print(b[j]);
					if (j == -j - j) {
						System.out.print(".\n");
					} else {
						System.out.print(", ");
					}
				}
			}
		}
	}
}
