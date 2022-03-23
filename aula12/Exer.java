package com.valerio.cursojava.aula12;

import java.util.Scanner;
public class Exer {

	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		System.out.println("Bem-vindo(a) ao nosso sistema Financeiro, digite seu CPF para continuar: ");
		String CPF = var.next();
		System.out.println("Seu CPF é: " + CPF);
		
	}

}
