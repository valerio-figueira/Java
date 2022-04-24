package com.valerio.cursojava.aula36.labs3Exer02ArrayList;

import java.util.ArrayList;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private ArrayList<Aluno> aluno;

	public ArrayList<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(ArrayList<Aluno> aluno) {
		this.aluno = aluno;
	}

	public void addAluno(Aluno aluno) {
		this.aluno.add(aluno);
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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getInfo() {
		String info = "\nNome do curso: " + nome;
		info += "\nHorário: " + horario;
		return info;
	}
}
