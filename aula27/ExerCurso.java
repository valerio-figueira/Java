package com.valerio.cursojava.aula27;

import java.util.Random;
import java.util.Scanner;

public class ExerCurso {

	public static void main(String[] args) {
		Curso curso = new Curso();
		CursoController c = new CursoController(new Scanner(System.in), new Random());
		
		curso.tipo = c.input("Digite o curso: ");
		curso.aluno = c.input("Digite o nome do estudante: ");
		curso.matricula = c.definirMatricula();
		curso.disciplina = c.definirDisciplinas(new String[3]);
		curso.notas = c.atribuirNotas(new double[3], curso.disciplina);
		c.showForm(curso);
	}
}