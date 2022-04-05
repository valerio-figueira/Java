package com.valerio.cursojava.aula29;

import com.valerio.cursojava.aula24.Carro;

public class Construtores {
	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 5;
	}
}