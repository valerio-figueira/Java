package com.valerio.cursojava.aula43.labsExer02;

public abstract class Contribuinte {
	private String nome;

	Contribuinte() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularIR();

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + " - Pessoa Física";
	}
}
