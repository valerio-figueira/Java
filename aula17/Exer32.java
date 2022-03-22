package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pedido = null;
		double cQ = 1.20, bS = 1.30, bO = 1.50, hB = 1.20, cB = 1.30, refri = 1.00, preco = 0, total = 0;
		int qtd, concluir = 1;

		while (concluir == 1) {
			System.out.print("Digite o código do pedido: ");
			pedido = input.next();
			while (!pedido.equalsIgnoreCase("100") && !pedido.equalsIgnoreCase("101") && !pedido.equalsIgnoreCase("102")
					&& !pedido.equalsIgnoreCase("103") && !pedido.equalsIgnoreCase("104")
					&& !pedido.equalsIgnoreCase("105")) {
				System.out.print("Incorreto! Digite o código do pedido: ");
				pedido = input.next();
			}
			if (pedido.equalsIgnoreCase("100")) {
				System.out.println("Cachorro quente | Valor: R$" + cQ);
				System.out.print("Digite a quantidade: ");
				qtd = input.nextInt();
				preco = qtd * cQ;
				System.out.println("Preço: R$" + preco);
			} else if (pedido.equalsIgnoreCase("101")) {
				System.out.println("Bauru simples | Valor: R$" + bS);
				System.out.print("Digite a quantidade: ");
				qtd = input.nextInt();
				preco = qtd * bS;
				System.out.println("Preço: R$" + preco);
			} else if (pedido.equalsIgnoreCase("102")) {
				System.out.println("Bauru com Ovo | Valor: R$" + bO);
				System.out.print("Digite a quantidade: ");
				qtd = input.nextInt();
				preco = qtd * bO;
				System.out.println("Preço: R$" + preco);
			} else if (pedido.equalsIgnoreCase("103")) {
				System.out.println("Hambúrguer | Valor: R$" + hB);
				System.out.print("Digite a quantidade: ");
				qtd = input.nextInt();
				preco = qtd * hB;
				System.out.println("Preço: R$" + preco);
			} else if (pedido.equalsIgnoreCase("104")) {
				System.out.println("Cheeseburguer | Valor: R$" + cB);
				System.out.print("Digite a quantidade: ");
				qtd = input.nextInt();
				preco = qtd * cB;
				System.out.println("Preço: R$" + preco);
			} else if (pedido.equalsIgnoreCase("105")) {
				System.out.println("Refrigerante | Valor: R$" + refri);
				System.out.print("Digite a quantidade: ");
				qtd = input.nextInt();
				preco = qtd * refri;
				System.out.println("Preço: R$" + preco);
			}
			total += preco;
			System.out.println("Deseja continuar? 1 - (Sim) ou 2 - (Não):");
			concluir = input.nextInt();
			while (concluir != 1 && concluir != 2) {
				System.out.println("Deseja continuar? 'Sim' ou 'Não':");
				concluir = input.nextInt();
			}
			if (concluir == 2) {
				System.out.println("Total do pedido: R$" + total);
			}
		}
	}
}
