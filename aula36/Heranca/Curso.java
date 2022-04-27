package com.valerio.cursojava.aula36.Heranca;

import java.util.ArrayList;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private ArrayList<Aluno> alunos;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void addAlunos(Aluno alunos) {
		this.alunos.add(alunos);
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
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

}
