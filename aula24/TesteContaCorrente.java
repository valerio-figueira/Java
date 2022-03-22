package com.valerio.cursojava.aula24;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.conta = "102356";
		conta.agencia = "1121";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = 1212.00;
	}
}
