package com.valerio.cursojava.aula38;

public class Professor extends Pessoa {
	private double salario;
	private String nmCurso;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNmCurso() {
		return nmCurso;
	}

	public void setNmCurso(String nmCurso) {
		this.nmCurso = nmCurso;
	}

	double definirSalarioLiquido() {
		return 0;
	}
}
