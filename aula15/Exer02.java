package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer02 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = key.nextInt();
		
		if (valor < 0) {
			System.out.println("Negativo: "+valor);
		} 
		else if (valor == 0) {System.out.println("Nem Positivo nem negativo");}
		
		else {
			System.out.println("Positivo: "+valor);
		}

	}

}
