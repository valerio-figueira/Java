package com.valerio.cursojava.aula27v4;

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
					System.out.println("Está usando limite especial");
					return true;
				} else {
					System.out.println("Sem limite especial");
					return false;
				}
			} else {
				System.out.println("A conta não é especial.");
				return false;
			}
		}
	}
}
