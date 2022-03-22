package com.valerio.cursojava.aula26;

public class Carro { // define o objeto
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	double obterAutonomia() {
		System.out.println("O método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel; // retorna resultado para classe TesteCarro
	}
}