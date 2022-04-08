package com.valerio.cursojava.aula33.labs;

import java.util.Scanner;

public class ExerCurso {

	public static void main(String[] args) {
		Curso c = new Curso();

		c.setScanner(new Scanner(System.in));
		
		c.setAluno(c.typeText("Digite o nome do aluno: "));
		c.setTipo(c.typeText("Digite o curso: "));
		c.setMatricula(c.definirMatricula());
		
		c.definirDisciplinas();
		c.atribuirNotas();
		c.showForm();
	}
}
