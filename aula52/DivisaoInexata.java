package com.valerio.cursojava.aula52;

public class DivisaoInexata extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	private int den;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public DivisaoInexata(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + den + " não é um inteiro.";
	}

}
