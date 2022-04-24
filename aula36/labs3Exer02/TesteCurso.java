package com.valerio.cursojava.aula36.labs3Exer02;

public class TesteCurso {

	public static void printInfo(String text) {
		System.out.print(text);
	}

	public static void main(String[] args) {
		Curso c = new Curso();
		Professor p = new Professor();
		CursoController cc = new CursoController();
		double media = 0;

		cc.definirCurso(c);
		cc.definirProfessor(p);
		c.setProfessor(p);

		cc.definirAluno(c, new Aluno[2]);
		
		if (c.getAluno() != null) {
			for (int i = 0; i < c.getAluno().length; i++) {
				printInfo(c.getAluno()[i].getInfo());
				cc.definirMedia(c.getAluno()[i], media);
				cc.definirAprovacao(c.getAluno()[i], media);
			}
		}

		if (c.getInfo() != null && p.getInfo() != null) {
			printInfo(c.getInfo());
			printInfo(p.getInfo());
		}
	}
}
