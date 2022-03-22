package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean valido = true;

		System.out.println("Digite o nome:");
		nome = key.next();

		while (nome.length() <= 3) {
			System.out.println("Incorreto, digite novamente o nome:");
			nome = key.next();
		}
		if (nome.length() > 3) {
		}

		System.out.println("Digite a idade:");
		idade = key.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.println("Incorreto. Digite-a novamente:");
			idade = key.nextInt();
		}

		if (idade > 0 && idade < 150) {
		}
		System.out.println("Digite o salário:");
		salario = key.nextDouble();

		while (salario < 0) {
			System.out.println("Incorreto. Digite o salário novamente:");
			salario = key.nextDouble();
		}
		if (salario > 0) {
		}

		System.out.println("Digite o sexo, se F ou M:");
		sexo = key.next();

		while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
			System.out.println("Incorreto. Digite o sexo, se F ou M:");
			sexo = key.next();
		}
		if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
		}

		System.out.println("Digite o estado civil: 's', 'c', 'v', 'd'");
		estadoCivil = key.next();
		while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v")
				&& !estadoCivil.equalsIgnoreCase("d")) {
			System.out.println("Incorreto, digite novamente o estado civil: 's', 'c', 'v', 'd'");
			estadoCivil = key.next();
		}
		if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
				|| estadoCivil.equalsIgnoreCase("d")) {
			System.out.println("Estado Civil: " + estadoCivil);
		}
	}

}
