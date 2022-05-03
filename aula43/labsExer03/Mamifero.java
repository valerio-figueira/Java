package com.valerio.cursojava.aula43.labsExer03;

public class Mamifero extends Terrestre {
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String toString() {
		String description = super.toString();
		description += "\nAmbiente: " + this.getAmbiente();
		description += "\nAlimento: " + this.getAlimento();
		return description;
	}
}
