package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer32v2 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String pedido = null;
			double cQ = 1.20, bS = 1.30, bO = 1.50, hB = 1.20, cB = 1.30, refri = 1.00, preco = 0, total = 0;
			int qtd, concluir = 1;
			String output = "";

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
					output += "Cachorro quente | Valor: R$" + cQ;
					System.out.print("Digite a quantidade: ");
					qtd = input.nextInt();
					preco = qtd * 1.20;
					output += "\nTotal Cachorro Quente: R$" + preco;
				} else if (pedido.equalsIgnoreCase("101")) {
					output += "\nBauru simples | Valor: R$" + bS;
					System.out.print("Digite a quantidade: ");
					qtd = input.nextInt();
					preco = qtd * 1.30;
					output += "\nTotal Bauru Simples: R$" + preco;
				} else if (pedido.equalsIgnoreCase("102")) {
					output += "\nBauru com Ovo | Valor: R$" + bO;
					System.out.print("Digite a quantidade: ");
					qtd = input.nextInt();
					preco = qtd * 1.50;
					output += "\nTotal Bauru com Ovo: R$" + preco;
				} else if (pedido.equalsIgnoreCase("103")) {
					output += "\nHambúrguer | Valor: R$" + hB;
					System.out.print("Digite a quantidade: ");
					qtd = input.nextInt();
					preco = qtd * 1.20;
					output += "\nPreço: R$" + preco;
				} else if (pedido.equalsIgnoreCase("104")) {
					output += "\nCheeseburguer | Valor: R$" + cB;
					System.out.print("Digite a quantidade: ");
					qtd = input.nextInt();
					preco = qtd * cB;
					output += "\nTotal Cheeseburguer: R$" + preco;
				} else if (pedido.equalsIgnoreCase("105")) {
					output += "\nRefrigerante | Valor: R$" + refri;
					System.out.print("Digite a quantidade: ");
					qtd = input.nextInt();
					preco = qtd * 1.00;
					output += "\nTotal Refrigerante: R$" + preco;
				}
				total += preco;
				System.out.println("Deseja continuar? 1 - (Sim) ou 2 - (Não):");
				concluir = input.nextInt();
				while (concluir != 1 && concluir != 2) {
					System.out.println("Deseja continuar? 1 - (Sim) ou 2 - (Não):");
					concluir = input.nextInt();
				}
				if (concluir == 2) {
					System.out.println(output);
					System.out.println("Valor a pagar:" + total);
				}
			}
		}
	}

