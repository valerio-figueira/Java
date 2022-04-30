package com.valerio.cursojava.aula43;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();

		aluno.setCurso("Matemática");
		aluno.setNotas(new ArrayList<Double>());
		aluno.addNotas(10);
		aluno.addNotas(8);
		aluno.addNotas(9);
		
		System.out.println(aluno);
		
		String s1 = "Joana";
		String s2 = "JoanA";
		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Matemática");
		aluno2.setNotas(new ArrayList<Double>());
		aluno2.addNotas(10);
		aluno2.addNotas(8);
		aluno2.addNotas(9);
		
		System.out.println("Se as informações de ambos os alunos são iguais: ");
		System.out.println(aluno.equals(aluno2));
	}
}