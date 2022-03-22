package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;

		for (int seq = 1, a[] = new int[5]; seq <= 5; seq++) {
			System.out.println("Digite o " + seq + "º número inteiro:");
			num = key.nextInt();
		}
	}

}
