package com.valerio.cursojava.ContaCorrente;

public class Conta {
	String nome;
	int conta;
	double saldo;
	double saque;
	double limite;
	double deposito;
	boolean especial;

	public Conta(String nome, int conta, boolean especial) {
		this.nome = nome;
		this.conta = conta;
		this.especial = especial;
	}

	public Conta() {
		this("Valério Figueira", 7475, true);
	}
}
