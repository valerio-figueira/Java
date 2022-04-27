package com.valerio.cursojava.aula36.Heranca;

import java.util.ArrayList;

public class Teste {
	static void showInfo(String text) {
		System.out.print(text);
	}

	public static void main(String[] args) {
		Curso c = new Curso();
		Controller controller = new Controller();
		Professor p = new Professor();
		ArrayList<Double> media = new ArrayList<Double>();
		double soma = 0;

		controller.definirCurso(c);
		controller.definirProfessor(p);
		controller.definirAlunos(c, new ArrayList<Aluno>());
		c.setProfessor(p);

		if (c.getAlunos() != null) {
			for (int i = 0; i < c.getAlunos().size(); i++) {
				showInfo("\nNome do aluno: " + c.getAlunos().get(i).getNome());
				showInfo("\nNotas: ");
				soma = 0;
				for (int j = 0; j < c.getAlunos().get(i).getNotas().size(); j++) {
					soma += c.getAlunos().get(i).getNotas().get(j);
					showInfo(c.getAlunos().get(i).getNotas().get(j) + " - ");
					if (j == c.getAlunos().get(i).getNotas().size() - 1) {
						media.add(soma / c.getAlunos().get(i).getNotas().size());
						showInfo("Média: " + media.get(i));
						controller.definirAprovacao(c, media.get(i));
					}
				}
			}
		}
	}
}
