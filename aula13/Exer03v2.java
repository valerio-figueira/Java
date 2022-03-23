package com.valerio.cursojava.aula13;
import java.util.Scanner;
public class Exer03v2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero1 = key.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = key.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("Resultado da soma é: " + resultado );
		
		System.out.println("Digite os dois valores numéricos para soma: ");
		int valor1 = key.nextInt();
		int valor2 = key.nextInt();
		int resultado2 = valor1 + valor2;
		System.out.println("O resultado da soma é: " + resultado2);
	}

}
