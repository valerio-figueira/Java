package com.valerio.cursojava.aula37;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String curso;
	private ArrayList<Double> notas;
	

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	
	public double definirMedia() {
		return 0;
	}
	
	public boolean verificarAprovacao() {
		return true;
	}
}
