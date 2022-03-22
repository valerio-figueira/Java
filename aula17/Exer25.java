package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double preco = 0, total = 0, dinCliente = 0, troco = 0;
		int prod = 1;
		boolean flag = false;
		String output = "\nLojas Tabajara\n", continuar = "s";

		while (prod > 0 && continuar.equalsIgnoreCase("s")) {
			System.out.print("Produto " + prod + ": R$ ");
			preco = key.nextDouble();
			total += preco;
			output += "Produto " + prod + ": R$ " + preco + "\n";
			prod++;
			if (preco == 0) {
				System.out.println("Total: R$ " + total);
				System.out.print("\nDigite o dinheiro entregue pelo cliente: R$");
				dinCliente = key.nextDouble();
				troco = dinCliente - total;
				output += "Total: R$" + total + "\n";
				output += "Dinheiro: R$" + dinCliente + "\n";
				output += "Troco: R$" + troco + "\n";
				System.out.println(output);
				prod = 1;
			}
			if (prod == 1) {
				while (flag == false) {
					System.out.println("Deseja Continuar? S/N");
					continuar = key.next();
					while (!continuar.equalsIgnoreCase("s") && !continuar.equalsIgnoreCase("n")) {
						System.out.println("Deseja Continuar? S/N");
						continuar = key.next();
					}
					if (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("n")) {
						flag = true;
					}
				}
			}
		}
		System.out.println("Obrigado! Volte sempre!");
	}
}