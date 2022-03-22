package com.valerio.cursojava.aula17v2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31v2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = 1000, percentual = 1.5;
		int ano = 1995;

		while (ano <= 2022) {
			System.out.println(percentual);
			ano++;
			percentual = percentual * 2;
		}
	}

}
