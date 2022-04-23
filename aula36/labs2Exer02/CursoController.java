package com.valerio.cursojava.aula36.labs2Exer02;

import java.util.Random;
import java.util.Scanner;

public class CursoController {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	String typeText(String text) {
		System.out.print(text);
		return scanner.nextLine();
	}

	double typeNotas(String text) {
		System.out.print(text);
		return scanner.nextDouble();
	}

	void printText(String text) {
		System.out.print(text);
	}

	Curso definirCurso(Curso c) {
		c.setNome(typeText("O nome do Curso: "));
		c.setHorario(typeText("Horário: "));
		return c;
	}

	Professor definirProfessor(Professor p) {
		p.setNome(typeText("O nome do Professor: "));
		p.setDepartamento(typeText("O departamento: "));
		p.setEmail(typeText("O e-mail do Professor:"));
		return p;
	}

	Curso definirAluno(Curso c, Aluno[] aluno) {
		for (int i = 0; i < aluno.length; i++) {
			Aluno a = new Aluno();
			printText("O nome do " + (i + 1) + "º aluno: ");
			a.setNome(scanner.next());
			a.setMatricula(random.nextInt(9999));
			a.setNotas(definirNotas(a));
			a.setMedia(definirMedia(a));
			aluno[i] = a;
		}
		c.setAluno(aluno);
		return c;
	}

	Aluno definirAluno2(Curso c, Aluno a) {
		printText("O nome do aluno: ");
		a.setNome(scanner.next());
		a.setMatricula(random.nextInt(9999));
		a.setNotas(definirNotas(a));
		a.setMedia(definirMedia(a));
		return a;
	}

	double[] definirNotas(Aluno a) {
		double[] notas = new double[a.getNotas().length];
		for (int i = 0; i < a.getNotas().length; i++) {
			printText("Digite a " + (i + 1) + "ª nota: ");
			notas[i] = scanner.nextDouble();
		}
		return notas;
	}

	double definirMedia(Aluno a) {
		double media = 0;
		for (int i = 0; i < a.getNotas().length; i++) {
			media += a.getNotas()[i];
		}
		return media / a.getNotas().length;
	}

	boolean definirAprovacao(Curso c, Aluno a) {
		if (a.getMedia() >= 7) {
			printText(a.getNome() + " - Aprovado\n");
			return true;
		} else {
			printText(a.getNome() + " - Reprovado\n");
			return false;
		}
	}

}
