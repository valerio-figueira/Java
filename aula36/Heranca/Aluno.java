package com.valerio.cursojava.aula36.Heranca;

import java.util.ArrayList;

public class Aluno extends Usuario {
	private int matricula;
	private ArrayList<Double> notas;

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	public void addNotas(double notas) {
		this.notas.add(notas);
	}

}
