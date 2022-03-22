package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer18 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite um número:");
		num = key.nextInt();
		
		if (num % 2 == 0) {System.out.println(num+" é um número par.");}
		else {System.out.println("É um número ímpar.");}
	}

}
