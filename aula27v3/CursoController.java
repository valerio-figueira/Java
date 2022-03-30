package com.valerio.cursojava.aula27v3;

import java.util.Random;
import java.util.Scanner;

public class CursoController {
	Scanner input;
	Random random;
	double soma;
	double media;

	public CursoController(Scanner input, Random random) {
		this.input = input;
		this.random = random;
	}

	String typeText(String text) {
		System.out.print(text);
		return input.nextLine();
	}

	int typeNum(String text) {
		System.out.print(text);
		return input.nextInt();
	}

	int gerarMatricula() {
		return random.nextInt(9999);
	}

	String[] definirDisciplinas(Curso c) {
		for (int i = 0; i < c.disciplina.length; i++) {
			c.disciplina[i] = typeText("A " + (i + 1) + "ª disciplina: ");
		}
		return c.disciplina;
	}

	double[][] definirNotas(Curso c) {
		for (int i = 0; i < c.notas.length; i++) {
			for (int j = 0; j < c.notas[i].length; j++) {
				c.notas[i][j] = typeNum("A " + (j + 1) + "ª nota (" + c.disciplina[i] + "): ");
			}
		}
		return c.notas;
	}

	boolean definirAprovacao(Curso c, int indice) {
		soma = 0;
		for (int i = 0; i < c.notas[indice].length; i++) {
			soma += c.notas[indice][i];
		}
		media = soma / c.notas[indice].length;
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

	double[][] showNotas(Curso c) {
		for (int i = 0; i < c.notas.length; i++) {
			System.out.print(c.disciplina[i] + ": ");
			for (int j = 0; j < c.notas[i].length; j++) {
				System.out.print(c.notas[i][j]);
				if (j == c.notas[i].length - 1) {
					System.out.print(".");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.print("\n");
		}
		return c.notas;
	}

	void showForm(Curso c) {
		System.out.println("Curso: " + c.curso + " | Nome: " + c.nome + " | Matrícula: " + c.matricula);
		System.out.println("Disciplinas: ");

		showNotas(c);

		for (int i = 0; i < c.disciplina.length; i++) {
			if (definirAprovacao(c, i)) {
				System.out.println(c.disciplina[i] + " - Aprovado");
			} else {
				System.out.println(c.disciplina[i] + " - Reprovado");
			}
		}
	}
}