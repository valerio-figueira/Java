package com.valerio.cursojava.aula27v3;

import java.util.Random;
import java.util.Scanner;

public class ExerCurso {

	public static void main(String[] args) {
		CursoController cc = new CursoController(new Scanner(System.in), new Random());
		Curso c = new Curso();

		c.curso = cc.typeText("Digite o curso: ");
		c.nome = cc.typeText("Digite o nome do aluno: ");
		c.matricula = cc.gerarMatricula();
		c.disciplina = cc.definirDisciplinas(c);
		c.notas = cc.definirNotas(c);

		cc.showForm(c);
	}
}
