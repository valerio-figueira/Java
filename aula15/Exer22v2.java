package com.valerio.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer22v2 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		String entrada;
		double kgFruta, kgFruta2, totalKg, preco, preco1, preco2, desconto, desconto1, desconto2, vrTotal1, vrTotal2;

		System.out.println("Sacolão de Frutas");
		System.out.println("Digite o que vai comprar hoje: Maça, Morango ou Ambos: ");
		entrada = programa.nextLine();
		
		while (!entrada.equalsIgnoreCase("Maça") && !entrada.equalsIgnoreCase("Morango")
				&& !entrada.equalsIgnoreCase("Ambos")) {
			System.out.println("Incorreto! Digite Novamente.");
			System.out.println("Digite o que vai comprar hoje: Maça, Morango ou Ambos: ");
			entrada = programa.nextLine();
		}

		if (entrada.equalsIgnoreCase("Maça")) {
			System.out.println("Digite a quantidade de KG da fruta que deseja comprar: ");
			kgFruta = programa.nextDouble();

			if (kgFruta < 5) {

				preco = kgFruta * 1.80;

				System.out.println("Valor ser pago: R$" + new DecimalFormat("##.00").format(preco));
			} else if (entrada.equalsIgnoreCase("Maça") && kgFruta >= 5 && kgFruta <= 7) {
				preco = kgFruta * 1.50;

				System.out.println("Valor ser pago: R$" + new DecimalFormat("##.00").format(preco));
			}

			else if (kgFruta >= 8) {

				preco = kgFruta * 1.50;
				desconto = kgFruta * 10 / 100;

				System.out.println("Valor a ser pago sem desconto: R$" + new DecimalFormat("#0.00").format(preco));
				System.out.println("Você comprou acima 8kg ou acima de R$25.00 é ganhou um desconto de 10%");
				System.out.println("O desconto que você ganhou é de R$" + new DecimalFormat("#0.00").format(desconto));
				System.out.println("Ganhou mais desconto: R$" + new DecimalFormat("##.00").format((preco - desconto)));

			}
		}

		if (entrada.equalsIgnoreCase("Morango")) {
			System.out.println("Digite a quantidade de KG da fruta que deseja comprar: ");
			kgFruta = programa.nextDouble();

			if (kgFruta < 5) {

				preco = kgFruta * 2.50;

				System.out.println("Valor ser pago: R$" + new DecimalFormat("##.00").format(preco));
			} else if (entrada.equalsIgnoreCase("Morango") && kgFruta >= 5 && kgFruta <= 7) {
				preco = kgFruta * 2.20;

				System.out.println("Valor ser pago: R$" + new DecimalFormat("##.00").format(preco));
			} else if (entrada.equalsIgnoreCase("Morango") && kgFruta >= 8) {

				preco = kgFruta * 2.20;
				desconto = kgFruta * 10 / 100;

				System.out.println("Valor a ser pago sem desconto: R$" + new DecimalFormat("#0.00").format(preco));
				System.out.println("Você comprou acima 8kg ou acima de R$25.00 é ganhou um desconto de 10%");
				System.out.println("O desconto que você ganhou é de R$" + new DecimalFormat("#0.00").format(desconto));
				System.out.println("Ganhou mais desconto: R$" + new DecimalFormat("##.00").format((preco - desconto)));

			}

		}
		if (entrada.equalsIgnoreCase("Ambos")) {
			System.out.println("Digite a quantidade de KG de maça que deseja comprar: ");
			kgFruta = programa.nextDouble();

			System.out.println("Digite a quantidade de KG de morango que deseja comprar: ");
			kgFruta2 = programa.nextDouble();

			totalKg = kgFruta + kgFruta2;

			if (totalKg < 5) {

				preco1 = kgFruta * 1.80;
				preco2 = kgFruta2 * 2.50;

				System.out.println("Valor ser pago Kg Maça: R$" + new DecimalFormat("##.00").format(preco1));
				System.out.println("Valor ser pago Kg Morango: R$" + new DecimalFormat("##.00").format(preco2));
				System.out.println("Total a ser pago: R$" + new DecimalFormat("##.00").format(preco1 + preco2));
			} else if (entrada.equalsIgnoreCase("Ambos") && totalKg >= 5 && totalKg <= 7) {
				preco1 = kgFruta * 1.50;
				preco2 = kgFruta2 * 2.20;

				System.out.println("Valor ser pago Kg Maça: R$" + new DecimalFormat("##.00").format(preco1));
				System.out.println("Valor ser pago Kg Morango: R$" + new DecimalFormat("##.00").format(preco2));
				System.out.println("Total a ser pago: R$" + new DecimalFormat("##.00").format(preco1 + preco2));
			}
			

			else if (entrada.equalsIgnoreCase("Ambos") && totalKg >= 8) {

				preco1 = kgFruta * 1.50;
				desconto1 = kgFruta * 10 / 100;

				preco2 = kgFruta2 * 2.20;
				desconto2 = kgFruta2 * 10 / 100;

				vrTotal1 = preco1 - desconto1;

				vrTotal2 = preco2 - desconto2;

				System.out.println("\nCompra da Maça:");
				System.out.println("Valor a ser pago sem desconto: R$" + new DecimalFormat("#0.00").format(preco1));
				System.out.println("Você comprou acima 8kg ou acima de R$25.00 é ganhou um desconto de 10%");
				System.out.println("O desconto que você ganhou é de R$" + new DecimalFormat("#0.00").format(desconto1));
				System.out
						.println("Ganhou mais desconto: R$" + new DecimalFormat("##.00").format((preco1 - desconto1)));

				System.out.println("\nCompra do Morango:");
				System.out.println("Valor a ser pago sem desconto: R$" + new DecimalFormat("#0.00").format(preco2));
				System.out.println("Você comprou acima 8kg ou acima de R$25.00 é ganhou um desconto de 10%");
				System.out.println("O desconto que você ganhou é de R$" + new DecimalFormat("#0.00").format(desconto2));
				System.out
						.println("Ganhou mais desconto: R$" + new DecimalFormat("##.00").format((preco2 - desconto2)));

				System.out.println("\n Total da Compra: " + new DecimalFormat("#0.00").format((vrTotal1 + vrTotal2)));

			}

		}
	}
}