package com.valerio.cursojava.aula43.labsExer02;

public class Test {

	public static void printDescription(String description) {
		System.out.println(description);
	}

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Percival");
		pf1.setRendaBruta(1400);		
		printDescription(pf1.toString());
	
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setNome("Mary");
		pf2.setRendaBruta(3601);
		printDescription(pf2.toString());
		
		PessoaFisica pf3 = new PessoaFisica();
		pf3.setNome("Iohannes");
		pf3.setRendaBruta(2801);
		printDescription(pf3.toString());
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Irineu");
		pj1.setRendaBruta(6400);
		printDescription(pj1.toString());
		
		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setNome("Cícero");
		pj2.setRendaBruta(4400);
		printDescription(pj2.toString());
		
		PessoaJuridica pj3 = new PessoaJuridica();
		pj3.setNome("Teófilo");
		pj3.setRendaBruta(12000);
		printDescription(pj3.toString());
	}
}
