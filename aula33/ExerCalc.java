package com.valerio.cursojava.aula33;

public class ExerCalc {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		c.soma(1, 2);
		c.soma(5.5, 6.5);
		c.soma(new int[5]);
	}
}
