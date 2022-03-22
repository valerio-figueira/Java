package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a, b, i;

		for (a = 0, b = 1, i = 0; i <= 40; i++, b += a, a = b - a) {
			System.out.println(a);
		}

	}

}
