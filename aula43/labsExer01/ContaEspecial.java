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
				super.setSaldo(0);
				return true;
			}
			return false;
		}
	}

	public String toString() {
		String description = "\nNome: " + super.getNome();
		description += "\nNúmero da Conta: " + super.getConta();
		description += "\nSaldo: R$" + super.getSaldo();
		description += "\nLimite Especial: R$" + this.limite;
		return description;
	}
}
