package com.valerio.cursojava.aula36.labs3Exer01ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaController {
	Scanner scanner = new Scanner(System.in);

	String typeText(String text) {
		System.out.print(text);
		return scanner.nextLine();
	}

	void showContato(Contato c) {
		System.out.println(c);
	}

	Agenda cadastrarContato(Agenda a) {
		a.setContato(new ArrayList<Contato>());
		for (int i = 0; i < 2; i++) {
			a.setContatos(definirContato(new Contato()));
		}
		return a;
	}

	Contato definirContato(Contato c) {
		do {
			c.setNome(typeText("Digite o nome do contato: "));
		} while (c.getNome().length() > 50);
		do {
			c.setEmail(typeText("Digite o e-mail: "));
		} while (c.getEmail().length() > 50);
		do {
			c.setTelefone(typeText("Digite o nº do telefone: "));
		} while (c.getTelefone().length() > 10);
		return c;
	}

}
