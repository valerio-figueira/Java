package com.valerio.cursojava.aula36.labs2Exer01;

public class TesteAgenda {

	static void showText(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		Agenda a = new Agenda();
		AgendaController ac = new AgendaController();
		
		ac.cadastrarContato(a, new Contato[2]);

		showText(a.getInfo());
	}
}
