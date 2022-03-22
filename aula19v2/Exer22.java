package com.valerio.cursojava.aula19v2;
public class Exer22 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int zero = 0, um = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 1);
			if (a[i] == 1) {
				um++;
			} else {
				zero++;
			}
		}
		System.out.println("Percentual de 1: " + percentUm(um)+"%");
		System.out.println("Percentual de 0: " + percentZero(zero)+"%");
	}
	public static int percentUm(int um) {
		int percentual = (um * 100) / 10;
		return percentual;
	}
	public static int percentZero(int zero) {
		int percentual = (zero * 100) / 10;
		return percentual;
	}
}