package com.valerio.cursojava.aula33;

public class Calculadora {

	/* Sobrecarga de métodos: */
	
	public int soma(int num1, int num2) {
		return num1 + num2;
	}

	public int soma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	public int soma(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
}
