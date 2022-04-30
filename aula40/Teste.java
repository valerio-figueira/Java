package com.valerio.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereço("Rua Angenor, Nº 45");
		aluno.setEndereço("Rua Vitória, Nº 59");
		professor.setEndereço("Rua Santo Antão, Nº 105");
		
		System.out.println(pessoa.obterEndereco());
		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());
	}
}