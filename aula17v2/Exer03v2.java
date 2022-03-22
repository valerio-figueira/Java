package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer03v2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		System.out.println("Digite um nome:");
		nome = key.next();
		while (nome.length() <= 3) {
			System.out.println("Incorreto! Digite o nome:");
			nome = key.next();
		}
		if (nome.length() > 3) {
			System.out.println(nome + " correto.");
		}

		System.out.println("Digite a idade:");
		idade = key.nextInt();
		while (idade < 0 || idade > 150) {
			System.out.println("Incorreto! Digite a idade:");
			idade = key.nextInt();
		}
		if (idade >= 0 && idade <= 150) {
			System.out.println(idade + " correto.");
		}
		System.out.println("Digite o salário:");
		salario = key.nextInt();
		while (salario < 0) {
			System.out.println("Incorreto! Digite o salário:");
			salario = key.nextInt();
		}
		if (salario > 0) {
			System.out.println(salario + " correto.");
		}
		System.out.println("Digite o sexo 'f' ou 'm':");
		sexo = key.next();
		while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
			System.out.println("Incorreto! Digite o sexo:");
			sexo = key.next();
		}
		if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
			System.out.println(sexo + " correto.");
		}

		System.out.println("Digite o estado civil 's', 'c', 'v', 'd':");
		estadoCivil = key.next();
		while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c")
				&& !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
			System.out.println("Incorreto! Digite o estado civil 's', 'c', 'v', 'd':");
			estadoCivil = key.next();
		}
		if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
				|| estadoCivil.equalsIgnoreCase("d")) {
			System.out.println(estadoCivil + " correto.");
		}

	}

}
