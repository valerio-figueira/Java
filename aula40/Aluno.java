package com.valerio.cursojava.aula40;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String curso;
	private ArrayList<Double> notas;
	
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	public Aluno(String nome, String endereço, String telefone, String curso, ArrayList<Double> notas) {
		super(nome, endereço, telefone);
		this.curso = curso;
		this.notas = notas;
	}

	public String obterEndereco() {
		String info = "Endereço do aluno: ";
		return info += super.getEndereço();
	}

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
		this.getNome();
		this.getCpf();
		this.getNotas().get(0);
		super.getNome(); //Não pega os get desta classe, mostra apenas os da super classe
		super.getCpf();
		return true;
	}
}
