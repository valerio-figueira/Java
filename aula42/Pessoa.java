package com.valerio.cursojava.aula42;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String numCelular;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String obterEndereco() {
		return this.endereco;
	}
	
	//public abstract void obterNome();
	
	//public abstract void obterTelefone();

	public Pessoa(String nome, String endereço, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereço;
		this.telefone = telefone;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
