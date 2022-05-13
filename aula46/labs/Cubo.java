package com.valerio.cursojava.aula46.labs;

public class Cubo extends Figura3D {
	private final double ARESTAS = 6;
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getARESTAS() {
		return ARESTAS;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 3);
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2) * ARESTAS;
	}
	@Override
	public String toString() {
		String s = super.toString();
		s += "\n¿rea do cubo: " + calcularArea();
		return s += "\nVolume do cubo: " + calcularVolume();
	}

}
