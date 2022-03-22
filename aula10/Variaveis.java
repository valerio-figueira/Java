package com.valerio.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
	
		int idade = 20;
		String nome = "Zé Valerio";
		String nomeDoMeuCachorro = "Totó sem dente";
		
		//coisas bizarras que devem ser evitadas:
		int _idade;
		int $idade;
		String ano2014;
		String nome_do_meu_cachorro;
		String Nome;
		
		idade = 25;
		
		System.out.println ("Idade: " + idade);
		System.out.println ("Nome: " + nome);
		
		//má prática
		int a = 10;
		String b = "Zé Valério";
		
	}
}
