package com.valerio.cursojava.aula34;

public class ExerCalculadora {

	static void showNum(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		showNum(Calculadora.somarNum(15, 15));

		showNum(Calculadora.subtrairNum(20, 15));

		showNum(Calculadora.dividirNum(50, 3));

		showNum(Calculadora.elevarNum(4, 4));

		showNum(Calculadora.fatorarNum(5));
	}
}
