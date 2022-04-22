package com.valerio.cursojava.aula36.labsExer02;

public class TesteCurso {

	static void showContent(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		Curso c = new Curso();
		Professor p = new Professor();
		CursoController cc = new CursoController();

		Aluno[] aluno = new Aluno[2];
		for (int i = 0; i < aluno.length; i++) {
			Aluno a = new Aluno();
			cc.definirAluno2(c, a);
			aluno[i] = a;
		}
		c.setAluno(aluno);

		for (int i = 0; i < c.getAluno().length; i++) {
			showContent(c.getAluno()[i].getInfo());
		}
	}
}