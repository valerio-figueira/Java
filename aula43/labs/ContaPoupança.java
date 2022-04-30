package com.valerio.cursojava.aula43.labs;

public class ContaPoupança extends ContaBancaria {
	private double diaRendimento;

	public double getSaldo() {
		return super.getSaldo();
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public double atualizarSaldo(double taxa) {
		taxa = taxa / 100;
		this.setDiaRendimento(super.getSaldo() * taxa);
		super.setSaldo(super.getSaldo() + getDiaRendimento());
		return super.getSaldo();
	}

	public String toString() {
		String description = "\nNome: " + super.getNome();
		description += "\nNúmero da Conta: " + super.getConta();
		description += "\nSaldo: R$" + super.getSaldo();
		description += "\nRendimento Diário: R$" + diaRendimento;
		return description;
	}
}
