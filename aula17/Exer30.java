package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tab, inicio, fim, res, i;

		System.out.println("Digite a tabuada que deseja montar:");
		tab = input.nextInt();
		System.out.println("Por qual número deseja começar?");
		inicio = input.nextInt();
		System.out.println("Em qual deseja parar?");
		fim = input.nextInt();
		while (fim < inicio) {
			System.out.println("Falha! O valor final deve ser maior que o inicial. Digite o valor final:");
			fim = input.nextInt();
		}
		System.out.println("Tabuada de: " + tab);
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em: " + fim + "\n");

		for (i = inicio; i <= fim; i++) {
			res = tab * i;
			System.out.println(tab + " x " + i + " = " + res);

		}
	}

}
