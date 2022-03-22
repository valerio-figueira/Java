package com.valerio.cursojava.aula27;

public class Carro { /* Declaração do objeto. */
	String marca; // Declaração dos atributos do objeto.
	String modelo; // Declaração dos atributos do objeto.
	int numPassageiros; // Declaração dos atributos do objeto.
	double capCombustivel; // Declaração dos atributos do objeto.
	double consumoCombustivel; // Declaração dos atributos do objeto.

	void/* Tipo do método. */ exibirAutonomia(/* Parâmetros: argumentos. */) {
		System.out.println("A autonomia do carro é de: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia/* Nome do método. */() {
		System.out.println("O método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel; // Retorna resultado para classe TesteCarro
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
}