package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Boolean ligacao, local, residencia, debito, trabalho;

		System.out.println("Responda com \"true\" para verdadeiro ou \"false\" para falso:");
		System.out.println("Telefonou para a vítima?");
		ligacao = key.nextBoolean();
		System.out.println("Esteve no local do crime?");
		local = key.nextBoolean();
		System.out.println("Mora perto da vítima?");
		residencia = key.nextBoolean();
		System.out.println("Devia para a vítima?");
		debito = key.nextBoolean();
		System.out.println("Já trabalhou com a vítima?");
		trabalho = key.nextBoolean();
		// 2 suspeito, 3/4 cúmplice, 5 assassino. O contrário é inocente.

		if (ligacao == local && ligacao != residencia && ligacao != debito && ligacao != trabalho
				|| ligacao == residencia && ligacao != local && ligacao != debito && ligacao != trabalho
				|| ligacao == debito && ligacao != local && ligacao != residencia && ligacao != trabalho
				|| ligacao == trabalho && ligacao != local && ligacao != residencia && ligacao != debito) {
			System.out.println("Há duas participações no crime, é suspeito.");
		} else {
			System.out.println("Inválido.");
		}

	}
}
