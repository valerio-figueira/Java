package com.valerio.cursojava.aula19;
import java.util.Scanner;
public class Exer15 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[7];
		int par = 0, impar = 0, perc = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro:");
			a[i] = key.nextInt();
			if (a[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		par = (par * 100) / a.length;
		impar = (impar * 100) / a.length;
		System.out.println("Os pares são "+par+"%.");
		System.out.println("Os ímpares são "+impar+"%.");
	}
}