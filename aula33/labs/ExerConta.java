package com.valerio.cursojava.aula33.labs;

public class ExerConta {

	public static void main(String[] args) {
		Conta c = new Conta();
		ContaController cc = new ContaController();

		c.setNome("José Valério");
		c.setConta(7574);
		c.setEspecial(true);
		c.setLimite(200);
		c.setSaldo(30);

		if (c.isEspecial()) {
			System.out.println("Sua conta é especial");
		} else {
			System.out.println("Sua conta não é especial");
		}

		cc.sacarDinheiro(c);
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Limite: " + c.getLimite());

		cc.depositarDinheiro(c);
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Limite: " + c.getLimite());

		cc.consultarSaldo(c);
	}
}
