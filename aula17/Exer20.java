package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double idade, media;
		int i, cont;

		System.out.println("Digite a quantidade de pessoas para o cálculo da média:");
		i = key.nextInt();

		for (cont = 1, media = 0; cont <= i; cont++) {
			System.out.println("Digite a " + cont + "ª idade da pessoa.");
			idade = key.nextDouble();
			media += idade;
			if (cont == i) {
				media = media / i;
				if (media > 0 && media <= 25) {
					System.out.println("A média é de " + media + " anos. A média é de pessoas jovens.");
				} else if (media > 26 && media < 60) {
					System.out.println("A média é de " + media + " anos. A média é de pessoas adultas.");
				} else if (media > 60) {
					System.out.println("A média é de " + media + " anos. A média é de pessoas idosas.");
				}
			}
		}
	}

}
