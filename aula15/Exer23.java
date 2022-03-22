package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer23 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String carne, cartao;
		double preco, kg, total, pagamento, desconto;
		preco = 0;
		kg = 0;
		total = 0;
		pagamento = 0;
		desconto = 0;

		System.out.println("Promoção de Carnes.");
		System.out.println(
				"\nEscolha o tipo de carne que deseja. \nSe Filé Duplo, digite \"Filé Duplo\". Se Alcatra, digite \"Alcatra\". Se Picanha, digite \"Picanha\".");
		carne = key.nextLine();
		System.out.println("Digite a quantidade em KG:");
		kg = key.nextDouble();
		System.out.println("Tecle C - Cartão Tabajara ou D - Dinheiro:");
		cartao = key.next();

		if (carne.equalsIgnoreCase("Filé Duplo") || carne.equalsIgnoreCase("File Duplo")) {

			if (cartao.equalsIgnoreCase("C") && kg <= 5) {
				preco = 4.90;
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Cartão Tabajara.");
				System.out.println("Preço: R$" + total);
				System.out.println("5% de desconto: R$" + desconto);
				System.out.println("Valor a pagar: R$" + (total - desconto));
			} else if (cartao.equalsIgnoreCase("C") && kg > 5) {
				preco = 5.80;
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Cartão Tabajara.");
				System.out.println("Preço: R$" + total);
				System.out.println("5% de desconto: R$" + desconto);
				System.out.println("Valor a pagar: R$" + (total - desconto));
			}
			if (cartao.equalsIgnoreCase("D") && kg <= 5) {
				preco = 4.90;
				total = preco * kg;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Dinheiro.");
				System.out.println("Valor a pagar: R$" + total);
			} else if (cartao.equalsIgnoreCase("D") && kg > 5) {
				preco = 5.80;
				total = preco * kg;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Dinheiro.");
				System.out.println("Valor a pagar: R$" + total);
			}
		}
		if (carne.equalsIgnoreCase("Alcatra")) {
			preco = 5.90;
			if (cartao.equalsIgnoreCase("C") && kg <= 5) {
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Cartão Tabajara.");
				System.out.println("Preço: R$" + total);
				System.out.println("5% de desconto: R$" + desconto);
				System.out.println("Valor a pagar: R$" + (total - desconto));
			} else if (cartao.equalsIgnoreCase("C") && kg > 5) {
				preco = 6.80;
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Cartão Tabajara.");
				System.out.println("Preço: R$" + total);
				System.out.println("5% de desconto: R$" + desconto);
				System.out.println("Valor a pagar: R$" + (total - desconto));
			}
			if (cartao.equalsIgnoreCase("D") && kg <= 5) {
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Dinheiro.");
				System.out.println("Valor a pagar: R$" + total);
			} else if (cartao.equalsIgnoreCase("D") && kg > 5) {
				preco = 6.80;
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Dinheiro.");
				System.out.println("Valor a pagar: R$" + total);
			}
		}
		if (carne.equalsIgnoreCase("P")) {
			preco = 6.90;
			if (cartao.equalsIgnoreCase("C") && kg <= 5) {
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Cartão Tabajara.");
				System.out.println("Preço: R$" + total);
				System.out.println("5% de desconto: R$" + desconto);
				System.out.println("Valor a pagar: R$" + (total - desconto));
			} else if (cartao.equalsIgnoreCase("C") && kg > 5) {
				preco = 7.80;
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Cartão Tabajara.");
				System.out.println("Preço: R$" + total);
				System.out.println("5% de desconto: R$" + desconto);
				System.out.println("Valor a pagar: R$" + (total - desconto));
			}
			if (cartao.equalsIgnoreCase("D") && kg <= 5) {
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Dinheiro.");
				System.out.println("Valor a pagar: R$" + total);
			} else if (cartao.equalsIgnoreCase("D") && kg > 5) {
				preco = 7.80;
				total = preco * kg;
				desconto = (total * 5) / 100;
				System.out.println("Tipo de Carne: " + carne);
				System.out.println("Quantidade: " + kg + "Kg");
				System.out.println("Tipo de pagamento: Dinheiro.");
				System.out.println("Valor a pagar: R$" + total);
			}
		}

	}
}