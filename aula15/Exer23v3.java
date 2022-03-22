package com.valerio.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer23v3 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		boolean valido = true;
		double preco, kg, total, desconto;
		int carne, cartao;
		carne = 0;
		preco = 0;
		kg = 0;
		total = 0;
		desconto = 0;

		System.out.println("Promoção de Carnes.");
		System.out.println("\nEscolha o tipo de carne que deseja: \n1 - Filé Duplo\n2 - Alcatra\n3 - Picanha");
		carne = key.nextInt();
		if (carne == 1 || carne == 2 || carne == 3) {
			System.out.println("Digite a quantidade em KG:");
			kg = key.nextDouble();
			if (kg > 0) {
				System.out.println("\n1 - Cartão Tabajara \n2 - Dinheiro");
				cartao = key.nextInt();
				if (cartao == 1 || cartao == 2) {
					if (cartao == 1) {
						desconto = (total * 5) / 100;
					}
					if (cartao == 2) {
					}
					if (carne == 1) {
						if (kg <= 5) {
							preco = 4.90;
							System.out.println("Tipo de Carne: Filé Duplo");
						} else if (kg > 5) {
							preco = 5.80;
							System.out.println("Tipo de Carne: Filé Duplo");
						}
					}
					if (carne == 2) {
						if (kg <= 5) {
							preco = 5.90;
							System.out.println("Tipo de Carne: Alcatra");
						} else if (kg > 5) {
							preco = 6.80;
							System.out.println("Tipo de Carne: Alcatra");
						}
					}
					if (carne == 3) {
						if (kg <= 5) {
							preco = 6.90;
							System.out.println("Tipo de Carne: Picanha");
						} else if (kg > 5) {
							preco = 7.80;
							System.out.println("Tipo de Carne: Picanha");
						}
					}
					if (valido) {
						total = kg * preco;
						desconto = (total * 5) / 100;
						System.out.println("Quantidade: " + kg + "Kg");
						System.out.println("Preço: R$" + new DecimalFormat("0.00").format(total));
						System.out.println("Tipo de pagamento: " + cartao);
						System.out.println("Desconto: R$" + desconto);
						System.out.println("A pagar: R$" + new DecimalFormat("0.00").format(total + desconto));
					}
				} else {
					System.out.println("Inválido.");
				}
			} else {
				System.out.println("Inválido.");
			}
		} else {
			System.out.println("Inválido.");
		}

	}
}