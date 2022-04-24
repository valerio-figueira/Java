package com.valerio.cursojava.aula36.labs3Exer02ArrayList;

import java.util.ArrayList;
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

	Curso definirAluno(Curso c, ArrayList<Aluno> alunos) {
		showText(":::: Informações do Aluno ::::");
		for (int i = 0; i < 2; i++) {
			Aluno a = new Aluno();
			a.setNome(typeText("Nome do Aluno: "));
			a.setMatricula(random.nextInt(9999));
			a.setNotas(definirNotas(a));
			alunos.add(a);
		}
		c.setAluno(alunos);
		return c;
	}

	ArrayList<Double> definirNotas(Aluno a) {
		a.setNotas(new ArrayList<Double>());
		for (int i = 0; i < 2; i++) {
			while (true) {
				a.addNotas(typeNum("Digite a " + (i + 1) + "ª nota: "));
				if (a.getNotas().get(i) < 0 || a.getNotas().get(i) > 10) {
					showText("A nota deve ser menor ou igual a dez.");
				} else {
					break;
				}
			}
		}
		return a.getNotas();
	}

	double definirMedia(Aluno a, double media) {
		double soma = 0;
		for (int i = 0; i < a.getNotas().size(); i++) {
			soma += a.getNotas().get(i);
		}
		media = soma / a.getNotas().size();
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

	double definirMediaTurma(Curso c, double mediaTurma) {
		double soma = 0;
		showText("\n:::: Informações da Turma ::::");
		for (int i = 0; i < c.getAluno().size(); i++) {
			for (int j = 0; j < c.getAluno().get(i).getNotas().size(); j++) {
				soma += c.getAluno().get(i).getNotas().get(j);
			}
		}
		mediaTurma = soma / (c.getAluno().get(0).getNotas().size() * c.getAluno().size());
		return mediaTurma;
	}
}
