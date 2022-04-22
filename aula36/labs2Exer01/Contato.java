package com.valerio.cursojava.aula36.labs2Exer01;

public class Contato {
	private String nome;
	private String email;
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getInfo() {
		String info = "Nome: " + nome + "\n";
		info += "E-mail: " + email + "\n";
		info += "Telefone: " + telefone + "\n";
		return info;
	}
}
