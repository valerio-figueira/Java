package com.valerio.cursojava.ContaCorrente;

import java.util.Scanner;

public class ContaController {
	Scanner scanner;

	ContaController(Scanner scanner) {
		this.scanner = scanner;
	}

	ContaController() {
		this(new Scanner(System.in));
	}

	int typeNum(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	boolean sacarDinheiro(Conta c) {
		c.saque = typeNum("Digite o valor do saque: ");
		if (c.saldo >= c.saque) {
			c.saldo -= c.saque;
			System.out.println("Limite: " + c.limite);
			System.out.println("Saldo: " + c.saldo);
			return true;
		} else {
			if (c.especial) {
				c.limite = c.limite + c.saldo; // utiliza o restante do saldo
				if (c.limite >= c.saque) {
					c.limite -= c.saque;
					c.saldo -= c.saque;
					System.out.println("Limite: " + c.limite);
					System.out.println("Saldo: " + c.saldo);
					return true;
				} else {
					System.out.println("Limite insuficiente para saque.");
					return false;
				}
			} else {
				System.out.println("Conta não é especial.");
				return false;
			}
		}
	}

	double depositarVerba(Conta c) {
		c.deposito = typeNum("O valor do depósito: ");
		return c.saldo += c.deposito;
	}

	String consultarProventos(Conta c) {
		String status = "Saldo: " + c.saldo;
		System.out.println(status);
		return status;
	}
}
