package com.valerio.cursojava.aula36.labs2Exer02;

public class TesteCurso {
	static void showContent(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		Curso c = new Curso();
		Professor p = new Professor();
		CursoController cc = new CursoController();

		cc.definirCurso(c);
		cc.definirProfessor(p);
		cc.definirAluno(c, new Aluno[2]);

		c.setProfessor(p);

		showContent(c.getInfo());
		showContent(p.getInfo());

		// showContent(a.getInfo());
		// cc.definirAprovacao(c);
	}
}
