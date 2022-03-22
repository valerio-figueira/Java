package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		/*
		 * for (int num = 1, cont = 1; cont <= 50; num++, cont++) { if (num % 2 != 0) {
		 * System.out.println(num); }
		 */
		for (int num = 1; num <= 50; num+=2) {

			System.out.println(num);
		}

	}

}
