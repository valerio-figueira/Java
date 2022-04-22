package com.valerio.cursojava.aula36.labs1Exer01;

import java.util.Scanner;

public class TesteAgenda {

	static String typeText(String text) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print(text);
		return scanner.nextLine();
	}

	static void showText(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		Agenda a = new Agenda();
		Contato[] contato = new Contato[2];

		for (int i = 0; i < contato.length; i++) {
			Contato c = new Contato();
			c.setNome(typeText("Digite o " + (i + 1) + "º nome: "));
			c.setEmail(typeText("Digite o e-mail: "));
			c.setTelefone(typeText("Digite o telefone: "));
			contato[i] = c;
		}
		a.setContato(contato);

		typeText(a.getInfo());
	}

}
