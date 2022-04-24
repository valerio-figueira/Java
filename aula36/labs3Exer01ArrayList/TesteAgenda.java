package com.valerio.cursojava.aula36.labs3Exer01ArrayList;

public class TesteAgenda {
	public static void getResult(String content) {
		System.out.println(content);
	}

	public static void main(String[] args) {
		AgendaController ac = new AgendaController();
		Agenda a = new Agenda();

		ac.cadastrarContato(a);

		if (a.getContatos() != null) {
			for (int i = 0; i < a.getContatos().size(); i++) {
				Contato contato = a.getContatos().get(i);
				System.out.println(contato);
			}
		}
	}
}