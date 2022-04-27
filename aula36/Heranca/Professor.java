package com.valerio.cursojava.aula36.Heranca;

public class Professor extends Usuario {
	private String departamento;
	private String email;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
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

}
