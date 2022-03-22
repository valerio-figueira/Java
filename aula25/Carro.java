package com.valerio.cursojava.aula25;

public class Carro { // define o objeto
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void/* tipo do método e a seguir o nome do método */ exibirAutonomia(/* parâmetros: argumentos */) {
		/* bloco de códigos */
		System.out.println("A autonomia do carro é de: " + capCombustivel * consumoCombustivel + " km");
	}
}