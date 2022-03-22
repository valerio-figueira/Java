package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer20v2 {
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

		if (resultado >= 0 || resultado <= 5) {
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
				System.out.println("Inocente.");
			} else if (resultado == 2) {
				System.out.println("Suspeito.");
			} else if (resultado == 3 || resultado == 4) {
				System.out.println("Cúmplice.");
			} else if (resultado == 5) {
				System.out.println("Assassino.");
			}
		}
	}
}

/*
 * if (p1.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p1.equalsIgnoreCase("Não"))
 * 
 * if (p2.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p2.equalsIgnoreCase("Não"))
 * 
 * if (p3.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p3.equalsIgnoreCase("Não"))
 * 
 * if (p4.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p4.equalsIgnoreCase("Não"))
 * 
 * if (p5.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (p5.equalsIgnoreCase("Não"))
 * 
 * 
 * if (resultado == 2) { System.out.println("Suspeito."); } else if (resultado
 * == 3 || resultado == 4) { System.out.println("Cúmplice."); } else if
 * (resultado == 5) { System.out.println("Assassino."); } else if (resultado ==
 * 0) { System.out.println("Inocente."); }
 */

/*
 * if (ligacao.equalsIgnoreCase("Sim")) { resultado++; if
 * (local.equalsIgnoreCase("Sim")) { resultado++; if
 * (residencia.equalsIgnoreCase("Sim")) { resultado++; if
 * (debito.equalsIgnoreCase("Sim")) { resultado++; if
 * (trabalho.equalsIgnoreCase("Sim")) { resultado++; } else if
 * (trabalho.equalsIgnoreCase("Não")) { resultado = 0; } else if
 * (debito.equalsIgnoreCase("Não")) { resultado = 0; } } else if
 * (residencia.equalsIgnoreCase("Não")) { resultado = 0; } } else if
 * (local.equalsIgnoreCase("Não")) { resultado = 0; } } else if
 * (ligacao.equalsIgnoreCase("Não")) { resultado = 0; } if (resultado == 2) {
 * System.out.println("É suspeito."); } else if (resultado == 3 || resultado ==
 * 4) { System.out.println("É cúmplice."); } else if (resultado == 5) {
 * System.out.println("É assassino."); }
 * 
 * }
 */

/*
 * if (ligacao.equalsIgnoreCase("Sim")) { resultado++; if
 * (ligacao.equalsIgnoreCase("Não")) { resultado=0; if
 * (local.equalsIgnoreCase("Sim")) { resultado++; if
 * (local.equalsIgnoreCase("Não")) { resultado=0; if
 * (residencia.equalsIgnoreCase("Sim")) { resultado++; if
 * (residencia.equalsIgnoreCase("Não")) { resultado=0; if
 * (debito.equalsIgnoreCase("Sim")) { resultado++; if
 * (debito.equalsIgnoreCase("Não")) { resultado=0; if
 * (trabalho.equalsIgnoreCase("Sim")) { resultado++; if
 * (trabalho.equalsIgnoreCase("Não")) { resultado=0; if (resultado == 2) {
 * System.out.println("É suspeito."); } else if (resultado == 3 || resultado ==
 * 4) { System.out.println("É cúmplice."); } else if (resultado == 5) {
 * System.out.println("É assassino."); } } } } } } } } } }
 * 
 * 
 * }
 */
