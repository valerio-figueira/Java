package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda? Digite M-matutino, V-Vesperino ou N-Noturno: ");
		String turno = key.nextLine();
		switch (turno) {
		
		case "M": System.out.println("Bom dia!"); break;
		case "m": System.out.println("Bom dia!"); break;
		case "V": System.out.println("Boa tarde!"); break;
		case "v": System.out.println("Boa tarde!"); break;
		case "N": System.out.println("Boa noite!"); break;
		case "n": System.out.println("Boa noite!"); break;
		default: System.out.println("Inválido!");
		}
		
	}

}
