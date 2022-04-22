package com.valerio.cursojava.aula36.labs3Exer01;

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

	void cadastrarContato(Agenda a) {	
		Contato contato1 = definirContato(new Contato());
		a.setContatos(contato1);
		a.setContatos(definirContato(new Contato()));
		a.setContatos(definirContato(new Contato()));
		
		/*a.setContatos(definirContato(new Contato()), 0);
		a.setContatos(definirContato(new Contato()), 1);
		a.setContatos(definirContato(new Contato()), 2);*/
	}

	Contato definirContato(Contato c) {
		c.setNome(typeText("Digite o nome do contato: "));
		c.setEmail(typeText("Digite o e-mail: "));
		c.setTelefone(typeText("Digite o nº do telefone: "));
		return c;
	}

}
