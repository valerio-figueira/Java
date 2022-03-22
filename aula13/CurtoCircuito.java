package com.valerio.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro; //analisa as duas variáveis
		boolean resultado2 = falso && verdadeiro; //analisa apenas a primeira
		System.out.println(resultado1);
		System.out.println(resultado2);

		int resultado = 1 + 1 - 1 + 1 * 1 / 1; //primeiro multiplicação e divisão
		System.out.println(resultado);
		
	}

}
