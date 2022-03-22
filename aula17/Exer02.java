package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String id, senha;
		boolean idSenha = false;

		System.out.println("Cadastre sua ID:");
		id = key.next();
		System.out.println("Cadastre sua senha:");
		senha = key.next();

		while (!idSenha) {
			if (!id.equalsIgnoreCase(senha)) {
				idSenha = true;
				System.out.println("Parabéns! Você está cadastrado em nossa lista.");
			} else {
				System.out.println("A senha não pode ser igual a ID!");
				System.out.println("Cadastre sua ID:");
				id = key.next();
				System.out.println("Cadastre sua senha:");
				senha = key.next();
			}
		}

	}

}
