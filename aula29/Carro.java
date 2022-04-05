package com.valerio.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	Carro() {
		numPassageiros = 4;
		System.out.println("A classe Carro foi instanciada.");
	}

	Carro(String marca) {
		this.marca = marca;
	}
}
