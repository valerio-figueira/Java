package com.valerio.cursojava.aula30;

public class Carro {
	String marca;
	String modelo;
	String ano;
	int numPassageiros;

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com três parâmetros.");
	}

	public Carro(String ano) {
		this("Fiat", "Ducate", 10); /* referenciar um construtor dentro de outro */
		this.ano = ano;
		System.out.println("Chamando construtor com dois parâmetros.");
	}

	public Carro() {
		this("2004");
	}
}