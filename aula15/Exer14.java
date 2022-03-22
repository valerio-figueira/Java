package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite sua primeira nota: ");
		double nota1 = key.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = key.nextDouble();
		double media = (nota1 + nota2) / 2;

		if (media >= 9.0 && media <= 10.0) {
			System.out.println("A - Aprovado.");
			System.out.println("Notas: "+nota1+" e "+nota2);
			System.out.println("Média: "+media);
		} else if (media >= 7.5 && media < 9.0) {
			System.out.println("B - Aprovado.");
			System.out.println("Notas: "+nota1+" e "+nota2);
			System.out.println("Média: "+media);
		} else if (media >= 6.0 && media < 7.5) {
			System.out.println("C - Aprovado.");
			System.out.println("Notas: "+nota1+" e "+nota2);
			System.out.println("Média: "+media);
		} else if (media >= 4.0 && media < 6.0) {
			System.out.println("D - Reprovado.");
			System.out.println("Notas: "+nota1+" e "+nota2);
			System.out.println("Média: "+media);
		} else if (media < 4.0 && media >= 0) {
			System.out.println("E - Reprovado.");
			System.out.println("Notas: "+nota1+" e "+nota2);
			System.out.println("Média: "+media);
		} else {
			System.out.println("Nota inválida.");
		}
	}

}
