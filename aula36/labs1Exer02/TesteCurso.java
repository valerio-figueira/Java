package com.valerio.cursojava.aula36.labs1Exer02;

public class TesteCurso {

	static void showContent(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		Curso c = new Curso();
		Professor p = new Professor();
		CursoController cc = new CursoController();
		Aluno[] aluno = new Aluno[2];
		
		cc.definirCurso(c);
		cc.definirProfessor(p);
		
		c.setProfessor(p);
		
		for (int i = 0; i < aluno.length; i++) {
			Aluno a = new Aluno();
			cc.definirAluno(a);
			aluno[i] = a;
		}
		c.setAluno(aluno);
		
		showContent(c.getInfo());
		showContent(p.getInfo());

		for (int i = 0; i < c.getAluno().length; i++) {
			showContent(c.getAluno()[i].getInfo());
			cc.definirAprovacao(c, c.getAluno()[i]);
		}
	}
}