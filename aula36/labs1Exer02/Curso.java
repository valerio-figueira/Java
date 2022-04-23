package com.valerio.cursojava.aula36.labs1Exer02;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] aluno;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAluno() {
		return aluno;
	}

	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getInfo() {
		String info = "Nome do Curso: " + nome;
		info += "\nHorário: " + horario;
		return info;
	}
	/*
	 * for (Aluno a : aluno) { info += a.getInfo(); }
	 */
}
