package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer11v2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		double salario, reajuste;

		System.out.println("Digite o valor de seu salário R$ ");
		salario = key.nextDouble();

		if (salario <= 280.00) {
			reajuste = (salario * 20) / 100;
			System.out.println("Salário antes do reajuste é de R$"+salario);
			System.out.println("Sua porcentagem é de 20%");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo salário R$"+ (salario + reajuste));
		} else if (salario > 280.00 && salario <= 700.00) {
			reajuste = (salario * 15) / 100;
			System.out.println("Salário antes do reajuste é de R$"+salario);
			System.out.println("Sua porcentagem é de 15%");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo salário R$"+ (salario + reajuste));
		} else if (salario > 700.00 && salario <= 1500) {
			reajuste = ((salario * 10) / 100);
			System.out.println("Salário antes do reajuste é de R$"+salario);
			System.out.println("Sua porcentagem é de 10% ");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo salário R$"+ (salario + reajuste));
		} else if (salario > 1500) {
			reajuste = (salario * 5) / 100;
			System.out.println("Salário antes do reajuste é de R$"+salario);
			System.out.println("Sua porcentagem é de 5%");
			System.out.println("Valor do aumento R$"+reajuste);
			System.out.println("Novo salário R$"+ (salario + reajuste));
		}
		
		

	}

}
