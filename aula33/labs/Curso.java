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

	public void setDisciplina(int i, String typeNum) {
		this.disciplina[i] = typeNum;
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

	public void setNotas(int i, int j, int typeNum) {
		this.notas[i][j] = typeNum;
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

	public Object getNotas(int i) {
		return notas[i];		
	}

}
