package com.valerio.cursojava.aula43.labs;

public class ContaBancaria {
	private String nome;
	private int conta;
	private double saldo;

	ContaBancaria() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacarDinheiro(double saque) {
		if (saldo >= saque) {
			this.saldo -= saque;
			return true;
		} else {
			return false;
		}
	}

	public void depositarDinheiro(double valor) {
		this.saldo += valor;
	}

	public void printText(String text) {
		System.out.println(text);
	}

	public String toString() {
		String description = "\nNome: " + this.nome;
		description += "\nNúmero da Conta: " + this.conta;
		description += "\nSaldo: R$" + this.saldo;
		return description;
	}
}
