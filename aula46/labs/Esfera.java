package com.valerio.cursojava.aula46.labs;

public class Esfera extends Figura3D {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return (4 / 3) * (raio * Math.PI);
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (4 * Math.PI) * Math.pow(raio, 2);
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\n¿rea da esfera: " + calcularArea();
		return s += "\nVolume da esfera: " + calcularVolume();
	}

}
