package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class Exer08 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Olá! Seja Bem-vindo.\nEste programa lhe mostrará o valor de seu salário em horas e, em seguida, o total de horas trabalhadas no mês");
		System.out.println("Valor do Salário R$ ");
		double salario = key.nextDouble();
		System.out.println("Digite as horas diárias de trabalho: ");
		int horas = key.nextInt();
		System.out.println("Digite o número de dias por semana: ");
		int dias = key.nextInt();

		int horasSemana = horas * dias;
		int horasMes = horasSemana * 4;
		double salarioHoras = salario / horasMes;
		System.out.println("Você ganha R$" + salarioHoras + " à hora.");
		System.out.println("Seu expediente é de " + horasMes + " horas mensais.");

	}

}
