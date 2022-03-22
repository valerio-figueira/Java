package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite sua primeira nota: ");
		double nota1 = key.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = key.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media <10) {System.out.println("Aprovado!");}
		else if(media < 7) {System.out.println("Reprovado!");}
		else if(media == 10) {System.out.println("Aprovado com distinção!");}
		
		
	}

}
