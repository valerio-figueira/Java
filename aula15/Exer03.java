package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Digite o sexo, se 'F' ou 'M': ");
		String sexo = key.nextLine();
		
		
		/*if (sexo == "F") {System.out.println("F - Feminino");}
		else if (sexo == "M") {System.out.println("M - Masculino.");}
		*/
		
		switch (sexo) {
		case "M": System.out.println("M - Masculino"); break;
		case "F": System.out.println("F - Feminino"); break;
		default: System.out.println("Inválido.");
		}
		}

}
