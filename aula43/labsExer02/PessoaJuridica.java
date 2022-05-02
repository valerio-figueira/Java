package com.valerio.cursojava.aula43.labsExer02;

public class PessoaJuridica extends Contribuinte {
	private double proventos;
	private final double percentual = 10;

	public double getRendaBruta() {
		return proventos;
	}

	public void setRendaBruta(double proventos) {
		this.proventos = proventos;
	}

	public double calcularIR() {
		double imposto = (proventos * percentual) / 100;
		return imposto;
	}

	@Override
	public String toString() {
		String desc = super.toString();
		desc += "\nRenda Bruta: R$" + this.proventos;
		desc += "\nImposto a pagar: R$" + calcularIR() + " - " + this.percentual + "%";
		return desc;
	}
}
