package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer20v3 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String p1, p2, p3, p4, p5;
		int resultado = 0;

		System.out.println("Responda \"Sim\" ou \"Não\":");
		System.out.println("Telefonou para a vítima?");
		p1 = key.next();
		System.out.println("Esteve no local do crime?");
		p2 = key.next();
		System.out.println("Mora perto da vítima?");
		p3 = key.next();
		System.out.println("Devia para a vítima?");
		p4 = key.next();
		System.out.println("Já trabalhou com a vítima?");
		p5 = key.next();
		// 2 suspeito, 3/4 cúmplice, 5 assassino. O contrário é inocente.

		if (p1.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p1.equalsIgnoreCase("Não")) {
		}

		if (p2.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p2.equalsIgnoreCase("Não")) {
		}

		if (p3.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p3.equalsIgnoreCase("Não")) {
		}

		if (p4.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p4.equalsIgnoreCase("Não")) {
		}

		if (p5.equalsIgnoreCase("Sim")) {
			resultado++;
		} else if (p5.equalsIgnoreCase("Não")) {
		}

		if (resultado == 0) {
			System.out.println("É inocente.");
		} else if (resultado == 2) {
			System.out.println("É suspeito.");
		} else if (resultado == 3 || resultado == 4) {
			System.out.println("É cúmplice.");
		} else if (resultado == 5) {
			System.out.println("É assassino.");
		}
	}
}