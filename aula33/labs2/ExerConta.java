package com.valerio.cursojava.aula33.labs2;

public class ExerConta {

	public static void main(String[] args) {
		Conta c = new Conta();

		c.setNome("José Valério");
		c.setConta(7574);
		c.setEspecial(true);
		c.setLimite(200);
		c.setSaldo(30);
		
		c.sacarDinheiro();
	}
}
