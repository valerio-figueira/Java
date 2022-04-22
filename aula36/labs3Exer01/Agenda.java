package com.valerio.cursojava.aula36.labs3Exer01;

import java.util.ArrayList;

public class Agenda {
	private String agendaNome;
	private ArrayList<Contato> contato = new ArrayList<Contato>();

	public String getAgendaNome() {
		return this.agendaNome;
	}

	public void setAgendaNome(String agendaNome) {
		this.agendaNome = agendaNome;
	}

	public ArrayList<Contato> getContatos() {
		return this.contato;
	}

	public void setContatos(Contato contato) {
		this.contato.add(contato);
	}
}
