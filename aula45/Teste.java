package com.valerio.cursojava.aula45;

public class Teste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereço("Rua Angenor, Nº 45");
		aluno.setNome("Juvenal");
		aluno.setEndereço("Rua Vitória, Nº 59");
		professor.setNome("Rubens");
		professor.setEndereço("Rua Santo Antão, Nº 105");

		System.out.println(pessoa.obterEndereco());
		System.out.println(aluno.obterEndereco());
		System.out.println(professor.obterEndereco());

		Pessoa[] p = new Pessoa[2];
		p[0] = aluno; // upcasting
		p[1] = professor; // upcasting

		for (Pessoa array : p) {
			System.out.println(array);
		}

		Aluno a1 = new Aluno();
		Pessoa p1 = a1; // upcasting

		p1.setNome("Jurama");
		
		Pessoa a2 = new Aluno(); // upcasting manual
		Pessoa a3 = (Pessoa) new Aluno(); // upcasting de conversão
		
		Aluno a4 = (Aluno) p1; // downcasting
		
	}
}