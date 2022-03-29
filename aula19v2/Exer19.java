package com.valerio.cursojava.aula19v2;

public class Exer19 {
	public static void main(String[] args) {
		double nota1[] = new double[10];
		double nota2[] = new double[10];
		double result[] = new double[10];

		for (int i = 0; i < nota1.length; i++) {
			nota1[i] = (int) Math.round(Math.random() * 10);
			nota2[i] = (int) Math.round(Math.random() * 10);
			System.out.println(
					(i + 1) + "º valor da nota1: " + nota1[i] + " | " + (i + 1) + "º valor da nota2: " + nota2[i]);
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println("Resultado da média do " + (i + 1) + "º aluno: " + result[i]);
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] >= 7) {
				System.out.println("O " + (i + 1) + "º aluno foi aprovado.");
			} else {
				System.out.println("O " + (i + 1) + "º aluno foi reprovado.");
			}
		}
	}
}
