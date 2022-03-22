package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite o valor de seu salário R$ ");
		double salario = key.nextDouble();

		double vinte = (salario * 20) / 100;
		double quinze = (salario * 15) / 100;
		double dez = (salario * 10) / 100;
		double cinco = (salario * 5) / 100;

		if (salario <= 280.00) {
			System.out.println("Seu salário antes do reajuste é R$" + (salario));
			System.out.println("Sua porcentagem é 20%");
			System.out.println("Valor do aumento R$"+vinte);
			System.out.println("Novo salário R$"+(salario+vinte));
		} else if (salario > 280.00 && salario <= 700.00) {
			System.out.println("Seu salário antes do reajuste é R$" + (salario));
			System.out.println("Sua porcentagem é 15%");
			System.out.println("Valor do aumento R$"+quinze);
			System.out.println("Novo salário R$"+(salario+quinze));
		} else if (salario > 700.00 && salario <= 1500.00) {
			System.out.println("Seu salário antes do reajuste é R$" + (salario));
			System.out.println("Sua porcentagem é 10%");
			System.out.println("Valor do aumento R$"+dez);
			System.out.println("Novo salário R$"+(salario+dez));
		} else if (salario > 1500.00) {
			System.out.println("Seu salário antes do reajuste é R$" + (salario));
			System.out.println("Sua porcentagem é 5%");
			System.out.println("Valor do aumento R$"+cinco);
			System.out.println("Novo salário R$"+(salario+cinco));
		} else {
			System.out.println("Inválido!");
		}

	}

}