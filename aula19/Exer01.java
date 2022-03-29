package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer01 {
	private static Scanner input = new Scanner(System.in);
	private static int a[] = new int[5];

	public static void main(String[] args) {
		
		for (int seq = 1; seq <= a.length; seq++) {
			System.out.println("Digite o " + seq + "º número inteiro:");
			input.nextInt();
		}
	}
}
