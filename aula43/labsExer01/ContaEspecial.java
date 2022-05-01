package com.valerio.cursojava.aula43.labsExer01;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	ContaEspecial() {
		super();
	}

	public double getSaldo() {
		return super.getSaldo();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean sacarDinheiro(double saque) {
		if (super.getSaldo() >= saque) {
			super.setSaldo(super.getSaldo() - saque);
			return true;
		} else {
			if (super.getSaldo() + this.limite >= saque) {
				this.limite = (getSaldo() + this.limite) - saque;
				super.setSaldo(getSaldo() - saque);
				return true;
			} else {
				return false;
			}
		}

	}

	public String toString() {
		String description = super.toString();
		description += "\nLimite Especial: R$" + this.limite;
		return description;
	}
}
