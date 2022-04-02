package com.valerio.cursojava.aula27v4;

import java.util.Scanner;

public class ExerConta {

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente();
		ContaController cc = new ContaController(new Scanner(System.in));

		c.conta = 7574;
		c.nome = "Valério Figueira";
		c.saldo = 30;
		c.limite = 200;
		c.especial = true;

		if (cc.sacarSaldo(c)) {
			System.out.println("Saldo: " + c.saldo);
			System.out.println("Limite: " + c.limite);
		}
	}
}
