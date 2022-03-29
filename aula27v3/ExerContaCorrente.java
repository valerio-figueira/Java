package com.valerio.cursojava.aula27v3;

import java.util.Scanner;

public class ExerContaCorrente {

	public static void main(String[] args) {
		ContaController cc = new ContaController(new Scanner(System.in));
		ContaCorrente c = new ContaCorrente();

		c.conta = 7574;
		c.nome = "José Valério";
		c.saldo = 30;
		c.especial = true;
		c.limite = 200;

		while (true) {
			cc.showHome(c);
			switch (c.menu) {
			case 1: {
				cc.sacarSaldo(c);
				System.out.println("Saldo: " + c.saldo);
				System.out.println("Limite: " + c.limite);
				break;
			}
			case 2: {
				c.saldo = cc.depositarDin(c);
				System.out.println("Saldo: " + c.saldo);
				break;
			}
			case 3: {
				cc.consultarSaldo(c);
				break;
			}
			}
		}
	}
}
