package com.valerio.cursojava.aula43.labsExer01;

public class ContaPoupança extends ContaBancaria {
	private double rendimento;

	public double getSaldo() {
		return super.getSaldo();
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double diaRendimento) {
		this.rendimento = diaRendimento;
	}

	public double atualizarSaldo(double taxa) {
		taxa = taxa / 100;
		this.setRendimento(super.getSaldo() * taxa);
		super.setSaldo(super.getSaldo() + getRendimento());
		return super.getSaldo();
	}

	public String toString() {
		String description = super.toString();
		description += "\nRendimento Diário: R$" + rendimento;
		return description;
	}
}
