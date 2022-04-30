package com.valerio.cursojava.aula43.labs;

public class Test {

	static void printDescription(String description) {
		System.out.println(description);
	}

	public static void main(String[] args) {
		ContaEspecial ce = new ContaEspecial();
		Controller c = new Controller();

		// Audi, fili mi, verba sapientium et aenigmata eorum.

		ce.setNome(c.setName());
		ce.setConta(c.setAccount());
		ce.setSaldo(120);
		ce.setLimite(200);

		ce.sacarDinheiro(50);
		ce.sacarDinheiro(80);
		ce.depositarDinheiro(20);

		printDescription(ce.toString());

		ContaPoupança cp = new ContaPoupança();
		cp.setNome("Percival");
		cp.setConta(3806);
		cp.setSaldo(1350);
		cp.atualizarSaldo(0.2); // 0.2%

		printDescription(cp.toString());

		ContaBancaria cb = new ContaBancaria();
		cb.setNome("Dulcinéia");
		cb.setConta(3807);
		cb.setSaldo(130);

		cb.sacarDinheiro(131);

		printDescription(cb.toString());
	}
}
