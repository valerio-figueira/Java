package com.valerio.cursojava.aula33.labs;

import java.util.Scanner;

public class ExerCurso {

	public static void main(String[] args) {
		Curso c = new Curso();
		CursoController cc = new CursoController();

		c.setScanner(new Scanner(System.in));
		
		c.setAluno(cc.typeText("Digite o nome do aluno: "));
		c.setTipo(cc.typeText("Digite o curso: "));
		c.setMatricula(cc.definirMatricula(c));
		
		cc.definirDisciplinas(c);
		cc.atribuirNotas(c);
		cc.showForm(c);
	}
}
