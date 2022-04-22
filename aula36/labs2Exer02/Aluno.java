package com.valerio.cursojava.aula36.labs2Exer02;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] nota;
	private double media;

	Aluno() {
		nota = new double[2];
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
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

	public double[] getNotas() {
		return nota;
	}

	public void setNotas(double[] nota) {
		this.nota = nota;
	}

	public String getInfo() {
		String info = "\nNome do aluno: " + nome;
		info += "\nMatrícula: " + matricula;
		for (int i = 0; i < getNotas().length; i++) {
			info += "\n" + (i + 1) + "ª Nota: " + nota[i];
		}
		info += "\nMédia: " + media;
		return info;
	}
}
