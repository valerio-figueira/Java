package com.valerio.cursojava.aula27v2;

import java.util.Random;
import java.util.Scanner;

public class ExerCurso {

	public static void main(String[] args) {
		CursoController c = new CursoController(new Scanner(System.in), new Random());

		Curso curso = new Curso();
		curso.tipo = c.input("Digite o curso que deseja: ");
		curso.matricula = c.generateRegistration();
		curso.nome = c.input("Digite o nome do estudante: ");
		curso.disciplina = c.cadastrarDisciplinas(new String[3]);
		curso.notas = c.atribuirNotas(new double[3], curso.disciplina);

		c.showForm(curso);
	}
}