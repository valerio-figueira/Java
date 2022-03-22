package com.valerio.cursojava.aula19;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double[] a = new double[5];
		double soma = 0, seq = 0;
		double media;

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro:");
			a[i] = key.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				seq++;
				soma += a[i];
				System.out.println("O " + (i + 1) + "º número: (" + a[i] + ") é ímpar.");
			}
			if (i + 1 == a.length) {
				media = soma / seq;
				System.out.println("A média dos números ímpares é "+media);
			}
		}
	}
}