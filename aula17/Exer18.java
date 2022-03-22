package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num, i;
		boolean primo = true;

		num = (int) Math.round(Math.random() * 10);

		for (i = 2; i < num; i++) {
				if (num % i == 0) {
					primo = false;
					System.out.println("É Composto. O nº "+num+" é divisível por "+i);
				}
			}
			if (primo) {
				System.out.println("É primo.");
			}
		}
	}