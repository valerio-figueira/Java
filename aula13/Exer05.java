package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class Exer05 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Olá! Este é um conversor de metros para centímetros.");
		System.out.println("Para continuar, digite o valor em metros: ");
		double m = key.nextDouble();
		double cm = m * 100;
		System.out.println("metros: " + m);
		System.out.println("cm: " + cm);
		System.out.println("Enjoy!");
	}

}
