package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer27v2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double menor, maior, temp, soma, media = 0;
		int i = 1;
		String concluir = "sim";

		System.out.println("Digite a " + i + "ª temperatura: ");
		temp = input.nextDouble();
		menor = maior = temp;
		soma = temp;

		while (concluir.equalsIgnoreCase("sim")) {
			i++;
			System.out.println("Digite a " + i + "ª temperatura: ");
			temp = input.nextDouble();
			media += temp;

			if (temp != 0) {
				if (temp > maior) {
					maior = temp;
				} else if (temp < menor) {
					menor = temp;
				}
			}
			if (i > 2) {
				System.out.println("Deseja continuar? 'Sim' ou 'Não':");
				concluir = input.next();
				while (!concluir.equalsIgnoreCase("sim") && !concluir.equalsIgnoreCase("não")) {
					System.out.println("Incorreto! Deseja continuar? 'Sim' ou 'Não':");
					concluir = input.next();
				}
				if (concluir.equalsIgnoreCase("não")) {
					System.out.println("maior " + maior + "º C.");
					System.out.println("menor " + menor + "º C.");
					media = media + soma;
					System.out.println("A média de temperatura é: " + media / i + "º C.");
				}
			}
		}
	}

}
