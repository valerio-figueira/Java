package com.valerio.cursojava.aula13;
import java.util.Scanner;
public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		System.out.println("Este é um programa para calcular a área de um circunferência a partir do raio.");
		System.out.println("Digite o raio da circunferência: ");
		double raio = key.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("Área do círculo é: " + area);
	}

}