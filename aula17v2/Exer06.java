package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num;

		for (num = 1; num <= 20; num++) {
			System.out.println(num);
		}
		for (num = 1; num <= 19; num++) {
			System.out.print(num + ", ");
		}
		System.out.println(num++ + ".");

	}

}
