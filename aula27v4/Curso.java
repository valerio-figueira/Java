package com.valerio.cursojava.aula27v4;

public class Curso {
	String nome;
	String curso;
	int matricula;
	String[] disciplina;
	double[][] notas;

	public Curso() {
		disciplina = new String[3];
		notas = new double[3][4];
	}
}
