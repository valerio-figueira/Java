package com.valerio.cursojava.aula41;

public class Professor extends Pessoa {
	private double salario;
	private String nmCurso;

	Professor() {
		super();
	}

	public String obterEndereco() {
		String info = "Endereço do professor: ";
		return info += super.getEndereço();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNmCurso() {
		return nmCurso;
	}

	public void setNmCurso(String nmCurso) {
		this.nmCurso = nmCurso;
	}

	double definirSalarioLiquido() {
		return 0;
	}

	@Override
	public void obterNome() {
		System.out.println("Nome do professor:" + getNome());

	}
	
	@Override
	public void obterTelefone() {
		System.out.println("Telefone do Professor: " + getTelefone());
	}
}
