package com.valerio.cursojava.aula27v2;

import java.util.Random;
import java.util.Scanner;

public class CursoController {
	Scanner input;
	Random random;
	static double media;

	public CursoController(Scanner scanner, Random random) {
		this.input = scanner;
		this.random = random;
	}

	String input(String text) {
		System.out.print(text);
		return input.nextLine();
	}

	int generateRegistration() {
		return random.nextInt(99999);
	}

	String[] cadastrarDisciplinas(String[] vetorDisciplinas) {
		for (int i = 0; i < vetorDisciplinas.length; i++) {
			System.out.print("Cadastre a " + (i + 1) + "ª disciplina: ");
			vetorDisciplinas[i] = input.nextLine();
		}
		return vetorDisciplinas;
	}

	double[][] atribuirNotas(double[][] notas, String[] disciplinas) {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				do {
					System.out.print("Digite a " + (j + 1) + "ª nota (" + disciplinas[i] + "): ");
					notas[i][j] = input.nextInt();
					if (notas[i][j] < 0 || notas[i][j] > 10) {
						System.out.println("Digite uma nota válida");
					}
				} while (notas[i][j] < 0 || notas[i][j] > 10);
			}
		}
		return notas;
	}

	boolean verificarAprovacao(int indice, Curso curso) {
		double soma = 0;
		for (int i = 0; i < curso.notas[indice].length; i++) {
			soma += curso.notas[indice][i];
		}
		media = soma / 4;
		if (media >= 7) {
			return true;
		}
		return false;
	}

	String showNotas(Curso curso) {
		String status = "";
		for (int i = 0; i < curso.notas.length; i++) {
			status += curso.disciplina[i] + ": ";
			for (int j = 0; j < curso.notas[i].length; j++) {
				status += curso.notas[i][j];
				if (j == curso.notas[i].length - 1) {
					status += ".\n";
				} else {
					status += " - ";
				}
			}
			System.out.println();
		}
		return status;
	}

	void showForm(Curso curso) {
		String status = "";
		status += "Curso: " + curso.tipo + " | Nome: ";
		status += curso.nome + " | Matrícula: ";
		status += curso.matricula + "\nDisciplinas: ";
		for (int i = 0; i < curso.disciplina.length; i++) {
			status += curso.disciplina[i];
			if (i == curso.disciplina.length - 1) {
				status += ".\n";
			} else {
				status += ", ";
			}
		}
		System.out.print(status + showNotas(curso));
	}
}
