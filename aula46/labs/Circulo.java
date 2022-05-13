package com.valerio.cursojava.aula46.labs;

public class Circulo extends Figura2D {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {
		String s = super.toString();
		return s += "\nÀrea do círculo: " + calcularArea();
	}

}
