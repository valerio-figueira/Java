package com.valerio.cursojava.aula36.labs3Exer01ArrayList;

import java.util.ArrayList;

public class Agenda {
	private String agendaNome;
	private ArrayList<Contato> contato;

	public String getAgendaNome() {
		return this.agendaNome;
	}

	public void setAgendaNome(String agendaNome) {
		this.agendaNome = agendaNome;
	}

	public ArrayList<Contato> getContatos() {
		return this.contato;
	}

	public void setContato(ArrayList<Contato> contato) { // utilizei para definir o construtor no método
															// cadastrarContato
		this.contato = contato;
	}

	public void setContatos(Contato contato) {
		this.contato.add(contato);
	}
}
