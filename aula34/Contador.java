package com.valerio.cursojava.aula34;

public class Contador {

	private static int subir;
	
	Contador(){
		subir++;
	}

	static int subirContador() {
		return subir++;
	}

	static int zerarContador() {
		return subir = 0;
	}

	static int obterContador() {
		return subir;
	}
}
