package com.valerio.cursojava.aula36.labs3Exer01;

public class TesteAgenda {
	public static void getResult(String content) {
		System.out.println(content);
	}

	public static void main(String[] args) {
		AgendaController ac = new AgendaController();
		Agenda a = new Agenda();

		ac.cadastrarContato(a);
		
		for (int i = 0; i < a.getContatos().size(); i++) {
			Contato contato = a.getContatos().get(i);
			System.out.println(contato);
		}

		/*
		 * if (ac != null) { ac.showContato(a.getContatos()[0]);
		 * ac.showContato(a.getContatos()[1]); ac.showContato(a.getContatos()[2]); }
		 */
	}
}