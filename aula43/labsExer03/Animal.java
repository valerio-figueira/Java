package com.valerio.cursojava.aula43.labsExer03;

public abstract class Animal {
	private String nome;
	private String tipo;
	private String cor;
	private double comprimento;
	private double velocidade;

	public Animal() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public String toString() {
		String description = "\nAnimal: " + getNome();
		description += "\nTipo: " + getTipo();
		description += "\nCor: " + getCor();
		description += "\nComprimento: " + getComprimento() + " cm";
		description += "\nVelocidade: " + getVelocidade() + " m/s";
		return description;
	}
}
