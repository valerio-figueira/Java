package com.valerio.cursojava.aula43.labsExer03;

public class Aquatico extends Animal {
	private String ambiente;
	private String caracteristica;

	Aquatico() {
		super();
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String toString() {
		String description = super.toString();
		description += "\nAmbiente: " + this.getAmbiente();
		description += "\nCaracterística: " + this.getCaracteristica();
		return description;
	}
}
