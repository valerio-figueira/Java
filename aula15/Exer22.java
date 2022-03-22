package com.valerio.cursojava.aula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String fr1, fr2;
		double morango, maca, preco1, preco2, kg1, kg2, kgTotal, desconto, total;
		kg1 = 0;
		kg2 = 0;
		morango = 0;
		maca = 0;
		total = 0;
		kgTotal = 0;
		preco1 = 0;
		preco2 = 0;

		System.out.println("Sacolão de Frutas. \n");
		System.out.println("Digite \"Morango\" para comprar morangos:");
		fr1 = key.next();
		System.out.println("Digite \"Kg\" para quantidade de Kilos de morangos:");
		kg1 = key.nextDouble();

		if (fr1.equalsIgnoreCase("Morango")) {
			if (kg1 <= 5) {
				morango = 2.50;
				preco1 = kg1 * morango;
				System.out.println("Você pagará R$" + preco1 + " em " + kg1 + "Kilos de morango.");
			} else if (kg1 > 5) {
				morango = 2.20;
				preco1 = kg1 * morango;
				System.out.println("Você pagará R$" + preco1 + " em " + kg1 + "Kilos de morango.");
			}
		}
		System.out.println("\nDigite \"Maçã\" para comprar maçãs:");
		fr2 = key.next();
		System.out.println("Digite \"Kg\" para quantidade de Kilos de maçãs:");
		kg2 = key.nextDouble();

		if (fr2.equalsIgnoreCase("Maçã") || fr2.equalsIgnoreCase("Maça") || fr2.equalsIgnoreCase("Maca")) {
			if (kg2 <= 5) {
				maca = 1.80;
				preco2 = kg2 * maca;
				System.out.println("Você pagará R$" + preco2 + " em " + kg2 + "Kilos de maçã.");
			} else if (kg2 > 5) {
				maca = 1.50;
				preco2 = kg2 * maca;
				System.out.println("Você pagará R$" + preco2 + " em " + kg2 + "Kilos de maçã.");
			}
		}
		kgTotal = kg1 + kg2;
		total = preco1 + preco2;

		System.out.println("\nTotal Kg = " + kgTotal);
		System.out.println("Total R$" + total + " reais.");
		if (kgTotal >= 8 || total >= 25.0) {
			desconto = (total * 10) / 100;
			total = (preco1 + preco2) - desconto;
			System.out.println("\nVocê ganha 10% de desconto!\nTotal = " + new DecimalFormat("0.00").format(total));
		}

	}
}
