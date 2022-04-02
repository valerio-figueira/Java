package com.valerio.cursojava.aula27v4;

import java.util.Random;
import java.util.Scanner;

public class ExerCurso {

	public static void main(String[] args) {
		CursoController cc = new CursoController(new Scanner(System.in), new Random());
		Curso c = new Curso();

		c.nome = cc.typeText("Nome do aluno: ");
		c.curso = cc.typeText("O curso: ");
		c.matricula = cc.gerarMatricula();
		c.disciplina = cc.definirDisciplina(c);
		c.notas = cc.definirNotas(c);
		
		cc.showForm(c);
	}
}
