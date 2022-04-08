package com.valerio.cursojava.aula33.labs;

import java.util.Random;
import java.util.Scanner;

public class Curso {
	private Random random;
	private Scanner scanner;
	private String aluno;
	private String tipo;
	private String[] disciplina;
	private double[][] notas;
	private int matricula;

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public String[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public String typeText(String text) {
		System.out.print(text);
		return scanner.nextLine();
	}

	public int typeNum(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	public int definirMatricula() {
		setRandom(new Random());
		return random.nextInt(9999);
	}

	public String[] definirDisciplinas() {
		setDisciplina(new String[3]);
		for (int i = 0; i < disciplina.length; i++) {
			disciplina[i] = typeText("Digite a " + (i + 1) + "ª disciplina: ");
		}
		return disciplina;
	}

	public double[][] atribuirNotas() {
		setNotas(new double[3][4]);
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j] = typeNum("A " + (j + 1) + "ª nota (" + disciplina[i] + "): ");
			}
		}
		return notas;
	}

	public boolean definirAprovacao(int position) {
		double media = 0;
		for (int i = 0; i < notas[position].length; i++) {
			media += notas[position][i];
			System.out.println("Notas: " + notas[position][i]);
		}
		media = media / notas[position].length;
		if (media >= 7) {
			System.out.println("Média: " + media);
			return true;
		} else {
			System.out.println("Média: " + media);
			return false;
		}
	}

	public void showForm() {
		System.out.println("Nome: " + aluno + " | Curso: " + tipo + " | Matrícula: " + matricula);
		for (int i = 0; i < disciplina.length; i++) {
			System.out.println(disciplina[i] + ": ");
			if (definirAprovacao(i)) {
				System.out.println("Aprovado\n");
			} else {
				System.out.println("Reprovado\n");
			}
		}
	}
}
