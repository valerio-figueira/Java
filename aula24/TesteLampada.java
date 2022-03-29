package com.valerio.cursojava.aula24;

public class TesteLampada {
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		lamp.brand = "Elgin";
		lamp.model = "E710";
		lamp.type = new String[4];
		lamp.colour = "Branca";
		lamp.potency = 9;
		lamp.energy = "Bivolt";
		lamp.price = 34.90;
		lamp.type[0] = "Led";
	}
}