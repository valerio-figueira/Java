package com.valerio.cursojava.aula33.labs;

public class ExerLamp {

	public static void main(String[] args) {
		Lampada l = new Lampada();

		l.mudarEstado();

		l.showStatus();

		l.mudarEstado();

		l.showStatus();

		/* OU */

		l.setLigar(true);
		l.showStatus();
		l.setLigar(false);
		l.showStatus();

	}
}
