package com.valerio.cursojava.aula39;

import com.valerio.cursojava.aula39.TesteVisibilidade.Aluno;

public class Teste {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Professor p = new Professor();

		a.setNome(null);
		a.setTelefone(null);
		a.setNumCelular(null);
		p.setNome(null);
		p.setTelefone(null);
		p.setNumCelular(null);

		Pessoa aluno = new Aluno(); // só tem acesso aos atributos comuns da classe Pessoa e não da classe Aluno
		Pessoa professor = new Professor(); // Super classe, classe mãe/pai.
		aluno.getNome();
		professor.getNome();

		a.nomeProtected = "";
		a.nomePublic = "";
		// Não aparece o default porque ele não é visível para sub-classes

		// A herança é um relacionamento do tipo um-para-um
	}
}