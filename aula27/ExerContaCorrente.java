package com.valerio.cursojava.aula27;

public class ExerContaCorrente {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.conta = 1565;
		cc.nome = "José Valério";
		cc.especial = true;
		cc.saldo = 0;
		cc.saldoEspecial = 200;
		cc.menu = cc.home();

		while (true) {
			switch (cc.menu) {
			case 1: {
				cc.saldo = cc.sacarDinheiro(0);
				cc.menu = cc.home();
				break;
			}
			case 2: {
				cc.saldo = cc.depositarDinheiro(0);
				cc.menu = cc.home();
				break;
			}
			case 3: {
				cc.consultarSaldo();
				cc.menu = cc.home();
				break;
			}
			}
		}
	}
}