package com.valerio.cursojava.aula36.Heranca;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {
	private Scanner scanner;
	private Random random;

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	Controller(Scanner scanner, Random random) {
		this.scanner = scanner;
		this.random = random;
	}

	Controller() {
		this(new Scanner(System.in), new Random());
	}

	String typeText(String text) {
		System.out.print(text);
		return scanner.next();
	}

	double typeNotas(String text) {
		System.out.print(text);
		return scanner.nextDouble();
	}

	void showText(String text) {
		System.out.println(text);
	}

	Curso definirCurso(Curso c) {
		showText("::: Informações do Curso :::");
		c.setNome(typeText("Digite o nome do Curso: "));
		c.setHorario(typeText("Digite o horário: "));
		return c;
	}

	Professor definirProfessor(Professor p) {
		showText("::: Informações do Professor :::");
		p.setNome(typeText("Digite o nome do professor: "));
		p.setEmail(typeText("Digite o e-mail: "));
		p.setDepartamento(typeText("Digite o departamento: "));
		return p;
	}

	Curso definirAlunos(Curso c, ArrayList<Aluno> alunos) {
		for (int i = 0; i < 2; i++) {
			Aluno a = new Aluno();
			a.setNome(typeText("Digite o nome do aluno: "));
			a.setMatricula(random.nextInt(9999));
			definirNotas(a);
			alunos.add(a);
		}
		c.setAlunos(alunos);
		return c;
	}

	Aluno definirNotas(Aluno a) {
		a.setNotas(new ArrayList<Double>());
		for (int i = 0; i < 3; i++) {
			a.addNotas(typeNotas("Digite a " + (i + 1) + "ª nota: "));
		}
		return a;
	}

	double definirMedia(Curso c, double media) {
		double soma = 0;
		for (int i = 0; i < c.getAlunos().size(); i++) {
			for (int j = 0; j < c.getAlunos().get(i).getNotas().size(); j++) {
				soma += c.getAlunos().get(i).getNotas().get(j);
			}
		}
		return media = soma / (c.getAlunos().get(0).getNotas().size());
	}

	boolean definirAprovacao(Curso c, double media) {
		if (media >= 7) {
			showText("\nAprovado");
			return true;
		} else {
			showText("\nReprovado");
			return false;
		}

	}
}
