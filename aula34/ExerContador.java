package com.valerio.cursojava.aula34;

public class ExerContador {

	static void showNum(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		showNum(Contador.subirContador());
		
		showNum(Contador.subirContador());
		
		showNum(Contador.zerarContador());	
		
		/*
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		*/
		
		//A instância compartilha do mesmo atributo
	}
}
