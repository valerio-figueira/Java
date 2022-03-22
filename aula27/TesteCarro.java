package com.valerio.cursojava.aula27;

import com.valerio.cursojava.aula27.Carro;

public class TesteCarro {
	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		System.out.println(van);

		double autonomia = van.obterAutonomia();
		// System.out.println("Autonomia do carro é: " + van.obterAutonomia());
		System.out.println("Autonomia do carro é: " + autonomia);
		System.out.println("Consumo de gasolina a cada 10Km é de: " + van.calcularCombustivel(10) + "L");
	}
}