package com.valerio.cursojava.aula36.labs3Exer01;

public class Telefone {
	private String tipo;
	private String ddd;
	private String telefone;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return tipo + "\n" + ddd + "\n" + telefone;
	}

}
