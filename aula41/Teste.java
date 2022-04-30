package com.valerio.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		aluno.setEndereço("Rua Vitória, Nº 59");
		professor.setEndereço("Rua Santo Antão, Nº 105");

		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());

		aluno.setNome("Percival");
		professor.setNome("Arthur");

		aluno.obterNome();
		professor.obterNome();

		aluno.setTelefone("(34)9971-3655");
		professor.setTelefone("(34)9988-4555");
		
		aluno.obterTelefone();
		professor.obterTelefone();
	}
}