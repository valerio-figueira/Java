package com.valerio.cursojava.aula36.labs3Exer02ArrayList;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int matricula;
	private ArrayList<Double> notas;

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	public void addNotas(double notas) {
		this.notas.add(notas);
	}

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

	public String getInfo() {
		String info = "\n:::: Informações do Aluno(a) ::::";
		info += "\nNome do aluno(a): " + nome;
		info += "\nMatrícula: " + matricula;
		info += "\nNotas: ";
		for (int i = 0; i < notas.size(); i++) {
			info += notas.get(i);
			if (i == notas.size() - 1) {
				info += ".\n";
			} else {
				info += ", ";
			}
		}
		return info;
	}
}
