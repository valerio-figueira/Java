package com.valerio.cursojava.aula44;

public abstract class Animal {
	private String nome;
	private String especie;
	private String nomeCientifico;
	private String ambiente;
	private String cor;

	abstract void emitirSom();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getEspécie() {
		return especie;
	}

	public void setEspécie(String especie) {
		this.especie = especie;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public String toString() {
		String description = "\nNome: " + this.nome;
		description += "\nEspécie: " + this.especie;
		description += "\nNome Científico: " + this.nomeCientifico;
		return description += "\nCor: " + this.cor;
	}
}