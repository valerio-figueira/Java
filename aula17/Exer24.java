package com.valerio.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int i = 1, cont;
		double pao = 0.18;

		for (; i <= 50; i++) {
			System.out.println(i + " - R$ " + new DecimalFormat("00.00").format(pao*i));
		}
	}

}
