package com.valerio.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int i = 1, cont;
		double produto;

		for (produto = 1.99; i <= 50; i++) {
			System.out.println(i + " - R$ " + new DecimalFormat("##.00").format(produto*i));
		}
	}
}
