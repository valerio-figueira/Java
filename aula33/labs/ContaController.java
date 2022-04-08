package com.valerio.cursojava.aula33.labs;

import java.util.Scanner;

public class ContaController {
	Scanner scanner;

	ContaController(Scanner scanner) {
		this.scanner = scanner;
	}

	ContaController() {
		this(new Scanner(System.in));
	}

	double typeNum(String text) {
		System.out.print(text);
		return scanner.nextDouble();
	}

	boolean sacarDinheiro(Conta c) {
		c.setSaque(typeNum("Digite o valor do saque: "));
		if (c.getSaldo() >= c.getSaque()) {
			c.setSaldo(c.getSaldo() - c.getSaque());
			return true;
		} else {
			if (c.isEspecial()) {
				c.setLimite(c.getLimite() + c.getSaldo());
				if (c.getLimite() >= c.getSaque()) {
					c.setLimite(c.getLimite() - c.getSaque());
					c.setSaldo(c.getSaldo() - c.getSaque());
					return true;
				} else {
					System.out.println("Sem limite suficiente para o saque");
					return false;
				}
			} else {
				System.out.println("Não é especial");
				return false;
			}
		}
	}

	double depositarDinheiro(Conta c) {
		c.setDeposito(typeNum("Digite o valor do depósito: "));
		c.setSaldo(c.getDeposito() + c.getSaldo());
		return c.getSaldo();
	}

	void consultarSaldo(Conta c) {
		System.out.println("Consulta do Saldo: " + c.getSaldo());
	}
}
