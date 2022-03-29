package com.valerio.cursojava.aula27v2;

import java.util.Random;
import java.util.Scanner;

public class ContaCorrenteController {
	Scanner input;
	Random random;

	public ContaCorrenteController(Scanner input, Random random) {
		this.input = input;
		this.random = random;		
	}

	int typeNum(String text) {
		System.out.print(text);
		return input.nextInt();		
	}

	boolean sacarSaldo(ContaCorrente cc) {
		cc.saque = typeNum("Digite o valor a sacar: ");
		if (cc.saldo >= cc.saque) {
			cc.saldo -= cc.saque;
			return true;
		} else {
			if (cc.especial) {
				cc.limite = cc.limite + cc.saldo; //utiliza o restante do saldo
				if (cc.limite >= cc.saque) {
					cc.saldo -= cc.saque;
					return true;
				}
			} else {
				System.out.println("Sua conta não é especial.");
				return false;
			}
		}
		return false;
	}
}
