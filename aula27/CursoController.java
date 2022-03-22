package com.valerio.cursojava.aula27;

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
		System.out.print(text);
		return input.nextLine();
	}

	int definirMatricula() {
		return random.nextInt(9999);
	}

	String[] definirDisciplinas(String[] disciplinas) {
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.print("A " + (i + 1) + "ª disciplina: ");
			disciplinas[i] = input.nextLine();
		}
		return disciplinas;
	}

	double[] atribuirNotas(double[] notas, String[] disciplinas) {
		for (int i = 0; i < notas.length; i++) {
			do {
				System.out.print("A " + (i + 1) + "ª nota (" + disciplinas[i] + "): ");
				notas[i] = input.nextDouble();
				if (notas[i] < 0 || notas[i] > 10) {
					System.out.println("Nota inválida");
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
		status += "Curso: " + curso.tipo;
		status += " | Nome: " + curso.aluno;
		status += " | Matrícula: " + curso.matricula;
		status += "\nDisciplinas: ";
		for (int i = 0; i < curso.disciplina.length; i++) {
			status += curso.disciplina[i];
			if (i == curso.disciplina.length - 1) {
				status += ".\n";
			} else {
				status += ", ";
			}
		}
		System.out.println(status + definirAprovacao(curso));
	}
}