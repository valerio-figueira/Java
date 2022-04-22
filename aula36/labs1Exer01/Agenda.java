package com.valerio.cursojava.aula36.labs1Exer01;

public class Agenda {
	private String nome;
	private Contato[] contato;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContato() {
		return contato;
	}

	public void setContato(Contato[] contato) {
		this.contato = contato;
	}

	public String getInfo() {
		String info = "Nome da Agenda: " + nome + "\n";
		for (Contato c : contato) {
			info += c.getInfo();
		}
		return info;
	}
}
