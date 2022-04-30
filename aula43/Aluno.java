package com.valerio.cursojava.aula43;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Pessoa {
	private String curso;
	private ArrayList<Double> notas;

	public Aluno() {
		super();
	}

	public String obterEndereco() {
		String info = "Endereço do aluno: ";
		return info += super.getEndereço();
	}

	public Aluno(String nome, String endereço, String telefone, String curso, ArrayList<Double> notas) {
		super(nome, endereço, telefone);
		this.curso = curso;
		this.notas = notas;
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

	public void addNotas(double nota) {
		this.notas.add(nota);
	}

	public double definirMedia() {
		return 0;
	}

	public boolean verificarAprovacao() {
		this.getNome();
		this.getCpf();
		this.getNotas().get(0);
		super.getNome(); // Não pega os get desta classe, mostra apenas os da super classe
		super.getCpf();
		return true;
	}

	@Override
	public void obterNome() {
		System.out.println("Nome do aluno(a): " + getNome());
	}

	@Override
	public void obterTelefone() {
		System.out.println("Telefone do Aluno(a): " + getTelefone());
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(curso, notas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(notas, other.notas);
	}

	public String toString() {
		String description = curso + "\n";
		for (double nota : notas) {
			description += nota + " ";
		}
		return description;
	}
}
