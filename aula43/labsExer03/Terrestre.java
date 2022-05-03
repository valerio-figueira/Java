package com.valerio.cursojava.aula43.labsExer03;

public class Terrestre extends Animal {
	private String ambiente;

	Terrestre() {
		super();
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String toString() {
		String description = super.toString();
		description += "\nAmbiente: " + this.getAmbiente();
		return description;
	}
}
