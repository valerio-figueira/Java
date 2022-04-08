package com.valerio.cursojava.aula33.labs;

public class Lampada {
	private boolean ligar;

	public boolean isLigar() {
		return this.ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	public boolean ligar() {
		return this.ligar = true;
	}

	public boolean desligar() {
		return this.ligar = false;
	}

	public void mudarEstado() {
		if (isLigar()) {
			desligar();
		} else {
			ligar();
		}
	}

	public void showStatus() {
		if (isLigar()) {
			System.out.println("Está ligada");
		} else {
			System.out.println("Está desligada");
		}
	}
}
