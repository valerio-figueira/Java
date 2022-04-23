package com.valerio.cursojava.aula36.labs3Exer02;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getInfo() {
		String info = "\n:::: Informações do Aluno(a) ::::";
		info += "\nNome do aluno(a): " + nome;
		info += "\nMatrícula: " + matricula;
		info += "\nNotas: ";
		for (int i = 0; i < notas.length; i++) {			
			info += notas[i];
			if (i == notas.length - 1) {
				info += ".\n";
			} else {
				info += ", ";
			}
		}
		return info;
	}
}
