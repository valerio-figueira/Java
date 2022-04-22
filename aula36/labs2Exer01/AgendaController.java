package com.valerio.cursojava.aula36.labs2Exer01;

import java.util.Scanner;

public class AgendaController {
	Scanner scanner;

	AgendaController(Scanner scanner) {
		this.scanner = scanner;
	}

	AgendaController() {
		this(new Scanner(System.in));
	}

	String typeText(String text) {
		System.out.print(text);
		return scanner.nextLine();
	}

	Agenda cadastrarContato(Agenda a) {
		Contato[] contato = new Contato[2];
		for (int i = 0; i < contato.length; i++) {
			Contato c = new Contato();
			c.setNome(typeText("Digite o nome do contato: "));
			c.setEmail(typeText("Digite o e-mail: "));
			c.setTelefone(typeText("Digite o telefone: "));
			contato[i] = c;
		}
		a.setContato(contato);
		return a;
	}

	Contato definirInformacoes(Contato c) {
		c.setNome(typeText("Digite o nome: "));
		c.setEmail(typeText("Digite o e-mail: "));
		c.setTelefone(typeText("Digite o telefone: "));
		return c;
	}
}
