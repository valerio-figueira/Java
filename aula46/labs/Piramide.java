package com.valerio.cursojava.aula46.labs;

public class Piramide extends Figura3D {
	private double arestas;
	private double arestaBase;
	private double apotemaBase;
	private double apotemaLateral;
	private double altura;	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getArestas() {
		return arestas;
	}

	public void setArestas(double arestas) {
		this.arestas = arestas;
	}

	public double getApotemaBase() {
		return apotemaBase;
	}

	public void setApotemaBase(double apotemaBase) {
		this.apotemaBase = apotemaBase;
	}

	public double getApotemaLateral() {
		return apotemaLateral;
	}

	public void setApotemaLateral(double apotemaLateral) {
		this.apotemaLateral = apotemaLateral;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		double areaBase = Math.pow(arestaBase, 2);
		return (areaBase * altura) / 3;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double areaLateral = arestas * ((arestaBase * apotemaLateral) / 2);
		double areaBase = Math.pow(arestaBase, 2);
		return areaBase + areaLateral;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\n¿rea da pir‚mide: " + calcularArea();
		return s += "\nVolume da pir‚mide: " + calcularVolume();
	}

}
