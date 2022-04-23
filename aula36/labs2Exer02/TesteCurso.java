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

		if (c.getInfo() != null) {
			showContent(c.getInfo());
		}
		if (p.getInfo() != null) {
			showContent(p.getInfo());
		}
		if (c.getAluno() != null) {
			for (int i = 0; i < c.getAluno().length; i++) {
				showContent(c.getAluno()[i].getInfo());
				cc.definirAprovacao(c, c.getAluno()[i]);
			}
		}
	}
}
