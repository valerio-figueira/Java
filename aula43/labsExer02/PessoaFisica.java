package com.valerio.cursojava.aula43.labsExer02;

public class PessoaFisica extends Contribuinte {
	private double proventos;
	private int percentual;

	public double getRendaBruta() {
		return proventos;
	}

	public void setRendaBruta(double rendaBruta) {
		this.proventos = rendaBruta;
	}

	public double calcularIR() {
		double imposto = 0;
		if (proventos <= 1400) {
			percentual = 0;
			imposto = (proventos * percentual) / 100;
		} else if (proventos > 1400 && proventos <= 2100) {
			percentual = 10;
			imposto = (proventos * percentual) / 100;
		} else if (proventos > 2100 && proventos <= 2800) {
			percentual = 15;
			imposto = (proventos * percentual) / 100;
		} else if (proventos > 2800 && proventos <= 3600) {
			percentual = 25;
			imposto = (proventos * percentual) / 100;
		} else {
			percentual = 30;
			imposto = (proventos * percentual) / 100;
		}
		return imposto;
	}

	@Override
	public String toString() {
		String desc = "\nNome: " + super.getNome() + " - Pessoa Física";
		desc += "\nRenda Bruta: R$" + this.proventos;
		desc += "\nImposto a pagar: R$" + calcularIR() + " - " + this.percentual + "%";
		return desc;
	}
}
