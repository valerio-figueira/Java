package com.valerio.cursojava.aula29;

public class ExerCarro {

	public static void main(String[] args) {
		Carro van = new Carro();

		van.marca = "Fiat 1";
		van.modelo = "Ducato";
		// van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 5;

		System.out.println(van.numPassageiros);

		Carro van_marca = new Carro("Fiat 2");

		van_marca.modelo = "Ducato";
		System.out.println(van_marca.marca);
	}
}
