package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class Exer08v2 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Olá! Seja Bem-vindo.\nEste programa lhe mostrará o valor de seu salário em horas e, em seguida, o total de horas trabalhadas no mês.");
		System.out.println("Valor do Salário R$ ");
		double salario = key.nextDouble();
		System.out.println("Expediente em dias por semana: ");
		double diasSemana = key.nextDouble();
		System.out.println("Diária de trabalho em horas: ");
		double horas = key.nextDouble();

		double horasSemana = horas * diasSemana;
		double horasMes = horasSemana * 4;
		double salarioHoras = salario / horasMes;
		System.out.println("Você ganha R$" + salarioHoras + " à hora.");
		System.out.println("Seu expediente é de " + horasMes + " horas mensais.");

	}

}