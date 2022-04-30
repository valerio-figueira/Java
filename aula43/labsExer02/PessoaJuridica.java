package com.valerio.cursojava.aula43.labsExer02;

public class PessoaJuridica extends Contribuinte {
	private double proventos;
	private double percentual;

	public double getRendaBruta() {
		return proventos;
	}

	public void setRendaBruta(double proventos) {
		this.proventos = proventos;
	}

	public double calcularIR() {
		this.percentual = 10;
		double imposto = (proventos * percentual) / 100;
		return imposto;
	}
	
	@Override
	public String toString() {
		String desc = "\nNome: " + super.getNome() + " - Pessoa Jurídica";
		desc += "\nRenda Bruta: R$" + this.proventos;
		desc += "\nImposto a pagar: R$" + calcularIR() + " - " + this.percentual + "%";
		return desc;
	}
}
