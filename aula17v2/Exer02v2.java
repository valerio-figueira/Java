package com.valerio.cursojava.aula17v2;

import java.util.Scanner;

public class Exer02v2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String id, senha;

		System.out.println("Digite sua id: ");
		id = key.next();
		System.out.println("Digite sua senha: ");
		senha = key.next();

		while (id.equalsIgnoreCase(senha)) {
			System.out.println("Sua id e senha não podem ser iguais.");
			System.out.println("Digite sua id:");
			id = key.next();
			System.out.println("Digite sua senha:");
			senha = key.next();
		}
		if (!id.equalsIgnoreCase(senha)) {
			System.out.println("Cadastrado com sucesso!");
		}

	}

}
