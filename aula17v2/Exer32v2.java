package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer32v2 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Cardápio do Rei da Gula");

			String saida = null;
			double total = 0;
			int fecharPedido, cod, qtdItem, i = 1;
			boolean fechaPrograma = true;

			do {
				
					System.out.println("Digite o codigo do item: ");
					cod = input.nextInt();

					System.out.println("Digite a quantidade que deseja comprar: ");
					qtdItem = input.nextInt();

					System.out.println("Deseja compra algo mais? (1 - Sim) ou (2 - Não)");
					fecharPedido = input.nextInt();

					if (fecharPedido == 2) {
						fechaPrograma = false;
						saida += "Total = " + total;
						i = 0;
					} else {
						switch (cod) {
						case 100:
							saida += "Cachorro Quente - R$1,20 * " + qtdItem;
							saida += " = " + (1.2 * qtdItem + "\n");
							total += 1.2 * qtdItem;
							i++;
							break;

						case 101:
							saida += "Bauru Simples - R$1,30 * " + qtdItem;
							saida += " = " + (1.3 * qtdItem + "\n");
							total += 1.3 * qtdItem;
							i++;
							break;

						case 102:
							saida += "Bauro com ovo - R$1,50 * " + qtdItem;
							saida += " = " + (1.5 * qtdItem + "\n");
							total += 1.5 * qtdItem;
							i++;
							break;

						case 103:
							saida += "Hambúrguer - R$1,20 * " + qtdItem;
							saida += " = " + (1.2 * qtdItem + "\n");
							total += 1.2 * qtdItem;
							i++;
							break;

						case 104:
							saida += "Cheeseburguer - R$1,30 * " + qtdItem * 1.3;
							saida += " = " + (1.3 * qtdItem + "\n");
							total += 1.3 * qtdItem;
							i++;
							break;

						case 105:
							saida += "Refrigerante - R$1,00 * " + qtdItem * 1.00;
							saida += " = " + (1 * qtdItem + "\n");
							total += 1.00 * qtdItem;
							i++;
							break;
						default:
							System.out.println("Codigo Inválido!");
						}
					}

				
			} while (fechaPrograma);
				System.out.println(saida);
		}
	}
