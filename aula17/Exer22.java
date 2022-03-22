package com.valerio.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int qtd, i = 1;
		double media = 0, total = 0, cd;

		System.out.println("Digite a quantidade de CDs:");
		qtd = key.nextInt();

		for (; i <= qtd; i++) {
			System.out.println("Digite o valor do " + i + "º CD.");
			cd = key.nextDouble();
			total += cd;
			if (i == qtd) {
				media = total / qtd;
				System.out.println(
						"O valor médio gasto nos CDs é de " + new DecimalFormat("#.00").format(media) + "R$ reais.");
				System.out.println(
						"O preço total gasto nos CDs é de " + new DecimalFormat("#.00").format(total) + "R$ reais.");
			}
		}
	}
}