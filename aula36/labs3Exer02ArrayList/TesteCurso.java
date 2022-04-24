package com.valerio.cursojava.aula36.labs3Exer02ArrayList;

import java.util.ArrayList;

public class TesteCurso {

	public static void printInfo(String text) {
		System.out.print(text);
	}

	public static void main(String[] args) {
		Curso c = new Curso();
		Professor p = new Professor();
		CursoController cc = new CursoController();
		double mediaTurma = 0;

		cc.definirCurso(c);
		cc.definirProfessor(p);
		c.setProfessor(p);

		cc.definirAluno(c, new ArrayList<Aluno>());
		double[] media = new double[c.getAluno().size()];

		if (c.getAluno() != null) {
			for (int i = 0; i < c.getAluno().size(); i++) {
				printInfo(c.getAluno().get(i).getInfo());
				media[i] = cc.definirMedia(c.getAluno().get(i), media[i]);
				cc.definirAprovacao(c.getAluno().get(i), media[i]);
			}
		}
		printInfo("Média da turma: " + cc.definirMediaTurma(c, mediaTurma));

		if (c.getInfo() != null && p.getInfo() != null) {
			printInfo(c.getInfo());
			printInfo(p.getInfo());
		}

	}
}
