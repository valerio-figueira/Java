package com.valerio.cursojava.aula43.labsExer03;

public class Alado extends Animal {
	private String ambiente;

	Alado() {
		super();
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String toString() {
		String description = "\nNome: " + getNome();
		description += "\nTipo: " + getTipo();
		description += "\nCor: " + getCor();
		description += "\nComprimento: " + getComprimento() + " cm";
		description += "\nVelocidade: " + getVelocidade() + " m/s";
		description += "\nAmbiente: " + this.getAmbiente();
		return description;
	}
}
