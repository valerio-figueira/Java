package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite uma letra, vogal ou consoante: ");
		String letra = key.next();

	/*	String vogal1 = ("a");
		String vogal2 = ("e");
		String vogal3 = ("i");
		String vogal4 = ("o");
		String vogal5 = ("u");
		String vogal = vogal1 + vogal2 + vogal3 + vogal4 + vogal5;
		vogal.contains(letra);

		if (vogal.contains(letra)) {
			System.out.println("Você digitou uma vogal");
		} else {
			System.out.println("Você digitou uma consoante");
		} */
	
	switch (letra) {
	case "a": System.out.println("Digitou uma vogal."); break;
	case "e": System.out.println("Digitou uma vogal."); break;
	case "i": System.out.println("Digitou uma vogal."); break;
	case "o": System.out.println("Digitou uma vogal."); break;
	case "u": System.out.println("Digitou uma vogal."); break;
	case "A": System.out.println("Digitou uma vogal."); break;
	case "E": System.out.println("Digitou uma vogal."); break;
	case "I": System.out.println("Digitou uma vogal."); break;
	case "O": System.out.println("Digitou uma vogal."); break;
	case "U": System.out.println("Digitou uma vogal."); break;
	default: System.out.println("Digitou uma consoante.");
	}
	
	}
}