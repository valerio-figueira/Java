package com.valerio.cursojava.aula33.labs;

import java.util.Random;
import java.util.Scanner;

public class CursoController {
	Scanner scanner;
	Random random;

	CursoController(Random random, Scanner scanner) {
		this.random = random;
		this.scanner = scanner;
	}

	CursoController() {
		this(new Random(), new Scanner(System.in));
	}

	public String typeText(String text) {
		System.out.print(text);
		return scanner.nextLine();
	}

	public int typeNum(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	public int definirMatricula(Curso c) {
		return random.nextInt(9999);
	}

	public String[] definirDisciplinas(Curso c) {
		c.setDisciplina(new String[3]);
		for (int i = 0; i < c.getDisciplina().length; i++) {
			c.setDisciplina(i, typeText("Digite a " + (i + 1) + "ª disciplina: "));
		}
		return c.getDisciplina();
	}

	public double[][] atribuirNotas(Curso c) {
		c.setNotas(new double[3][4]);
		for (int i = 0; i < c.getNotas().length; i++) {
			for (int j = 0; j < c.getNotas()[i].length; j++) {
				c.setNotas(i, j, typeNum("A " + (j + 1) + "ª nota (" + c.getDisciplina()[i] + "): "));
			}
		}
		return c.getNotas();
	}

	public boolean definirAprovacao(Curso c, int position) {
		double media = 0;
		for (int i = 0; i < c.getNotas()[position].length; i++) {
			media += c.getNotas()[position][i];
			System.out.println("Notas: " + c.getNotas()[position][i]);
		}
		media = media / c.getNotas()[position].length;
		if (media >= 7) {
			System.out.println("Média: " + media);
			return true;
		} else {
			System.out.println("Média: " + media);
			return false;
		}
	}

	public void showForm(Curso c) {
		System.out.println("Nome: " + c.getAluno() + " | Curso: " + c.getTipo() + " | Matrícula: " + c.getMatricula());
		for (int i = 0; i < c.getDisciplina().length; i++) {
			System.out.println(c.getDisciplina()[i] + ": ");
			if (definirAprovacao(c, i)) {
				System.out.println("Aprovado\n");
			} else {
				System.out.println("Reprovado\n");
			}
		}
	}
}
