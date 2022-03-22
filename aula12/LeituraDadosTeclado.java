package com.valerio.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		
		      Scanner var = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = var.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto + " - Bem-vindo(a)");
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = var.next();
		System.out.println("Seu primeiro Nome é: " + primeiroNome);*/
		
		System.out.println("Digite a sua idade: ");
		int idade = var.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = var.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
	
	}

}
