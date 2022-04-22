package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class Exer04 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Olá, seja Bem-vindo!");
		System.out.println("Vamos calcular a sua média bimestral? :)");
		System.out.println("Digite sua primeira nota: ");
		double nota1 = key.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = key.nextDouble();
		System.out.println("Digite sua terceira nota: ");
		double nota3 = key.nextDouble();
		System.out.println("Digite sua quarta nota: ");
		double nota4 = key.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Sua média bimestral é: " + media);

	}

}
