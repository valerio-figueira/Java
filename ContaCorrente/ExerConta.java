package com.valerio.cursojava.ContaCorrente;

public class ExerConta {

	public static void main(String[] args) {
		Conta c = new Conta();
		ContaController cc = new ContaController();

		c.especial = true;
		c.limite = 200;
		c.saldo = 30;

		cc.sacarDinheiro(c);
		cc.depositarVerba(c);
		cc.consultarProventos(c);
	}
}
