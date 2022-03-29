package com.valerio.cursojava.aula27v3;

import java.util.Scanner;

public class ContaController {
	Scanner input;

	public ContaController(Scanner input) {
		this.input = input;
	}

	int typeNum(String text) {
		System.out.print(text);
		return input.nextInt();
	}

	boolean sacarSaldo(ContaCorrente c) {
		c.saque = typeNum("Digite o valor do saque: ");
		if (c.saldo >= c.saque) {
			c.saldo -= c.saque;
			return true;
		} else {
			if (c.especial) {
				c.limite = c.limite + c.saldo;
				if (c.limite >= c.saque) {
					c.limite -= c.saque;
					c.saldo -= c.saque;
					return true;
				} else {
					System.out.println("Conta sem fundo.");
					return false;
				}
			} else {
				System.out.println("Não é especial.");
				return false;
			}
		}
	}

	double depositarDin(ContaCorrente c) {
		c.deposito = typeNum("Digite o valor do depósito: ");
		return c.deposito + c.saldo;
	}

	void consultarSaldo(ContaCorrente c) {
		System.out.println("Saldo: " + c.saldo);
		System.out.println("Limite Especial: " + c.limite);
	}

	void showHome(ContaCorrente c) {
		c.status = "";
		do {
			c.status += ":::::::::::::::: HOME ::::::::::::::::\n";
			c.status += "1 - Saque | 2 - Depósito | 3 - Consulta";
			System.out.println(c.status);
			c.menu = typeNum("Digite uma opção: ");
		} while (c.menu < 1 || c.menu > 3);
	}
}
