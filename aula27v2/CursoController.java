package com.valerio.cursojava.aula27v2;

import java.util.Random;
import java.util.Scanner;

public class CursoController {
	Scanner input;
	Random random;

	public CursoController(Scanner scanner, Random random) {
		this.input = scanner;
		this.random = random;
	}

	String input(String text) {
		System.out.println(text);
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

	double[] atribuirNotas(double[] notas, String[] disciplinas) {
		for (int i = 0; i < notas.length; i++) {
			do {
				System.out.print("Digite a " + (i + 1) + "ª nota (" + disciplinas[i] + "): ");
				notas[i] = input.nextInt();
				if (notas[i] < 0 || notas[i] > 10) {
					System.out.println("Digite uma nota válida");
				}
			} while (notas[i] < 0 || notas[i] > 10);
		}
		return notas;
	}

	String definirAprovacao(Curso curso) {
		String status = "";
		for (int i = 0; i < curso.notas.length; i++) {
			if (curso.notas[i] >= 7) {
				status += curso.disciplina[i] + ": " + curso.notas[i] + " - Aprovado\n";
			} else {
				status += curso.disciplina[i] + ": " + curso.notas[i] + " - Reprovado\n";
			}
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
		System.out.print(status + definirAprovacao(curso));
	}
}
