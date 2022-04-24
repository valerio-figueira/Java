package com.valerio.cursojava.aula36.labs3Exer02ArrayList;

public class Professor {
	private String nome;
	private String departamento;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		String info = "\n:::: Informações do Professor ::::";
		info += "\nNome do professor(a): " + nome;
		info += "\nDepartamento: " + departamento;
		info += "\nE-mail: " + email;
		return info;
	}
}
