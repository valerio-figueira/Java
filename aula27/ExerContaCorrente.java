package com.valerio.cursojava.aula27;

import java.util.Scanner;

public class ExerContaCorrente {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		boolean sair = false;
		cc.oid = 1;
		cc.conta = 1565;
		cc.nome = "José Valério";
		cc.especial = true;
		cc.saldo = 0;
		cc.saldoEspecial = 200;

		int menu = cc.home(0);

		while (true) {
			switch (menu) {
			case 1: {
				cc.saldo = cc.sacarDinheiro(cc.saldo);
				menu = cc.home(0);
				break;
			}
			case 2: {
				cc.saldo = cc.depositarDinheiro(cc.saldo);
				menu = cc.home(0);
				break;
			}
			case 3: {
				cc.consultarSaldo();
				menu = cc.home(0);
				break;
			}
			}
		}
	}
}