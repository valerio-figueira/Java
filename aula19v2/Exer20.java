package com.valerio.cursojava.aula19v2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double a[] = new double[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = 5.15 * (i + 1);
			System.out.println("Resultado, cotação do dólar x valor de i: " + new DecimalFormat("#.00").format(a[i]));
		}
	}
}
