package com.valerio.cursojava.aula46.labs;

public class Quadrado extends Figura2D {
	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		return s += "\n¿rea do quadrado: " + calcularArea();
	}
	
}
