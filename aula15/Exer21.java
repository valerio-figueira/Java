package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String combustivel;
		int litros = 0;
		double gasolina, etanol, preco, desconto;

		System.out.println("A gasolina está à R$2,50 reais o litro, o Etanol à R$1,90 reais.\n");
		System.out.println("Tecle o tipo de combustível: \"G\" - Gasolina ou \"A\" - Álcool");
		combustivel = key.next();
		System.out.println("Quantos litros deseja abastecer?");
		litros = key.nextInt();

		if (combustivel.equalsIgnoreCase("G")) {
			gasolina = 2.50;
			if (litros <= 20) {
				desconto = (litros * gasolina * 4) / 100;
				preco = (litros * gasolina) - desconto;
				System.out.println("Você pagará R$" + preco + " por " + litros + "L de gasolina, com 4% de desconto.");
				System.out.println("Desconto R$" + desconto);
			} else if (litros > 20) {
				desconto = (litros * gasolina * 6) / 100;
				preco = (litros * gasolina) - desconto;
				System.out.println("Você pagará R$" + preco + " por " + litros + "L de gasolina, com 6% de desconto.");
				System.out.println("Desconto R$" + desconto);
			} else System.out.println("Inválido.");
		}
		if (combustivel.equalsIgnoreCase("A")) {
			etanol = 1.90;
			if (litros <= 20) {
				desconto = (litros * etanol * 3) / 100;
				preco = (litros * etanol) - desconto;
				System.out.println("Você pagará R$" + preco + " por " + litros + "L de gasolina, com 3% de desconto.");
				System.out.println("Desconto R$" + desconto);
			} else if (litros > 20) {
				desconto = (litros * etanol * 5) / 100;
				preco = (litros * etanol) - desconto;
				System.out.println("Você pagará R$" + preco + " por " + litros + "L de gasolina, com 5% de desconto.");
				System.out.println("Desconto R$" + desconto);
			} else System.out.println("Inválido.");
		}
	}

}
