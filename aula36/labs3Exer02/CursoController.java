package com.valerio.cursojava.aula36.labs3Exer02;

import java.util.Random;
import java.util.Scanner;

public class CursoController {
	Scanner scanner;
	Random random;

	CursoController(Scanner scanner, Random random) {
		this.scanner = scanner;
		this.random = random;
	}

	CursoController() {
		this(new Scanner(System.in), new Random());
	}

	String typeText(String text) {
		System.out.print(text);
		return scanner.next();
	}

	double typeNum(String text) {
		System.out.print(text);
		return scanner.nextDouble();
	}

	void showText(String text) {
		System.out.println(text);
	}

	Curso definirCurso(Curso c) {
		showText(":::: Informações do Curso ::::\n");
		c.setNome(typeText("Digite o nome do Curso: "));
		c.setHorario(typeText("Digite o horário: "));
		return c;
	}

	Professor definirProfessor(Professor p) {
		showText(":::: Informações do Professor ::::\n");
		p.setNome(typeText("Digite o nome do professor: "));
		p.setDepartamento(typeText("Digite o departamento: "));
		p.setEmail(typeText("Digite o e-mail: "));
		return p;
	}

	Curso definirAluno(Curso c, Aluno[] alunos) {
		showText(":::: Informações do Aluno ::::");
		for (int i = 0; i < alunos.length; i++) {
			Aluno a = new Aluno();
			a.setNome(typeText("Nome do Aluno: "));
			a.setMatricula(random.nextInt(9999));
			a.setNotas(definirNotas(a));
			alunos[i] = a;
		}
		c.setAluno(alunos);
		return c;
	}

	double[] definirNotas(Aluno a) {
		a.setNotas(new double[2]);
		double[] notas = a.getNotas();
		for (int i = 0; i < notas.length; i++) {
			notas[i] = typeNum("Digite a " + (i + 1) + "ª nota: ");
		}
		return notas;
	}

	double definirMedia(Aluno a, double media) {
		double soma = 0;
		for (int i = 0; i < a.getNotas().length; i++) {
			soma += a.getNotas()[i];
		}
		media = soma / a.getNotas().length;
		showText("Média: " + media);
		return media;
	}

	boolean definirAprovacao(Aluno a, double media) {
		if (media >= 7) {
			showText(a.getNome() + " - Aprovado(a)");
			return true;
		} else {
			showText(a.getNome() + " - Reprovado(a)");
			return false;
		}
	}
}
