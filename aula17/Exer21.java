package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int turma = 0, alunos = 0, cont = 1, i, media = 0;
		
		while(turma < 3) {
		System.out.println("Digite a quantidade de turmas:");
		turma = key.nextInt();
		}
		for (; cont <= turma; cont++) {
			System.out.println("Digite a quantidade de alunos da " + cont + "ª turma:");
			alunos = key.nextInt();

			while (alunos > 40) {
				System.out.println("Digite a quantidade de alunos da " + cont + "ª turma novamente:");
				alunos = key.nextInt();
			}
			media += alunos;
			if (alunos <= 40 && cont == turma) {
				media = media / turma;
				System.out.println("A média é de " + media + " alunos por turma.");
			}
		}
	}
}